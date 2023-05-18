// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class RejectResourceShareInvitationResponseBody extends TeaModel {
    /**
     * <p>The ID of the resource share.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the resource share.</p>
     */
    @NameInMap("ResourceShareInvitation")
    public RejectResourceShareInvitationResponseBodyResourceShareInvitation resourceShareInvitation;

    public static RejectResourceShareInvitationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RejectResourceShareInvitationResponseBody self = new RejectResourceShareInvitationResponseBody();
        return TeaModel.build(map, self);
    }

    public RejectResourceShareInvitationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RejectResourceShareInvitationResponseBody setResourceShareInvitation(RejectResourceShareInvitationResponseBodyResourceShareInvitation resourceShareInvitation) {
        this.resourceShareInvitation = resourceShareInvitation;
        return this;
    }
    public RejectResourceShareInvitationResponseBodyResourceShareInvitation getResourceShareInvitation() {
        return this.resourceShareInvitation;
    }

    public static class RejectResourceShareInvitationResponseBodyResourceShareInvitation extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ReceiverAccountId")
        public String receiverAccountId;

        /**
         * <p>The Alibaba Cloud account ID of the invitee.</p>
         */
        @NameInMap("ResourceShareId")
        public String resourceShareId;

        /**
         * <p>The Alibaba Cloud account ID of the inviter.</p>
         */
        @NameInMap("ResourceShareInvitationId")
        public String resourceShareInvitationId;

        /**
         * <p>The time when the invitation was created. The time is displayed in UTC.</p>
         */
        @NameInMap("ResourceShareName")
        public String resourceShareName;

        /**
         * <p>The status of the invitation. Valid values:</p>
         * <br>
         * <p>*   Pending: The invitation is waiting for confirmation.</p>
         * <p>*   Accepted: The invitation is accepted.</p>
         * <p>*   Cancelled: The invitation is canceled.</p>
         * <p>*   Rejected: The invitation is rejected.</p>
         * <p>*   Expired: The invitation has expired.</p>
         */
        @NameInMap("SenderAccountId")
        public String senderAccountId;

        @NameInMap("Status")
        public String status;

        public static RejectResourceShareInvitationResponseBodyResourceShareInvitation build(java.util.Map<String, ?> map) throws Exception {
            RejectResourceShareInvitationResponseBodyResourceShareInvitation self = new RejectResourceShareInvitationResponseBodyResourceShareInvitation();
            return TeaModel.build(map, self);
        }

        public RejectResourceShareInvitationResponseBodyResourceShareInvitation setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public RejectResourceShareInvitationResponseBodyResourceShareInvitation setReceiverAccountId(String receiverAccountId) {
            this.receiverAccountId = receiverAccountId;
            return this;
        }
        public String getReceiverAccountId() {
            return this.receiverAccountId;
        }

        public RejectResourceShareInvitationResponseBodyResourceShareInvitation setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public RejectResourceShareInvitationResponseBodyResourceShareInvitation setResourceShareInvitationId(String resourceShareInvitationId) {
            this.resourceShareInvitationId = resourceShareInvitationId;
            return this;
        }
        public String getResourceShareInvitationId() {
            return this.resourceShareInvitationId;
        }

        public RejectResourceShareInvitationResponseBodyResourceShareInvitation setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public RejectResourceShareInvitationResponseBodyResourceShareInvitation setSenderAccountId(String senderAccountId) {
            this.senderAccountId = senderAccountId;
            return this;
        }
        public String getSenderAccountId() {
            return this.senderAccountId;
        }

        public RejectResourceShareInvitationResponseBodyResourceShareInvitation setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
