// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeDatabasesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeDatabasesResponseBodyResult result;

    public static DescribeDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabasesResponseBody self = new DescribeDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatabasesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeDatabasesResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribeDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDatabasesResponseBody setResult(DescribeDatabasesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeDatabasesResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeDatabasesResponseBodyResultDatabasesAccounts extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        @NameInMap("AccountPrivilegeDetail")
        public String accountPrivilegeDetail;

        public static DescribeDatabasesResponseBodyResultDatabasesAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyResultDatabasesAccounts self = new DescribeDatabasesResponseBodyResultDatabasesAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyResultDatabasesAccounts setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public DescribeDatabasesResponseBodyResultDatabasesAccounts setAccountPrivilege(String accountPrivilege) {
            this.accountPrivilege = accountPrivilege;
            return this;
        }
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        public DescribeDatabasesResponseBodyResultDatabasesAccounts setAccountPrivilegeDetail(String accountPrivilegeDetail) {
            this.accountPrivilegeDetail = accountPrivilegeDetail;
            return this;
        }
        public String getAccountPrivilegeDetail() {
            return this.accountPrivilegeDetail;
        }

    }

    public static class DescribeDatabasesResponseBodyResultDatabases extends TeaModel {
        @NameInMap("Accounts")
        public java.util.List<DescribeDatabasesResponseBodyResultDatabasesAccounts> accounts;

        @NameInMap("CharacterSetName")
        public String characterSetName;

        @NameInMap("DBDescription")
        public String DBDescription;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("DBStatus")
        public String DBStatus;

        @NameInMap("Engine")
        public String engine;

        public static DescribeDatabasesResponseBodyResultDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyResultDatabases self = new DescribeDatabasesResponseBodyResultDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyResultDatabases setAccounts(java.util.List<DescribeDatabasesResponseBodyResultDatabasesAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<DescribeDatabasesResponseBodyResultDatabasesAccounts> getAccounts() {
            return this.accounts;
        }

        public DescribeDatabasesResponseBodyResultDatabases setCharacterSetName(String characterSetName) {
            this.characterSetName = characterSetName;
            return this;
        }
        public String getCharacterSetName() {
            return this.characterSetName;
        }

        public DescribeDatabasesResponseBodyResultDatabases setDBDescription(String DBDescription) {
            this.DBDescription = DBDescription;
            return this;
        }
        public String getDBDescription() {
            return this.DBDescription;
        }

        public DescribeDatabasesResponseBodyResultDatabases setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDatabasesResponseBodyResultDatabases setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeDatabasesResponseBodyResultDatabases setDBStatus(String DBStatus) {
            this.DBStatus = DBStatus;
            return this;
        }
        public String getDBStatus() {
            return this.DBStatus;
        }

        public DescribeDatabasesResponseBodyResultDatabases setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

    }

    public static class DescribeDatabasesResponseBodyResult extends TeaModel {
        @NameInMap("Databases")
        public java.util.List<DescribeDatabasesResponseBodyResultDatabases> databases;

        public static DescribeDatabasesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyResult self = new DescribeDatabasesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyResult setDatabases(java.util.List<DescribeDatabasesResponseBodyResultDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<DescribeDatabasesResponseBodyResultDatabases> getDatabases() {
            return this.databases;
        }

    }

}
