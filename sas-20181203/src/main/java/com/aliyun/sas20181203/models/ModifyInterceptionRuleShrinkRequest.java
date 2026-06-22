// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionRuleShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/182997.html">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c17ef568f81884cdab402decd5fcd****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The destination object. The metric description is as follows:</p>
     * <ul>
     * <li>targetId: the ID of the destination object. You can invoke the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to obtain this parameter.</li>
     * <li>ports: the list of destination port ranges.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;targetId&quot;:600069,&quot;ports&quot;:[&quot;80/8088&quot;]}</p>
     */
    @NameInMap("DstTarget")
    public String dstTargetShrink;

    /**
     * <p>The interception mode. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Block Mode</li>
     * <li><strong>2</strong>: Alert mode</li>
     * <li><strong>3</strong>: Allow mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InterceptType")
    public Integer interceptType;

    /**
     * <p>The priority of the rule. The priority ranges from 1 to 1000. A smaller number indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrderIndex")
    public Long orderIndex;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>500018</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>tetsRule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The switch status of the rule. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>0</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleSwitch")
    public Integer ruleSwitch;

    /**
     * <p>The source rule object. The metric description is as follows:</p>
     * <ul>
     * <li>targetId: the ID of the source object. You can invoke the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to obtain this parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;targetId&quot;:400989}</p>
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
