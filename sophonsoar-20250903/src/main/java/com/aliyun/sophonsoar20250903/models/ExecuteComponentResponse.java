// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class ExecuteComponentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteComponentResponseBody body;

    public static ExecuteComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteComponentResponse self = new ExecuteComponentResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteComponentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteComponentResponse setBody(ExecuteComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteComponentResponseBody getBody() {
        return this.body;
    }

}
