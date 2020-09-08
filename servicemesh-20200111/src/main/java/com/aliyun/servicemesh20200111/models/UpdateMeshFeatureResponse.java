// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateMeshFeatureResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateMeshFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshFeatureResponse self = new UpdateMeshFeatureResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMeshFeatureResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
