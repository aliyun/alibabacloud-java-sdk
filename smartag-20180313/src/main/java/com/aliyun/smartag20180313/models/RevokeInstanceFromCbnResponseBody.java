// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromCbnResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>07D73949-2508-4169-8C64-7CCDB33871C4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeInstanceFromCbnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceFromCbnResponseBody self = new RevokeInstanceFromCbnResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceFromCbnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
