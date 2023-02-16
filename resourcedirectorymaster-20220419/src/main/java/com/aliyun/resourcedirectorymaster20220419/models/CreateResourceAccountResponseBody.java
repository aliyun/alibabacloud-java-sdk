// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CreateResourceAccountResponseBody extends TeaModel {
    @NameInMap("Account")
    public CreateResourceAccountResponseBodyAccount account;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateResourceAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceAccountResponseBody self = new CreateResourceAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceAccountResponseBody setAccount(CreateResourceAccountResponseBodyAccount account) {
        this.account = account;
        return this;
    }
    public CreateResourceAccountResponseBodyAccount getAccount() {
        return this.account;
    }

    public CreateResourceAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateResourceAccountResponseBodyAccount extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("JoinMethod")
        public String joinMethod;

        @NameInMap("JoinTime")
        public String joinTime;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static CreateResourceAccountResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceAccountResponseBodyAccount self = new CreateResourceAccountResponseBodyAccount();
            return TeaModel.build(map, self);
        }

        public CreateResourceAccountResponseBodyAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CreateResourceAccountResponseBodyAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public CreateResourceAccountResponseBodyAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateResourceAccountResponseBodyAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public CreateResourceAccountResponseBodyAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public CreateResourceAccountResponseBodyAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public CreateResourceAccountResponseBodyAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public CreateResourceAccountResponseBodyAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public CreateResourceAccountResponseBodyAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateResourceAccountResponseBodyAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
