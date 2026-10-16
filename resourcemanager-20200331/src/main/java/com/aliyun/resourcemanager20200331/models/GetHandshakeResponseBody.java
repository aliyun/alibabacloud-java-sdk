// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetHandshakeResponseBody extends TeaModel {
    /**
     * <p>The handshake information.</p>
     */
    @NameInMap("Handshake")
    public GetHandshakeResponseBodyHandshake handshake;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
     */
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
        /**
         * <p>The creation time of the handshake (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-10T09:55:41Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The expiration time of the handshake (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-24T09:55:41Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The handshake ID.</p>
         * 
         * <strong>example:</strong>
         * <p>h-ycm4rp****</p>
         */
        @NameInMap("HandshakeId")
        public String handshakeId;

        /**
         * <p>The real-name verification information of the invited account.</p>
         * <blockquote>
         * <p>This parameter is visible only when the invited account calls this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("InvitedAccountRealName")
        public String invitedAccountRealName;

        /**
         * <p>The ID of the management account of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>172841235500****</p>
         */
        @NameInMap("MasterAccountId")
        public String masterAccountId;

        /**
         * <p>The name of the management account of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:company@example.com">company@example.com</a></p>
         */
        @NameInMap("MasterAccountName")
        public String masterAccountName;

        /**
         * <p>The real-name verification information of the management account of the resource directory.</p>
         * <blockquote>
         * <p>This parameter is visible only when the invited account calls this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>company</p>
         */
        @NameInMap("MasterAccountRealName")
        public String masterAccountRealName;

        /**
         * <p>The modification time of the handshake (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-10T09:55:41Z</p>
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
         * <p>rd-abcdef****</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The status of the handshake. Valid values:</p>
         * <ul>
         * <li>Pending: Waiting for confirmation.</li>
         * <li>Accepted: Accepted.</li>
         * <li>Cancelled: Cancelled.</li>
         * <li>Declined: Rejected.</li>
         * <li>Expired: Expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID or logon email address of the invited account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
         */
        @NameInMap("TargetEntity")
        public String targetEntity;

        /**
         * <p>The type of the invited account. Valid values:</p>
         * <ul>
         * <li>Account: account ID.</li>
         * <li>Email: logon email address of the account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Email</p>
         */
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
