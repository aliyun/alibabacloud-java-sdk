// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class PromoteResourceAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Account")
    @Validation(required = true)
    public PromoteResourceAccountResponseAccount account;

    public static PromoteResourceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        PromoteResourceAccountResponse self = new PromoteResourceAccountResponse();
        return TeaModel.build(map, self);
    }

    public PromoteResourceAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PromoteResourceAccountResponse setAccount(PromoteResourceAccountResponseAccount account) {
        this.account = account;
        return this;
    }
    public PromoteResourceAccountResponseAccount getAccount() {
        return this.account;
    }

    public static class PromoteResourceAccountResponseAccount extends TeaModel {
        @NameInMap("ResourceDirectoryId")
        @Validation(required = true)
        public String resourceDirectoryId;

        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("FolderId")
        @Validation(required = true)
        public String folderId;

        @NameInMap("JoinMethod")
        @Validation(required = true)
        public String joinMethod;

        @NameInMap("JoinTime")
        @Validation(required = true)
        public String joinTime;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("RecordId")
        @Validation(required = true)
        public String recordId;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        public static PromoteResourceAccountResponseAccount build(java.util.Map<String, ?> map) throws Exception {
            PromoteResourceAccountResponseAccount self = new PromoteResourceAccountResponseAccount();
            return TeaModel.build(map, self);
        }

        public PromoteResourceAccountResponseAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public PromoteResourceAccountResponseAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public PromoteResourceAccountResponseAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public PromoteResourceAccountResponseAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public PromoteResourceAccountResponseAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public PromoteResourceAccountResponseAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public PromoteResourceAccountResponseAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PromoteResourceAccountResponseAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PromoteResourceAccountResponseAccount setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public PromoteResourceAccountResponseAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public PromoteResourceAccountResponseAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

}
