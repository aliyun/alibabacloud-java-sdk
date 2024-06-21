// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetTextSparseEmbeddingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTextSparseEmbeddingResponseBody body;

    public static GetTextSparseEmbeddingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTextSparseEmbeddingResponse self = new GetTextSparseEmbeddingResponse();
        return TeaModel.build(map, self);
    }

    public GetTextSparseEmbeddingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTextSparseEmbeddingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTextSparseEmbeddingResponse setBody(GetTextSparseEmbeddingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTextSparseEmbeddingResponseBody getBody() {
        return this.body;
    }

}
