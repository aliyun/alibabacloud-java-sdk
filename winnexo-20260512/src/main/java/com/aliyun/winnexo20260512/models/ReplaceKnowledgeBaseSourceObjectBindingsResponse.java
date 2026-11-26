// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceKnowledgeBaseSourceObjectBindingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplaceKnowledgeBaseSourceObjectBindingsResponseBody body;

    public static ReplaceKnowledgeBaseSourceObjectBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceKnowledgeBaseSourceObjectBindingsResponse self = new ReplaceKnowledgeBaseSourceObjectBindingsResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceKnowledgeBaseSourceObjectBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceKnowledgeBaseSourceObjectBindingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceKnowledgeBaseSourceObjectBindingsResponse setBody(ReplaceKnowledgeBaseSourceObjectBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceKnowledgeBaseSourceObjectBindingsResponseBody getBody() {
        return this.body;
    }

}
