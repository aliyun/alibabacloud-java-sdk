// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RevokeTokenResponseBody extends TeaModel {
    /**
     * <p>The request ID. This parameter is a common parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>833EDFCB-C447-4CE3-B21F-3A4C2D1B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeTokenResponseBody self = new RevokeTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
