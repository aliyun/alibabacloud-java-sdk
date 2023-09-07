// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpgradeDBClusterVersionRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("FromTimeService")
    public Boolean fromTimeService;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The latest start time to run the task that updates the kernel version of the cluster. Specify the time in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The value of this parameter must be at least 30 minutes later than the value of PlannedStartTime.</p>
     * <br>
     * <p>*   If you specify `PlannedStartTime` but do not specify PlannedEndTime, the latest start time of the task is `PlannedEndTime + 30 minutes`. For example, if you set `PlannedStartTime` to `2021-01-14T09:00:00Z` and do not specify PlannedEndTime, the latest start time of the task is set to `2021-01-14T09:30:00Z`.</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest start time to run the task that updates the kernel version of the cluster. Specify the time in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The earliest start time of the task can be a point in time within the next 24 hours. For example, if the current time is `2021-01-14T09:00:00Z`, you can specify a point in time between `2021-01-14T09:00:00Z` and `2021-01-15T09:00:00Z`.</p>
     * <br>
     * <p>*   If you do not specify this parameter, the kernel update task runs immediately after you submit the request.</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>目标版本的VersionCode，参数取值可从[DescribeDBClusterVersion](~~2319145~~)接口获取。</p>
     */
    @NameInMap("TargetDBRevisionVersionCode")
    public String targetDBRevisionVersionCode;

    @NameInMap("UpgradeLabel")
    public String upgradeLabel;

    @NameInMap("UpgradePolicy")
    public String upgradePolicy;

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
