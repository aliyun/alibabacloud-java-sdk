// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateCloudAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Account")
    @Validation(required = true)
    public CreateCloudAccountResponseAccount account;

    public static CreateCloudAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudAccountResponse self = new CreateCloudAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCloudAccountResponse setAccount(CreateCloudAccountResponseAccount account) {
        this.account = account;
        return this;
    }
    public CreateCloudAccountResponseAccount getAccount() {
        return this.account;
    }

    public static class CreateCloudAccountResponseAccount extends TeaModel {
        @NameInMap("ResourceDirectoryId")
        @Validation(required = true)
        public String resourceDirectoryId;

        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("FolderId")
        @Validation(required = true)
        public String folderId;

        @NameInMap("JoinMethod")
        @Validation(required = true)
        public String joinMethod;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("RecordId")
        @Validation(required = true)
        public String recordId;

        public static CreateCloudAccountResponseAccount build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudAccountResponseAccount self = new CreateCloudAccountResponseAccount();
            return TeaModel.build(map, self);
        }

        public CreateCloudAccountResponseAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public CreateCloudAccountResponseAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CreateCloudAccountResponseAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateCloudAccountResponseAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public CreateCloudAccountResponseAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public CreateCloudAccountResponseAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public CreateCloudAccountResponseAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public CreateCloudAccountResponseAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateCloudAccountResponseAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateCloudAccountResponseAccount setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

    }

}
