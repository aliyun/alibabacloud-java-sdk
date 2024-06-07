// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateTrafficControlTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficControlTargetId")
    public String trafficControlTargetId;

    public static CreateTrafficControlTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficControlTargetResponseBody self = new CreateTrafficControlTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrafficControlTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTrafficControlTargetResponseBody setTrafficControlTargetId(String trafficControlTargetId) {
        this.trafficControlTargetId = trafficControlTargetId;
        return this;
    }
    public String getTrafficControlTargetId() {
        return this.trafficControlTargetId;
    }

}
