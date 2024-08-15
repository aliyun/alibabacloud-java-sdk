// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class UpdateMessageContactRequest extends TeaModel {
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
     * <p>After you specify an email address, you need to call <a href="~~SendEmailVerificationForMessageContact~~">SendEmailVerificationForMessageContact</a> to send verification information to the email address. After the verification is passed, the email address takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>someone***@example.com</p>
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
     * 
     * <strong>example:</strong>
     * <p>tom</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The mobile phone number of the contact.</p>
     * <p>Specify the mobile phone number in the <code>&lt;Country code&gt;-&lt;Mobile phone number&gt;</code> format.</p>
     * <p>After you specify a mobile phone number, you need to call <a href="~~SendPhoneVerificationForMessageContact~~">SendPhoneVerificationForMessageContact</a> to send verification information to the mobile phone number. After the verification is passed, the mobile phone number takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>86-139****1234</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The job title of the contact.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>FinanceDirector</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>TechnicalDirector</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>MaintenanceDirector</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>CEO</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>ProjectDirector</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Other</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TechnicalDirector</p>
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
