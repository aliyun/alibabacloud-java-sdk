// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteImageResponseBody body;

    public static DeleteImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageResponse self = new DeleteImageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteImageResponse setBody(DeleteImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteImageResponseBody getBody() {
        return this.body;
    }

}
