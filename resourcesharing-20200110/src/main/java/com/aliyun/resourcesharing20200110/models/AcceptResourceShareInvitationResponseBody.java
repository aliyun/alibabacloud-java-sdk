// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AcceptResourceShareInvitationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the resource sharing invitation.</p>
     */
    @NameInMap("ResourceShareInvitation")
    public AcceptResourceShareInvitationResponseBodyResourceShareInvitation resourceShareInvitation;

    public static AcceptResourceShareInvitationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AcceptResourceShareInvitationResponseBody self = new AcceptResourceShareInvitationResponseBody();
        return TeaModel.build(map, self);
    }

    public AcceptResourceShareInvitationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AcceptResourceShareInvitationResponseBody setResourceShareInvitation(AcceptResourceShareInvitationResponseBodyResourceShareInvitation resourceShareInvitation) {
        this.resourceShareInvitation = resourceShareInvitation;
        return this;
    }
    public AcceptResourceShareInvitationResponseBodyResourceShareInvitation getResourceShareInvitation() {
        return this.resourceShareInvitation;
    }

    public static class AcceptResourceShareInvitationResponseBodyResourceShareInvitationAcceptInvitationFailedDetails extends TeaModel {
        /**
         * <p>The type of the sharing operation. Valid values:</p>
         * <br>
         * <p>*   Associate</p>
         */
        @NameInMap("AssociateType")
        public String associateType;

        /**
         * <p>The ID of the shared resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the shared resource.</p>
         * <br>
         * <p>For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](~~450526~~).</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The failure status. Valid values:</p>
         * <br>
         * <p>*   Unavailable: The resource cannot be shared.</p>
         * <p>*   LimitExceeded: The number of shared resources within the Alibaba Cloud account exceeds the upper limit.</p>
         * <p>*   ZonalResourceInaccessible: The resource is unavailable in this region.</p>
         * <p>*   InternalError: An internal error occurred during the check.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The failure cause.</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        public static AcceptResourceShareInvitationResponseBodyResourceShareInvitationAcceptInvitationFailedDetails build(java.util.Map<String, ?> map) throws Exception {
            AcceptResourceShareInvitationResponseBodyResourceShareInvitationAcceptInvitationFailedDetails self = new AcceptResourceShareInvitationResponseBodyResourceShareInvitationAcceptInvitationFailedDetails();
            return TeaModel.build(map, self);
        }

        public AcceptResourceShareInvitationResponseBodyResourceShareInvitationAcceptInvitationFailedDetails setAssociateType(String associateType) {
            this.associateType = associateType;
            return this;
        }
        public String getAssociateType() {
            return this.associateType;
        }

        public AcceptResourceShareInvitationResponseBodyResourceShareInvitationAcceptInvitationFailedDetails setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AcceptResourceShareInvitationResponseBodyResourceShareInvitationAcceptInvitationFailedDetails setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public AcceptResourceShareInvitationResponseBodyResourceShareInvitationAcceptInvitationFailedDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AcceptResourceShareInvitationResponseBodyResourceShareInvitationAcceptInvitationFailedDetails setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

    }

    public static class AcceptResourceShareInvitationResponseBodyResourceShareInvitation extends TeaModel {
        /**
         * <p>The information about the failure.</p>
         */
        @NameInMap("AcceptInvitationFailedDetails")
        public java.util.List<AcceptResourceShareInvitationResponseBodyResourceShareInvitationAcceptInvitationFailedDetails> acceptInvitationFailedDetails;

        /**
         * <p>The time when the invitation was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The Alibaba Cloud account ID of the invitee.</p>
         */
        @NameInMap("ReceiverAccountId")
        public String receiverAccountId;

        /**
         * <p>The ID of the resource share.</p>
         */
        @NameInMap("ResourceShareId")
        public String resourceShareId;

        /**
         * <p>The ID of the resource sharing invitation.</p>
         */
        @NameInMap("ResourceShareInvitationId")
        public String resourceShareInvitationId;

        /**
         * <p>The name of the resource share.</p>
         */
        @NameInMap("ResourceShareName")
        public String resourceShareName;

        /**
         * <p>The Alibaba Cloud account ID of the inviter.</p>
         */
        @NameInMap("SenderAccountId")
        public String senderAccountId;

        /**
         * <p>The status of the invitation. Valid values:</p>
         * <br>
         * <p>*   Pending</p>
         * <p>*   Accepted</p>
         * <p>*   Cancelled</p>
         * <p>*   Rejected</p>
         * <p>*   Expired</p>
         * <p>*   AcceptFailed</p>
         */
        @NameInMap("Status")
        public String status;

        public static AcceptResourceShareInvitationResponseBodyResourceShareInvitation build(java.util.Map<String, ?> map) throws Exception {
            AcceptResourceShareInvitationResponseBodyResourceShareInvitation self = new AcceptResourceShareInvitationResponseBodyResourceShareInvitation();
            return TeaModel.build(map, self);
        }

        public AcceptResourceShareInvitationResponseBodyResourceShareInvitation setAcceptInvitationFailedDetails(java.util.List<AcceptResourceShareInvitationResponseBodyResourceShareInvitationAcceptInvitationFailedDetails> acceptInvitationFailedDetails) {
            this.acceptInvitationFailedDetails = acceptInvitationFailedDetails;
            return this;
        }
        public java.util.List<AcceptResourceShareInvitationResponseBodyResourceShareInvitationAcceptInvitationFailedDetails> getAcceptInvitationFailedDetails() {
            return this.acceptInvitationFailedDetails;
        }

        public AcceptResourceShareInvitationResponseBodyResourceShareInvitation setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public AcceptResourceShareInvitationResponseBodyResourceShareInvitation setReceiverAccountId(String receiverAccountId) {
            this.receiverAccountId = receiverAccountId;
            return this;
        }
        public String getReceiverAccountId() {
            return this.receiverAccountId;
        }

        public AcceptResourceShareInvitationResponseBodyResourceShareInvitation setResourceShareId(String resourceShareId) {
            this.resourceShareId = resourceShareId;
            return this;
        }
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        public AcceptResourceShareInvitationResponseBodyResourceShareInvitation setResourceShareInvitationId(String resourceShareInvitationId) {
            this.resourceShareInvitationId = resourceShareInvitationId;
            return this;
        }
        public String getResourceShareInvitationId() {
            return this.resourceShareInvitationId;
        }

        public AcceptResourceShareInvitationResponseBodyResourceShareInvitation setResourceShareName(String resourceShareName) {
            this.resourceShareName = resourceShareName;
            return this;
        }
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        public AcceptResourceShareInvitationResponseBodyResourceShareInvitation setSenderAccountId(String senderAccountId) {
            this.senderAccountId = senderAccountId;
            return this;
        }
        public String getSenderAccountId() {
            return this.senderAccountId;
        }

        public AcceptResourceShareInvitationResponseBodyResourceShareInvitation setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
