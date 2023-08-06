// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class AcceptHandshakeResponseBody extends TeaModel {
    /**
     * <p>The information of the invitation.</p>
     */
    @NameInMap("Handshake")
    public AcceptHandshakeResponseBodyHandshake handshake;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AcceptHandshakeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AcceptHandshakeResponseBody self = new AcceptHandshakeResponseBody();
        return TeaModel.build(map, self);
    }

    public AcceptHandshakeResponseBody setHandshake(AcceptHandshakeResponseBodyHandshake handshake) {
        this.handshake = handshake;
        return this;
    }
    public AcceptHandshakeResponseBodyHandshake getHandshake() {
        return this.handshake;
    }

    public AcceptHandshakeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AcceptHandshakeResponseBodyHandshake extends TeaModel {
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
         * <p>*   Pending: The invitation is waiting for confirmation.</p>
         * <p>*   Accepted: The invitation is accepted.</p>
         * <p>*   Cancelled: The invitation is canceled.</p>
         * <p>*   Declined: The invitation is rejected.</p>
         * <p>*   Expired: The invitation expires.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID or logon email address of the invited Alibaba Cloud account.</p>
         */
        @NameInMap("TargetEntity")
        public String targetEntity;

        /**
         * <p>The type of the invited Alibaba Cloud account. Valid values:</p>
         * <br>
         * <p>*   Account: indicates the ID of the Alibaba Cloud account.</p>
         * <p>*   Email: indicates the logon email address of the Alibaba Cloud account.</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static AcceptHandshakeResponseBodyHandshake build(java.util.Map<String, ?> map) throws Exception {
            AcceptHandshakeResponseBodyHandshake self = new AcceptHandshakeResponseBodyHandshake();
            return TeaModel.build(map, self);
        }

        public AcceptHandshakeResponseBodyHandshake setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public AcceptHandshakeResponseBodyHandshake setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public AcceptHandshakeResponseBodyHandshake setHandshakeId(String handshakeId) {
            this.handshakeId = handshakeId;
            return this;
        }
        public String getHandshakeId() {
            return this.handshakeId;
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

        public AcceptHandshakeResponseBodyHandshake setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public AcceptHandshakeResponseBodyHandshake setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public AcceptHandshakeResponseBodyHandshake setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AcceptHandshakeResponseBodyHandshake setTargetEntity(String targetEntity) {
            this.targetEntity = targetEntity;
            return this;
        }
        public String getTargetEntity() {
            return this.targetEntity;
        }

        public AcceptHandshakeResponseBodyHandshake setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
