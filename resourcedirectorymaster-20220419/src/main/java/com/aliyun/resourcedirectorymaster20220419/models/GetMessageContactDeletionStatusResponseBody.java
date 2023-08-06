// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetMessageContactDeletionStatusResponseBody extends TeaModel {
    /**
     * <p>The deletion information of the contact.</p>
     */
    @NameInMap("ContactDeletionStatus")
    public GetMessageContactDeletionStatusResponseBodyContactDeletionStatus contactDeletionStatus;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMessageContactDeletionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageContactDeletionStatusResponseBody self = new GetMessageContactDeletionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageContactDeletionStatusResponseBody setContactDeletionStatus(GetMessageContactDeletionStatusResponseBodyContactDeletionStatus contactDeletionStatus) {
        this.contactDeletionStatus = contactDeletionStatus;
        return this;
    }
    public GetMessageContactDeletionStatusResponseBodyContactDeletionStatus getContactDeletionStatus() {
        return this.contactDeletionStatus;
    }

    public GetMessageContactDeletionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMessageContactDeletionStatusResponseBodyContactDeletionStatusFailReasonList extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the member.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The types of messages received by the contact.</p>
         */
        @NameInMap("MessageTypes")
        public java.util.List<String> messageTypes;

        public static GetMessageContactDeletionStatusResponseBodyContactDeletionStatusFailReasonList build(java.util.Map<String, ?> map) throws Exception {
            GetMessageContactDeletionStatusResponseBodyContactDeletionStatusFailReasonList self = new GetMessageContactDeletionStatusResponseBodyContactDeletionStatusFailReasonList();
            return TeaModel.build(map, self);
        }

        public GetMessageContactDeletionStatusResponseBodyContactDeletionStatusFailReasonList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetMessageContactDeletionStatusResponseBodyContactDeletionStatusFailReasonList setMessageTypes(java.util.List<String> messageTypes) {
            this.messageTypes = messageTypes;
            return this;
        }
        public java.util.List<String> getMessageTypes() {
            return this.messageTypes;
        }

    }

    public static class GetMessageContactDeletionStatusResponseBodyContactDeletionStatus extends TeaModel {
        /**
         * <p>The ID of the contact.</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>The types of messages received by the contact.</p>
         */
        @NameInMap("FailReasonList")
        public java.util.List<GetMessageContactDeletionStatusResponseBodyContactDeletionStatusFailReasonList> failReasonList;

        /**
         * <p>The deletion status of the contact. Valid values:</p>
         * <br>
         * <p>*   Deleting</p>
         * <p>*   Failed</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetMessageContactDeletionStatusResponseBodyContactDeletionStatus build(java.util.Map<String, ?> map) throws Exception {
            GetMessageContactDeletionStatusResponseBodyContactDeletionStatus self = new GetMessageContactDeletionStatusResponseBodyContactDeletionStatus();
            return TeaModel.build(map, self);
        }

        public GetMessageContactDeletionStatusResponseBodyContactDeletionStatus setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public GetMessageContactDeletionStatusResponseBodyContactDeletionStatus setFailReasonList(java.util.List<GetMessageContactDeletionStatusResponseBodyContactDeletionStatusFailReasonList> failReasonList) {
            this.failReasonList = failReasonList;
            return this;
        }
        public java.util.List<GetMessageContactDeletionStatusResponseBodyContactDeletionStatusFailReasonList> getFailReasonList() {
            return this.failReasonList;
        }

        public GetMessageContactDeletionStatusResponseBodyContactDeletionStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
