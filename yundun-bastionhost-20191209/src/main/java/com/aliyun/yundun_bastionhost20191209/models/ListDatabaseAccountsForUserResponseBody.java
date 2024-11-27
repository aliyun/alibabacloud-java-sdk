// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabaseAccountsForUserResponseBody extends TeaModel {
    /**
     * <p>The database accounts returned.</p>
     */
    @NameInMap("DatabaseAccounts")
    public java.util.List<ListDatabaseAccountsForUserResponseBodyDatabaseAccounts> databaseAccounts;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00E3701B-3616-55FE-93EC-E7CF5480B654</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of database accounts that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
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
        /**
         * <p>The database account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
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
         * <p>The ID of the database to which the database account belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>Indicates whether the user is authorized to manage the database account. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAuthorized")
        public Boolean isAuthorized;

        /**
         * <p>The protocol used by the database account. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>SQLServer</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
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
