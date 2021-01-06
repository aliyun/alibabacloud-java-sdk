// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ResendCreateCloudAccountEmailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Account")
    @Validation(required = true)
    public ResendCreateCloudAccountEmailResponseAccount account;

    public static ResendCreateCloudAccountEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        ResendCreateCloudAccountEmailResponse self = new ResendCreateCloudAccountEmailResponse();
        return TeaModel.build(map, self);
    }

    public ResendCreateCloudAccountEmailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResendCreateCloudAccountEmailResponse setAccount(ResendCreateCloudAccountEmailResponseAccount account) {
        this.account = account;
        return this;
    }
    public ResendCreateCloudAccountEmailResponseAccount getAccount() {
        return this.account;
    }

    public static class ResendCreateCloudAccountEmailResponseAccount extends TeaModel {
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

        public static ResendCreateCloudAccountEmailResponseAccount build(java.util.Map<String, ?> map) throws Exception {
            ResendCreateCloudAccountEmailResponseAccount self = new ResendCreateCloudAccountEmailResponseAccount();
            return TeaModel.build(map, self);
        }

        public ResendCreateCloudAccountEmailResponseAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ResendCreateCloudAccountEmailResponseAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ResendCreateCloudAccountEmailResponseAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ResendCreateCloudAccountEmailResponseAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ResendCreateCloudAccountEmailResponseAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public ResendCreateCloudAccountEmailResponseAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ResendCreateCloudAccountEmailResponseAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ResendCreateCloudAccountEmailResponseAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ResendCreateCloudAccountEmailResponseAccount setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ResendCreateCloudAccountEmailResponseAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ResendCreateCloudAccountEmailResponseAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

}
