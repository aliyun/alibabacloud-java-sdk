// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class SendEmailVerificationForMessageContactRequest extends TeaModel {
    /**
     * <p>The ID of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>c-5gsZAGt***PGduDF</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>The email address of the contact.</p>
     * <p>The specified email address must be the one you specify when you call <a href="~~AddMessageContact~~">AddMessageContact</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>someone***@example.com</p>
     */
    @NameInMap("EmailAddress")
    public String emailAddress;

    public static SendEmailVerificationForMessageContactRequest build(java.util.Map<String, ?> map) throws Exception {
        SendEmailVerificationForMessageContactRequest self = new SendEmailVerificationForMessageContactRequest();
        return TeaModel.build(map, self);
    }

    public SendEmailVerificationForMessageContactRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public SendEmailVerificationForMessageContactRequest setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }

}
