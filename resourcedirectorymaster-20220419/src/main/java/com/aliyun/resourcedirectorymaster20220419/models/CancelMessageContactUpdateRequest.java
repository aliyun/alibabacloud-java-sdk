// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CancelMessageContactUpdateRequest extends TeaModel {
    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("EmailAddress")
    public String emailAddress;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    public static CancelMessageContactUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelMessageContactUpdateRequest self = new CancelMessageContactUpdateRequest();
        return TeaModel.build(map, self);
    }

    public CancelMessageContactUpdateRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public CancelMessageContactUpdateRequest setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }

    public CancelMessageContactUpdateRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
