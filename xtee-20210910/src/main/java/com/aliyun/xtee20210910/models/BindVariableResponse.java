// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class BindVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindVariableResponseBody body;

    public static BindVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        BindVariableResponse self = new BindVariableResponse();
        return TeaModel.build(map, self);
    }

    public BindVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindVariableResponse setBody(BindVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public BindVariableResponseBody getBody() {
        return this.body;
    }

}
