// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateFeatureConsistencyCheckJobResponseBody extends TeaModel {
    @NameInMap("FeatureConsistencyCheckJobId")
    public String featureConsistencyCheckJobId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateFeatureConsistencyCheckJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFeatureConsistencyCheckJobResponseBody self = new CreateFeatureConsistencyCheckJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFeatureConsistencyCheckJobResponseBody setFeatureConsistencyCheckJobId(String featureConsistencyCheckJobId) {
        this.featureConsistencyCheckJobId = featureConsistencyCheckJobId;
        return this;
    }
    public String getFeatureConsistencyCheckJobId() {
        return this.featureConsistencyCheckJobId;
    }

    public CreateFeatureConsistencyCheckJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
