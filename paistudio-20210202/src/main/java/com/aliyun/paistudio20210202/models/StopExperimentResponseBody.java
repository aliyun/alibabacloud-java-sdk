// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class StopExperimentResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static StopExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopExperimentResponseBody self = new StopExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public StopExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
