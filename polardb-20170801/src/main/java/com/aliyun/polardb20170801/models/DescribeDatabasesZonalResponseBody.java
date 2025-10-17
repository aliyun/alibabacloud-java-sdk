// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDatabasesZonalResponseBody extends TeaModel {
    @NameInMap("Databases")
    public java.util.List<DescribeDatabasesZonalResponseBodyDatabases> databases;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>212db86sca4384811e0b5e8707e******</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>2FED790E-FB61-4721-8C1C-07C627******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDatabasesZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabasesZonalResponseBody self = new DescribeDatabasesZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatabasesZonalResponseBody setDatabases(java.util.List<DescribeDatabasesZonalResponseBodyDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<DescribeDatabasesZonalResponseBodyDatabases> getDatabases() {
        return this.databases;
    }

    public DescribeDatabasesZonalResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDatabasesZonalResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDatabasesZonalResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDatabasesZonalResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDatabasesZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDatabasesZonalResponseBodyDatabasesAccounts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test_acc</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>ReadOnly</p>
         */
        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <strong>example:</strong>
         * <p>Empowered</p>
         */
        @NameInMap("PrivilegeStatus")
        public String privilegeStatus;

        public static DescribeDatabasesZonalResponseBodyDatabasesAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesZonalResponseBodyDatabasesAccounts self = new DescribeDatabasesZonalResponseBodyDatabasesAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesZonalResponseBodyDatabasesAccounts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeDatabasesZonalResponseBodyDatabasesAccounts setAccountPrivilege(String accountPrivilege) {
            this.accountPrivilege = accountPrivilege;
            return this;
        }
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        public DescribeDatabasesZonalResponseBodyDatabasesAccounts setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeDatabasesZonalResponseBodyDatabasesAccounts setPrivilegeStatus(String privilegeStatus) {
            this.privilegeStatus = privilegeStatus;
            return this;
        }
        public String getPrivilegeStatus() {
            return this.privilegeStatus;
        }

    }

    public static class DescribeDatabasesZonalResponseBodyDatabases extends TeaModel {
        @NameInMap("Accounts")
        public java.util.List<DescribeDatabasesZonalResponseBodyDatabasesAccounts> accounts;

        /**
         * <strong>example:</strong>
         * <p>utf8mb4</p>
         */
        @NameInMap("CharacterSetName")
        public String characterSetName;

        /**
         * <strong>example:</strong>
         * <p>test_des</p>
         */
        @NameInMap("DBDescription")
        public String DBDescription;

        /**
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBStatus")
        public String DBStatus;

        /**
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MasterID")
        public String masterID;

        public static DescribeDatabasesZonalResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesZonalResponseBodyDatabases self = new DescribeDatabasesZonalResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesZonalResponseBodyDatabases setAccounts(java.util.List<DescribeDatabasesZonalResponseBodyDatabasesAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<DescribeDatabasesZonalResponseBodyDatabasesAccounts> getAccounts() {
            return this.accounts;
        }

        public DescribeDatabasesZonalResponseBodyDatabases setCharacterSetName(String characterSetName) {
            this.characterSetName = characterSetName;
            return this;
        }
        public String getCharacterSetName() {
            return this.characterSetName;
        }

        public DescribeDatabasesZonalResponseBodyDatabases setDBDescription(String DBDescription) {
            this.DBDescription = DBDescription;
            return this;
        }
        public String getDBDescription() {
            return this.DBDescription;
        }

        public DescribeDatabasesZonalResponseBodyDatabases setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeDatabasesZonalResponseBodyDatabases setDBStatus(String DBStatus) {
            this.DBStatus = DBStatus;
            return this;
        }
        public String getDBStatus() {
            return this.DBStatus;
        }

        public DescribeDatabasesZonalResponseBodyDatabases setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDatabasesZonalResponseBodyDatabases setMasterID(String masterID) {
            this.masterID = masterID;
            return this;
        }
        public String getMasterID() {
            return this.masterID;
        }

    }

}
