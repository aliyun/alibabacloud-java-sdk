// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DeleteAppExpMetricRuleResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppExpMetricRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppExpMetricRuleResponseBody self = new DeleteAppExpMetricRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppExpMetricRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
