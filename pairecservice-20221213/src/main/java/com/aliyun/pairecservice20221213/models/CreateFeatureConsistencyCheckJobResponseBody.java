// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateFeatureConsistencyCheckJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("FeatureConsistencyCheckJobId")
    public String featureConsistencyCheckJobId;

    /**
     * <strong>example:</strong>
     * <p>7D59453C-48AA-5FC5-8848-2D373BD1A17F</p>
     */
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
