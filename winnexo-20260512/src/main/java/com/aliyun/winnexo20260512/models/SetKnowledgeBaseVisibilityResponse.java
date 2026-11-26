// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SetKnowledgeBaseVisibilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetKnowledgeBaseVisibilityResponseBody body;

    public static SetKnowledgeBaseVisibilityResponse build(java.util.Map<String, ?> map) throws Exception {
        SetKnowledgeBaseVisibilityResponse self = new SetKnowledgeBaseVisibilityResponse();
        return TeaModel.build(map, self);
    }

    public SetKnowledgeBaseVisibilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetKnowledgeBaseVisibilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetKnowledgeBaseVisibilityResponse setBody(SetKnowledgeBaseVisibilityResponseBody body) {
        this.body = body;
        return this;
    }
    public SetKnowledgeBaseVisibilityResponseBody getBody() {
        return this.body;
    }

}
