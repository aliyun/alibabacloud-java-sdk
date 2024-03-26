// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAIImageInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAIImageInfosResponseBody body;

    public static DeleteAIImageInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIImageInfosResponse self = new DeleteAIImageInfosResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAIImageInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAIImageInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAIImageInfosResponse setBody(DeleteAIImageInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAIImageInfosResponseBody getBody() {
        return this.body;
    }

}
