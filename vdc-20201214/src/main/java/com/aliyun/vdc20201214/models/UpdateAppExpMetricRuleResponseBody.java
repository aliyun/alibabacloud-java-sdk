// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class UpdateAppExpMetricRuleResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppExpMetricRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppExpMetricRuleResponseBody self = new UpdateAppExpMetricRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppExpMetricRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
