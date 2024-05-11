// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class PushAllExperimentVersionResponseBody extends TeaModel {
    @NameInMap("FeatureId")
    public String featureId;

    @NameInMap("RequestId")
    public String requestId;

    public static PushAllExperimentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushAllExperimentVersionResponseBody self = new PushAllExperimentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public PushAllExperimentVersionResponseBody setFeatureId(String featureId) {
        this.featureId = featureId;
        return this;
    }
    public String getFeatureId() {
        return this.featureId;
    }

    public PushAllExperimentVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
