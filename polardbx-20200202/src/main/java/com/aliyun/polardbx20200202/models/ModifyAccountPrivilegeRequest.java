// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyAccountPrivilegeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account_sec</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-htri0ori2r4k9p</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>sbtest</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>account_audit</p>
     */
    @NameInMap("SecurityAccountName")
    public String securityAccountName;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SecurityAccountPassword")
    public String securityAccountPassword;

    public static ModifyAccountPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPrivilegeRequest self = new ModifyAccountPrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPrivilegeRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyAccountPrivilegeRequest setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
        return this;
    }
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    public ModifyAccountPrivilegeRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyAccountPrivilegeRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ModifyAccountPrivilegeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAccountPrivilegeRequest setSecurityAccountName(String securityAccountName) {
        this.securityAccountName = securityAccountName;
        return this;
    }
    public String getSecurityAccountName() {
        return this.securityAccountName;
    }

    public ModifyAccountPrivilegeRequest setSecurityAccountPassword(String securityAccountPassword) {
        this.securityAccountPassword = securityAccountPassword;
        return this;
    }
    public String getSecurityAccountPassword() {
        return this.securityAccountPassword;
    }

}
