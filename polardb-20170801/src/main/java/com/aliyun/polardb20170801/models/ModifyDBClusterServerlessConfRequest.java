// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterServerlessConfRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable No-activity Suspension. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowShutDown")
    public String allowShutDown;

    /**
     * <p>The ID of the serverless cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp10gr51qasnl****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies an immediate or scheduled task to modify parameters and restart the cluster. Valid values:</p>
     * <ul>
     * <li>false: scheduled task</li>
     * <li>true: immediate task</li>
     * </ul>
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
     * <p>The latest start time for upgrading the specifications within the scheduled time period. Specify the time in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The value of this parameter must be at least 30 minutes later than the value of PlannedStartTime.</li>
     * <li>If you specify PlannedStartTime but do not specify PlannedEndTime, the latest start time of the task is set to a value that is calculated by using the following formula: <code>PlannedEndTime value + 30 minutes</code>. For example, if you set PlannedStartTime to <code>2021-01-14T09:00:00Z</code> and you do not specify PlannedEndTime, the latest start time of the task is set to <code>2021-01-14T09:30:00Z</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest start time of the scheduled task for adding the read-only node. The scheduled task specifies that the task is run in the required period. Specify the time in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The earliest start time of the scheduled task can be a point in time within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, you can specify a point in time between <code>2021-01-14T09:00:00Z</code> and <code>2021-01-15T09:00:00Z</code>.</li>
     * <li>If you leave this parameter empty, the task for adding the read-only node is immediately run by default.</li>
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
     * <p>The maximum number of stable AP read-only nodes. Valid values: 0 to 7.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScaleApRoNumMax")
    public String scaleApRoNumMax;

    /**
     * <p>The minimum number of stable AP read-only nodes. Valid values: 0 to 7.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScaleApRoNumMin")
    public String scaleApRoNumMin;

    /**
     * <p>The maximum number of PCUs per node for scaling. Valid values: 1 PCU to 32 PCUs.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ScaleMax")
    public String scaleMax;

    /**
     * <p>The minimum number of PCUs per node for scaling. Valid values: 1 PCU to 31 PCUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScaleMin")
    public String scaleMin;

    /**
     * <p>The maximum number of read-only nodes for scaling. Valid values: 0 to 15.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ScaleRoNumMax")
    public String scaleRoNumMax;

    /**
     * <p>The minimum number of read-only nodes for scaling. Valid values: 0 to 15.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScaleRoNumMin")
    public String scaleRoNumMin;

    /**
     * <p>The detection period for No-activity Suspension. Valid values: 5 to 1440. Unit: minutes. The detection duration must be a multiple of 5 minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SecondsUntilAutoPause")
    public String secondsUntilAutoPause;

    @NameInMap("ServerlessRuleCpuEnlargeThreshold")
    public String serverlessRuleCpuEnlargeThreshold;

    @NameInMap("ServerlessRuleCpuShrinkThreshold")
    public String serverlessRuleCpuShrinkThreshold;

    @NameInMap("ServerlessRuleMode")
    public String serverlessRuleMode;

    public static ModifyDBClusterServerlessConfRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterServerlessConfRequest self = new ModifyDBClusterServerlessConfRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterServerlessConfRequest setAllowShutDown(String allowShutDown) {
        this.allowShutDown = allowShutDown;
        return this;
    }
    public String getAllowShutDown() {
        return this.allowShutDown;
    }

    public ModifyDBClusterServerlessConfRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterServerlessConfRequest setFromTimeService(Boolean fromTimeService) {
        this.fromTimeService = fromTimeService;
        return this;
    }
    public Boolean getFromTimeService() {
        return this.fromTimeService;
    }

    public ModifyDBClusterServerlessConfRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterServerlessConfRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterServerlessConfRequest setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
        return this;
    }
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    public ModifyDBClusterServerlessConfRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    public ModifyDBClusterServerlessConfRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterServerlessConfRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBClusterServerlessConfRequest setScaleApRoNumMax(String scaleApRoNumMax) {
        this.scaleApRoNumMax = scaleApRoNumMax;
        return this;
    }
    public String getScaleApRoNumMax() {
        return this.scaleApRoNumMax;
    }

    public ModifyDBClusterServerlessConfRequest setScaleApRoNumMin(String scaleApRoNumMin) {
        this.scaleApRoNumMin = scaleApRoNumMin;
        return this;
    }
    public String getScaleApRoNumMin() {
        return this.scaleApRoNumMin;
    }

    public ModifyDBClusterServerlessConfRequest setScaleMax(String scaleMax) {
        this.scaleMax = scaleMax;
        return this;
    }
    public String getScaleMax() {
        return this.scaleMax;
    }

    public ModifyDBClusterServerlessConfRequest setScaleMin(String scaleMin) {
        this.scaleMin = scaleMin;
        return this;
    }
    public String getScaleMin() {
        return this.scaleMin;
    }

    public ModifyDBClusterServerlessConfRequest setScaleRoNumMax(String scaleRoNumMax) {
        this.scaleRoNumMax = scaleRoNumMax;
        return this;
    }
    public String getScaleRoNumMax() {
        return this.scaleRoNumMax;
    }

    public ModifyDBClusterServerlessConfRequest setScaleRoNumMin(String scaleRoNumMin) {
        this.scaleRoNumMin = scaleRoNumMin;
        return this;
    }
    public String getScaleRoNumMin() {
        return this.scaleRoNumMin;
    }

    public ModifyDBClusterServerlessConfRequest setSecondsUntilAutoPause(String secondsUntilAutoPause) {
        this.secondsUntilAutoPause = secondsUntilAutoPause;
        return this;
    }
    public String getSecondsUntilAutoPause() {
        return this.secondsUntilAutoPause;
    }

    public ModifyDBClusterServerlessConfRequest setServerlessRuleCpuEnlargeThreshold(String serverlessRuleCpuEnlargeThreshold) {
        this.serverlessRuleCpuEnlargeThreshold = serverlessRuleCpuEnlargeThreshold;
        return this;
    }
    public String getServerlessRuleCpuEnlargeThreshold() {
        return this.serverlessRuleCpuEnlargeThreshold;
    }

    public ModifyDBClusterServerlessConfRequest setServerlessRuleCpuShrinkThreshold(String serverlessRuleCpuShrinkThreshold) {
        this.serverlessRuleCpuShrinkThreshold = serverlessRuleCpuShrinkThreshold;
        return this;
    }
    public String getServerlessRuleCpuShrinkThreshold() {
        return this.serverlessRuleCpuShrinkThreshold;
    }

    public ModifyDBClusterServerlessConfRequest setServerlessRuleMode(String serverlessRuleMode) {
        this.serverlessRuleMode = serverlessRuleMode;
        return this;
    }
    public String getServerlessRuleMode() {
        return this.serverlessRuleMode;
    }

}
