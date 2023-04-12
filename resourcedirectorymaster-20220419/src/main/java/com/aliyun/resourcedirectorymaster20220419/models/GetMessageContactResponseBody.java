// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetMessageContactResponseBody extends TeaModel {
    @NameInMap("Contact")
    public GetMessageContactResponseBodyContact contact;

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
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("EmailAddress")
        public String emailAddress;

        @NameInMap("Members")
        public java.util.List<String> members;

        @NameInMap("MessageTypes")
        public java.util.List<String> messageTypes;

        @NameInMap("Name")
        public String name;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("Status")
        public String status;

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
