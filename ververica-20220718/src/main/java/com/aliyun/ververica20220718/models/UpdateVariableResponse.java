// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVariableResponseBody body;

    public static UpdateVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVariableResponse self = new UpdateVariableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVariableResponse setBody(UpdateVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVariableResponseBody getBody() {
        return this.body;
    }

}
