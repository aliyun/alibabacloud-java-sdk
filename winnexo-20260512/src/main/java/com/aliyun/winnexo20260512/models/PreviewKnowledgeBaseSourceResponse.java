// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class PreviewKnowledgeBaseSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewKnowledgeBaseSourceResponseBody body;

    public static PreviewKnowledgeBaseSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewKnowledgeBaseSourceResponse self = new PreviewKnowledgeBaseSourceResponse();
        return TeaModel.build(map, self);
    }

    public PreviewKnowledgeBaseSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewKnowledgeBaseSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewKnowledgeBaseSourceResponse setBody(PreviewKnowledgeBaseSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewKnowledgeBaseSourceResponseBody getBody() {
        return this.body;
    }

}
