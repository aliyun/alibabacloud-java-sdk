// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateModelFeatureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateModelFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelFeatureResponseBody self = new UpdateModelFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateModelFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
