// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateModelFeatureResponseBody extends TeaModel {
    @NameInMap("ModelFeatureId")
    public String modelFeatureId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateModelFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelFeatureResponseBody self = new CreateModelFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelFeatureResponseBody setModelFeatureId(String modelFeatureId) {
        this.modelFeatureId = modelFeatureId;
        return this;
    }
    public String getModelFeatureId() {
        return this.modelFeatureId;
    }

    public CreateModelFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
