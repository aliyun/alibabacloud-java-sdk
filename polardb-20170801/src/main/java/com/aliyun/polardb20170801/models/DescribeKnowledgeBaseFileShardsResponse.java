// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseFileShardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKnowledgeBaseFileShardsResponseBody body;

    public static DescribeKnowledgeBaseFileShardsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseFileShardsResponse self = new DescribeKnowledgeBaseFileShardsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseFileShardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKnowledgeBaseFileShardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKnowledgeBaseFileShardsResponse setBody(DescribeKnowledgeBaseFileShardsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKnowledgeBaseFileShardsResponseBody getBody() {
        return this.body;
    }

}
