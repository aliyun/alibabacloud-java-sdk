// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DeletePublicUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePublicUrlResponseBody body;

    public static DeletePublicUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePublicUrlResponse self = new DeletePublicUrlResponse();
        return TeaModel.build(map, self);
    }

    public DeletePublicUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePublicUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePublicUrlResponse setBody(DeletePublicUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePublicUrlResponseBody getBody() {
        return this.body;
    }

}
