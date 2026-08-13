// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RetryKnowledgeBaseFailedSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryKnowledgeBaseFailedSourcesResponseBody body;

    public static RetryKnowledgeBaseFailedSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryKnowledgeBaseFailedSourcesResponse self = new RetryKnowledgeBaseFailedSourcesResponse();
        return TeaModel.build(map, self);
    }

    public RetryKnowledgeBaseFailedSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryKnowledgeBaseFailedSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryKnowledgeBaseFailedSourcesResponse setBody(RetryKnowledgeBaseFailedSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryKnowledgeBaseFailedSourcesResponseBody getBody() {
        return this.body;
    }

}
