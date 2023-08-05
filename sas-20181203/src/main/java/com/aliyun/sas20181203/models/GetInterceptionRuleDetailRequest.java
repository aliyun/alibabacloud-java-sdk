// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInterceptionRuleDetailRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <br>
     * <p>> You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>> You can call the [ListInterceptionRulePage](~~ListInterceptionRulePage~~) operation to query the IDs of rules.</p>
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
