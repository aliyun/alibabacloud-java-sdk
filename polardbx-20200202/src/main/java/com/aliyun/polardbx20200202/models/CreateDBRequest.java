// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateDBRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("Charset")
    public String charset;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    @NameInMap("DbDescription")
    public String dbDescription;

    @NameInMap("SecurityAccountName")
    public String securityAccountName;

    @NameInMap("SecurityAccountPassword")
    public String securityAccountPassword;

    public static CreateDBRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBRequest self = new CreateDBRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateDBRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateDBRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }
    public String getCharset() {
        return this.charset;
    }

    public CreateDBRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateDBRequest setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
        return this;
    }
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    public CreateDBRequest setDbDescription(String dbDescription) {
        this.dbDescription = dbDescription;
        return this;
    }
    public String getDbDescription() {
        return this.dbDescription;
    }

    public CreateDBRequest setSecurityAccountName(String securityAccountName) {
        this.securityAccountName = securityAccountName;
        return this;
    }
    public String getSecurityAccountName() {
        return this.securityAccountName;
    }

    public CreateDBRequest setSecurityAccountPassword(String securityAccountPassword) {
        this.securityAccountPassword = securityAccountPassword;
        return this;
    }
    public String getSecurityAccountPassword() {
        return this.securityAccountPassword;
    }

}
