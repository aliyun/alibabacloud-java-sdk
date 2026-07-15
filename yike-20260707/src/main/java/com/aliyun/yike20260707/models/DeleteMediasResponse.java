// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class DeleteMediasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMediasResponseBody body;

    public static DeleteMediasResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediasResponse self = new DeleteMediasResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMediasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMediasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMediasResponse setBody(DeleteMediasResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMediasResponseBody getBody() {
        return this.body;
    }

}
