// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DisableSlowQueryResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    @NameInMap("requestId")
    public String requestId;

    public static DisableSlowQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableSlowQueryResponseBody self = new DisableSlowQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableSlowQueryResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

    public DisableSlowQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
