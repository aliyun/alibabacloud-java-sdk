// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionRuleShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <br>
     * <p>> You can call the [DescribeGroupedContainerInstances](https://help.aliyun.com/document_detail/182997.html) operation to query the IDs of container clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The destination objects of the rule. The following parameters are included:</p>
     * <br>
     * <p>*   targetId: the ID of the destination object. You can call the [ListInterceptionTargetPage](~~ListInterceptionTargetPage~~) operation to query the ID.</p>
     * <p>*   ports: the destination port ranges.</p>
     */
    @NameInMap("DstTarget")
    public String dstTargetShrink;

    /**
     * <p>The interception mode. Valid values:</p>
     * <br>
     * <p>*   **1**: block</p>
     * <p>*   **2**: alert</p>
     * <p>*   **3**: allow</p>
     */
    @NameInMap("InterceptType")
    public Integer interceptType;

    /**
     * <p>The priority of the rule. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
     */
    @NameInMap("OrderIndex")
    public Long orderIndex;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The name of the rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Specifies whether the rule is enabled. Valid values:</p>
     * <br>
     * <p>*   **1**: enabled</p>
     * <p>*   **0**: disabled</p>
     */
    @NameInMap("RuleSwitch")
    public Integer ruleSwitch;

    /**
     * <p>The source object of the rule. The following parameters are included:</p>
     * <br>
     * <p>*   targetId: the ID of the source object. You can call the [ListInterceptionTargetPage](~~ListInterceptionTargetPage~~) operation to query the ID.</p>
     */
    @NameInMap("SrcTarget")
    public String srcTargetShrink;

    public static ModifyInterceptionRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInterceptionRuleShrinkRequest self = new ModifyInterceptionRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInterceptionRuleShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyInterceptionRuleShrinkRequest setDstTargetShrink(String dstTargetShrink) {
        this.dstTargetShrink = dstTargetShrink;
        return this;
    }
    public String getDstTargetShrink() {
        return this.dstTargetShrink;
    }

    public ModifyInterceptionRuleShrinkRequest setInterceptType(Integer interceptType) {
        this.interceptType = interceptType;
        return this;
    }
    public Integer getInterceptType() {
        return this.interceptType;
    }

    public ModifyInterceptionRuleShrinkRequest setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        return this;
    }
    public Long getOrderIndex() {
        return this.orderIndex;
    }

    public ModifyInterceptionRuleShrinkRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyInterceptionRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ModifyInterceptionRuleShrinkRequest setRuleSwitch(Integer ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    public ModifyInterceptionRuleShrinkRequest setSrcTargetShrink(String srcTargetShrink) {
        this.srcTargetShrink = srcTargetShrink;
        return this;
    }
    public String getSrcTargetShrink() {
        return this.srcTargetShrink;
    }

}
