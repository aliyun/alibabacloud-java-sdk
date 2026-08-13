// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySemanticKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySemanticKnowledgeResponseBody body;

    public static QuerySemanticKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySemanticKnowledgeResponse self = new QuerySemanticKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public QuerySemanticKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySemanticKnowledgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySemanticKnowledgeResponse setBody(QuerySemanticKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySemanticKnowledgeResponseBody getBody() {
        return this.body;
    }

}
