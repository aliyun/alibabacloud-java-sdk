// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Account")
    @Validation(required = true)
    public UpdateAccountResponseAccount account;

    public static UpdateAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountResponse self = new UpdateAccountResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAccountResponse setAccount(UpdateAccountResponseAccount account) {
        this.account = account;
        return this;
    }
    public UpdateAccountResponseAccount getAccount() {
        return this.account;
    }

    public static class UpdateAccountResponseAccount extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("JoinMethod")
        @Validation(required = true)
        public String joinMethod;

        @NameInMap("ResourceDirectoryId")
        @Validation(required = true)
        public String resourceDirectoryId;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("JoinTime")
        @Validation(required = true)
        public String joinTime;

        @NameInMap("FolderId")
        @Validation(required = true)
        public String folderId;

        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        public static UpdateAccountResponseAccount build(java.util.Map<String, ?> map) throws Exception {
            UpdateAccountResponseAccount self = new UpdateAccountResponseAccount();
            return TeaModel.build(map, self);
        }

        public UpdateAccountResponseAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateAccountResponseAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public UpdateAccountResponseAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public UpdateAccountResponseAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public UpdateAccountResponseAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateAccountResponseAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UpdateAccountResponseAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateAccountResponseAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public UpdateAccountResponseAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public UpdateAccountResponseAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

}
