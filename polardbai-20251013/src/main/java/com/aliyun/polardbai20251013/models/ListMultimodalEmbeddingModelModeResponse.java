// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ListMultimodalEmbeddingModelModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMultimodalEmbeddingModelModeResponseBody body;

    public static ListMultimodalEmbeddingModelModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMultimodalEmbeddingModelModeResponse self = new ListMultimodalEmbeddingModelModeResponse();
        return TeaModel.build(map, self);
    }

    public ListMultimodalEmbeddingModelModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMultimodalEmbeddingModelModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMultimodalEmbeddingModelModeResponse setBody(ListMultimodalEmbeddingModelModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMultimodalEmbeddingModelModeResponseBody getBody() {
        return this.body;
    }

}
