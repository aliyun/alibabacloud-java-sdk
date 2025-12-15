// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListAuthorizedAccountsResponseBody extends TeaModel {
    /**
     * <p>The information about the member.</p>
     */
    @NameInMap("Accounts")
    public ListAuthorizedAccountsResponseBodyAccounts accounts;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
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

    public static ListAuthorizedAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedAccountsResponseBody self = new ListAuthorizedAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedAccountsResponseBody setAccounts(ListAuthorizedAccountsResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public ListAuthorizedAccountsResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public ListAuthorizedAccountsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedAccountsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizedAccountsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthorizedAccountsResponseBodyAccountsAccount extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>184311716100****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The name of the member.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The display name of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-bVaRIG****</p>
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
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("JoinTime")
        public String joinTime;

        /**
         * <p>The time when the member was modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-k4****</p>
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

        public static ListAuthorizedAccountsResponseBodyAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedAccountsResponseBodyAccountsAccount self = new ListAuthorizedAccountsResponseBodyAccountsAccount();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedAccountsResponseBodyAccountsAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListAuthorizedAccountsResponseBodyAccountsAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListAuthorizedAccountsResponseBodyAccountsAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAuthorizedAccountsResponseBodyAccountsAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListAuthorizedAccountsResponseBodyAccountsAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public ListAuthorizedAccountsResponseBodyAccountsAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public ListAuthorizedAccountsResponseBodyAccountsAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListAuthorizedAccountsResponseBodyAccountsAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ListAuthorizedAccountsResponseBodyAccountsAccount setResourceDirectoryPath(String resourceDirectoryPath) {
            this.resourceDirectoryPath = resourceDirectoryPath;
            return this;
        }
        public String getResourceDirectoryPath() {
            return this.resourceDirectoryPath;
        }

        public ListAuthorizedAccountsResponseBodyAccountsAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAuthorizedAccountsResponseBodyAccountsAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAuthorizedAccountsResponseBodyAccounts extends TeaModel {
        @NameInMap("Account")
        public java.util.List<ListAuthorizedAccountsResponseBodyAccountsAccount> account;

        public static ListAuthorizedAccountsResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedAccountsResponseBodyAccounts self = new ListAuthorizedAccountsResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedAccountsResponseBodyAccounts setAccount(java.util.List<ListAuthorizedAccountsResponseBodyAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<ListAuthorizedAccountsResponseBodyAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
