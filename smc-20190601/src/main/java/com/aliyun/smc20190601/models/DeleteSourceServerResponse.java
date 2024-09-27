// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DeleteSourceServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSourceServerResponseBody body;

    public static DeleteSourceServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSourceServerResponse self = new DeleteSourceServerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSourceServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSourceServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSourceServerResponse setBody(DeleteSourceServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSourceServerResponseBody getBody() {
        return this.body;
    }

}
