// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class InflightTaskTimeoutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InflightTaskTimeoutResponseBody body;

    public static InflightTaskTimeoutResponse build(java.util.Map<String, ?> map) throws Exception {
        InflightTaskTimeoutResponse self = new InflightTaskTimeoutResponse();
        return TeaModel.build(map, self);
    }

    public InflightTaskTimeoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InflightTaskTimeoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InflightTaskTimeoutResponse setBody(InflightTaskTimeoutResponseBody body) {
        this.body = body;
        return this;
    }
    public InflightTaskTimeoutResponseBody getBody() {
        return this.body;
    }

}
