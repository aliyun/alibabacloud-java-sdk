// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ForbidVsStreamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>119F7639-4646-51A4-B6C1-300D391C0104</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ForbidVsStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ForbidVsStreamResponseBody self = new ForbidVsStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public ForbidVsStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
