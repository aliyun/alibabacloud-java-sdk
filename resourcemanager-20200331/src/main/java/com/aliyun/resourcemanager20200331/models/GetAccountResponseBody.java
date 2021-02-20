// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetAccountResponseBody extends TeaModel {
    @NameInMap("Account")
    public GetAccountResponseBodyAccount account;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountResponseBody self = new GetAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountResponseBody setAccount(GetAccountResponseBodyAccount account) {
        this.account = account;
        return this;
    }
    public GetAccountResponseBodyAccount getAccount() {
        return this.account;
    }

    public GetAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccountResponseBodyAccount extends TeaModel {
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

        @NameInMap("IdentityInformation")
        public String identityInformation;

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

        public static GetAccountResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            GetAccountResponseBodyAccount self = new GetAccountResponseBodyAccount();
            return TeaModel.build(map, self);
        }

        public GetAccountResponseBodyAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAccountResponseBodyAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAccountResponseBodyAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAccountResponseBodyAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public GetAccountResponseBodyAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public GetAccountResponseBodyAccount setIdentityInformation(String identityInformation) {
            this.identityInformation = identityInformation;
            return this;
        }
        public String getIdentityInformation() {
            return this.identityInformation;
        }

        public GetAccountResponseBodyAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public GetAccountResponseBodyAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetAccountResponseBodyAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public GetAccountResponseBodyAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetAccountResponseBodyAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

}
