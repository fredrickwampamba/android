package com.codiumug.android;

public class Contacts {
    private String contactName;
    private String phoneNumber;
    private String contactEmail;
    private String imageUrl;

    public Contacts(String contactName, String phoneNumber, String contactEmail, String imageUrl) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.contactEmail = contactEmail;
        this.imageUrl = imageUrl;
    }

    public Contacts() {
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "contactName='" + contactName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                '}';
    }
}
