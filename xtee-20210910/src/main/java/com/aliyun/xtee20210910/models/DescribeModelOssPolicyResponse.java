// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeModelOssPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModelOssPolicyResponseBody body;

    public static DescribeModelOssPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelOssPolicyResponse self = new DescribeModelOssPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelOssPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelOssPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModelOssPolicyResponse setBody(DescribeModelOssPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelOssPolicyResponseBody getBody() {
        return this.body;
    }

}
