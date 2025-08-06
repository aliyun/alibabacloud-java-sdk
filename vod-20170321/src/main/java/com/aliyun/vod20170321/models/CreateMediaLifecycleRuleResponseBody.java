// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateMediaLifecycleRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleId")
    public String ruleId;

    public static CreateMediaLifecycleRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaLifecycleRuleResponseBody self = new CreateMediaLifecycleRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMediaLifecycleRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMediaLifecycleRuleResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
