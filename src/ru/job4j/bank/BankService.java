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
    if (user != null) {
      List<Account> accounts = users.get(user);
      if (!accounts.contains(account)) {
        accounts.add(account);
      }
    }
  }

  public User findByPassport(String passport) {
    User user = users.keySet().stream()
        .filter(u -> u.getPassport().equals(passport)).findAny().orElse(null);
    return user;
  }

  public Account findByRequisite(String passport, String requisite) {
    User user = findByPassport(passport);
    Account account = null;
    if (user != null) {
      account = users.get(user).stream()
          .filter(a -> a.getRequisite().equals(requisite)).findAny().orElse(null);
    }
    return account;
  }

  public boolean transferMoney(String srcPassport, String srcRequisite,
      String destPassport, String destRequisite, double amount) {
    boolean rsl = false;
    Account srcAccount = findByRequisite(srcPassport, srcRequisite);
    Account destAccount = findByRequisite(destPassport, destRequisite);
    if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
      srcAccount.setBalance(srcAccount.getBalance() - amount);
      destAccount.setBalance(destAccount.getBalance() + amount);
      rsl = true;
    }
    return rsl;
  }

}
