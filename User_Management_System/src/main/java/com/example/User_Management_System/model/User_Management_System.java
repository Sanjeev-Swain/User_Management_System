package com.example.User_Management_System.model;

public class User_Management_System {
    private int id;
    private String name;
    private String username;
    private String address;
    private int ph_no;

    //default constructor
   public  User_Management_System()
    {

    }


    //parameterized constructor
    public User_Management_System(int id,String name,String username,String address,int ph_no)
    {
        this.id = id;
        this.name = name;
        this.username = username;
        this.address = address;
        this.ph_no = ph_no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPh_no() {
        return ph_no;
    }

    public void setPh_no(int ph_no) {
        this.ph_no = ph_no;
    }

    @Override
    public String toString() {
        return "User_Management_System{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", ph_no=" + ph_no +
                '}';
    }
}
