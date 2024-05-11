// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class StartExperimentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartExperimentResponseBody self = new StartExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public StartExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
