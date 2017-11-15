package cn.persist.bean;

/**
 * Created by ACER on 2017/11/15.
 */
public class MessageInfo {
    private String name;
    private String email;
    private String date;
    private String phone;
    private String matter;

    @Override
    public String toString() {
        return "MessageInfo{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", date='" + date + '\'' +
                ", phone='" + phone + '\'' +
                ", matter='" + matter + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }
}
