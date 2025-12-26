// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class RetrieveKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetrieveKnowledgeBaseResponseBody body;

    public static RetrieveKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        RetrieveKnowledgeBaseResponse self = new RetrieveKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public RetrieveKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetrieveKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetrieveKnowledgeBaseResponse setBody(RetrieveKnowledgeBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public RetrieveKnowledgeBaseResponseBody getBody() {
        return this.body;
    }

}
