package com.example.tests;

import org.testng.annotations.Test;

public class AddressCreationTests extends TestBase {
  @Test
  public void testNonEmptyAddressBookCreation() throws Exception {
	openMainPage();
    openNewAddressBook();
    AddressBookData addressBook = new AddressBookData();
    addressBook.first_name = "first_name";
    addressBook.last_name = "last_name";
    addressBook.address = "address";
    addressBook.home = "home";
    addressBook.mobile = "mobile";
    addressBook.work = "work";
    addressBook.email = "email";
    addressBook.email_2 = "email_2";
    addressBook.bday = "1";
    addressBook.bmonth = "January";
    addressBook.byear = "1990";
    addressBook.new_group = "Group 1";
    addressBook.address2 = "address2";
    addressBook.phone2 = "phone2";
	fillAddressBook(addressBook);
    submitAddressBookCreation();
    returnToHomePage();
    }

  @Test
  public void testEmptyAddressBookCreation() throws Exception {
	openMainPage();
    openNewAddressBook();
    fillAddressBook(new AddressBookData("", "", "", "", "", "", "", "", "-", "-", "", "", "", ""));
    submitAddressBookCreation();
    returnToHomePage();
    }
}
