// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOssPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssPolicyResponseBody body;

    public static DescribeOssPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssPolicyResponse self = new DescribeOssPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssPolicyResponse setBody(DescribeOssPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssPolicyResponseBody getBody() {
        return this.body;
    }

}
