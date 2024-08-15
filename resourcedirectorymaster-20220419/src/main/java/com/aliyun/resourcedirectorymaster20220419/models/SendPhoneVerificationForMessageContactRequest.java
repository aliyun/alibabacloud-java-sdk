// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class SendPhoneVerificationForMessageContactRequest extends TeaModel {
    /**
     * <p>The ID of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>c-qL4HqKONzOM7****</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>The mobile phone number of the contact.</p>
     * <p>The value must be in the <code>&lt;Country code&gt;-&lt;Mobile phone number&gt;</code> format.</p>
     * <p>The specified mobile phone number must be the one you specify when you call the <a href="~~AddMessageContact~~">AddMessageContact</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>86-139****1234</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    public static SendPhoneVerificationForMessageContactRequest build(java.util.Map<String, ?> map) throws Exception {
        SendPhoneVerificationForMessageContactRequest self = new SendPhoneVerificationForMessageContactRequest();
        return TeaModel.build(map, self);
    }

    public SendPhoneVerificationForMessageContactRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public SendPhoneVerificationForMessageContactRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
