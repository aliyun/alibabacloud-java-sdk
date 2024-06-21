// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetTextEmbeddingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTextEmbeddingResponseBody body;

    public static GetTextEmbeddingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTextEmbeddingResponse self = new GetTextEmbeddingResponse();
        return TeaModel.build(map, self);
    }

    public GetTextEmbeddingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTextEmbeddingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTextEmbeddingResponse setBody(GetTextEmbeddingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTextEmbeddingResponseBody getBody() {
        return this.body;
    }

}
