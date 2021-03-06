// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AcceptHandshakeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Handshake")
    public AcceptHandshakeResponseBodyHandshake handshake;

    public static AcceptHandshakeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AcceptHandshakeResponseBody self = new AcceptHandshakeResponseBody();
        return TeaModel.build(map, self);
    }

    public AcceptHandshakeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AcceptHandshakeResponseBody setHandshake(AcceptHandshakeResponseBodyHandshake handshake) {
        this.handshake = handshake;
        return this;
    }
    public AcceptHandshakeResponseBodyHandshake getHandshake() {
        return this.handshake;
    }

    public static class AcceptHandshakeResponseBodyHandshake extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Note")
        public String note;

        @NameInMap("TargetEntity")
        public String targetEntity;

        @NameInMap("MasterAccountId")
        public String masterAccountId;

        @NameInMap("MasterAccountName")
        public String masterAccountName;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("HandshakeId")
        public String handshakeId;

        public static AcceptHandshakeResponseBodyHandshake build(java.util.Map<String, ?> map) throws Exception {
            AcceptHandshakeResponseBodyHandshake self = new AcceptHandshakeResponseBodyHandshake();
            return TeaModel.build(map, self);
        }

        public AcceptHandshakeResponseBodyHandshake setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AcceptHandshakeResponseBodyHandshake setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public AcceptHandshakeResponseBodyHandshake setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public AcceptHandshakeResponseBodyHandshake setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public AcceptHandshakeResponseBodyHandshake setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public AcceptHandshakeResponseBodyHandshake setTargetEntity(String targetEntity) {
            this.targetEntity = targetEntity;
            return this;
        }
        public String getTargetEntity() {
            return this.targetEntity;
        }

        public AcceptHandshakeResponseBodyHandshake setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public AcceptHandshakeResponseBodyHandshake setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public AcceptHandshakeResponseBodyHandshake setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public AcceptHandshakeResponseBodyHandshake setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public AcceptHandshakeResponseBodyHandshake setHandshakeId(String handshakeId) {
            this.handshakeId = handshakeId;
            return this;
        }
        public String getHandshakeId() {
            return this.handshakeId;
        }

    }

}
