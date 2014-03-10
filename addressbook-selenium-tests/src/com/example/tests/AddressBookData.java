package com.example.tests;

public class AddressBookData {
	public String first_name;
	public String last_name;
	public String address;
	public String home;
	public String mobile;
	public String work;
	public String email;
	public String email_2;
	public String bday;
	public String bmonth;
	public String byear;
	public String new_group;
	public String address2;
	public String phone2;

	public AddressBookData() {
	}
	
	public AddressBookData(String first_name, String last_name, String address,
			String home, String mobile, String work, String email,
			String email_2, String bday, String bmonth, String byear,
			String new_group, String address2, String phone2) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.home = home;
		this.mobile = mobile;
		this.work = work;
		this.email = email;
		this.email_2 = email_2;
		this.bday = bday;
		this.bmonth = bmonth;
		this.byear = byear;
		this.new_group = new_group;
		this.address2 = address2;
		this.phone2 = phone2;
	}
}