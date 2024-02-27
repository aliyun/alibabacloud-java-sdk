// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectTrafficQosQueueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyExpressConnectTrafficQosQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectTrafficQosQueueResponseBody self = new ModifyExpressConnectTrafficQosQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectTrafficQosQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
