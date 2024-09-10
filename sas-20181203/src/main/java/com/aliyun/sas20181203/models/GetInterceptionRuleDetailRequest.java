// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInterceptionRuleDetailRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c7f60fdabc84xxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the rule.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListInterceptionRulePage~~">ListInterceptionRulePage</a> operation to query the IDs of rules.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>500002</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static GetInterceptionRuleDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInterceptionRuleDetailRequest self = new GetInterceptionRuleDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetInterceptionRuleDetailRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetInterceptionRuleDetailRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
