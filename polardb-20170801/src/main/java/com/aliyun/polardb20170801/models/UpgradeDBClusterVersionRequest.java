// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradeDBClusterVersionRequest extends TeaModel {
    /**
     * <p>The ID of cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to immediately run the kernel upgrade task. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default)</li>
     * <li><strong>true</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter is not required when you call the operation.</p>
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
     * <p>The latest start time to run the task that updates the kernel version of the cluster. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The value of this parameter must be at least 30 minutes later than the value of PlannedStartTime.</li>
     * <li>If you specify <code>PlannedStartTime</code> but do not specify PlannedEndTime, the latest start time of the task is <code>PlannedEndTime + 30 minutes</code>. For example, if you set <code>PlannedStartTime</code> to <code>2021-01-14T09:00:00Z</code> and do not specify PlannedEndTime, the latest start time of the task is set to <code>2021-01-14T09:30:00Z</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest start time to run the task that updates the kernel version of the cluster. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The earliest start time of the task can be a point in time within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, you can specify a point in time between <code>2021-01-14T09:00:00Z</code> and <code>2021-01-15T09:00:00Z</code>.</li>
     * <li>If you do not specify this parameter, the kernel update task runs immediately after you submit the request.</li>
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
     * <p>The code of the version to which you want to upgrade the cluster. You can call the <a href="https://help.aliyun.com/document_detail/2319145.html">DescribeDBClusterVersion</a> operation to query the version code.</p>
     * 
     * <strong>example:</strong>
     * <p>20230707</p>
     */
    @NameInMap("TargetDBRevisionVersionCode")
    public String targetDBRevisionVersionCode;

    @NameInMap("TargetProxyRevisionVersionCode")
    public String targetProxyRevisionVersionCode;

    /**
     * <p>The upgrade tag. The value is fixed as <strong>INNOVATE</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is applicable only when you upgrade PolarDB for MySQL 8.0.1 to PolarDB for MySQL 8.0.2.</li>
     * <li>If you specify this parameter, you must set <code>UpgradePolicy</code> to <strong>COLD</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>INNOVATE</p>
     */
    @NameInMap("UpgradeLabel")
    public String upgradeLabel;

    /**
     * <p>The upgrade policy. Valid values:</p>
     * <ul>
     * <li><strong>HOT</strong>: hot upgrade.</li>
     * <li><strong>COLD</strong>: cold upgrade. Only PolarDB for MySQL Cluster Edition that runs MySQL 8.0 supports this upgrade method.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HOT</p>
     */
    @NameInMap("UpgradePolicy")
    public String upgradePolicy;

    /**
     * <p>The update type. Valid values:</p>
     * <ul>
     * <li><strong>PROXY</strong>: specifies to upgrade PloarProxy.</li>
     * <li><strong>DB</strong>: specifies to upgrade the kernel version.</li>
     * <li><strong>ALL</strong>: specifies to upgrade both PloarProxy and kernel version.</li>
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
