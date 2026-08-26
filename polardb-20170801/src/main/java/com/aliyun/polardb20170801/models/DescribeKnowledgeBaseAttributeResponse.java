// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKnowledgeBaseAttributeResponseBody body;

    public static DescribeKnowledgeBaseAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseAttributeResponse self = new DescribeKnowledgeBaseAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKnowledgeBaseAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKnowledgeBaseAttributeResponse setBody(DescribeKnowledgeBaseAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKnowledgeBaseAttributeResponseBody getBody() {
        return this.body;
    }

}
