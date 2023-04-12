// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListMessageContactsResponseBody extends TeaModel {
    @NameInMap("Contacts")
    public java.util.List<ListMessageContactsResponseBodyContacts> contacts;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListMessageContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessageContactsResponseBody self = new ListMessageContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessageContactsResponseBody setContacts(java.util.List<ListMessageContactsResponseBodyContacts> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<ListMessageContactsResponseBodyContacts> getContacts() {
        return this.contacts;
    }

    public ListMessageContactsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMessageContactsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMessageContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMessageContactsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMessageContactsResponseBodyContacts extends TeaModel {
        @NameInMap("AssociatedDate")
        public String associatedDate;

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

        public static ListMessageContactsResponseBodyContacts build(java.util.Map<String, ?> map) throws Exception {
            ListMessageContactsResponseBodyContacts self = new ListMessageContactsResponseBodyContacts();
            return TeaModel.build(map, self);
        }

        public ListMessageContactsResponseBodyContacts setAssociatedDate(String associatedDate) {
            this.associatedDate = associatedDate;
            return this;
        }
        public String getAssociatedDate() {
            return this.associatedDate;
        }

        public ListMessageContactsResponseBodyContacts setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListMessageContactsResponseBodyContacts setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListMessageContactsResponseBodyContacts setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }
        public String getEmailAddress() {
            return this.emailAddress;
        }

        public ListMessageContactsResponseBodyContacts setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public ListMessageContactsResponseBodyContacts setMessageTypes(java.util.List<String> messageTypes) {
            this.messageTypes = messageTypes;
            return this;
        }
        public java.util.List<String> getMessageTypes() {
            return this.messageTypes;
        }

        public ListMessageContactsResponseBodyContacts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMessageContactsResponseBodyContacts setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListMessageContactsResponseBodyContacts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMessageContactsResponseBodyContacts setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
