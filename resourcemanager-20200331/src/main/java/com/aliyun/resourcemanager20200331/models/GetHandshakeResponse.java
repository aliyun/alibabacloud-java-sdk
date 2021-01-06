// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetHandshakeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Handshake")
    @Validation(required = true)
    public GetHandshakeResponseHandshake handshake;

    public static GetHandshakeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHandshakeResponse self = new GetHandshakeResponse();
        return TeaModel.build(map, self);
    }

    public GetHandshakeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHandshakeResponse setHandshake(GetHandshakeResponseHandshake handshake) {
        this.handshake = handshake;
        return this;
    }
    public GetHandshakeResponseHandshake getHandshake() {
        return this.handshake;
    }

    public static class GetHandshakeResponseHandshake extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("ResourceDirectoryId")
        @Validation(required = true)
        public String resourceDirectoryId;

        @NameInMap("HandshakeId")
        @Validation(required = true)
        public String handshakeId;

        @NameInMap("MasterAccountName")
        @Validation(required = true)
        public String masterAccountName;

        @NameInMap("Note")
        @Validation(required = true)
        public String note;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("TargetType")
        @Validation(required = true)
        public String targetType;

        @NameInMap("MasterAccountId")
        @Validation(required = true)
        public String masterAccountId;

        @NameInMap("MasterAccountRealName")
        @Validation(required = true)
        public String masterAccountRealName;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("InvitedAccountRealName")
        @Validation(required = true)
        public String invitedAccountRealName;

        @NameInMap("TargetEntity")
        @Validation(required = true)
        public String targetEntity;

        public static GetHandshakeResponseHandshake build(java.util.Map<String, ?> map) throws Exception {
            GetHandshakeResponseHandshake self = new GetHandshakeResponseHandshake();
            return TeaModel.build(map, self);
        }

        public GetHandshakeResponseHandshake setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetHandshakeResponseHandshake setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetHandshakeResponseHandshake setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public GetHandshakeResponseHandshake setHandshakeId(String handshakeId) {
            this.handshakeId = handshakeId;
            return this;
        }
        public String getHandshakeId() {
            return this.handshakeId;
        }

        public GetHandshakeResponseHandshake setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public GetHandshakeResponseHandshake setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public GetHandshakeResponseHandshake setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetHandshakeResponseHandshake setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public GetHandshakeResponseHandshake setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public GetHandshakeResponseHandshake setMasterAccountRealName(String masterAccountRealName) {
            this.masterAccountRealName = masterAccountRealName;
            return this;
        }
        public String getMasterAccountRealName() {
            return this.masterAccountRealName;
        }

        public GetHandshakeResponseHandshake setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetHandshakeResponseHandshake setInvitedAccountRealName(String invitedAccountRealName) {
            this.invitedAccountRealName = invitedAccountRealName;
            return this;
        }
        public String getInvitedAccountRealName() {
            return this.invitedAccountRealName;
        }

        public GetHandshakeResponseHandshake setTargetEntity(String targetEntity) {
            this.targetEntity = targetEntity;
            return this;
        }
        public String getTargetEntity() {
            return this.targetEntity;
        }

    }

}
