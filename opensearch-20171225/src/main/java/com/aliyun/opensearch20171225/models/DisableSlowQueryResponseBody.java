// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DisableSlowQueryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The return result.</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static DisableSlowQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableSlowQueryResponseBody self = new DisableSlowQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableSlowQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableSlowQueryResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
