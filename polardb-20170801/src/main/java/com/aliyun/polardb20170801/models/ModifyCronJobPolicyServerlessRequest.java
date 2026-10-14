// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyCronJobPolicyServerlessRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable No-activity Suspension. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowShutDown")
    public String allowShutDown;

    /**
     * <p>The cron expression.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 13 * * ?</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time.</p>
     * <p>Specify the time in the ISO 8601 standard in the YYYY-MM-DDTHH:mmZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-12T15:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The scheduled task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8006e51c-dab3-4602-bc69-4f728002c6ce</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The maximum number of read-only column store nodes. Valid values: 0 to 15.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScaleApRoNumMax")
    public String scaleApRoNumMax;

    /**
     * <p>The minimum number of read-only column store nodes. Valid values: 0 to 15.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScaleApRoNumMin")
    public String scaleApRoNumMin;

    /**
     * <p>The maximum value. Valid values: 1 to 32. Unit: PCU.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("ScaleMax")
    public String scaleMax;

    /**
     * <p>The minimum value. Valid values: 0.25 to 32. The minimum value must be less than or equal to the maximum value. Unit: PCU.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScaleMin")
    public String scaleMin;

    /**
     * <p>The maximum number of read-only nodes for scaling. The value cannot be less than the minimum value. Valid values: 0 to 15.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ScaleRoNumMax")
    public String scaleRoNumMax;

    /**
     * <p>The minimum number of read-only nodes for scaling. Valid values: 0 to 15.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ScaleRoNumMin")
    public String scaleRoNumMin;

    /**
     * <p>The detection duration for No-activity Suspension. Valid values: 5 to 1440. Unit: minutes. The detection duration must be a multiple of 5 minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SecondsUntilAutoPause")
    public String secondsUntilAutoPause;

    /**
     * <p>The CPU scale-up threshold. Valid values: 40 to 100. Unit: %.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ServerlessRuleCpuEnlargeThreshold")
    public String serverlessRuleCpuEnlargeThreshold;

    /**
     * <p>The CPU scale-down threshold. Valid values: 10 to 100. Unit: %. The difference between the scale-up threshold and the scale-down threshold must be at least 30.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("ServerlessRuleCpuShrinkThreshold")
    public String serverlessRuleCpuShrinkThreshold;

    /**
     * <p>The scaling sensitivity. Valid values:</p>
     * <ul>
     * <li>normal: standard.</li>
     * <li>flexible: sensitive.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ServerlessRuleMode")
    public String serverlessRuleMode;

    /**
     * <p>The start time. Specify the time in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-23T01:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ModifyCronJobPolicyServerlessRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCronJobPolicyServerlessRequest self = new ModifyCronJobPolicyServerlessRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCronJobPolicyServerlessRequest setAllowShutDown(String allowShutDown) {
        this.allowShutDown = allowShutDown;
        return this;
    }
    public String getAllowShutDown() {
        return this.allowShutDown;
    }

    public ModifyCronJobPolicyServerlessRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public ModifyCronJobPolicyServerlessRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyCronJobPolicyServerlessRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ModifyCronJobPolicyServerlessRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ModifyCronJobPolicyServerlessRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyCronJobPolicyServerlessRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCronJobPolicyServerlessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCronJobPolicyServerlessRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyCronJobPolicyServerlessRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyCronJobPolicyServerlessRequest setScaleApRoNumMax(String scaleApRoNumMax) {
        this.scaleApRoNumMax = scaleApRoNumMax;
        return this;
    }
    public String getScaleApRoNumMax() {
        return this.scaleApRoNumMax;
    }

    public ModifyCronJobPolicyServerlessRequest setScaleApRoNumMin(String scaleApRoNumMin) {
        this.scaleApRoNumMin = scaleApRoNumMin;
        return this;
    }
    public String getScaleApRoNumMin() {
        return this.scaleApRoNumMin;
    }

    public ModifyCronJobPolicyServerlessRequest setScaleMax(String scaleMax) {
        this.scaleMax = scaleMax;
        return this;
    }
    public String getScaleMax() {
        return this.scaleMax;
    }

    public ModifyCronJobPolicyServerlessRequest setScaleMin(String scaleMin) {
        this.scaleMin = scaleMin;
        return this;
    }
    public String getScaleMin() {
        return this.scaleMin;
    }

    public ModifyCronJobPolicyServerlessRequest setScaleRoNumMax(String scaleRoNumMax) {
        this.scaleRoNumMax = scaleRoNumMax;
        return this;
    }
    public String getScaleRoNumMax() {
        return this.scaleRoNumMax;
    }

    public ModifyCronJobPolicyServerlessRequest setScaleRoNumMin(String scaleRoNumMin) {
        this.scaleRoNumMin = scaleRoNumMin;
        return this;
    }
    public String getScaleRoNumMin() {
        return this.scaleRoNumMin;
    }

    public ModifyCronJobPolicyServerlessRequest setSecondsUntilAutoPause(String secondsUntilAutoPause) {
        this.secondsUntilAutoPause = secondsUntilAutoPause;
        return this;
    }
    public String getSecondsUntilAutoPause() {
        return this.secondsUntilAutoPause;
    }

    public ModifyCronJobPolicyServerlessRequest setServerlessRuleCpuEnlargeThreshold(String serverlessRuleCpuEnlargeThreshold) {
        this.serverlessRuleCpuEnlargeThreshold = serverlessRuleCpuEnlargeThreshold;
        return this;
    }
    public String getServerlessRuleCpuEnlargeThreshold() {
        return this.serverlessRuleCpuEnlargeThreshold;
    }

    public ModifyCronJobPolicyServerlessRequest setServerlessRuleCpuShrinkThreshold(String serverlessRuleCpuShrinkThreshold) {
        this.serverlessRuleCpuShrinkThreshold = serverlessRuleCpuShrinkThreshold;
        return this;
    }
    public String getServerlessRuleCpuShrinkThreshold() {
        return this.serverlessRuleCpuShrinkThreshold;
    }

    public ModifyCronJobPolicyServerlessRequest setServerlessRuleMode(String serverlessRuleMode) {
        this.serverlessRuleMode = serverlessRuleMode;
        return this;
    }
    public String getServerlessRuleMode() {
        return this.serverlessRuleMode;
    }

    public ModifyCronJobPolicyServerlessRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
