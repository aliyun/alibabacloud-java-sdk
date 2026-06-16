// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordRestrictRequest extends TeaModel {
    /**
     * <p>The name of the account whose password you want to reset. &gt; Only passwords of standard accounts can be reset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testaccount</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The account information for which you want to reset the password. Separate multiple account entries with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The instance ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in the specified region, including instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The region ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the account whose password you want to reset. &gt; <em>Only passwords of standard accounts can be reset.</em> You can invoke the <a href="https://help.aliyun.com/document_detail/196844.html">DescribeAccountList</a> operation to query the account information of the target instance, including account names.</p>
     * 
     * <strong>example:</strong>
     * <p>account_sec</p>
     */
    @NameInMap("SecurityAccountName")
    public String securityAccountName;

    /**
     * <p>The password of the security administrator account. &gt; If three-role mode is enabled, this parameter is required. For more information about three-role mode, see <a href="https://help.aliyun.com/document_detail/213824.html">Three-role mode</a>.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SecurityAccountPassword")
    public String securityAccountPassword;

    public static ResetAccountPasswordRestrictRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountPasswordRestrictRequest self = new ResetAccountPasswordRestrictRequest();
        return TeaModel.build(map, self);
    }

    public ResetAccountPasswordRestrictRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ResetAccountPasswordRestrictRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public ResetAccountPasswordRestrictRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ResetAccountPasswordRestrictRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResetAccountPasswordRestrictRequest setSecurityAccountName(String securityAccountName) {
        this.securityAccountName = securityAccountName;
        return this;
    }
    public String getSecurityAccountName() {
        return this.securityAccountName;
    }

    public ResetAccountPasswordRestrictRequest setSecurityAccountPassword(String securityAccountPassword) {
        this.securityAccountPassword = securityAccountPassword;
        return this;
    }
    public String getSecurityAccountPassword() {
        return this.securityAccountPassword;
    }

}
