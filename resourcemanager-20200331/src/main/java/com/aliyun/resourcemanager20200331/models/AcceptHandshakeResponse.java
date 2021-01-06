// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AcceptHandshakeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Handshake")
    @Validation(required = true)
    public AcceptHandshakeResponseHandshake handshake;

    public static AcceptHandshakeResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptHandshakeResponse self = new AcceptHandshakeResponse();
        return TeaModel.build(map, self);
    }

    public AcceptHandshakeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AcceptHandshakeResponse setHandshake(AcceptHandshakeResponseHandshake handshake) {
        this.handshake = handshake;
        return this;
    }
    public AcceptHandshakeResponseHandshake getHandshake() {
        return this.handshake;
    }

    public static class AcceptHandshakeResponseHandshake extends TeaModel {
        @NameInMap("HandshakeId")
        @Validation(required = true)
        public String handshakeId;

        @NameInMap("ResourceDirectoryId")
        @Validation(required = true)
        public String resourceDirectoryId;

        @NameInMap("MasterAccountId")
        @Validation(required = true)
        public String masterAccountId;

        @NameInMap("MasterAccountName")
        @Validation(required = true)
        public String masterAccountName;

        @NameInMap("TargetEntity")
        @Validation(required = true)
        public String targetEntity;

        @NameInMap("TargetType")
        @Validation(required = true)
        public String targetType;

        @NameInMap("Note")
        @Validation(required = true)
        public String note;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        public static AcceptHandshakeResponseHandshake build(java.util.Map<String, ?> map) throws Exception {
            AcceptHandshakeResponseHandshake self = new AcceptHandshakeResponseHandshake();
            return TeaModel.build(map, self);
        }

        public AcceptHandshakeResponseHandshake setHandshakeId(String handshakeId) {
            this.handshakeId = handshakeId;
            return this;
        }
        public String getHandshakeId() {
            return this.handshakeId;
        }

        public AcceptHandshakeResponseHandshake setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public AcceptHandshakeResponseHandshake setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public AcceptHandshakeResponseHandshake setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public AcceptHandshakeResponseHandshake setTargetEntity(String targetEntity) {
            this.targetEntity = targetEntity;
            return this;
        }
        public String getTargetEntity() {
            return this.targetEntity;
        }

        public AcceptHandshakeResponseHandshake setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public AcceptHandshakeResponseHandshake setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public AcceptHandshakeResponseHandshake setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AcceptHandshakeResponseHandshake setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public AcceptHandshakeResponseHandshake setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public AcceptHandshakeResponseHandshake setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

    }

}
