// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeclineHandshakeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Handshake")
    public DeclineHandshakeResponseBodyHandshake handshake;

    public static DeclineHandshakeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeclineHandshakeResponseBody self = new DeclineHandshakeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeclineHandshakeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeclineHandshakeResponseBody setHandshake(DeclineHandshakeResponseBodyHandshake handshake) {
        this.handshake = handshake;
        return this;
    }
    public DeclineHandshakeResponseBodyHandshake getHandshake() {
        return this.handshake;
    }

    public static class DeclineHandshakeResponseBodyHandshake extends TeaModel {
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

        public static DeclineHandshakeResponseBodyHandshake build(java.util.Map<String, ?> map) throws Exception {
            DeclineHandshakeResponseBodyHandshake self = new DeclineHandshakeResponseBodyHandshake();
            return TeaModel.build(map, self);
        }

        public DeclineHandshakeResponseBodyHandshake setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeclineHandshakeResponseBodyHandshake setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DeclineHandshakeResponseBodyHandshake setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public DeclineHandshakeResponseBodyHandshake setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DeclineHandshakeResponseBodyHandshake setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public DeclineHandshakeResponseBodyHandshake setTargetEntity(String targetEntity) {
            this.targetEntity = targetEntity;
            return this;
        }
        public String getTargetEntity() {
            return this.targetEntity;
        }

        public DeclineHandshakeResponseBodyHandshake setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public DeclineHandshakeResponseBodyHandshake setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public DeclineHandshakeResponseBodyHandshake setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DeclineHandshakeResponseBodyHandshake setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DeclineHandshakeResponseBodyHandshake setHandshakeId(String handshakeId) {
            this.handshakeId = handshakeId;
            return this;
        }
        public String getHandshakeId() {
            return this.handshakeId;
        }

    }

}
