// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class FlinkApiProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FlinkApiProxyResponseBody body;

    public static FlinkApiProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        FlinkApiProxyResponse self = new FlinkApiProxyResponse();
        return TeaModel.build(map, self);
    }

    public FlinkApiProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlinkApiProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlinkApiProxyResponse setBody(FlinkApiProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public FlinkApiProxyResponseBody getBody() {
        return this.body;
    }

}
