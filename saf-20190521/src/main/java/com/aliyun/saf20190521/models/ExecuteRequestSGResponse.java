// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class ExecuteRequestSGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteRequestSGResponseBody body;

    public static ExecuteRequestSGResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRequestSGResponse self = new ExecuteRequestSGResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteRequestSGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteRequestSGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteRequestSGResponse setBody(ExecuteRequestSGResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteRequestSGResponseBody getBody() {
        return this.body;
    }

}
