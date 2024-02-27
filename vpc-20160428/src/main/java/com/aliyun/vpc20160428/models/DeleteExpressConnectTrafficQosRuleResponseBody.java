// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteExpressConnectTrafficQosRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteExpressConnectTrafficQosRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressConnectTrafficQosRuleResponseBody self = new DeleteExpressConnectTrafficQosRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExpressConnectTrafficQosRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
