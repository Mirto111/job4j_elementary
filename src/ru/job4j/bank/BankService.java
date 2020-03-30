package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {

  private Map<User, List<Account>> users = new HashMap<>();

  public void addUser(User user) {
    users.putIfAbsent(user, new ArrayList<Account>());
  }

  public void addAccount(String passport, Account account) {
    User user = findByPassport(passport);
    List<Account> accounts = users.get(user);
    if (!accounts.contains(account)) {
      accounts.add(account);
    }
  }

  public User findByPassport(String passport) {
    User user = null;
    for (User key : users.keySet()) {
      if (key.getPassport().equals(passport)) {
        user = key;
        break;
      }
    }
    return user;
  }

  public Account findByRequisite(String passport, String requisite) {
    User user = findByPassport(passport);
    Account account = null;
    if (user != null) {
      List<Account> accounts = users.get(user);
      int index = accounts.indexOf(new Account(requisite, -1));
      account = accounts.get(index);
    }
    return account;
  }

  public boolean transferMoney(String srcPassport, String srcRequisite,
      String destPassport, String destRequisite, double amount) {
    boolean rsl = false;
    Account srcAccount = findByRequisite(srcPassport, srcRequisite);
    Account destAccount = findByRequisite(destPassport, destRequisite);
    if (srcAccount != null && srcAccount.getBalance() >= amount) {
      srcAccount.setBalance(srcAccount.getBalance() - amount);
      destAccount.setBalance(destAccount.getBalance() + amount);
      rsl = true;
    }
    return rsl;
  }

}
