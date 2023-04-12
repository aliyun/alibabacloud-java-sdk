// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class AddMessageContactRequest extends TeaModel {
    @NameInMap("EmailAddress")
    public String emailAddress;

    @NameInMap("MessageTypes")
    public java.util.List<String> messageTypes;

    @NameInMap("Name")
    public String name;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("Title")
    public String title;

    public static AddMessageContactRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMessageContactRequest self = new AddMessageContactRequest();
        return TeaModel.build(map, self);
    }

    public AddMessageContactRequest setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }

    public AddMessageContactRequest setMessageTypes(java.util.List<String> messageTypes) {
        this.messageTypes = messageTypes;
        return this;
    }
    public java.util.List<String> getMessageTypes() {
        return this.messageTypes;
    }

    public AddMessageContactRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddMessageContactRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public AddMessageContactRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
