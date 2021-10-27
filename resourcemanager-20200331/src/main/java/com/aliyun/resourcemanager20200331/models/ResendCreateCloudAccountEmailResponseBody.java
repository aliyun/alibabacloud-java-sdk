// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ResendCreateCloudAccountEmailResponseBody extends TeaModel {
    @NameInMap("Account")
    public ResendCreateCloudAccountEmailResponseBodyAccount account;

    @NameInMap("RequestId")
    public String requestId;

    public static ResendCreateCloudAccountEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResendCreateCloudAccountEmailResponseBody self = new ResendCreateCloudAccountEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public ResendCreateCloudAccountEmailResponseBody setAccount(ResendCreateCloudAccountEmailResponseBodyAccount account) {
        this.account = account;
        return this;
    }
    public ResendCreateCloudAccountEmailResponseBodyAccount getAccount() {
        return this.account;
    }

    public ResendCreateCloudAccountEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResendCreateCloudAccountEmailResponseBodyAccount extends TeaModel {
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

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static ResendCreateCloudAccountEmailResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            ResendCreateCloudAccountEmailResponseBodyAccount self = new ResendCreateCloudAccountEmailResponseBodyAccount();
            return TeaModel.build(map, self);
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ResendCreateCloudAccountEmailResponseBodyAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
