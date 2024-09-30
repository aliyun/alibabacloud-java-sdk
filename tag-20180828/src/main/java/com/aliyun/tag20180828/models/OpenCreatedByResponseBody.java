// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class OpenCreatedByResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>74F03511-FDFA-54AF-96A4-71575B41E74D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenCreatedByResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenCreatedByResponseBody self = new OpenCreatedByResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenCreatedByResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
