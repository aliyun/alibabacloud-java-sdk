// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateExperimentResponseBody extends TeaModel {
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentResponseBody self = new CreateExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExperimentResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public CreateExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
