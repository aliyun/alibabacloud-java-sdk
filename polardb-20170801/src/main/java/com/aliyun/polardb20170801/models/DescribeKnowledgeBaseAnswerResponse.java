// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseAnswerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKnowledgeBaseAnswerResponseBody body;

    public static DescribeKnowledgeBaseAnswerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseAnswerResponse self = new DescribeKnowledgeBaseAnswerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseAnswerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKnowledgeBaseAnswerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKnowledgeBaseAnswerResponse setBody(DescribeKnowledgeBaseAnswerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKnowledgeBaseAnswerResponseBody getBody() {
        return this.body;
    }

}
