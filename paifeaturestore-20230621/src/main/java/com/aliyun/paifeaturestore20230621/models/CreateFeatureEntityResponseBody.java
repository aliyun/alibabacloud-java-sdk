// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateFeatureEntityResponseBody extends TeaModel {
    @NameInMap("FeatureEntityId")
    public String featureEntityId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateFeatureEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFeatureEntityResponseBody self = new CreateFeatureEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFeatureEntityResponseBody setFeatureEntityId(String featureEntityId) {
        this.featureEntityId = featureEntityId;
        return this;
    }
    public String getFeatureEntityId() {
        return this.featureEntityId;
    }

    public CreateFeatureEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
