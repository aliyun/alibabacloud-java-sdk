// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CancelMessageContactUpdateRequest extends TeaModel {
    /**
     * <p>The ID of the contact.</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>The email address of the contact.</p>
     */
    @NameInMap("EmailAddress")
    public String emailAddress;

    /**
     * <p>The mobile phone number of the contact.</p>
     * <br>
     * <p>Specify the mobile phone number in the `<Country code>-<Mobile phone number>` format.</p>
     */
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
