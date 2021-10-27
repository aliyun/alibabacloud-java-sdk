// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ResendPromoteResourceAccountEmailResponseBody extends TeaModel {
    @NameInMap("Account")
    public ResendPromoteResourceAccountEmailResponseBodyAccount account;

    @NameInMap("RequestId")
    public String requestId;

    public static ResendPromoteResourceAccountEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResendPromoteResourceAccountEmailResponseBody self = new ResendPromoteResourceAccountEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public ResendPromoteResourceAccountEmailResponseBody setAccount(ResendPromoteResourceAccountEmailResponseBodyAccount account) {
        this.account = account;
        return this;
    }
    public ResendPromoteResourceAccountEmailResponseBodyAccount getAccount() {
        return this.account;
    }

    public ResendPromoteResourceAccountEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResendPromoteResourceAccountEmailResponseBodyAccount extends TeaModel {
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

        public static ResendPromoteResourceAccountEmailResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            ResendPromoteResourceAccountEmailResponseBodyAccount self = new ResendPromoteResourceAccountEmailResponseBodyAccount();
            return TeaModel.build(map, self);
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ResendPromoteResourceAccountEmailResponseBodyAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
