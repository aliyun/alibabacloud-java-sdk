// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateFeatureViewResponseBody extends TeaModel {
    @NameInMap("FeatureViewId")
    public String featureViewId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateFeatureViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFeatureViewResponseBody self = new CreateFeatureViewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFeatureViewResponseBody setFeatureViewId(String featureViewId) {
        this.featureViewId = featureViewId;
        return this;
    }
    public String getFeatureViewId() {
        return this.featureViewId;
    }

    public CreateFeatureViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
