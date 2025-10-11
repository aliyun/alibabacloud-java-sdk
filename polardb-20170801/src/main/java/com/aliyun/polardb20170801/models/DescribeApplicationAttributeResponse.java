// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationAttributeResponseBody body;

    public static DescribeApplicationAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationAttributeResponse self = new DescribeApplicationAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationAttributeResponse setBody(DescribeApplicationAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationAttributeResponseBody getBody() {
        return this.body;
    }

}
