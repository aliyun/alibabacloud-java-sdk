// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorSessionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficMirrorSessionId")
    public String trafficMirrorSessionId;

    public static CreateTrafficMirrorSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMirrorSessionResponseBody self = new CreateTrafficMirrorSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMirrorSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTrafficMirrorSessionResponseBody setTrafficMirrorSessionId(String trafficMirrorSessionId) {
        this.trafficMirrorSessionId = trafficMirrorSessionId;
        return this;
    }
    public String getTrafficMirrorSessionId() {
        return this.trafficMirrorSessionId;
    }

}
