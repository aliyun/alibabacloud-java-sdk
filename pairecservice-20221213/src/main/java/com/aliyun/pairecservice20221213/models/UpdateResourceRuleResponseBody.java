// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateResourceRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateResourceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceRuleResponseBody self = new UpdateResourceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
