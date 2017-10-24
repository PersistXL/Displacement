package cn.persist.bean;

/**
 * Created by ACER on 2017/10/23.
 */
public class UserBean {
    private String username;
    private String password;
    private String post_message;
    private String order_situation;
    private String id_card;
    private String phone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPost_message() {
        return post_message;
    }

    public void setPost_message(String post_message) {
        this.post_message = post_message;
    }

    public String getOrder_situation() {
        return order_situation;
    }

    public void setOrder_situation(String order_situation) {
        this.order_situation = order_situation;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", post_message='" + post_message + '\'' +
                ", order_situation='" + order_situation + '\'' +
                ", id_card='" + id_card + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
