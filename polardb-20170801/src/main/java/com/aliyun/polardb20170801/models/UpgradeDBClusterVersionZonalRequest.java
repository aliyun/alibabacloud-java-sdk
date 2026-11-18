// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradeDBClusterVersionZonalRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value on the client side. The value must be unique across different requests and is case-sensitive. It can contain up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the PolarDB on ENS cluster. Only cluster IDs returned by the DescribeDBClustersZonal operation are supported. Before you call this operation, you must create an edge cluster by using ENS infrastructure. Standard PolarDB cluster IDs are not supported. Note: Only edge cluster IDs returned by DescribeDBClustersZonal are accepted, and the edge cluster must be created based on ENS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-a************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to immediately execute or schedule the kernel version upgrade. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): Scheduled execution.</p>
     * </li>
     * <li><p><strong>true</strong>: Immediate execution.</p>
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
     * <p>The latest time to start the scheduled task. The time must be in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The latest time must be at least 30 minutes later than the start time.</li>
     * <li>If you specify <code>PlannedStartTime</code> but do not specify this parameter, the latest time to start the task defaults to 30 minutes after the start time. For example, if you set <code>PlannedStartTime</code> to <code>2021-01-14T09:00:00Z</code> and leave this parameter empty, the task starts at <code>2021-01-14T09:30:00Z</code> at the latest.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest time to start the scheduled Milvus version upgrade task. The time must be in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The start time must be within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, the allowed start time ranges from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</li>
     * <li>If you leave this parameter empty, the Milvus version upgrade task is immediately executed by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-04-28T14:00:00Z</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The version code of the target database engine version. You can obtain the value from the <a href="https://help.aliyun.com/document_detail/2319145.html">DescribeDBClusterVersion</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>20230707</p>
     */
    @NameInMap("TargetDBRevisionVersionCode")
    public String targetDBRevisionVersionCode;

    /**
     * <p>The version code of the target PolarProxy version. You can obtain the value from the <a href="https://help.aliyun.com/document_detail/2319145.html">DescribeDBClusterVersion</a> operation.</p>
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
     * <p>The kernel version upgrade policy. Valid values:</p>
     * <ul>
     * <li><p><strong>HOT</strong>: Hot upgrade.</p>
     * </li>
     * <li><p><strong>COLD</strong>: Cold upgrade. Only PolarDB for MySQL 8.0 Cluster Edition supports this upgrade method.</p>
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

    public static UpgradeDBClusterVersionZonalRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBClusterVersionZonalRequest self = new UpgradeDBClusterVersionZonalRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBClusterVersionZonalRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpgradeDBClusterVersionZonalRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpgradeDBClusterVersionZonalRequest setFromTimeService(Boolean fromTimeService) {
        this.fromTimeService = fromTimeService;
        return this;
    }
    public Boolean getFromTimeService() {
        return this.fromTimeService;
    }

    public UpgradeDBClusterVersionZonalRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpgradeDBClusterVersionZonalRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeDBClusterVersionZonalRequest setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
        return this;
    }
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    public UpgradeDBClusterVersionZonalRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    public UpgradeDBClusterVersionZonalRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpgradeDBClusterVersionZonalRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeDBClusterVersionZonalRequest setTargetDBRevisionVersionCode(String targetDBRevisionVersionCode) {
        this.targetDBRevisionVersionCode = targetDBRevisionVersionCode;
        return this;
    }
    public String getTargetDBRevisionVersionCode() {
        return this.targetDBRevisionVersionCode;
    }

    public UpgradeDBClusterVersionZonalRequest setTargetProxyRevisionVersionCode(String targetProxyRevisionVersionCode) {
        this.targetProxyRevisionVersionCode = targetProxyRevisionVersionCode;
        return this;
    }
    public String getTargetProxyRevisionVersionCode() {
        return this.targetProxyRevisionVersionCode;
    }

    public UpgradeDBClusterVersionZonalRequest setUpgradeLabel(String upgradeLabel) {
        this.upgradeLabel = upgradeLabel;
        return this;
    }
    public String getUpgradeLabel() {
        return this.upgradeLabel;
    }

    public UpgradeDBClusterVersionZonalRequest setUpgradePolicy(String upgradePolicy) {
        this.upgradePolicy = upgradePolicy;
        return this;
    }
    public String getUpgradePolicy() {
        return this.upgradePolicy;
    }

    public UpgradeDBClusterVersionZonalRequest setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public String getUpgradeType() {
        return this.upgradeType;
    }

}
