// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressConnectTrafficQosResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>qos-2giu0a6vd5x0mv4700</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <strong>example:</strong>
     * <p>DC668356-BCB4-42FD-9BC3-FA2B2E04B634</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateExpressConnectTrafficQosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressConnectTrafficQosResponseBody self = new CreateExpressConnectTrafficQosResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExpressConnectTrafficQosResponseBody setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public CreateExpressConnectTrafficQosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
