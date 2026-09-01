// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKnowledgeBaseFilesResponseBody body;

    public static DescribeKnowledgeBaseFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseFilesResponse self = new DescribeKnowledgeBaseFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKnowledgeBaseFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKnowledgeBaseFilesResponse setBody(DescribeKnowledgeBaseFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKnowledgeBaseFilesResponseBody getBody() {
        return this.body;
    }

}
