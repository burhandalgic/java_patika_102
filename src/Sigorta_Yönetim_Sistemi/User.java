package Sigorta_Yönetim_Sistemi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String job;
    private int age;
    private List<Address> addressList=new ArrayList<>();
    private ArrayList<Insurance> insuranceList = new ArrayList<>();
    private LocalDate lastEnterDate;
    private boolean AuthenticationStatus;

    public User(String name, String lastName, String email, String password, String job, int age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        AuthenticationStatus=false;
        this.lastEnterDate= LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    public LocalDate getLastEnterDate() {
        return lastEnterDate;
    }

    public void setLastEnterDate(LocalDate lastEnterDate) {
        this.lastEnterDate = lastEnterDate;
    }

    public boolean isAuthenticationStatus() {
        return AuthenticationStatus;
    }

    public void setAuthenticationStatus(boolean authenticationStatus) {
        AuthenticationStatus = authenticationStatus;
    }


}
