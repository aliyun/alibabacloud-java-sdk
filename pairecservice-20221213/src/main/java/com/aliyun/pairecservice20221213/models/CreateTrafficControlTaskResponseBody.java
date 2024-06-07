// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateTrafficControlTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficControlTaskId")
    public String trafficControlTaskId;

    public static CreateTrafficControlTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficControlTaskResponseBody self = new CreateTrafficControlTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrafficControlTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTrafficControlTaskResponseBody setTrafficControlTaskId(String trafficControlTaskId) {
        this.trafficControlTaskId = trafficControlTaskId;
        return this;
    }
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
    }

}
