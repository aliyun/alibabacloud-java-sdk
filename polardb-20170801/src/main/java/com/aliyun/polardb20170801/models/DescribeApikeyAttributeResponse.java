// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApikeyAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApikeyAttributeResponseBody body;

    public static DescribeApikeyAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApikeyAttributeResponse self = new DescribeApikeyAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApikeyAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApikeyAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApikeyAttributeResponse setBody(DescribeApikeyAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApikeyAttributeResponseBody getBody() {
        return this.body;
    }

}
