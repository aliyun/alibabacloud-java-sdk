// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateMPURuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static CreateMPURuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMPURuleResponseBody self = new CreateMPURuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMPURuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMPURuleResponseBody setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
