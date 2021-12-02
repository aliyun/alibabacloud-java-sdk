// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficMirrorFilterId")
    public String trafficMirrorFilterId;

    public static CreateTrafficMirrorFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMirrorFilterResponseBody self = new CreateTrafficMirrorFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMirrorFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTrafficMirrorFilterResponseBody setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

}
