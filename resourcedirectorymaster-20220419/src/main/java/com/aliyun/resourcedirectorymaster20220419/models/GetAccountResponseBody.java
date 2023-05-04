// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

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

    public static class GetAccountResponseBodyAccountTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetAccountResponseBodyAccountTags build(java.util.Map<String, ?> map) throws Exception {
            GetAccountResponseBodyAccountTags self = new GetAccountResponseBodyAccountTags();
            return TeaModel.build(map, self);
        }

        public GetAccountResponseBodyAccountTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAccountResponseBodyAccountTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAccountResponseBodyAccount extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("EmailStatus")
        public String emailStatus;

        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("IdentityInformation")
        public String identityInformation;

        @NameInMap("JoinMethod")
        public String joinMethod;

        @NameInMap("JoinTime")
        public String joinTime;

        @NameInMap("Location")
        public String location;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        @NameInMap("ResourceDirectoryPath")
        public String resourceDirectoryPath;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<GetAccountResponseBodyAccountTags> tags;

        @NameInMap("Type")
        public String type;

        public static GetAccountResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            GetAccountResponseBodyAccount self = new GetAccountResponseBodyAccount();
            return TeaModel.build(map, self);
        }

        public GetAccountResponseBodyAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetAccountResponseBodyAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetAccountResponseBodyAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAccountResponseBodyAccount setEmailStatus(String emailStatus) {
            this.emailStatus = emailStatus;
            return this;
        }
        public String getEmailStatus() {
            return this.emailStatus;
        }

        public GetAccountResponseBodyAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public GetAccountResponseBodyAccount setIdentityInformation(String identityInformation) {
            this.identityInformation = identityInformation;
            return this;
        }
        public String getIdentityInformation() {
            return this.identityInformation;
        }

        public GetAccountResponseBodyAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public GetAccountResponseBodyAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public GetAccountResponseBodyAccount setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetAccountResponseBodyAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetAccountResponseBodyAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public GetAccountResponseBodyAccount setResourceDirectoryPath(String resourceDirectoryPath) {
            this.resourceDirectoryPath = resourceDirectoryPath;
            return this;
        }
        public String getResourceDirectoryPath() {
            return this.resourceDirectoryPath;
        }

        public GetAccountResponseBodyAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAccountResponseBodyAccount setTags(java.util.List<GetAccountResponseBodyAccountTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetAccountResponseBodyAccountTags> getTags() {
            return this.tags;
        }

        public GetAccountResponseBodyAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
