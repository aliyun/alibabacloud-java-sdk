// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceKnowledgeBaseSourceFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplaceKnowledgeBaseSourceFileResponseBody body;

    public static ReplaceKnowledgeBaseSourceFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceKnowledgeBaseSourceFileResponse self = new ReplaceKnowledgeBaseSourceFileResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceKnowledgeBaseSourceFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceKnowledgeBaseSourceFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceKnowledgeBaseSourceFileResponse setBody(ReplaceKnowledgeBaseSourceFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceKnowledgeBaseSourceFileResponseBody getBody() {
        return this.body;
    }

}
