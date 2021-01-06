// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class InviteAccountToResourceDirectoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Handshake")
    @Validation(required = true)
    public InviteAccountToResourceDirectoryResponseHandshake handshake;

    public static InviteAccountToResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        InviteAccountToResourceDirectoryResponse self = new InviteAccountToResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public InviteAccountToResourceDirectoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InviteAccountToResourceDirectoryResponse setHandshake(InviteAccountToResourceDirectoryResponseHandshake handshake) {
        this.handshake = handshake;
        return this;
    }
    public InviteAccountToResourceDirectoryResponseHandshake getHandshake() {
        return this.handshake;
    }

    public static class InviteAccountToResourceDirectoryResponseHandshake extends TeaModel {
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

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("TargetEntity")
        @Validation(required = true)
        public String targetEntity;

        public static InviteAccountToResourceDirectoryResponseHandshake build(java.util.Map<String, ?> map) throws Exception {
            InviteAccountToResourceDirectoryResponseHandshake self = new InviteAccountToResourceDirectoryResponseHandshake();
            return TeaModel.build(map, self);
        }

        public InviteAccountToResourceDirectoryResponseHandshake setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public InviteAccountToResourceDirectoryResponseHandshake setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public InviteAccountToResourceDirectoryResponseHandshake setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public InviteAccountToResourceDirectoryResponseHandshake setHandshakeId(String handshakeId) {
            this.handshakeId = handshakeId;
            return this;
        }
        public String getHandshakeId() {
            return this.handshakeId;
        }

        public InviteAccountToResourceDirectoryResponseHandshake setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public InviteAccountToResourceDirectoryResponseHandshake setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public InviteAccountToResourceDirectoryResponseHandshake setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public InviteAccountToResourceDirectoryResponseHandshake setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public InviteAccountToResourceDirectoryResponseHandshake setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public InviteAccountToResourceDirectoryResponseHandshake setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public InviteAccountToResourceDirectoryResponseHandshake setTargetEntity(String targetEntity) {
            this.targetEntity = targetEntity;
            return this;
        }
        public String getTargetEntity() {
            return this.targetEntity;
        }

    }

}
