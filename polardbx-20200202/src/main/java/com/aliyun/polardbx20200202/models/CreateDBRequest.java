// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateDBRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testaccount</p>
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
     * <p>utf8mb4</p>
     */
    @NameInMap("Charset")
    public String charset;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-**************</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>db for test</p>
     */
    @NameInMap("DbDescription")
    public String dbDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("Mode")
    public String mode;

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
     * <p>securityAccount</p>
     */
    @NameInMap("SecurityAccountName")
    public String securityAccountName;

    /**
     * <strong>example:</strong>
     * <p>securityPassword</p>
     */
    @NameInMap("SecurityAccountPassword")
    public String securityAccountPassword;

    @NameInMap("StoragePoolName")
    public String storagePoolName;

    public static CreateDBRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBRequest self = new CreateDBRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateDBRequest setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
        return this;
    }
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    public CreateDBRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }
    public String getCharset() {
        return this.charset;
    }

    public CreateDBRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateDBRequest setDbDescription(String dbDescription) {
        this.dbDescription = dbDescription;
        return this;
    }
    public String getDbDescription() {
        return this.dbDescription;
    }

    public CreateDBRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateDBRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateDBRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public CreateDBRequest setStoragePoolName(String storagePoolName) {
        this.storagePoolName = storagePoolName;
        return this;
    }
    public String getStoragePoolName() {
        return this.storagePoolName;
    }

}
