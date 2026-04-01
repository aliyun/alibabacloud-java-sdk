// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDatabasesResponseBody extends TeaModel {
    @NameInMap("Databases")
    public DescribeDatabasesResponseBodyDatabases databases;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2603CA96-B17D-4903-BC04-61A2C829CD94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabasesResponseBody self = new DescribeDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatabasesResponseBody setDatabases(DescribeDatabasesResponseBodyDatabases databases) {
        this.databases = databases;
        return this;
    }
    public DescribeDatabasesResponseBodyDatabases getDatabases() {
        return this.databases;
    }

    public DescribeDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        @NameInMap("AccountPrivilegeDetail")
        public String accountPrivilegeDetail;

        public static DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo self = new DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo setAccountPrivilege(String accountPrivilege) {
            this.accountPrivilege = accountPrivilege;
            return this;
        }
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo setAccountPrivilegeDetail(String accountPrivilegeDetail) {
            this.accountPrivilegeDetail = accountPrivilegeDetail;
            return this;
        }
        public String getAccountPrivilegeDetail() {
            return this.accountPrivilegeDetail;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabaseAccounts extends TeaModel {
        @NameInMap("AccountPrivilegeInfo")
        public java.util.List<DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo> accountPrivilegeInfo;

        public static DescribeDatabasesResponseBodyDatabasesDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabaseAccounts self = new DescribeDatabasesResponseBodyDatabasesDatabaseAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccounts setAccountPrivilegeInfo(java.util.List<DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo> accountPrivilegeInfo) {
            this.accountPrivilegeInfo = accountPrivilegeInfo;
            return this;
        }
        public java.util.List<DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo> getAccountPrivilegeInfo() {
            return this.accountPrivilegeInfo;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo extends TeaModel {
        @NameInMap("AdvancedDbProperty")
        public java.util.List<java.util.Map<String, ?>> advancedDbProperty;

        public static DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo self = new DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo setAdvancedDbProperty(java.util.List<java.util.Map<String, ?>> advancedDbProperty) {
            this.advancedDbProperty = advancedDbProperty;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getAdvancedDbProperty() {
            return this.advancedDbProperty;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo extends TeaModel {
        @NameInMap("BasicDbProperty")
        public java.util.List<java.util.Map<String, ?>> basicDbProperty;

        public static DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo self = new DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo setBasicDbProperty(java.util.List<java.util.Map<String, ?>> basicDbProperty) {
            this.basicDbProperty = basicDbProperty;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getBasicDbProperty() {
            return this.basicDbProperty;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo extends TeaModel {
        @NameInMap("RuntimeDbProperty")
        public java.util.List<java.util.Map<String, ?>> runtimeDbProperty;

        public static DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo self = new DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo setRuntimeDbProperty(java.util.List<java.util.Map<String, ?>> runtimeDbProperty) {
            this.runtimeDbProperty = runtimeDbProperty;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getRuntimeDbProperty() {
            return this.runtimeDbProperty;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabase extends TeaModel {
        @NameInMap("Accounts")
        public DescribeDatabasesResponseBodyDatabasesDatabaseAccounts accounts;

        @NameInMap("AdvancedInfo")
        public DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo advancedInfo;

        @NameInMap("BasicInfo")
        public DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo basicInfo;

        @NameInMap("CharacterSetName")
        public String characterSetName;

        @NameInMap("Collate")
        public String collate;

        @NameInMap("ConnLimit")
        public String connLimit;

        @NameInMap("Ctype")
        public String ctype;

        @NameInMap("DBDescription")
        public String DBDescription;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("DBStatus")
        public String DBStatus;

        @NameInMap("DuckDBEnabled")
        public Boolean duckDBEnabled;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RuntimeInfo")
        public DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo runtimeInfo;

        @NameInMap("Tablespace")
        public String tablespace;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeDatabasesResponseBodyDatabasesDatabase build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabase self = new DescribeDatabasesResponseBodyDatabasesDatabase();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setAccounts(DescribeDatabasesResponseBodyDatabasesDatabaseAccounts accounts) {
            this.accounts = accounts;
            return this;
        }
        public DescribeDatabasesResponseBodyDatabasesDatabaseAccounts getAccounts() {
            return this.accounts;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setAdvancedInfo(DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo advancedInfo) {
            this.advancedInfo = advancedInfo;
            return this;
        }
        public DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo getAdvancedInfo() {
            return this.advancedInfo;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setBasicInfo(DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }
        public DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo getBasicInfo() {
            return this.basicInfo;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setCharacterSetName(String characterSetName) {
            this.characterSetName = characterSetName;
            return this;
        }
        public String getCharacterSetName() {
            return this.characterSetName;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setCollate(String collate) {
            this.collate = collate;
            return this;
        }
        public String getCollate() {
            return this.collate;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setConnLimit(String connLimit) {
            this.connLimit = connLimit;
            return this;
        }
        public String getConnLimit() {
            return this.connLimit;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setCtype(String ctype) {
            this.ctype = ctype;
            return this;
        }
        public String getCtype() {
            return this.ctype;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setDBDescription(String DBDescription) {
            this.DBDescription = DBDescription;
            return this;
        }
        public String getDBDescription() {
            return this.DBDescription;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setDBStatus(String DBStatus) {
            this.DBStatus = DBStatus;
            return this;
        }
        public String getDBStatus() {
            return this.DBStatus;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setDuckDBEnabled(Boolean duckDBEnabled) {
            this.duckDBEnabled = duckDBEnabled;
            return this;
        }
        public Boolean getDuckDBEnabled() {
            return this.duckDBEnabled;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setRuntimeInfo(DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo runtimeInfo) {
            this.runtimeInfo = runtimeInfo;
            return this;
        }
        public DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo getRuntimeInfo() {
            return this.runtimeInfo;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setTablespace(String tablespace) {
            this.tablespace = tablespace;
            return this;
        }
        public String getTablespace() {
            return this.tablespace;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabases extends TeaModel {
        @NameInMap("Database")
        public java.util.List<DescribeDatabasesResponseBodyDatabasesDatabase> database;

        public static DescribeDatabasesResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabases self = new DescribeDatabasesResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabases setDatabase(java.util.List<DescribeDatabasesResponseBodyDatabasesDatabase> database) {
            this.database = database;
            return this;
        }
        public java.util.List<DescribeDatabasesResponseBodyDatabasesDatabase> getDatabase() {
            return this.database;
        }

    }

}
