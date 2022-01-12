// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class LogOptimizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LogOptimizationResponseBody body;

    public static LogOptimizationResponse build(java.util.Map<String, ?> map) throws Exception {
        LogOptimizationResponse self = new LogOptimizationResponse();
        return TeaModel.build(map, self);
    }

    public LogOptimizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LogOptimizationResponse setBody(LogOptimizationResponseBody body) {
        this.body = body;
        return this;
    }
    public LogOptimizationResponseBody getBody() {
        return this.body;
    }

}
