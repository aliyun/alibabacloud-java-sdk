// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteVideoResponse setBody(DeleteVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVideoResponseBody getBody() {
        return this.body;
    }

}
