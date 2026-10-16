// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ResendCreateCloudAccountEmailResponseBody extends TeaModel {
    /**
     * <p>The member account information.</p>
     */
    @NameInMap("Account")
    public ResendCreateCloudAccountEmailResponseBodyAccount account;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResendCreateCloudAccountEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResendCreateCloudAccountEmailResponseBody self = new ResendCreateCloudAccountEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public ResendCreateCloudAccountEmailResponseBody setAccount(ResendCreateCloudAccountEmailResponseBodyAccount account) {
        this.account = account;
        return this;
    }
    public ResendCreateCloudAccountEmailResponseBodyAccount getAccount() {
        return this.account;
    }

    public ResendCreateCloudAccountEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResendCreateCloudAccountEmailResponseBodyAccount extends TeaModel {
        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The account name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The display name of the member account.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the resource folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-bVaRIG****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The method used by the member account to join the resource directory. Valid values:</p>
         * <ul>
         * <li>invited: Invited.</li>
         * <li>created: Created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("JoinMethod")
        public String joinMethod;

        /**
         * <p>The time when the member account joined the resource directory. The time is displayed in UTC, as specified by RFC 3339, with Z indicating UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("JoinTime")
        public String joinTime;

        /**
         * <p>The time when the member account was last modified. The time is displayed in UTC, as specified by RFC 3339, with Z indicating UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The account record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16950264-3f0d-4ca9-82dd-6ee7a3d3****</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-k3****</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The join status of the member account. Valid values:</p>
         * <ul>
         * <li>CreateSuccess: Created.</li>
         * <li>CreateVerifying: Pending creation confirmation.</li>
         * <li>CreateFailed: Creation failed.</li>
         * <li>CreateExpired: Creation expired.</li>
         * <li>CreateCancelled: Creation canceled.</li>
         * <li>PromoteVerifying: Pending upgrade confirmation.</li>
         * <li>PromoteFailed: Upgrade failed.</li>
         * <li>PromoteExpired: Upgrade expired.</li>
         * <li>PromoteCancelled: Upgrade canceled.</li>
         * <li>PromoteSuccess: Upgraded.</li>
         * <li>InviteSuccess: Invited.</li>
         * <li>Removed: Removed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateVerifying</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the member account. The value CloudAccount indicates a cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudAccount</p>
         */
        @NameInMap("Type")
        public String type;

        public static ResendCreateCloudAccountEmailResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            ResendCreateCloudAccountEmailResponseBodyAccount self = new ResendCreateCloudAccountEmailResponseBodyAccount();
            return TeaModel.build(map, self);
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
