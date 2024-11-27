// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabaseAccountsForUserGroupResponseBody extends TeaModel {
    /**
     * <p>The database accounts returned.</p>
     */
    @NameInMap("DatabaseAccounts")
    public java.util.List<ListDatabaseAccountsForUserGroupResponseBodyDatabaseAccounts> databaseAccounts;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
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
        /**
         * <p>The ID of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("DatabaseAccountId")
        public String databaseAccountId;

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("DatabaseAccountName")
        public String databaseAccountName;

        /**
         * <p>The ID of the database to which the database account belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>Indicates whether the user group is authorized to manage the database account. Valid values:</p>
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
