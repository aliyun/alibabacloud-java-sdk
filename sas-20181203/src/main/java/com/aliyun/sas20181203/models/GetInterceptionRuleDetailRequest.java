// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInterceptionRuleDetailRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

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
