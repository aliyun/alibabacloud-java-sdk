// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationDatabaseAccountsResponseBody extends TeaModel {
    @NameInMap("DatabaseAccounts")
    public java.util.List<ListOperationDatabaseAccountsResponseBodyDatabaseAccounts> databaseAccounts;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOperationDatabaseAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationDatabaseAccountsResponseBody self = new ListOperationDatabaseAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationDatabaseAccountsResponseBody setDatabaseAccounts(java.util.List<ListOperationDatabaseAccountsResponseBodyDatabaseAccounts> databaseAccounts) {
        this.databaseAccounts = databaseAccounts;
        return this;
    }
    public java.util.List<ListOperationDatabaseAccountsResponseBodyDatabaseAccounts> getDatabaseAccounts() {
        return this.databaseAccounts;
    }

    public ListOperationDatabaseAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperationDatabaseAccountsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOperationDatabaseAccountsResponseBodyDatabaseAccounts extends TeaModel {
        @NameInMap("DBName")
        public String DBName;

        @NameInMap("DatabaseAccountId")
        public String databaseAccountId;

        @NameInMap("DatabaseAccountName")
        public String databaseAccountName;

        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("HasPassword")
        public String hasPassword;

        @NameInMap("LoginAttribute")
        public String loginAttribute;

        @NameInMap("ProtocolName")
        public String protocolName;

        public static ListOperationDatabaseAccountsResponseBodyDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListOperationDatabaseAccountsResponseBodyDatabaseAccounts self = new ListOperationDatabaseAccountsResponseBodyDatabaseAccounts();
            return TeaModel.build(map, self);
        }

        public ListOperationDatabaseAccountsResponseBodyDatabaseAccounts setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public ListOperationDatabaseAccountsResponseBodyDatabaseAccounts setDatabaseAccountId(String databaseAccountId) {
            this.databaseAccountId = databaseAccountId;
            return this;
        }
        public String getDatabaseAccountId() {
            return this.databaseAccountId;
        }

        public ListOperationDatabaseAccountsResponseBodyDatabaseAccounts setDatabaseAccountName(String databaseAccountName) {
            this.databaseAccountName = databaseAccountName;
            return this;
        }
        public String getDatabaseAccountName() {
            return this.databaseAccountName;
        }

        public ListOperationDatabaseAccountsResponseBodyDatabaseAccounts setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public ListOperationDatabaseAccountsResponseBodyDatabaseAccounts setHasPassword(String hasPassword) {
            this.hasPassword = hasPassword;
            return this;
        }
        public String getHasPassword() {
            return this.hasPassword;
        }

        public ListOperationDatabaseAccountsResponseBodyDatabaseAccounts setLoginAttribute(String loginAttribute) {
            this.loginAttribute = loginAttribute;
            return this;
        }
        public String getLoginAttribute() {
            return this.loginAttribute;
        }

        public ListOperationDatabaseAccountsResponseBodyDatabaseAccounts setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
        }

    }

}
