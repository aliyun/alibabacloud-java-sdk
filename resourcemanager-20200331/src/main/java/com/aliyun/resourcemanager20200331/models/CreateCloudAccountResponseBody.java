// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateCloudAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Account")
    public CreateCloudAccountResponseBodyAccount account;

    public static CreateCloudAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudAccountResponseBody self = new CreateCloudAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCloudAccountResponseBody setAccount(CreateCloudAccountResponseBodyAccount account) {
        this.account = account;
        return this;
    }
    public CreateCloudAccountResponseBodyAccount getAccount() {
        return this.account;
    }

    public static class CreateCloudAccountResponseBodyAccount extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("JoinMethod")
        public String joinMethod;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("AccountName")
        public String accountName;

        public static CreateCloudAccountResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudAccountResponseBodyAccount self = new CreateCloudAccountResponseBodyAccount();
            return TeaModel.build(map, self);
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

        public CreateCloudAccountResponseBodyAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public CreateCloudAccountResponseBodyAccount setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public CreateCloudAccountResponseBodyAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
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

        public CreateCloudAccountResponseBodyAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

}
