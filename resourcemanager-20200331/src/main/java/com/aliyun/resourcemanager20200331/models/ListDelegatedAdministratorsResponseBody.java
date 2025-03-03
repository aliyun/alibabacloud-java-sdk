// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListDelegatedAdministratorsResponseBody extends TeaModel {
    /**
     * <p>The information of the delegated administrator accounts.</p>
     */
    @NameInMap("Accounts")
    public ListDelegatedAdministratorsResponseBodyAccounts accounts;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>009C3A02-7D4B-416C-9CE7-548C91508F1E</p>
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
    public Long totalCount;

    public static ListDelegatedAdministratorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDelegatedAdministratorsResponseBody self = new ListDelegatedAdministratorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDelegatedAdministratorsResponseBody setAccounts(ListDelegatedAdministratorsResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public ListDelegatedAdministratorsResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public ListDelegatedAdministratorsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDelegatedAdministratorsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDelegatedAdministratorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDelegatedAdministratorsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDelegatedAdministratorsResponseBodyAccountsAccount extends TeaModel {
        /**
         * <p>The ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>138660628348****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The time when the member was specified as a delegated administrator account.</p>
         * 
         * <strong>example:</strong>
         * <p>1616652684164</p>
         */
        @NameInMap("DelegationEnabledTime")
        public String delegationEnabledTime;

        /**
         * <p>The display name of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

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
         * <p>The identifier of the trusted service.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudfw.aliyuncs.com</p>
         */
        @NameInMap("ServicePrincipal")
        public String servicePrincipal;

        public static ListDelegatedAdministratorsResponseBodyAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            ListDelegatedAdministratorsResponseBodyAccountsAccount self = new ListDelegatedAdministratorsResponseBodyAccountsAccount();
            return TeaModel.build(map, self);
        }

        public ListDelegatedAdministratorsResponseBodyAccountsAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListDelegatedAdministratorsResponseBodyAccountsAccount setDelegationEnabledTime(String delegationEnabledTime) {
            this.delegationEnabledTime = delegationEnabledTime;
            return this;
        }
        public String getDelegationEnabledTime() {
            return this.delegationEnabledTime;
        }

        public ListDelegatedAdministratorsResponseBodyAccountsAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListDelegatedAdministratorsResponseBodyAccountsAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public ListDelegatedAdministratorsResponseBodyAccountsAccount setServicePrincipal(String servicePrincipal) {
            this.servicePrincipal = servicePrincipal;
            return this;
        }
        public String getServicePrincipal() {
            return this.servicePrincipal;
        }

    }

    public static class ListDelegatedAdministratorsResponseBodyAccounts extends TeaModel {
        @NameInMap("Account")
        public java.util.List<ListDelegatedAdministratorsResponseBodyAccountsAccount> account;

        public static ListDelegatedAdministratorsResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListDelegatedAdministratorsResponseBodyAccounts self = new ListDelegatedAdministratorsResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public ListDelegatedAdministratorsResponseBodyAccounts setAccount(java.util.List<ListDelegatedAdministratorsResponseBodyAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<ListDelegatedAdministratorsResponseBodyAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
