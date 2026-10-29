// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class ExecuteRequestMLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteRequestMLResponseBody body;

    public static ExecuteRequestMLResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRequestMLResponse self = new ExecuteRequestMLResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteRequestMLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteRequestMLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteRequestMLResponse setBody(ExecuteRequestMLResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteRequestMLResponseBody getBody() {
        return this.body;
    }

}
