// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteResourceRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteResourceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceRuleResponseBody self = new DeleteResourceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
