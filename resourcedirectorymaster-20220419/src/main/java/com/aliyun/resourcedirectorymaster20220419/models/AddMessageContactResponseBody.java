// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class AddMessageContactResponseBody extends TeaModel {
    /**
     * <p>The information about the contact.</p>
     */
    @NameInMap("Contact")
    public AddMessageContactResponseBodyContact contact;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddMessageContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMessageContactResponseBody self = new AddMessageContactResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMessageContactResponseBody setContact(AddMessageContactResponseBodyContact contact) {
        this.contact = contact;
        return this;
    }
    public AddMessageContactResponseBodyContact getContact() {
        return this.contact;
    }

    public AddMessageContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddMessageContactResponseBodyContact extends TeaModel {
        /**
         * <p>The ID of the contact.</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>The time when the contact was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        public static AddMessageContactResponseBodyContact build(java.util.Map<String, ?> map) throws Exception {
            AddMessageContactResponseBodyContact self = new AddMessageContactResponseBodyContact();
            return TeaModel.build(map, self);
        }

        public AddMessageContactResponseBodyContact setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public AddMessageContactResponseBodyContact setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
