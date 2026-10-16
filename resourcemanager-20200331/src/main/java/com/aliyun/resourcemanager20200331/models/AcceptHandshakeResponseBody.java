// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AcceptHandshakeResponseBody extends TeaModel {
    /**
     * <p>The handshake information.</p>
     */
    @NameInMap("Handshake")
    public AcceptHandshakeResponseBodyHandshake handshake;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5828C836-3286-49A6-9006-15231BB19342</p>
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
         * <p>The creation time of the handshake (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06T02:15:40Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The expiration time of the handshake (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-20T02:15:40Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The handshake ID.</p>
         * 
         * <strong>example:</strong>
         * <p>h-Ih8IuPfvV0t0****</p>
         */
        @NameInMap("HandshakeId")
        public String handshakeId;

        /**
         * <p>The ID of the management account of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>151266687691****</p>
         */
        @NameInMap("MasterAccountId")
        public String masterAccountId;

        /**
         * <p>The name of the management account of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>CompanyA</p>
         */
        @NameInMap("MasterAccountName")
        public String masterAccountName;

        /**
         * <p>The modification time of the handshake (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06T02:16:40Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Welcome to join us</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The resource directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-3G****</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The status of the handshake. Valid values:</p>
         * <ul>
         * <li>Pending: waiting for confirmation.</li>
         * <li>Accepted: accepted.</li>
         * <li>Cancelled: canceled.</li>
         * <li>Declined: rejected.</li>
         * <li>Expired: expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Accepted</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The Alibaba Cloud account ID or logon email address of the invited account.</p>
         * 
         * <strong>example:</strong>
         * <p>177242285274****</p>
         */
        @NameInMap("TargetEntity")
        public String targetEntity;

        /**
         * <p>The type of the invited Alibaba Cloud account. Valid values:</p>
         * <ul>
         * <li>Account: Alibaba Cloud account ID.</li>
         * <li>Email: logon email address of the Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Account</p>
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
