// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class DeleteSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSessionResponseBody body;

    public static DeleteSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSessionResponse self = new DeleteSessionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSessionResponse setBody(DeleteSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSessionResponseBody getBody() {
        return this.body;
    }

}
