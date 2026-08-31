// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateOpenSearchAccountRequest extends TeaModel {
    /**
     * <p>The name of the account to be created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account_sec</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the account. The password must be 6 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters (!@#$&amp;%^*()_+-=).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The name of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The region in which the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateOpenSearchAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenSearchAccountRequest self = new CreateOpenSearchAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateOpenSearchAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateOpenSearchAccountRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateOpenSearchAccountRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateOpenSearchAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
