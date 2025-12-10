// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CreateExperimentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>draft-rbvg5wzljzjhc9ks92</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <strong>example:</strong>
     * <p>42F23B58-3684-5443-848A-8DA81FF99712</p>
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
