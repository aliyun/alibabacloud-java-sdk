// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatRateLimitRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2315DEB7-5E92-423A-91F7-4C1EC9AD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the rate limiting rule.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static CreateNatRateLimitRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNatRateLimitRuleResponseBody self = new CreateNatRateLimitRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNatRateLimitRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNatRateLimitRuleResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
