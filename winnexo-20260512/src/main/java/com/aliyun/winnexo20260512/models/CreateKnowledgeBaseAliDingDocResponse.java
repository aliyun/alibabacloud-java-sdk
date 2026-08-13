// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseAliDingDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowledgeBaseAliDingDocResponseBody body;

    public static CreateKnowledgeBaseAliDingDocResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseAliDingDocResponse self = new CreateKnowledgeBaseAliDingDocResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseAliDingDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeBaseAliDingDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowledgeBaseAliDingDocResponse setBody(CreateKnowledgeBaseAliDingDocResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeBaseAliDingDocResponseBody getBody() {
        return this.body;
    }

}
