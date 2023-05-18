// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceShareInvitationsResponseBody extends TeaModel {
    /**
     * <p>The status of the invitation. Valid values:</p>
     * <br>
     * <p>*   Pending: The invitation is waiting for confirmation.</p>
     * <p>*   Accepted: The invitation is accepted.</p>
     * <p>*   Cancelled: The invitation is canceled.</p>
     * <p>*   Rejected: The invitation is rejected.</p>
     * <p>*   Expired: The invitation has expired.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The time when the invitation was created. The time is displayed in UTC.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource share.</p>
     */
    @NameInMap("ResourceShareInvitations")
    public java.util.List<ListResourceShareInvitationsResponseBodyResourceShareInvitations> resourceShareInvitations;

    public static ListResourceShareInvitationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceShareInvitationsResponseBody self = new ListResourceShareInvitationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceShareInvitationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceShareInvitationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceShareInvitationsResponseBody setResourceShareInvitations(java.util.List<ListResourceShareInvitationsResponseBodyResourceShareInvitations> resourceShareInvitations) {
        this.resourceShareInvitations = resourceShareInvitations;
        return this;
    }
    public java.util.List<ListResourceShareInvitationsResponseBodyResourceShareInvitations> getResourceShareInvitations() {
        return this.resourceShareInvitations;
    }

    public static class ListResourceShareInvitationsResponseBodyResourceShareInvitations extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the inviter.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ReceiverAccountId")
        public String receiverAccountId;

        /**
         * <p>The Alibaba Cloud account ID of the invitee.</p>
         */
        @NameInMap("ResourceShareId")
        public String resourceShareId;

        @NameInMap("ResourceShareInvitationId")
        public String resourceShareInvitationId;

        /**
         * <p>The ID of the invitation.</p>
         */
        @NameInMap("ResourceShareName")
        public String resourceShareName;

        @NameInMap("SenderAccountId")
        public String senderAccountId;

        /**
         * <p>The name of the resource share.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListResourceShareInvitationsResponseBodyResourceShareInvitations build(java.util.Map<String, ?> map) throws Exception {
            ListResourceShareInvitationsResponseBodyResourceShareInvitations self = new ListResourceShareInvitationsResponseBodyResourceShareInvitations();
            return TeaModel.build(map, self);
        }

        public ListResourceShareInvitationsResponseBodyResourceShareInvitations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceShareInvitationsResponseBodyResourceShareInvitations setReceiverAccountId(String receiverAccountId) {
            this.receiverAccountId = receiverAccountId;
            return this;
        }
        public String getReceiverAccountId() {
            return this.receiverAccountId;
        }

        public ListResourceShareInvitationsResponseBodyResourceShareInvitations setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public ListResourceShareInvitationsResponseBodyResourceShareInvitations setResourceShareInvitationId(String resourceShareInvitationId) {
            this.resourceShareInvitationId = resourceShareInvitationId;
            return this;
        }
        public String getResourceShareInvitationId() {
            return this.resourceShareInvitationId;
        }

        public ListResourceShareInvitationsResponseBodyResourceShareInvitations setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public ListResourceShareInvitationsResponseBodyResourceShareInvitations setSenderAccountId(String senderAccountId) {
            this.senderAccountId = senderAccountId;
            return this;
        }
        public String getSenderAccountId() {
            return this.senderAccountId;
        }

        public ListResourceShareInvitationsResponseBodyResourceShareInvitations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
