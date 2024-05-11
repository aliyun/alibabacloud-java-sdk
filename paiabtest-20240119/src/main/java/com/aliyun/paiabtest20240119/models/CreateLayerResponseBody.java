// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateLayerResponseBody extends TeaModel {
    @NameInMap("LayerId")
    public String layerId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateLayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLayerResponseBody self = new CreateLayerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLayerResponseBody setLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }
    public String getLayerId() {
        return this.layerId;
    }

    public CreateLayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
