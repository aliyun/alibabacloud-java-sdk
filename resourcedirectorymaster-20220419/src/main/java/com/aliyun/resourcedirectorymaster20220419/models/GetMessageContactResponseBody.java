// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetMessageContactResponseBody extends TeaModel {
    /**
     * <p>The information about the contact.</p>
     */
    @NameInMap("Contact")
    public GetMessageContactResponseBodyContact contact;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMessageContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageContactResponseBody self = new GetMessageContactResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageContactResponseBody setContact(GetMessageContactResponseBodyContact contact) {
        this.contact = contact;
        return this;
    }
    public GetMessageContactResponseBodyContact getContact() {
        return this.contact;
    }

    public GetMessageContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMessageContactResponseBodyContact extends TeaModel {
        /**
         * <p>The ID of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>c-qL4HqKONzOM7****</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>The time when the contact was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-27 17:19:21</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The email address of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>someone***@example.com</p>
         */
        @NameInMap("EmailAddress")
        public String emailAddress;

        /**
         * <p>The IDs of objects to which the contact is bound.</p>
         */
        @NameInMap("Members")
        public java.util.List<String> members;

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
         * 
         * <strong>example:</strong>
         * <p>86-139****1234</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The status of the contact. Valid values:</p>
         * <ul>
         * <li>Verifying</li>
         * <li>Active</li>
         * <li>Deleting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The job title of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>TechnicalDirector</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetMessageContactResponseBodyContact build(java.util.Map<String, ?> map) throws Exception {
            GetMessageContactResponseBodyContact self = new GetMessageContactResponseBodyContact();
            return TeaModel.build(map, self);
        }

        public GetMessageContactResponseBodyContact setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public GetMessageContactResponseBodyContact setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetMessageContactResponseBodyContact setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }
        public String getEmailAddress() {
            return this.emailAddress;
        }

        public GetMessageContactResponseBodyContact setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public GetMessageContactResponseBodyContact setMessageTypes(java.util.List<String> messageTypes) {
            this.messageTypes = messageTypes;
            return this;
        }
        public java.util.List<String> getMessageTypes() {
            return this.messageTypes;
        }

        public GetMessageContactResponseBodyContact setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMessageContactResponseBodyContact setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetMessageContactResponseBodyContact setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMessageContactResponseBodyContact setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
