// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RetryKnowledgeBaseFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryKnowledgeBaseFilesResponseBody body;

    public static RetryKnowledgeBaseFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryKnowledgeBaseFilesResponse self = new RetryKnowledgeBaseFilesResponse();
        return TeaModel.build(map, self);
    }

    public RetryKnowledgeBaseFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryKnowledgeBaseFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryKnowledgeBaseFilesResponse setBody(RetryKnowledgeBaseFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryKnowledgeBaseFilesResponseBody getBody() {
        return this.body;
    }

}
