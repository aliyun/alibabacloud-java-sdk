// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AcceptResourceShareInvitationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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

    public static class AcceptResourceShareInvitationResponseBodyResourceShareInvitation extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ReceiverAccountId")
        public String receiverAccountId;

        @NameInMap("ResourceShareId")
        public String resourceShareId;

        @NameInMap("ResourceShareInvitationId")
        public String resourceShareInvitationId;

        @NameInMap("ResourceShareName")
        public String resourceShareName;

        @NameInMap("SenderAccountId")
        public String senderAccountId;

        @NameInMap("Status")
        public String status;

        public static AcceptResourceShareInvitationResponseBodyResourceShareInvitation build(java.util.Map<String, ?> map) throws Exception {
            AcceptResourceShareInvitationResponseBodyResourceShareInvitation self = new AcceptResourceShareInvitationResponseBodyResourceShareInvitation();
            return TeaModel.build(map, self);
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
