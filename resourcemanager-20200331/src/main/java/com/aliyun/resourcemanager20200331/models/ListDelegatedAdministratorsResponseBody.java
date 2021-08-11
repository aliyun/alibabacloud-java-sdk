// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListDelegatedAdministratorsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Accounts")
    public ListDelegatedAdministratorsResponseBodyAccounts accounts;

    public static ListDelegatedAdministratorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDelegatedAdministratorsResponseBody self = new ListDelegatedAdministratorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDelegatedAdministratorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDelegatedAdministratorsResponseBody setAccounts(ListDelegatedAdministratorsResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public ListDelegatedAdministratorsResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public static class ListDelegatedAdministratorsResponseBodyAccountsAccount extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("JoinMethod")
        public String joinMethod;

        @NameInMap("ServicePrincipal")
        public String servicePrincipal;

        @NameInMap("DelegationEnabledTime")
        public String delegationEnabledTime;

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

        public ListDelegatedAdministratorsResponseBodyAccountsAccount setDelegationEnabledTime(String delegationEnabledTime) {
            this.delegationEnabledTime = delegationEnabledTime;
            return this;
        }
        public String getDelegationEnabledTime() {
            return this.delegationEnabledTime;
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
