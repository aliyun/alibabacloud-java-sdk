// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressConnectTrafficQosResponseBody extends TeaModel {
    @NameInMap("QosId")
    public String qosId;

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
