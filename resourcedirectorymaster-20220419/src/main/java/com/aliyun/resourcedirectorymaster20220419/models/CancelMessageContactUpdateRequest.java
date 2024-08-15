// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CancelMessageContactUpdateRequest extends TeaModel {
    /**
     * <p>The ID of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>c-qL4HqKONzOM7****</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>The email address of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>someone***@example.com</p>
     */
    @NameInMap("EmailAddress")
    public String emailAddress;

    /**
     * <p>The mobile phone number of the contact.</p>
     * <p>Specify the mobile phone number in the <code>&lt;Country code&gt;-&lt;Mobile phone number&gt;</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>86-139****1234</p>
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
