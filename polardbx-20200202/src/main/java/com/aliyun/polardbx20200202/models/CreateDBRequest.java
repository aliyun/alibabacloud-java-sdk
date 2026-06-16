// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateDBRequest extends TeaModel {
    /**
     * <p>The name of the account that is authorized to access the created database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testaccount</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The permissions granted to the account on the database. Valid values:</p>
     * <ul>
     * <li><strong>ReadWrite</strong>: read and write permissions.</li>
     * <li><strong>ReadOnly</strong>: read-only permissions.</li>
     * <li><strong>DMLOnly</strong>: DML-only permissions.</li>
     * <li><strong>DDLOnly</strong>: DDL-only permissions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The character set. Valid values:</p>
     * <ul>
     * <li><strong>utf8</strong></li>
     * <li><strong>gbk</strong></li>
     * <li><strong>latin1</strong></li>
     * <li><strong>utf8mb4</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>utf8mb4</p>
     */
    @NameInMap("Charset")
    public String charset;

    /**
     * <p>The name of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-**************</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The description of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>db for test</p>
     */
    @NameInMap("DbDescription")
    public String dbDescription;

    /**
     * <p>The name of the database to create.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The mode of the database. Valid values:</p>
     * <ul>
     * <li><strong>auto</strong>: The database supports automatic partitioning. You do not need to specify a partition key when you create a table.</li>
     * <li><strong>drds</strong>: The database does not support automatic partitioning. You must use the dedicated sharding syntax to specify sharding keys when you create a table.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The region where the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the security administrator account.</p>
     * <blockquote>
     * <p>If the three-role mode is enabled, this parameter is required. If the three-role mode is not enabled, this parameter is not required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>securityAccount</p>
     */
    @NameInMap("SecurityAccountName")
    public String securityAccountName;

    /**
     * <p>The password of the security administrator account.</p>
     * <blockquote>
     * <p>If the three-role mode is enabled, this parameter is required. If the three-role mode is not enabled, this parameter is not required.</p>
     * </blockquote>
     * 
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
