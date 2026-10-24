// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DeleteScalingRuleRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-3d5ce6454354****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The ID of the scaling rule to be deleted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-d01a1cac4081s****</p>
     */
    @NameInMap("ScalingRuleId")
    public String scalingRuleId;

    /**
     * <p>The trigger type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TIME_TRIGGER</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    public static DeleteScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScalingRuleRequest self = new DeleteScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScalingRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteScalingRuleRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public DeleteScalingRuleRequest setScalingRuleId(String scalingRuleId) {
        this.scalingRuleId = scalingRuleId;
        return this;
    }
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    public DeleteScalingRuleRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
