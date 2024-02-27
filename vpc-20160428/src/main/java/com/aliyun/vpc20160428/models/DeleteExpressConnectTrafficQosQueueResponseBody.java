// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteExpressConnectTrafficQosQueueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteExpressConnectTrafficQosQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressConnectTrafficQosQueueResponseBody self = new DeleteExpressConnectTrafficQosQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExpressConnectTrafficQosQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
