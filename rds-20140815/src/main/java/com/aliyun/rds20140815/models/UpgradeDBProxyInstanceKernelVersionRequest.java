// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBProxyInstanceKernelVersionRequest extends TeaModel {
    /**
     * <p>Instance ID of the instance. You can call the DescribeDBInstances operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The specified time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>If you set <strong>UpgradeTime</strong> to <strong>SpecifyTime</strong>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-07-10T13:15:12Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The target minor engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.25.9_20251028</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The time when you want to perform the upgrade. Valid values:</p>
     * <ul>
     * <li><strong>MaintainTime</strong> (default): The upgrade is performed within the <a href="https://help.aliyun.com/document_detail/610402.html">maintenance window</a>.</li>
     * <li><strong>Immediate</strong>: The upgrade is performed immediately.</li>
     * <li><strong>SpecifyTime</strong>: The upgrade is performed at a specified time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaintainTime</p>
     */
    @NameInMap("UpgradeTime")
    public String upgradeTime;

    public static UpgradeDBProxyInstanceKernelVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBProxyInstanceKernelVersionRequest self = new UpgradeDBProxyInstanceKernelVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setTargetMinorVersion(String targetMinorVersion) {
        this.targetMinorVersion = targetMinorVersion;
        return this;
    }
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setUpgradeTime(String upgradeTime) {
        this.upgradeTime = upgradeTime;
        return this;
    }
    public String getUpgradeTime() {
        return this.upgradeTime;
    }

}
