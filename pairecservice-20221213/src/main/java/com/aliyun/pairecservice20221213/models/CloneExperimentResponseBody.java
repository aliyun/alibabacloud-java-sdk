// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneExperimentResponseBody extends TeaModel {
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloneExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneExperimentResponseBody self = new CloneExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneExperimentResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public CloneExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
