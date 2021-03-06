package ru.job4j.collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.junit.Test;

public class NotifyAccountTest {

  @Test
  public void sent() {
    List<Account> accounts = Arrays.asList(
        new Account("123", "Petr Arsentev", "eDer3432f"),
        new Account("142", "Petr Arsentev", "000001")
    );
    HashSet<Account> expect = new HashSet<>(
        Arrays.asList(
            new Account("123", "Petr Arsentev", "eDer3432f"),
            new Account("142", "Petr Arsentev", "000001")
        )
    );
    assertThat(NotifyAccount.sent(accounts), is(expect));
  }

  @Test
  public void whenNoDuplicates() {
    List<Account> accounts = Arrays.asList(
        new Account("123", "Petr Arsentev", "eDer3432f"),
        new Account("142", "Petr Arsentev", "eDer3432f"),
        new Account("142", "Petr Arsentev", "000001")
    );
    HashSet<Account> expect = new HashSet<>(
        Arrays.asList(
            new Account("123", "Petr Arsentev", "eDer3432f"),
            new Account("142", "Petr Arsentev", "000001")
        )
    );
    assertThat(NotifyAccount.sent(accounts), is(expect));
  }

}