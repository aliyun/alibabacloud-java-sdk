// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ListMultimodalEmbeddingModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMultimodalEmbeddingModelResponseBody body;

    public static ListMultimodalEmbeddingModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultimodalEmbeddingModelResponse self = new ListMultimodalEmbeddingModelResponse();
        return TeaModel.build(map, self);
    }

    public ListMultimodalEmbeddingModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultimodalEmbeddingModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultimodalEmbeddingModelResponse setBody(ListMultimodalEmbeddingModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultimodalEmbeddingModelResponseBody getBody() {
        return this.body;
    }

}
