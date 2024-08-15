// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListMessageContactsResponseBody extends TeaModel {
    /**
     * <p>The time when the contact was bound to the objects.</p>
     */
    @NameInMap("Contacts")
    public java.util.List<ListMessageContactsResponseBodyContacts> contacts;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>95060F1D-6990-4645-8920-A81D1BBFE992</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
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
        /**
         * <p>The time when the contact was bound to the objects.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-27 17:19:21</p>
         */
        @NameInMap("AssociatedDate")
        public String associatedDate;

        /**
         * <p>The ID of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>c-qL4HqKONzOM7****</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>The time when the contact was added.</p>
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
