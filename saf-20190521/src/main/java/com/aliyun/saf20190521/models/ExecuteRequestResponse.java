// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class ExecuteRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteRequestResponseBody body;

    public static ExecuteRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRequestResponse self = new ExecuteRequestResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteRequestResponse setBody(ExecuteRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteRequestResponseBody getBody() {
        return this.body;
    }

}
