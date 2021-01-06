// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAccountsForParentResponse extends TeaModel {
    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Accounts")
    @Validation(required = true)
    public ListAccountsForParentResponseAccounts accounts;

    public static ListAccountsForParentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsForParentResponse self = new ListAccountsForParentResponse();
        return TeaModel.build(map, self);
    }

    public ListAccountsForParentResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAccountsForParentResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAccountsForParentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccountsForParentResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAccountsForParentResponse setAccounts(ListAccountsForParentResponseAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public ListAccountsForParentResponseAccounts getAccounts() {
        return this.accounts;
    }

    public static class ListAccountsForParentResponseAccountsAccount extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("JoinMethod")
        @Validation(required = true)
        public String joinMethod;

        @NameInMap("ResourceDirectoryId")
        @Validation(required = true)
        public String resourceDirectoryId;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("JoinTime")
        @Validation(required = true)
        public String joinTime;

        @NameInMap("FolderId")
        @Validation(required = true)
        public String folderId;

        public static ListAccountsForParentResponseAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsForParentResponseAccountsAccount self = new ListAccountsForParentResponseAccountsAccount();
            return TeaModel.build(map, self);
        }

        public ListAccountsForParentResponseAccountsAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAccountsForParentResponseAccountsAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListAccountsForParentResponseAccountsAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public ListAccountsForParentResponseAccountsAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ListAccountsForParentResponseAccountsAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAccountsForParentResponseAccountsAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListAccountsForParentResponseAccountsAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAccountsForParentResponseAccountsAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ListAccountsForParentResponseAccountsAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

    }

    public static class ListAccountsForParentResponseAccounts extends TeaModel {
        @NameInMap("Account")
        @Validation(required = true)
        public java.util.List<ListAccountsForParentResponseAccountsAccount> account;

        public static ListAccountsForParentResponseAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsForParentResponseAccounts self = new ListAccountsForParentResponseAccounts();
            return TeaModel.build(map, self);
        }

        public ListAccountsForParentResponseAccounts setAccount(java.util.List<ListAccountsForParentResponseAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<ListAccountsForParentResponseAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
