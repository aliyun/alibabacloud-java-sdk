// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyCustinsResourceRequest extends TeaModel {
    /**
     * <p>The deadline for the modification.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-31 23:59:06</p>
     */
    @NameInMap("AdjustDeadline")
    public String adjustDeadline;

    /**
     * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/26232.html">DescribeDBInstances</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-j5ekvfeengm******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The increase rate in percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("IncreaseRatio")
    public String increaseRatio;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>Memory</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The original value. This parameter must be specified when the <strong>ResourceType</strong> parameter is set to <strong>instance</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("RestoreOriginalSpecification")
    public String restoreOriginalSpecification;

    /**
     * <p>The target value. This parameter is available only if you set the ScalingRuleType parameter to TargetTrackingScalingRule or PredictiveScalingRule. The value must be greater than 0 and can contain up to three decimal places.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
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
