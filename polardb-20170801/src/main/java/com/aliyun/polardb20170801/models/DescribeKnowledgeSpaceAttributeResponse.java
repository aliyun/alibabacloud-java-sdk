// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeSpaceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKnowledgeSpaceAttributeResponseBody body;

    public static DescribeKnowledgeSpaceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeSpaceAttributeResponse self = new DescribeKnowledgeSpaceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeSpaceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKnowledgeSpaceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKnowledgeSpaceAttributeResponse setBody(DescribeKnowledgeSpaceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKnowledgeSpaceAttributeResponseBody getBody() {
        return this.body;
    }

}
