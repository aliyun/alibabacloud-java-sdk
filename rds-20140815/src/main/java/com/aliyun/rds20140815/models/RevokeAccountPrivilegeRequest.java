// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RevokeAccountPrivilegeRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    public static RevokeAccountPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeAccountPrivilegeRequest self = new RevokeAccountPrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public RevokeAccountPrivilegeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RevokeAccountPrivilegeRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public RevokeAccountPrivilegeRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

}
