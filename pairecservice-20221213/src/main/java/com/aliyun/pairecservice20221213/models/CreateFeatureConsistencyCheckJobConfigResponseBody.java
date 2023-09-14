// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateFeatureConsistencyCheckJobConfigResponseBody extends TeaModel {
    @NameInMap("FeatureConsistencyCheckJobConfigId")
    public String featureConsistencyCheckJobConfigId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateFeatureConsistencyCheckJobConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFeatureConsistencyCheckJobConfigResponseBody self = new CreateFeatureConsistencyCheckJobConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFeatureConsistencyCheckJobConfigResponseBody setFeatureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
        this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
        return this;
    }
    public String getFeatureConsistencyCheckJobConfigId() {
        return this.featureConsistencyCheckJobConfigId;
    }

    public CreateFeatureConsistencyCheckJobConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
