// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKnowledgeBasesResponseBody body;

    public static DescribeKnowledgeBasesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBasesResponse self = new DescribeKnowledgeBasesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKnowledgeBasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKnowledgeBasesResponse setBody(DescribeKnowledgeBasesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKnowledgeBasesResponseBody getBody() {
        return this.body;
    }

}
