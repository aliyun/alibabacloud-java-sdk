// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateFeatureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFeatureResponseBody self = new UpdateFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
