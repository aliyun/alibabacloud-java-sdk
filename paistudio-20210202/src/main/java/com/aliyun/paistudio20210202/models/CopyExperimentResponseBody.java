// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CopyExperimentResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExperimentId")
    public String experimentId;

    public static CopyExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyExperimentResponseBody self = new CopyExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopyExperimentResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

}
