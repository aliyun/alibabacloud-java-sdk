// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CopyExperimentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>draft-rbvg5wzljzjhc9ks92</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <strong>example:</strong>
     * <p>6D161C28-9CB1-584E-8DD5-64441E32A5B3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CopyExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyExperimentResponseBody self = new CopyExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyExperimentResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public CopyExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
