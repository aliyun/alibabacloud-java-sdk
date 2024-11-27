// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabaseAccountsResponseBody extends TeaModel {
    /**
     * <p>The returned database accounts.</p>
     */
    @NameInMap("DatabaseAccounts")
    public java.util.List<ListDatabaseAccountsResponseBodyDatabaseAccounts> databaseAccounts;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4F6C075F-FC86-476E-943B-097BD4E12948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of database accounts returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <p>The database account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        @NameInMap("DatabaseAccountId")
        public String databaseAccountId;

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DatabaseAccountName")
        public String databaseAccountName;

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The name of the database. A value is returned for this parameter if the engine of the database with the specified database ID is PostgreSQL or Oracle.</p>
         * 
         * <strong>example:</strong>
         * <p>orcl</p>
         */
        @NameInMap("DatabaseSchema")
        public String databaseSchema;

        /**
         * <p>Indicates whether the database account has a password. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
