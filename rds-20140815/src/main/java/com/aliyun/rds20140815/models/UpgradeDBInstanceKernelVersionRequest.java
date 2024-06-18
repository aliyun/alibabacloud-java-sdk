// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceKernelVersionRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance runs PostgreSQL, you must make sure that the instance uses <strong>cloud disks</strong>. If the instance uses local disks, you must call the <a href="https://help.aliyun.com/document_detail/26230.html">RestartDBInstance</a> operation to restart the instance. The system automatically updates the minor engine version of the instance to the latest version during the restart.</li>
     * <li>If your instance runs SQL Server, you must make sure that the instance runs SQL Server 2019.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bpxxxxx</p>
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
     * <p>The update time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>This parameter takes effect only when you set <strong>UpgradeTime</strong> to <strong>SpecifyTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-01-15T00:00:00Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The minor engine version to which you want to update. Format:</p>
     * <ul>
     * <li><p><strong>PostgreSQL</strong>: <code>rds_postgres_&lt;Major engine version&gt;00_&lt;Minor engine version&gt;</code>. Example: <code>rds_postgres_1200_20200830</code>.</p>
     * </li>
     * <li><p><strong>MySQL</strong>: <code>&lt;RDS edition and MySQL version&gt;_&lt;Minor engine version&gt;</code>. Examples: <code>rds_20200229</code>, <code>xcluster_20200229</code>, and <code>xcluster80_20200229</code>. The following RDS editions and MySQL versions are supported:</p>
     * <ul>
     * <li><strong>rds</strong>: RDS Basic Edition or RDS High-availability Edition</li>
     * <li><strong>xcluster</strong>: MySQL 5.7 on RDS Enterprise Edition</li>
     * <li><strong>xcluster80</strong>: MySQL 8.0 on RDS Enterprise Edition</li>
     * </ul>
     * </li>
     * <li><p><strong>SQLServer</strong>: <code>&lt;Minor engine version&gt;</code>. Example: <code>15.0.4073.23</code>.</p>
     * </li>
     * </ul>
     * <p>If you do not specify this parameter, the instance is updated to the latest minor engine version.</p>
     * <blockquote>
     * <p> For more information about minor engine versions, see <a href="https://help.aliyun.com/document_detail/126002.html">Release notes of AliPG</a>, <a href="https://help.aliyun.com/document_detail/96060.html">Release notes of AliSQL</a>, and <a href="https://help.aliyun.com/document_detail/213577.html">Release notes of minor engine versions of ApsaraDB RDS for SQL Server</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xcluster80_20210305</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The time when the update takes effect. Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong> (default): The update takes effect immediately.</li>
     * <li><strong>MaintainTime</strong>: The update takes effect during the maintenance window that you specify. For more information about how to change the maintenance window, see ModifyDBInstanceMaintainTime.</li>
     * <li><strong>SpecifyTime</strong>: The update takes effect at the point in time you specify.</li>
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
