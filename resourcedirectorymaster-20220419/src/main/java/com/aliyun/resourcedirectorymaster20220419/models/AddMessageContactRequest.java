// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class AddMessageContactRequest extends TeaModel {
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
     * <br>
     * <p>The name must be unique in your resource directory.</p>
     * <br>
     * <p>The name must be 2 to 12 characters in length and can contain only letters.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The mobile phone number of the contact.</p>
     * <br>
     * <p>Specify the mobile phone number in the `<Country code>-<Mobile phone number>` format.</p>
     * <br>
     * <p>> Only mobile phone numbers in the `86-<Mobile phone number>` format in the Chinese mainland are supported.</p>
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
