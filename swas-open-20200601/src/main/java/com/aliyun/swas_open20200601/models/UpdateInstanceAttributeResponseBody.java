// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class UpdateInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceAttributeResponseBody self = new UpdateInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
