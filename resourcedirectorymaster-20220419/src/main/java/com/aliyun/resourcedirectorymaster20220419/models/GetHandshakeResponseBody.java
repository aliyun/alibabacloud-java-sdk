// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetHandshakeResponseBody extends TeaModel {
    @NameInMap("Handshake")
    public GetHandshakeResponseBodyHandshake handshake;

    @NameInMap("RequestId")
    public String requestId;

    public static GetHandshakeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHandshakeResponseBody self = new GetHandshakeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHandshakeResponseBody setHandshake(GetHandshakeResponseBodyHandshake handshake) {
        this.handshake = handshake;
        return this;
    }
    public GetHandshakeResponseBodyHandshake getHandshake() {
        return this.handshake;
    }

    public GetHandshakeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHandshakeResponseBodyHandshake extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("HandshakeId")
        public String handshakeId;

        @NameInMap("InvitedAccountRealName")
        public String invitedAccountRealName;

        @NameInMap("MasterAccountId")
        public String masterAccountId;

        @NameInMap("MasterAccountName")
        public String masterAccountName;

        @NameInMap("MasterAccountRealName")
        public String masterAccountRealName;

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

        public static GetHandshakeResponseBodyHandshake build(java.util.Map<String, ?> map) throws Exception {
            GetHandshakeResponseBodyHandshake self = new GetHandshakeResponseBodyHandshake();
            return TeaModel.build(map, self);
        }

        public GetHandshakeResponseBodyHandshake setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetHandshakeResponseBodyHandshake setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetHandshakeResponseBodyHandshake setHandshakeId(String handshakeId) {
            this.handshakeId = handshakeId;
            return this;
        }
        public String getHandshakeId() {
            return this.handshakeId;
        }

        public GetHandshakeResponseBodyHandshake setInvitedAccountRealName(String invitedAccountRealName) {
            this.invitedAccountRealName = invitedAccountRealName;
            return this;
        }
        public String getInvitedAccountRealName() {
            return this.invitedAccountRealName;
        }

        public GetHandshakeResponseBodyHandshake setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public GetHandshakeResponseBodyHandshake setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public GetHandshakeResponseBodyHandshake setMasterAccountRealName(String masterAccountRealName) {
            this.masterAccountRealName = masterAccountRealName;
            return this;
        }
        public String getMasterAccountRealName() {
            return this.masterAccountRealName;
        }

        public GetHandshakeResponseBodyHandshake setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetHandshakeResponseBodyHandshake setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public GetHandshakeResponseBodyHandshake setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public GetHandshakeResponseBodyHandshake setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetHandshakeResponseBodyHandshake setTargetEntity(String targetEntity) {
            this.targetEntity = targetEntity;
            return this;
        }
        public String getTargetEntity() {
            return this.targetEntity;
        }

        public GetHandshakeResponseBodyHandshake setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
