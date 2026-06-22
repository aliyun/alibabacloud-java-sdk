// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionRuleSwitchRequest extends TeaModel {
    /**
     * <p>The ID of the cluster that you want to modify.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ce5c29aba99694ade9ba85dc620b4****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The list of rule IDs to operate on. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListInterceptionRulePage~~">ListInterceptionRulePage</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>403287</p>
     */
    @NameInMap("RuleIds")
    public String ruleIds;

    /**
     * <p>The switch status of the rule. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enabled.</li>
     * <li><strong>0</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleSwitch")
    public Integer ruleSwitch;

    public static ModifyInterceptionRuleSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInterceptionRuleSwitchRequest self = new ModifyInterceptionRuleSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInterceptionRuleSwitchRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyInterceptionRuleSwitchRequest setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public String getRuleIds() {
        return this.ruleIds;
    }

    public ModifyInterceptionRuleSwitchRequest setRuleSwitch(Integer ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

}
