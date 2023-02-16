// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListAccountsForParentResponseBody extends TeaModel {
    @NameInMap("Accounts")
    public ListAccountsForParentResponseBodyAccounts accounts;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAccountsForParentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsForParentResponseBody self = new ListAccountsForParentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountsForParentResponseBody setAccounts(ListAccountsForParentResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public ListAccountsForParentResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public ListAccountsForParentResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAccountsForParentResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAccountsForParentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccountsForParentResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAccountsForParentResponseBodyAccountsAccountTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListAccountsForParentResponseBodyAccountsAccountTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsForParentResponseBodyAccountsAccountTagsTag self = new ListAccountsForParentResponseBodyAccountsAccountTagsTag();
            return TeaModel.build(map, self);
        }

        public ListAccountsForParentResponseBodyAccountsAccountTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAccountsForParentResponseBodyAccountsAccountTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAccountsForParentResponseBodyAccountsAccountTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListAccountsForParentResponseBodyAccountsAccountTagsTag> tag;

        public static ListAccountsForParentResponseBodyAccountsAccountTags build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsForParentResponseBodyAccountsAccountTags self = new ListAccountsForParentResponseBodyAccountsAccountTags();
            return TeaModel.build(map, self);
        }

        public ListAccountsForParentResponseBodyAccountsAccountTags setTag(java.util.List<ListAccountsForParentResponseBodyAccountsAccountTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListAccountsForParentResponseBodyAccountsAccountTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class ListAccountsForParentResponseBodyAccountsAccount extends TeaModel {
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

        @NameInMap("Tags")
        public ListAccountsForParentResponseBodyAccountsAccountTags tags;

        @NameInMap("Type")
        public String type;

        public static ListAccountsForParentResponseBodyAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsForParentResponseBodyAccountsAccount self = new ListAccountsForParentResponseBodyAccountsAccount();
            return TeaModel.build(map, self);
        }

        public ListAccountsForParentResponseBodyAccountsAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setTags(ListAccountsForParentResponseBodyAccountsAccountTags tags) {
            this.tags = tags;
            return this;
        }
        public ListAccountsForParentResponseBodyAccountsAccountTags getTags() {
            return this.tags;
        }

        public ListAccountsForParentResponseBodyAccountsAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAccountsForParentResponseBodyAccounts extends TeaModel {
        @NameInMap("Account")
        public java.util.List<ListAccountsForParentResponseBodyAccountsAccount> account;

        public static ListAccountsForParentResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsForParentResponseBodyAccounts self = new ListAccountsForParentResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public ListAccountsForParentResponseBodyAccounts setAccount(java.util.List<ListAccountsForParentResponseBodyAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<ListAccountsForParentResponseBodyAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
