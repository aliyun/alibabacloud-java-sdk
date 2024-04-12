// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabaseAccountsForUserResponseBody extends TeaModel {
    @NameInMap("DatabaseAccounts")
    public java.util.List<ListDatabaseAccountsForUserResponseBodyDatabaseAccounts> databaseAccounts;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDatabaseAccountsForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseAccountsForUserResponseBody self = new ListDatabaseAccountsForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabaseAccountsForUserResponseBody setDatabaseAccounts(java.util.List<ListDatabaseAccountsForUserResponseBodyDatabaseAccounts> databaseAccounts) {
        this.databaseAccounts = databaseAccounts;
        return this;
    }
    public java.util.List<ListDatabaseAccountsForUserResponseBodyDatabaseAccounts> getDatabaseAccounts() {
        return this.databaseAccounts;
    }

    public ListDatabaseAccountsForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabaseAccountsForUserResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDatabaseAccountsForUserResponseBodyDatabaseAccounts extends TeaModel {
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

        public static ListDatabaseAccountsForUserResponseBodyDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListDatabaseAccountsForUserResponseBodyDatabaseAccounts self = new ListDatabaseAccountsForUserResponseBodyDatabaseAccounts();
            return TeaModel.build(map, self);
        }

        public ListDatabaseAccountsForUserResponseBodyDatabaseAccounts setDatabaseAccountId(String databaseAccountId) {
            this.databaseAccountId = databaseAccountId;
            return this;
        }
        public String getDatabaseAccountId() {
            return this.databaseAccountId;
        }

        public ListDatabaseAccountsForUserResponseBodyDatabaseAccounts setDatabaseAccountName(String databaseAccountName) {
            this.databaseAccountName = databaseAccountName;
            return this;
        }
        public String getDatabaseAccountName() {
            return this.databaseAccountName;
        }

        public ListDatabaseAccountsForUserResponseBodyDatabaseAccounts setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public ListDatabaseAccountsForUserResponseBodyDatabaseAccounts setIsAuthorized(Boolean isAuthorized) {
            this.isAuthorized = isAuthorized;
            return this;
        }
        public Boolean getIsAuthorized() {
            return this.isAuthorized;
        }

        public ListDatabaseAccountsForUserResponseBodyDatabaseAccounts setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
        }

    }

}
