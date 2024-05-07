// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateResourceRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceRuleId")
    public String resourceRuleId;

    public static CreateResourceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRuleResponseBody self = new CreateResourceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResourceRuleResponseBody setResourceRuleId(String resourceRuleId) {
        this.resourceRuleId = resourceRuleId;
        return this;
    }
    public String getResourceRuleId() {
        return this.resourceRuleId;
    }

}
