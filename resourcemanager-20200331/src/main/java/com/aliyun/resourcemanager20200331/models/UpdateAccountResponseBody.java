// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAccountResponseBody extends TeaModel {
    @NameInMap("Account")
    public UpdateAccountResponseBodyAccount account;

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

        @NameInMap("JoinTime")
        public String joinTime;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("JoinMethod")
        public String joinMethod;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("AccountName")
        public String accountName;

        public static UpdateAccountResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            UpdateAccountResponseBodyAccount self = new UpdateAccountResponseBodyAccount();
            return TeaModel.build(map, self);
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

        public UpdateAccountResponseBodyAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public UpdateAccountResponseBodyAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public UpdateAccountResponseBodyAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UpdateAccountResponseBodyAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public UpdateAccountResponseBodyAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public UpdateAccountResponseBodyAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

}
