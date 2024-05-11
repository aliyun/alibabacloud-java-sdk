// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateFeatureResponseBody extends TeaModel {
    @NameInMap("FeatureId")
    public String featureId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFeatureResponseBody self = new CreateFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFeatureResponseBody setFeatureId(String featureId) {
        this.featureId = featureId;
        return this;
    }
    public String getFeatureId() {
        return this.featureId;
    }

    public CreateFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
