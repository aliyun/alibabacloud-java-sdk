// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVideoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVideoResponseBody body;

    public static DeleteVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoResponse self = new DeleteVideoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVideoResponse setBody(DeleteVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVideoResponseBody getBody() {
        return this.body;
    }

}
