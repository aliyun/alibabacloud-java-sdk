// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class UpdateMessageContactRequest extends TeaModel {
    /**
     * <p>The ID of the contact.</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>The email address of the contact.</p>
     * <br>
     * <p>After you specify an email address, you need to call [SendEmailVerificationForMessageContact](~~SendEmailVerificationForMessageContact~~) to send verification information to the email address. After the verification is passed, the email address takes effect.</p>
     */
    @NameInMap("EmailAddress")
    public String emailAddress;

    /**
     * <p>The types of messages received by the contact.</p>
     */
    @NameInMap("MessageTypes")
    public java.util.List<String> messageTypes;

    /**
     * <p>The name of the contact.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The mobile phone number of the contact.</p>
     * <br>
     * <p>Specify the mobile phone number in the `<Country code>-<Mobile phone number>` format.</p>
     * <br>
     * <p>After you specify a mobile phone number, you need to call [SendPhoneVerificationForMessageContact](~~SendPhoneVerificationForMessageContact~~) to send verification information to the mobile phone number. After the verification is passed, the mobile phone number takes effect.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The job title of the contact.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   FinanceDirector</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   TechnicalDirector</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   MaintenanceDirector</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   CEO</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   ProjectDirector</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Other</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
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
