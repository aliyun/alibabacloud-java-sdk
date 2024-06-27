// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateQueryVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateQueryVariableResponseBody body;

    public static UpdateQueryVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQueryVariableResponse self = new UpdateQueryVariableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQueryVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQueryVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateQueryVariableResponse setBody(UpdateQueryVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQueryVariableResponseBody getBody() {
        return this.body;
    }

}
