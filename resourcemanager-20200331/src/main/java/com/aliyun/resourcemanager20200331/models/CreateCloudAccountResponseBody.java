// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateCloudAccountResponseBody extends TeaModel {
    /**
     * <p>The information of the member account.</p>
     */
    @NameInMap("Account")
    public CreateCloudAccountResponseBodyAccount account;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCloudAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudAccountResponseBody self = new CreateCloudAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudAccountResponseBody setAccount(CreateCloudAccountResponseBodyAccount account) {
        this.account = account;
        return this;
    }
    public CreateCloudAccountResponseBodyAccount getAccount() {
        return this.account;
    }

    public CreateCloudAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCloudAccountResponseBodyAccount extends TeaModel {
        /**
         * <p>The ID of the member account.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The name of the member account.</p>
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
         * <p>admin-****</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-bVaRIG****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The way in which the member account joined the resource directory. Valid values:</p>
         * <ul>
         * <li>invited: The member account is invited to join the resource directory.</li>
         * <li>created: The member account is directly created in the resource directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("JoinMethod")
        public String joinMethod;

        /**
         * <p>The time when the member account was modified.</p>
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
         * <p>06950264-3f0d-4ca9-82dd-6ee7a3d3****</p>
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
         * <p>The status of the member account. Valid values:</p>
         * <ul>
         * <li>CreateSuccess: The member account is created.</li>
         * <li>CreateVerifying: The creation of the member account is under confirmation.</li>
         * <li>CreateFailed: The member account failed to be created.</li>
         * <li>CreateExpired: The creation of the member account expired.</li>
         * <li>CreateCancelled: The creation of the member account is canceled.</li>
         * <li>PromoteVerifying: The upgrade of the member account is under confirmation.</li>
         * <li>PromoteFailed: The member account failed to be upgraded.</li>
         * <li>PromoteExpired: The upgrade of the member account expired.</li>
         * <li>PromoteCancelled: The upgrade of the member account is canceled.</li>
         * <li>PromoteSuccess: The member account is upgraded.</li>
         * <li>InviteSuccess: The owner of the member account accepted the invitation.</li>
         * <li>Removed: The member account is removed from the resource directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateVerifying</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the member account. The value CloudAccount indicates that the member account is a cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudAccount</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateCloudAccountResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudAccountResponseBodyAccount self = new CreateCloudAccountResponseBodyAccount();
            return TeaModel.build(map, self);
        }

        public CreateCloudAccountResponseBodyAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CreateCloudAccountResponseBodyAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public CreateCloudAccountResponseBodyAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateCloudAccountResponseBodyAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public CreateCloudAccountResponseBodyAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public CreateCloudAccountResponseBodyAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public CreateCloudAccountResponseBodyAccount setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public CreateCloudAccountResponseBodyAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public CreateCloudAccountResponseBodyAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateCloudAccountResponseBodyAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
