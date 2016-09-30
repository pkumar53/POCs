package com.jsf.demo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jsf.demo.beans.User;

@ManagedBean(name="userBean")
@SessionScoped
public class UserManagedBean {

	private User user;
	private List<User> users;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public UserManagedBean() {
		System.out.println("inside constructor");
		if (users == null) {
			users = new ArrayList<User>();
		}
		System.out.println("inside constructor user list is " + users.size());
		System.out.println("inside constructor user is " + user);
		if (user == null) {
			user = new User();
		}
	}

	public String addUser() {
		System.out.println(users.size());
		User user = new User();
		user.setName(this.user.getName());
		user.setId(this.user.getId());
		users.add(user);
		return "success";
	}
}
