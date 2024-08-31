package com.vic.story_card.model;

public class Model_User {
    private String user_name;
    private String user_email;
    private String user_role;
    private String user_gender;
    private String user_subscription_tier;

    public Model_User(String user_name,
                      String user_email,
                      String user_role,
                      String user_gender,
                      String user_subscription_tier) {
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_role = user_role;
        this.user_gender = user_gender;
        this.user_subscription_tier = user_subscription_tier;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_subscription_tier() {
        return user_subscription_tier;
    }

    public void setUser_subscription_tier(String user_subscription_tier) {
        this.user_subscription_tier = user_subscription_tier;
    }

}
