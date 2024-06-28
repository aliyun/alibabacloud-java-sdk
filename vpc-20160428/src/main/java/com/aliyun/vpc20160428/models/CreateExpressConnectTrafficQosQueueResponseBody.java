// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressConnectTrafficQosQueueResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>qos-2giu0a6vd5x0mv4700</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <strong>example:</strong>
     * <p>qos-queue-9nyx2u7n71s2rcy4n5</p>
     */
    @NameInMap("QueueId")
    public String queueId;

    /**
     * <strong>example:</strong>
     * <p>4CF20CC7-D1FC-425B-A15B-DF7C8E2131A7</p>
     */
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
