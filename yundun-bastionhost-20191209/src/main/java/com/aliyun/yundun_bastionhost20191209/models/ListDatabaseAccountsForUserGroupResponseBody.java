// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabaseAccountsForUserGroupResponseBody extends TeaModel {
    @NameInMap("DatabaseAccounts")
    public java.util.List<ListDatabaseAccountsForUserGroupResponseBodyDatabaseAccounts> databaseAccounts;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDatabaseAccountsForUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseAccountsForUserGroupResponseBody self = new ListDatabaseAccountsForUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabaseAccountsForUserGroupResponseBody setDatabaseAccounts(java.util.List<ListDatabaseAccountsForUserGroupResponseBodyDatabaseAccounts> databaseAccounts) {
        this.databaseAccounts = databaseAccounts;
        return this;
    }
    public java.util.List<ListDatabaseAccountsForUserGroupResponseBodyDatabaseAccounts> getDatabaseAccounts() {
        return this.databaseAccounts;
    }

    public ListDatabaseAccountsForUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabaseAccountsForUserGroupResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDatabaseAccountsForUserGroupResponseBodyDatabaseAccounts extends TeaModel {
        @NameInMap("DatabaseAccountId")
        public String databaseAccountId;

        @NameInMap("DatabaseAccountName")
        public String databaseAccountName;

        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("IsAuthorized")
        public Boolean isAuthorized;

        @NameInMap("ProtocolName")
        public String protocolName;

        public static ListDatabaseAccountsForUserGroupResponseBodyDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListDatabaseAccountsForUserGroupResponseBodyDatabaseAccounts self = new ListDatabaseAccountsForUserGroupResponseBodyDatabaseAccounts();
            return TeaModel.build(map, self);
        }

        public ListDatabaseAccountsForUserGroupResponseBodyDatabaseAccounts setDatabaseAccountId(String databaseAccountId) {
            this.databaseAccountId = databaseAccountId;
            return this;
        }
        public String getDatabaseAccountId() {
            return this.databaseAccountId;
        }

        public ListDatabaseAccountsForUserGroupResponseBodyDatabaseAccounts setDatabaseAccountName(String databaseAccountName) {
            this.databaseAccountName = databaseAccountName;
            return this;
        }
        public String getDatabaseAccountName() {
            return this.databaseAccountName;
        }

        public ListDatabaseAccountsForUserGroupResponseBodyDatabaseAccounts setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public ListDatabaseAccountsForUserGroupResponseBodyDatabaseAccounts setIsAuthorized(Boolean isAuthorized) {
            this.isAuthorized = isAuthorized;
            return this;
        }
        public Boolean getIsAuthorized() {
            return this.isAuthorized;
        }

        public ListDatabaseAccountsForUserGroupResponseBodyDatabaseAccounts setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
        }

    }

}
