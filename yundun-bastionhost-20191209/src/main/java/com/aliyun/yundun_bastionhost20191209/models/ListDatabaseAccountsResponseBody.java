// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabaseAccountsResponseBody extends TeaModel {
    @NameInMap("DatabaseAccounts")
    public java.util.List<ListDatabaseAccountsResponseBodyDatabaseAccounts> databaseAccounts;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDatabaseAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseAccountsResponseBody self = new ListDatabaseAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabaseAccountsResponseBody setDatabaseAccounts(java.util.List<ListDatabaseAccountsResponseBodyDatabaseAccounts> databaseAccounts) {
        this.databaseAccounts = databaseAccounts;
        return this;
    }
    public java.util.List<ListDatabaseAccountsResponseBodyDatabaseAccounts> getDatabaseAccounts() {
        return this.databaseAccounts;
    }

    public ListDatabaseAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabaseAccountsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDatabaseAccountsResponseBodyDatabaseAccounts extends TeaModel {
        @NameInMap("DatabaseAccountId")
        public String databaseAccountId;

        @NameInMap("DatabaseAccountName")
        public String databaseAccountName;

        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("DatabaseSchema")
        public String databaseSchema;

        @NameInMap("HasPassword")
        public String hasPassword;

        public static ListDatabaseAccountsResponseBodyDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListDatabaseAccountsResponseBodyDatabaseAccounts self = new ListDatabaseAccountsResponseBodyDatabaseAccounts();
            return TeaModel.build(map, self);
        }

        public ListDatabaseAccountsResponseBodyDatabaseAccounts setDatabaseAccountId(String databaseAccountId) {
            this.databaseAccountId = databaseAccountId;
            return this;
        }
        public String getDatabaseAccountId() {
            return this.databaseAccountId;
        }

        public ListDatabaseAccountsResponseBodyDatabaseAccounts setDatabaseAccountName(String databaseAccountName) {
            this.databaseAccountName = databaseAccountName;
            return this;
        }
        public String getDatabaseAccountName() {
            return this.databaseAccountName;
        }

        public ListDatabaseAccountsResponseBodyDatabaseAccounts setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public ListDatabaseAccountsResponseBodyDatabaseAccounts setDatabaseSchema(String databaseSchema) {
            this.databaseSchema = databaseSchema;
            return this;
        }
        public String getDatabaseSchema() {
            return this.databaseSchema;
        }

        public ListDatabaseAccountsResponseBodyDatabaseAccounts setHasPassword(String hasPassword) {
            this.hasPassword = hasPassword;
            return this;
        }
        public String getHasPassword() {
            return this.hasPassword;
        }

    }

}
