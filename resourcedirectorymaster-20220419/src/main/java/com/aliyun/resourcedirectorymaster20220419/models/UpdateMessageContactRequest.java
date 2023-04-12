// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class UpdateMessageContactRequest extends TeaModel {
    @NameInMap("ContactId")
    public String contactId;

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

    public static UpdateMessageContactRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageContactRequest self = new UpdateMessageContactRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMessageContactRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public UpdateMessageContactRequest setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }

    public UpdateMessageContactRequest setMessageTypes(java.util.List<String> messageTypes) {
        this.messageTypes = messageTypes;
        return this;
    }
    public java.util.List<String> getMessageTypes() {
        return this.messageTypes;
    }

    public UpdateMessageContactRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMessageContactRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdateMessageContactRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
