package model;

public class User {
    //类型描述：能够描述用户名、密码、手机号码和邮箱等
    //    方法：构造方法、get和set方法，toString()方法
    private String name;
    private String password;
    private String mobile;
    private String email;
    public User(){

    }
    public User(String name, String password, String mobile, String email) {
        this.name = name;
        this.password = password;
        this.mobile = mobile;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
