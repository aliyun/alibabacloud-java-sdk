// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceKnowledgeBaseAdminsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplaceKnowledgeBaseAdminsResponseBody body;

    public static ReplaceKnowledgeBaseAdminsResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceKnowledgeBaseAdminsResponse self = new ReplaceKnowledgeBaseAdminsResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceKnowledgeBaseAdminsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceKnowledgeBaseAdminsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceKnowledgeBaseAdminsResponse setBody(ReplaceKnowledgeBaseAdminsResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceKnowledgeBaseAdminsResponseBody getBody() {
        return this.body;
    }

}
