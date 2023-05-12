// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddResolverRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
