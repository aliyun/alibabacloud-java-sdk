// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class InviteAccountToResourceDirectoryResponseBody extends TeaModel {
    /**
     * <p>The information about the invitation.</p>
     */
    @NameInMap("Handshake")
    public InviteAccountToResourceDirectoryResponseBodyHandshake handshake;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The time when the invitation was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the invitation expires. The time is displayed in UTC.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The ID of the invitation.</p>
         */
        @NameInMap("HandshakeId")
        public String handshakeId;

        /**
         * <p>The ID of the management account of the resource directory.</p>
         */
        @NameInMap("MasterAccountId")
        public String masterAccountId;

        /**
         * <p>The name of the management account of the resource directory.</p>
         */
        @NameInMap("MasterAccountName")
        public String masterAccountName;

        /**
         * <p>The time when the invitation was modified. The time is displayed in UTC.</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The description of the invitation.</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The ID of the resource directory.</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The status of the invitation. Valid values:</p>
         * <br>
         * <p>*   Pending</p>
         * <p>*   Accepted</p>
         * <p>*   Cancelled</p>
         * <p>*   Declined</p>
         * <p>*   Expired</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID or logon email address of the invited account.</p>
         */
        @NameInMap("TargetEntity")
        public String targetEntity;

        /**
         * <p>The type of the invited account. Valid values:</p>
         * <br>
         * <p>*   Account: indicates the ID of the account.</p>
         * <p>*   Email: indicates the logon email address of the account.</p>
         */
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
