// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyScalingRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TIME_TRIGGER</p>
     */
    @NameInMap("NewTriggerType")
    public String newTriggerType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-3d5ce6454354****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TIME_TRIGGER</p>
     */
    @NameInMap("OldTriggerType")
    public String oldTriggerType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;nodeNumber&quot;: 1,
     *   &quot;scalingRuleName&quot;: &quot;test1&quot;,
     *   &quot;scalingOutRule&quot;: {
     *     &quot;year&quot;: 2026,
     *     &quot;month&quot;: 3,
     *     &quot;day&quot;: 2,
     *     &quot;hour&quot;: 5,
     *     &quot;minute&quot;: 50,
     *     &quot;second&quot;: 0,
     *     &quot;recurrenceInterval&quot;: 1,
     *     &quot;recurrenceType&quot;: &quot;DAILY&quot;,
     *     &quot;recurrenceValues&quot;: null
     *   },
     *   &quot;scalingInRule&quot;: {
     *     &quot;year&quot;: 2026,
     *     &quot;month&quot;: 3,
     *     &quot;day&quot;: 2,
     *     &quot;hour&quot;: 6,
     *     &quot;minute&quot;: 50,
     *     &quot;second&quot;: 0,
     *     &quot;recurrenceInterval&quot;: 1,
     *     &quot;recurrenceType&quot;: &quot;DAILY&quot;,
     *     &quot;recurrenceValues&quot;: null
     *   }
     * }</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asr-bp10s4t9l21u9qtyrtco</p>
     */
    @NameInMap("ScalingRuleId")
    public String scalingRuleId;

    public static ModifyScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingRuleRequest self = new ModifyScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScalingRuleRequest setNewTriggerType(String newTriggerType) {
        this.newTriggerType = newTriggerType;
        return this;
    }
    public String getNewTriggerType() {
        return this.newTriggerType;
    }

    public ModifyScalingRuleRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ModifyScalingRuleRequest setOldTriggerType(String oldTriggerType) {
        this.oldTriggerType = oldTriggerType;
        return this;
    }
    public String getOldTriggerType() {
        return this.oldTriggerType;
    }

    public ModifyScalingRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public ModifyScalingRuleRequest setScalingRuleId(String scalingRuleId) {
        this.scalingRuleId = scalingRuleId;
        return this;
    }
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

}
