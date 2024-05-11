// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateLayerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLayerResponseBody self = new UpdateLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
