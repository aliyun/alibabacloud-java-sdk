// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetHandshakeResponseBody extends TeaModel {
    /**
     * <p>The information of the invitation.</p>
     */
    @NameInMap("Handshake")
    public GetHandshakeResponseBodyHandshake handshake;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The time when the invitation was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-10T09:55:41Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the invitation expires. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-24T09:55:41Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The ID of the invitation.</p>
         * 
         * <strong>example:</strong>
         * <p>h-ycm4rp****</p>
         */
        @NameInMap("HandshakeId")
        public String handshakeId;

        /**
         * <p>The real-name verification information of the invitee.</p>
         * <blockquote>
         * <p> This parameter is available only when an invitee calls this operation.</p>
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
         * <p> This parameter is available only when an invitee calls this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>company</p>
         */
        @NameInMap("MasterAccountRealName")
        public String masterAccountRealName;

        /**
         * <p>The time when the invitation was modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-10T09:55:41Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The comment on the invitation.</p>
         * 
         * <strong>example:</strong>
         * <p>Welcome</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-abcdef****</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The status of the invitation. Valid values:</p>
         * <ul>
         * <li>Pending: The invitation is waiting for confirmation.</li>
         * <li>Accepted: The invitation is accepted.</li>
         * <li>Cancelled: The invitation is canceled.</li>
         * <li>Declined: The invitation is rejected.</li>
         * <li>Expired: The invitation expires.</li>
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
         * <li>Account: indicates the ID of the account.</li>
         * <li>Email: indicates the logon email address of the account.</li>
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
