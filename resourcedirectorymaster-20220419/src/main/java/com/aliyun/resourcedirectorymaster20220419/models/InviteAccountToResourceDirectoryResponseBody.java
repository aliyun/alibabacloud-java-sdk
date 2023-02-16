// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class InviteAccountToResourceDirectoryResponseBody extends TeaModel {
    @NameInMap("Handshake")
    public InviteAccountToResourceDirectoryResponseBodyHandshake handshake;

    @NameInMap("RequestId")
    public String requestId;

    public static InviteAccountToResourceDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InviteAccountToResourceDirectoryResponseBody self = new InviteAccountToResourceDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public InviteAccountToResourceDirectoryResponseBody setHandshake(InviteAccountToResourceDirectoryResponseBodyHandshake handshake) {
        this.handshake = handshake;
        return this;
    }
    public InviteAccountToResourceDirectoryResponseBodyHandshake getHandshake() {
        return this.handshake;
    }

    public InviteAccountToResourceDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InviteAccountToResourceDirectoryResponseBodyHandshake extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("HandshakeId")
        public String handshakeId;

        @NameInMap("MasterAccountId")
        public String masterAccountId;

        @NameInMap("MasterAccountName")
        public String masterAccountName;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Note")
        public String note;

        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TargetEntity")
        public String targetEntity;

        @NameInMap("TargetType")
        public String targetType;

        public static InviteAccountToResourceDirectoryResponseBodyHandshake build(java.util.Map<String, ?> map) throws Exception {
            InviteAccountToResourceDirectoryResponseBodyHandshake self = new InviteAccountToResourceDirectoryResponseBodyHandshake();
            return TeaModel.build(map, self);
        }

        public InviteAccountToResourceDirectoryResponseBodyHandshake setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public InviteAccountToResourceDirectoryResponseBodyHandshake setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public InviteAccountToResourceDirectoryResponseBodyHandshake setHandshakeId(String handshakeId) {
            this.handshakeId = handshakeId;
            return this;
        }
        public String getHandshakeId() {
            return this.handshakeId;
        }

        public InviteAccountToResourceDirectoryResponseBodyHandshake setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public InviteAccountToResourceDirectoryResponseBodyHandshake setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public InviteAccountToResourceDirectoryResponseBodyHandshake setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public InviteAccountToResourceDirectoryResponseBodyHandshake setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public InviteAccountToResourceDirectoryResponseBodyHandshake setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public InviteAccountToResourceDirectoryResponseBodyHandshake setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public InviteAccountToResourceDirectoryResponseBodyHandshake setTargetEntity(String targetEntity) {
            this.targetEntity = targetEntity;
            return this;
        }
        public String getTargetEntity() {
            return this.targetEntity;
        }

        public InviteAccountToResourceDirectoryResponseBodyHandshake setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
