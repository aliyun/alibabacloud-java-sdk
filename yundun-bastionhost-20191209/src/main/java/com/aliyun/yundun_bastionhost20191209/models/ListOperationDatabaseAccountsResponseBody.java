// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationDatabaseAccountsResponseBody extends TeaModel {
    /**
     * <p>The database accounts returned.</p>
     */
    @NameInMap("DatabaseAccounts")
    public java.util.List<ListOperationDatabaseAccountsResponseBodyDatabaseAccounts> databaseAccounts;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
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
        /**
         * <p>The name of the PostgreSQL or Oracle database.</p>
         * 
         * <strong>example:</strong>
         * <p>xe</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The database account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DatabaseAccountId")
        public String databaseAccountId;

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("DatabaseAccountName")
        public String databaseAccountName;

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>Indicates whether a password is configured for the database host account.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasPassword")
        public String hasPassword;

        /**
         * <p>The logon attribute. One of the following values is returned if the database engine is Oracle:</p>
         * <ul>
         * <li><strong>SERVICENAME</strong></li>
         * <li><strong>SID</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SID</p>
         */
        @NameInMap("LoginAttribute")
        public String loginAttribute;

        /**
         * <p>The protocol that is used by the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
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
