// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceShareInvitationsResponseBody extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of `NextToken`.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the resource sharing invitations.</p>
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

    public static class ListResourceShareInvitationsResponseBodyResourceShareInvitationsInvitationFailedDetails extends TeaModel {
        /**
         * <p>The type of the sharing operation. Valid values:</p>
         * <br>
         * <p>*   Associate</p>
         * <p>*   Disassociate</p>
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
         * <p>*   UnsupportedOperation: The operation is not allowed because another association exists.</p>
         * <p>*   InternalError: An internal error occurred during the check.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The failure cause.</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        public static ListResourceShareInvitationsResponseBodyResourceShareInvitationsInvitationFailedDetails build(java.util.Map<String, ?> map) throws Exception {
            ListResourceShareInvitationsResponseBodyResourceShareInvitationsInvitationFailedDetails self = new ListResourceShareInvitationsResponseBodyResourceShareInvitationsInvitationFailedDetails();
            return TeaModel.build(map, self);
        }

        public ListResourceShareInvitationsResponseBodyResourceShareInvitationsInvitationFailedDetails setAssociateType(String associateType) {
            this.associateType = associateType;
            return this;
        }
        public String getAssociateType() {
            return this.associateType;
        }

        public ListResourceShareInvitationsResponseBodyResourceShareInvitationsInvitationFailedDetails setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourceShareInvitationsResponseBodyResourceShareInvitationsInvitationFailedDetails setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourceShareInvitationsResponseBodyResourceShareInvitationsInvitationFailedDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourceShareInvitationsResponseBodyResourceShareInvitationsInvitationFailedDetails setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

    }

    public static class ListResourceShareInvitationsResponseBodyResourceShareInvitations extends TeaModel {
        /**
         * <p>The time when the invitation was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The information about the failure.</p>
         */
        @NameInMap("InvitationFailedDetails")
        public java.util.List<ListResourceShareInvitationsResponseBodyResourceShareInvitationsInvitationFailedDetails> invitationFailedDetails;

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
         * <p>The ID of the invitation.</p>
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

        public ListResourceShareInvitationsResponseBodyResourceShareInvitations setInvitationFailedDetails(java.util.List<ListResourceShareInvitationsResponseBodyResourceShareInvitationsInvitationFailedDetails> invitationFailedDetails) {
            this.invitationFailedDetails = invitationFailedDetails;
            return this;
        }
        public java.util.List<ListResourceShareInvitationsResponseBodyResourceShareInvitationsInvitationFailedDetails> getInvitationFailedDetails() {
            return this.invitationFailedDetails;
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
