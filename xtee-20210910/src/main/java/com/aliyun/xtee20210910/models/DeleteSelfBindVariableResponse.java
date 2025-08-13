// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteSelfBindVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSelfBindVariableResponseBody body;

    public static DeleteSelfBindVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSelfBindVariableResponse self = new DeleteSelfBindVariableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSelfBindVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSelfBindVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSelfBindVariableResponse setBody(DeleteSelfBindVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSelfBindVariableResponseBody getBody() {
        return this.body;
    }

}
