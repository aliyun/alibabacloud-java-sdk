// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradeDBClusterVersionRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of all clusters under your account, such as the cluster ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to execute the kernel version upgrade immediately or on a schedule. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): The upgrade is executed on a schedule.</p>
     * </li>
     * <li><p><strong>true</strong>: The upgrade is executed immediately.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You do not need to specify this parameter when you invoke this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FromTimeService")
    public Boolean fromTimeService;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The latest time to start the scheduled task. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format and displayed in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The latest time must be at least 30 minutes later than the start time.</li>
     * <li>If you specify PlannedStartTime but do not specify this parameter, the latest time to start the task defaults to the start time plus 30 minutes. For example, if PlannedStartTime is set to <code>2021-01-14T09:00:00Z</code> and this parameter is left empty, the task starts at <code>2021-01-14T09:30:00Z</code> at the latest.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest time to start the scheduled Milvus version upgrade task. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format and displayed in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The start time must be within the next 72 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, the allowed start time ranges from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-17T09:00:00Z</code>.</li>
     * <li>If you leave this parameter empty, the Milvus version upgrade task is executed immediately by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:00:00Z</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The VersionCode of the target database version. You can obtain the value from the <a href="https://help.aliyun.com/document_detail/2319145.html">DescribeDBClusterVersion</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>20230707</p>
     */
    @NameInMap("TargetDBRevisionVersionCode")
    public String targetDBRevisionVersionCode;

    /**
     * <p>The VersionCode of the target PolarProxy version. You can obtain the value from the <a href="https://help.aliyun.com/document_detail/2319145.html">DescribeDBClusterVersion</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>20240702</p>
     */
    @NameInMap("TargetProxyRevisionVersionCode")
    public String targetProxyRevisionVersionCode;

    /**
     * <p>The kernel version upgrade label. Set the value to <strong>INNOVATE</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter applies only to upgrades from PolarDB for MySQL 8.0.1 to PolarDB for MySQL 8.0.2.</li>
     * <li>When you specify this parameter, you must set UpgradePolicy to <strong>COLD</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>INNOVATE</p>
     */
    @NameInMap("UpgradeLabel")
    public String upgradeLabel;

    /**
     * <p>The kernel version upgrade policy. Valid values:</p>
     * <ul>
     * <li><p><strong>HOT</strong>: Hot upgrade.</p>
     * </li>
     * <li><p><strong>COLD</strong>: Cold upgrade. Currently, only PolarDB for MySQL 8.0 Cluster Edition supports this upgrade method.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HOT</p>
     */
    @NameInMap("UpgradePolicy")
    public String upgradePolicy;

    /**
     * <p>The upgrade type. Valid values:</p>
     * <ul>
     * <li><p><strong>PROXY</strong>: Upgrades only PolarProxy.</p>
     * </li>
     * <li><p><strong>DB</strong>: Upgrades only the database engine.</p>
     * </li>
     * <li><p><strong>ALL</strong> (default): Upgrades both PolarProxy and the database engine.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROXY</p>
     */
    @NameInMap("UpgradeType")
    public String upgradeType;

    public static UpgradeDBClusterVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBClusterVersionRequest self = new UpgradeDBClusterVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBClusterVersionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpgradeDBClusterVersionRequest setFromTimeService(Boolean fromTimeService) {
        this.fromTimeService = fromTimeService;
        return this;
    }
    public Boolean getFromTimeService() {
        return this.fromTimeService;
    }

    public UpgradeDBClusterVersionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpgradeDBClusterVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeDBClusterVersionRequest setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
        return this;
    }
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    public UpgradeDBClusterVersionRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    public UpgradeDBClusterVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpgradeDBClusterVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeDBClusterVersionRequest setTargetDBRevisionVersionCode(String targetDBRevisionVersionCode) {
        this.targetDBRevisionVersionCode = targetDBRevisionVersionCode;
        return this;
    }
    public String getTargetDBRevisionVersionCode() {
        return this.targetDBRevisionVersionCode;
    }

    public UpgradeDBClusterVersionRequest setTargetProxyRevisionVersionCode(String targetProxyRevisionVersionCode) {
        this.targetProxyRevisionVersionCode = targetProxyRevisionVersionCode;
        return this;
    }
    public String getTargetProxyRevisionVersionCode() {
        return this.targetProxyRevisionVersionCode;
    }

    public UpgradeDBClusterVersionRequest setUpgradeLabel(String upgradeLabel) {
        this.upgradeLabel = upgradeLabel;
        return this;
    }
    public String getUpgradeLabel() {
        return this.upgradeLabel;
    }

    public UpgradeDBClusterVersionRequest setUpgradePolicy(String upgradePolicy) {
        this.upgradePolicy = upgradePolicy;
        return this;
    }
    public String getUpgradePolicy() {
        return this.upgradePolicy;
    }

    public UpgradeDBClusterVersionRequest setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public String getUpgradeType() {
        return this.upgradeType;
    }

}
