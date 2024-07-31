// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class UpdateDiskAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28D****534F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDiskAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDiskAttributeResponseBody self = new UpdateDiskAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDiskAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
