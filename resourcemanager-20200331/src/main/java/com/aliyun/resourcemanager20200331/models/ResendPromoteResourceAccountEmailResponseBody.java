// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ResendPromoteResourceAccountEmailResponseBody extends TeaModel {
    /**
     * <p>The information of the member account.</p>
     */
    @NameInMap("Account")
    public ResendPromoteResourceAccountEmailResponseBodyAccount account;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResendPromoteResourceAccountEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResendPromoteResourceAccountEmailResponseBody self = new ResendPromoteResourceAccountEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public ResendPromoteResourceAccountEmailResponseBody setAccount(ResendPromoteResourceAccountEmailResponseBodyAccount account) {
        this.account = account;
        return this;
    }
    public ResendPromoteResourceAccountEmailResponseBodyAccount getAccount() {
        return this.account;
    }

    public ResendPromoteResourceAccountEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResendPromoteResourceAccountEmailResponseBodyAccount extends TeaModel {
        /**
         * <p>The ID of the account.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The name of the account.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The display name of the member account.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the folder.</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The way in which the member account joined the resource directory. Valid values:</p>
         * <br>
         * <p>*   invited: The member account is invited to join the resource directory.</p>
         * <p>*   created: The member account is directly created in the resource directory.</p>
         */
        @NameInMap("JoinMethod")
        public String joinMethod;

        /**
         * <p>The time when the member account joined the resource directory.</p>
         */
        @NameInMap("JoinTime")
        public String joinTime;

        /**
         * <p>The time when the member account was modified.</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The account record ID.</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <p>The ID of the resource directory.</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The status of the member account. Valid values:</p>
         * <br>
         * <p>*   CreateSuccess: The member account is created.</p>
         * <p>*   CreateVerifying: The creation of the member account is under confirmation.</p>
         * <p>*   CreateFailed: The member account failed to be created.</p>
         * <p>*   CreateExpired: The creation of the member account expired.</p>
         * <p>*   CreateCancelled: The creation of the member account is canceled.</p>
         * <p>*   PromoteVerifying: The upgrade of the member account is under confirmation.</p>
         * <p>*   PromoteFailed: The member account failed to be upgraded.</p>
         * <p>*   PromoteExpired: The upgrade of the member account expired.</p>
         * <p>*   PromoteCancelled: The upgrade of the member account is canceled.</p>
         * <p>*   PromoteSuccess: The member account is upgraded.</p>
         * <p>*   InviteSuccess: The owner of the member account accepted the invitation.</p>
         * <p>*   Removed: The member account is removed from the resource directory.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the member account. Valid values:</p>
         * <br>
         * <p>*   CloudAccount: cloud account</p>
         * <p>*   ResourceAccount: resource account</p>
         */
        @NameInMap("Type")
        public String type;

        public static ResendPromoteResourceAccountEmailResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            ResendPromoteResourceAccountEmailResponseBodyAccount self = new ResendPromoteResourceAccountEmailResponseBodyAccount();
            return TeaModel.build(map, self);
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
