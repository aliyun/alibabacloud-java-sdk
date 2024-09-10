// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionRuleRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/182997.html">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c17ef568f81884cdab402decd5fcd****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The destination objects of the rule. The following parameters are included:</p>
     * <ul>
     * <li>targetId: the ID of the destination object. You can call the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to query the ID.</li>
     * <li>ports: the destination port ranges.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;targetId&quot;:600069,&quot;ports&quot;:[&quot;80/8088&quot;]}</p>
     */
    @NameInMap("DstTarget")
    public java.util.Map<String, ?> dstTarget;

    /**
     * <p>The interception mode. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: block</li>
     * <li><strong>2</strong>: alert</li>
     * <li><strong>3</strong>: allow</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InterceptType")
    public Integer interceptType;

    /**
     * <p>The priority of the rule. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrderIndex")
    public Long orderIndex;

    /**
     * <p>The ID of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>500018</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>tetsRule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Specifies whether the rule is enabled. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>0</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleSwitch")
    public Integer ruleSwitch;

    /**
     * <p>The source object of the rule. The following parameters are included:</p>
     * <ul>
     * <li>targetId: the ID of the source object. You can call the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to query the ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;targetId&quot;:400989}</p>
     */
    @NameInMap("SrcTarget")
    public java.util.Map<String, ?> srcTarget;

    public static ModifyInterceptionRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInterceptionRuleRequest self = new ModifyInterceptionRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInterceptionRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyInterceptionRuleRequest setDstTarget(java.util.Map<String, ?> dstTarget) {
        this.dstTarget = dstTarget;
        return this;
    }
    public java.util.Map<String, ?> getDstTarget() {
        return this.dstTarget;
    }

    public ModifyInterceptionRuleRequest setInterceptType(Integer interceptType) {
        this.interceptType = interceptType;
        return this;
    }
    public Integer getInterceptType() {
        return this.interceptType;
    }

    public ModifyInterceptionRuleRequest setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        return this;
    }
    public Long getOrderIndex() {
        return this.orderIndex;
    }

    public ModifyInterceptionRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyInterceptionRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ModifyInterceptionRuleRequest setRuleSwitch(Integer ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    public ModifyInterceptionRuleRequest setSrcTarget(java.util.Map<String, ?> srcTarget) {
        this.srcTarget = srcTarget;
        return this;
    }
    public java.util.Map<String, ?> getSrcTarget() {
        return this.srcTarget;
    }

}
