// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionRuleSwitchRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The IDs of the rules whose status you want to change. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>> You can call the [ListInterceptionRulePage](https://help.aliyun.com/document_detail/182997.html) operation to query the IDs of rules.</p>
     */
    @NameInMap("RuleIds")
    public String ruleIds;

    /**
     * <p>Specifies whether the rule is enabled. Valid values:</p>
     * <br>
     * <p>*   **1**: enabled</p>
     * <p>*   **0**: disabled</p>
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
