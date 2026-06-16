// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    /**
     * <p>The description of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The name of the account to be created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testAccount</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the account to be created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test@1111</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The permissions to be granted to the new account on the specified database. Valid values:</p>
     * <ul>
     * <li>ReadWrite</li>
     * <li>ReadOnly</li>
     * <li>DMLOnly</li>
     * <li>DDLOnly.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

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
     * <p>The name of the database to be authorized.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The region in which the instance resides.</p>
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
     * <p>If three-role mode is enabled, this parameter is required. If three-role mode is not enabled, this parameter is not required.</p>
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
     * <p>If three-role mode is enabled, this parameter is required. If three-role mode is not enabled, this parameter is not required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>securityPassword</p>
     */
    @NameInMap("SecurityAccountPassword")
    public String securityAccountPassword;

    public static CreateAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountRequest self = new CreateAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountRequest setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }
    public String getAccountDescription() {
        return this.accountDescription;
    }

    public CreateAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateAccountRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateAccountRequest setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
        return this;
    }
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    public CreateAccountRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateAccountRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAccountRequest setSecurityAccountName(String securityAccountName) {
        this.securityAccountName = securityAccountName;
        return this;
    }
    public String getSecurityAccountName() {
        return this.securityAccountName;
    }

    public CreateAccountRequest setSecurityAccountPassword(String securityAccountPassword) {
        this.securityAccountPassword = securityAccountPassword;
        return this;
    }
    public String getSecurityAccountPassword() {
        return this.securityAccountPassword;
    }

}
