// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddResolverRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>725B8BED-901F-480C-BBAC-FA59A18580C1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The forwarding rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hra0**</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static AddResolverRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddResolverRuleResponseBody self = new AddResolverRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddResolverRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddResolverRuleResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
