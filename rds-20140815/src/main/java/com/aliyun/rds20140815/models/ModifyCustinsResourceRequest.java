// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyCustinsResourceRequest extends TeaModel {
    /**
     * <p>AdjustDeadline</p>
     */
    @NameInMap("AdjustDeadline")
    public String adjustDeadline;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>IncreaseRatio</p>
     */
    @NameInMap("IncreaseRatio")
    public String increaseRatio;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the resource. Set the value to **INSTANCE**.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>RestoreOriginalSpecification</p>
     */
    @NameInMap("RestoreOriginalSpecification")
    public String restoreOriginalSpecification;

    /**
     * <p>Specifies whether to disable scale-in. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule.</p>
     */
    @NameInMap("TargetValue")
    public Integer targetValue;

    public static ModifyCustinsResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustinsResourceRequest self = new ModifyCustinsResourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustinsResourceRequest setAdjustDeadline(String adjustDeadline) {
        this.adjustDeadline = adjustDeadline;
        return this;
    }
    public String getAdjustDeadline() {
        return this.adjustDeadline;
    }

    public ModifyCustinsResourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyCustinsResourceRequest setIncreaseRatio(String increaseRatio) {
        this.increaseRatio = increaseRatio;
        return this;
    }
    public String getIncreaseRatio() {
        return this.increaseRatio;
    }

    public ModifyCustinsResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyCustinsResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ModifyCustinsResourceRequest setRestoreOriginalSpecification(String restoreOriginalSpecification) {
        this.restoreOriginalSpecification = restoreOriginalSpecification;
        return this;
    }
    public String getRestoreOriginalSpecification() {
        return this.restoreOriginalSpecification;
    }

    public ModifyCustinsResourceRequest setTargetValue(Integer targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public Integer getTargetValue() {
        return this.targetValue;
    }

}
