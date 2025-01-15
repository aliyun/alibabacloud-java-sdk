// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListAccountsResponseBody extends TeaModel {
    /**
     * <p>The information about the members.</p>
     */
    @NameInMap("Accounts")
    public ListAccountsResponseBodyAccounts accounts;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7B8A4E7D-6CFF-471D-84DF-195A7A241ECB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsResponseBody self = new ListAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountsResponseBody setAccounts(ListAccountsResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public ListAccountsResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public ListAccountsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccountsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAccountsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccountsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAccountsResponseBodyAccountsAccountTagsTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAccountsResponseBodyAccountsAccountTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsResponseBodyAccountsAccountTagsTag self = new ListAccountsResponseBodyAccountsAccountTagsTag();
            return TeaModel.build(map, self);
        }

        public ListAccountsResponseBodyAccountsAccountTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAccountsResponseBodyAccountsAccountTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAccountsResponseBodyAccountsAccountTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListAccountsResponseBodyAccountsAccountTagsTag> tag;

        public static ListAccountsResponseBodyAccountsAccountTags build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsResponseBodyAccountsAccountTags self = new ListAccountsResponseBodyAccountsAccountTags();
            return TeaModel.build(map, self);
        }

        public ListAccountsResponseBodyAccountsAccountTags setTag(java.util.List<ListAccountsResponseBodyAccountsAccountTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListAccountsResponseBodyAccountsAccountTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class ListAccountsResponseBodyAccountsAccount extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>181761095690****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The Alibaba Cloud account name of the member.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:oxy01414357@alibaba-inc.com">oxy01414357@alibaba-inc.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The deletion status of the member. Valid values:</p>
         * <ul>
         * <li>Checking: A deletion check is being performed for the member.</li>
         * <li>Deleting: The member is being deleted.</li>
         * <li>CheckFailed: The deletion check for the member fails.</li>
         * <li>DeleteFailed: The member fails to be deleted.</li>
         * </ul>
         * <blockquote>
         * <p> If deletion is not performed for the member, the value of this parameter is empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Checking</p>
         */
        @NameInMap("DeletionStatus")
        public String deletionStatus;

        /**
         * <p>The display name of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-QRzuim****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The way in which the member joins the resource directory. Valid values:</p>
         * <ul>
         * <li>invited: The member is invited to join the resource directory.</li>
         * <li>created: The member is directly created in the resource directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("JoinMethod")
        public String joinMethod;

        /**
         * <p>The time when the member joined the resource directory. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-18T08:01:50.522Z</p>
         */
        @NameInMap("JoinTime")
        public String joinTime;

        /**
         * <p>The time when the member was modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-18T08:04:37.668Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-3G****</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The RDPath of the member.</p>
         */
        @NameInMap("ResourceDirectoryPath")
        public String resourceDirectoryPath;

        /**
         * <p>The status of the member. Valid values:</p>
         * <ul>
         * <li>CreateSuccess: The member is created.</li>
         * <li>PromoteVerifying: The upgrade of the member is under confirmation.</li>
         * <li>PromoteFailed: The upgrade of the member fails.</li>
         * <li>PromoteExpired: The upgrade of the member expires.</li>
         * <li>PromoteCancelled: The upgrade of the member is canceled.</li>
         * <li>PromoteSuccess: The member is upgraded.</li>
         * <li>InviteSuccess: The member accepts the invitation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateSuccess</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags that are added to the member.</p>
         */
        @NameInMap("Tags")
        public ListAccountsResponseBodyAccountsAccountTags tags;

        /**
         * <p>The type of the member. Valid values:</p>
         * <ul>
         * <li>CloudAccount: cloud account</li>
         * <li>ResourceAccount: resource account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ResourceAccount</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAccountsResponseBodyAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsResponseBodyAccountsAccount self = new ListAccountsResponseBodyAccountsAccount();
            return TeaModel.build(map, self);
        }

        public ListAccountsResponseBodyAccountsAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListAccountsResponseBodyAccountsAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListAccountsResponseBodyAccountsAccount setDeletionStatus(String deletionStatus) {
            this.deletionStatus = deletionStatus;
            return this;
        }
        public String getDeletionStatus() {
            return this.deletionStatus;
        }

        public ListAccountsResponseBodyAccountsAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAccountsResponseBodyAccountsAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListAccountsResponseBodyAccountsAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public ListAccountsResponseBodyAccountsAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ListAccountsResponseBodyAccountsAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListAccountsResponseBodyAccountsAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ListAccountsResponseBodyAccountsAccount setResourceDirectoryPath(String resourceDirectoryPath) {
            this.resourceDirectoryPath = resourceDirectoryPath;
            return this;
        }
        public String getResourceDirectoryPath() {
            return this.resourceDirectoryPath;
        }

        public ListAccountsResponseBodyAccountsAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAccountsResponseBodyAccountsAccount setTags(ListAccountsResponseBodyAccountsAccountTags tags) {
            this.tags = tags;
            return this;
        }
        public ListAccountsResponseBodyAccountsAccountTags getTags() {
            return this.tags;
        }

        public ListAccountsResponseBodyAccountsAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAccountsResponseBodyAccounts extends TeaModel {
        @NameInMap("Account")
        public java.util.List<ListAccountsResponseBodyAccountsAccount> account;

        public static ListAccountsResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsResponseBodyAccounts self = new ListAccountsResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public ListAccountsResponseBodyAccounts setAccount(java.util.List<ListAccountsResponseBodyAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<ListAccountsResponseBodyAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
