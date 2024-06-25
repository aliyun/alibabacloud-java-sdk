// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateFeatureConsistencyCheckJobConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("FeatureConsistencyCheckJobConfigId")
    public String featureConsistencyCheckJobConfigId;

    /**
     * <strong>example:</strong>
     * <p>E15A1443-7917-5BE0-AE70-25538ECF398D</p>
     */
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
