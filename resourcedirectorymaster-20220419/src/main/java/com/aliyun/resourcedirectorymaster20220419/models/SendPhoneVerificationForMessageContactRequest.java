// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class SendPhoneVerificationForMessageContactRequest extends TeaModel {
    /**
     * <p>The ID of the contact.</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>The mobile phone number of the contact.</p>
     * <br>
     * <p>The value must be in the `<Country code>-<Mobile phone number>` format.</p>
     * <br>
     * <p>The specified mobile phone number must be the one you specify when you call the [AddMessageContact](~~AddMessageContact~~) operation.</p>
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
