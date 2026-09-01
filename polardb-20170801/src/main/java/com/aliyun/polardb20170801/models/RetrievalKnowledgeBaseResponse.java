// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RetrievalKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetrievalKnowledgeBaseResponseBody body;

    public static RetrievalKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        RetrievalKnowledgeBaseResponse self = new RetrievalKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public RetrievalKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetrievalKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetrievalKnowledgeBaseResponse setBody(RetrievalKnowledgeBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public RetrievalKnowledgeBaseResponseBody getBody() {
        return this.body;
    }

}
