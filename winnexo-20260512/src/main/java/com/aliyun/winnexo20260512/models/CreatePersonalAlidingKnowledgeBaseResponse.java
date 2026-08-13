// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalAlidingKnowledgeBaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePersonalAlidingKnowledgeBaseResponseBody body;

    public static CreatePersonalAlidingKnowledgeBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalAlidingKnowledgeBaseResponse self = new CreatePersonalAlidingKnowledgeBaseResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalAlidingKnowledgeBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalAlidingKnowledgeBaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalAlidingKnowledgeBaseResponse setBody(CreatePersonalAlidingKnowledgeBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalAlidingKnowledgeBaseResponseBody getBody() {
        return this.body;
    }

}
