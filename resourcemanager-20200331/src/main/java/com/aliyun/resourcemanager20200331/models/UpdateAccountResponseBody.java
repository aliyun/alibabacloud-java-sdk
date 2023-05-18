// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAccountResponseBody extends TeaModel {
    /**
     * <p>The information of the member.</p>
     */
    @NameInMap("Account")
    public UpdateAccountResponseBodyAccount account;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountResponseBody self = new UpdateAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAccountResponseBody setAccount(UpdateAccountResponseBodyAccount account) {
        this.account = account;
        return this;
    }
    public UpdateAccountResponseBodyAccount getAccount() {
        return this.account;
    }

    public UpdateAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAccountResponseBodyAccount extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account that corresponds to the member.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The name of the Alibaba Cloud account that corresponds to the member.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The display name of the member.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the folder.</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The way in which the member joins the resource directory. Valid values:</p>
         * <br>
         * <p>*   invited: The member is invited to join the resource directory.</p>
         * <p>*   created: The member is directly created in the resource directory.</p>
         */
        @NameInMap("JoinMethod")
        public String joinMethod;

        /**
         * <p>The time when the member joined the resource directory. The time is displayed in UTC.</p>
         */
        @NameInMap("JoinTime")
        public String joinTime;

        /**
         * <p>The time when the member was modified. The time is displayed in UTC.</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The ID of the resource directory.</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The status of the member. Valid values:</p>
         * <br>
         * <p>*   CreateSuccess: The member is created.</p>
         * <p>*   InviteSuccess: The member accepts the invitation.</p>
         * <p>*   Removed: The member is removed.</p>
         * <p>*   SwitchSuccess: The type of the member is switched.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the member. Valid values:</p>
         * <br>
         * <p>*   CloudAccount: cloud account</p>
         * <p>*   ResourceAccount: resource account</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateAccountResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            UpdateAccountResponseBodyAccount self = new UpdateAccountResponseBodyAccount();
            return TeaModel.build(map, self);
        }

        public UpdateAccountResponseBodyAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UpdateAccountResponseBodyAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public UpdateAccountResponseBodyAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateAccountResponseBodyAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public UpdateAccountResponseBodyAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public UpdateAccountResponseBodyAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public UpdateAccountResponseBodyAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public UpdateAccountResponseBodyAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public UpdateAccountResponseBodyAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateAccountResponseBodyAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
