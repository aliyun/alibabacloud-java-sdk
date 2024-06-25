// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateLayerResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0EA9215E-EC21-53AB-B8D9-D3DEA90D040A</p>
     */
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
