// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteAccountRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityAccountName")
    public String securityAccountName;

    @NameInMap("SecurityAccountPassword")
    public String securityAccountPassword;

    public static DeleteAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountRequest self = new DeleteAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DeleteAccountRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DeleteAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAccountRequest setSecurityAccountName(String securityAccountName) {
        this.securityAccountName = securityAccountName;
        return this;
    }
    public String getSecurityAccountName() {
        return this.securityAccountName;
    }

    public DeleteAccountRequest setSecurityAccountPassword(String securityAccountPassword) {
        this.securityAccountPassword = securityAccountPassword;
        return this;
    }
    public String getSecurityAccountPassword() {
        return this.securityAccountPassword;
    }

}
