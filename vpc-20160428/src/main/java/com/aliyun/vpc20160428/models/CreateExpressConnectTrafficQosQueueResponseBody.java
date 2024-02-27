// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressConnectTrafficQosQueueResponseBody extends TeaModel {
    @NameInMap("QosId")
    public String qosId;

    @NameInMap("QueueId")
    public String queueId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateExpressConnectTrafficQosQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressConnectTrafficQosQueueResponseBody self = new CreateExpressConnectTrafficQosQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExpressConnectTrafficQosQueueResponseBody setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public CreateExpressConnectTrafficQosQueueResponseBody setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }
    public String getQueueId() {
        return this.queueId;
    }

    public CreateExpressConnectTrafficQosQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
