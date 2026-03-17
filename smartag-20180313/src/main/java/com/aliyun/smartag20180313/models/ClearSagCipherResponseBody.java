// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ClearSagCipherResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3712F0B2-721E-4FBF-BBEF-888E3BFE0A20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClearSagCipherResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearSagCipherResponseBody self = new ClearSagCipherResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearSagCipherResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
