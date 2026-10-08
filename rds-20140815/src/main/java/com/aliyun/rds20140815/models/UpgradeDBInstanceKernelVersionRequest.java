// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceKernelVersionRequest extends TeaModel {
    /**
     * <p>The instance ID. You can invoke DescribeDBInstances to query the instance ID.</p>
     * <blockquote>
     * <ul>
     * <li>The storage type of the ApsaraDB RDS for PostgreSQL instance must be <strong>cloud disks</strong>. For an instance with Premium Local SSDs, you can invoke the <a href="https://help.aliyun.com/document_detail/26230.html">RestartDBInstance</a> operation to restart the instance, which automatically upgrades the instance to the latest minor engine version.</li>
     * <li>Only the 2019 version of ApsaraDB RDS for SQL Server supports minor engine version upgrades.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The specified time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>UpgradeTime</strong> is set to <strong>SpecifyTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-01-15T00:00:00Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The minor database engine version to which you want to upgrade. Format:</p>
     * <ul>
     * <li><strong>PostgreSQL</strong>: <code>rds_postgres_&lt;Major version number&gt;00_&lt;Minor version number&gt;</code>. Example for version 12 with minor version 20200830: <code>rds_postgres_1200_20200830</code>.</li>
     * <li><strong>MySQL</strong>: <code>&lt;Instance version&gt;_&lt;Minor version number&gt;</code>. Examples: <code>rds_20200229</code>, <code>xcluster_20200229</code>, or <code>xcluster80_20200229</code>. The instance version can be one of the following:<ul>
     * <li><strong>rds</strong>: high-availability series or Basic Edition.</li>
     * <li><strong>xcluster</strong>: MySQL 5.7 RDS Enterprise Edition.</li>
     * <li><strong>xcluster80</strong>: MySQL 8.0 RDS Enterprise Edition.</li>
     * </ul>
     * </li>
     * <li><strong>SQLServer</strong>: <code>&lt;Minor version number&gt;</code>. Example: <code>15.0.4073.23</code>.</li>
     * </ul>
     * <p>If you do not specify this parameter, the instance is upgraded to the latest minor engine version by default.</p>
     * <blockquote>
     * <p>For minor engine version numbers, see <a href="https://help.aliyun.com/document_detail/126002.html">Release notes of ApsaraDB RDS for PostgreSQL minor engine versions</a>, <a href="https://help.aliyun.com/document_detail/96060.html">Release notes of ApsaraDB RDS for MySQL minor engine versions</a>, and <a href="https://help.aliyun.com/document_detail/213577.html">Release notes of ApsaraDB RDS for SQL Server minor engine versions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xcluster80_20210305</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The upgrade time. Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong> (default): The upgrade takes effect immediately.</li>
     * <li><strong>MaintainTime</strong>: The upgrade takes effect during the maintenance window. To modify the maintenance window, call ModifyDBInstanceMaintainTime.</li>
     * <li><strong>SpecifyTime</strong>: The upgrade takes effect at a specified time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Immediate</p>
     */
    @NameInMap("UpgradeTime")
    public String upgradeTime;

    public static UpgradeDBInstanceKernelVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceKernelVersionRequest self = new UpgradeDBInstanceKernelVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceKernelVersionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBInstanceKernelVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeDBInstanceKernelVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpgradeDBInstanceKernelVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeDBInstanceKernelVersionRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public UpgradeDBInstanceKernelVersionRequest setTargetMinorVersion(String targetMinorVersion) {
        this.targetMinorVersion = targetMinorVersion;
        return this;
    }
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

    public UpgradeDBInstanceKernelVersionRequest setUpgradeTime(String upgradeTime) {
        this.upgradeTime = upgradeTime;
        return this;
    }
    public String getUpgradeTime() {
        return this.upgradeTime;
    }

}
