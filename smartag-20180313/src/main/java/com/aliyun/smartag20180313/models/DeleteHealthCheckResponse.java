// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteHealthCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHealthCheckResponseBody body;

    public static DeleteHealthCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHealthCheckResponse self = new DeleteHealthCheckResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHealthCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHealthCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHealthCheckResponse setBody(DeleteHealthCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHealthCheckResponseBody getBody() {
        return this.body;
    }

}
