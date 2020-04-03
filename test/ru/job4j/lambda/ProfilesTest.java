package ru.job4j.lambda;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ProfilesTest {

  @Test
  public void collect() {
    Address adr = new Address("Moscow", "Griboedova", 15, 34);
    Address adr1 = new Address("Moscow", "Lenina", 24, 15);
    Address adr2 = new Address("Volgograd", "Stalina", 45, 123);
    Profile prof = new Profile(adr);
    Profile prof1 = new Profile(adr1);
    Profile prof2 = new Profile(adr2);
    List<Address> result = new Profiles().collect(List.of(prof, prof1, prof2));
    assertThat(result, is(Arrays.asList(adr, adr1, adr2)));
  }

  @Test
  public void onlyUniqueElements() {
    Address adr = new Address("Moscow", "Griboedova", 15, 34);
    Address adr1 = new Address("Bryansk", "Lenina", 24, 15);
    Address adr2 = new Address("Bryansk", "Lenina", 24, 15);
    Profile prof = new Profile(adr);
    Profile prof1 = new Profile(adr1);
    Profile prof2 = new Profile(adr2);
    List<Address> result = new Profiles().collect(List.of(prof, prof1, prof2));
    assertThat(result, is(Arrays.asList(adr1, adr)));
  }
}