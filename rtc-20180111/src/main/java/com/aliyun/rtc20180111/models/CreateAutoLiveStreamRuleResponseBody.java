// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAutoLiveStreamRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static CreateAutoLiveStreamRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoLiveStreamRuleResponseBody self = new CreateAutoLiveStreamRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAutoLiveStreamRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAutoLiveStreamRuleResponseBody setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
