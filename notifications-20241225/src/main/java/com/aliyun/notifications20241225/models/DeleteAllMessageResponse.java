// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class DeleteAllMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAllMessageResponseBody body;

    public static DeleteAllMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAllMessageResponse self = new DeleteAllMessageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAllMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAllMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAllMessageResponse setBody(DeleteAllMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAllMessageResponseBody getBody() {
        return this.body;
    }

}
