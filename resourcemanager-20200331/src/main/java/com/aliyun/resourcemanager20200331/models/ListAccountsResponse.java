// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAccountsResponse extends TeaModel {
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
    public ListAccountsResponseAccounts accounts;

    public static ListAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsResponse self = new ListAccountsResponse();
        return TeaModel.build(map, self);
    }

    public ListAccountsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAccountsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAccountsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccountsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAccountsResponse setAccounts(ListAccountsResponseAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public ListAccountsResponseAccounts getAccounts() {
        return this.accounts;
    }

    public static class ListAccountsResponseAccountsAccount extends TeaModel {
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

        public static ListAccountsResponseAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsResponseAccountsAccount self = new ListAccountsResponseAccountsAccount();
            return TeaModel.build(map, self);
        }

        public ListAccountsResponseAccountsAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAccountsResponseAccountsAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListAccountsResponseAccountsAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public ListAccountsResponseAccountsAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ListAccountsResponseAccountsAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAccountsResponseAccountsAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListAccountsResponseAccountsAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAccountsResponseAccountsAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ListAccountsResponseAccountsAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

    }

    public static class ListAccountsResponseAccounts extends TeaModel {
        @NameInMap("Account")
        @Validation(required = true)
        public java.util.List<ListAccountsResponseAccountsAccount> account;

        public static ListAccountsResponseAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsResponseAccounts self = new ListAccountsResponseAccounts();
            return TeaModel.build(map, self);
        }

        public ListAccountsResponseAccounts setAccount(java.util.List<ListAccountsResponseAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<ListAccountsResponseAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
