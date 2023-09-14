// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneFeatureConsistencyCheckJobConfigResponseBody extends TeaModel {
    @NameInMap("FeatureConsistencyCheckId")
    public String featureConsistencyCheckId;

    @NameInMap("RequestId")
    public String requestId;

    public static CloneFeatureConsistencyCheckJobConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneFeatureConsistencyCheckJobConfigResponseBody self = new CloneFeatureConsistencyCheckJobConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneFeatureConsistencyCheckJobConfigResponseBody setFeatureConsistencyCheckId(String featureConsistencyCheckId) {
        this.featureConsistencyCheckId = featureConsistencyCheckId;
        return this;
    }
    public String getFeatureConsistencyCheckId() {
        return this.featureConsistencyCheckId;
    }

    public CloneFeatureConsistencyCheckJobConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
