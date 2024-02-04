// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceSecurityConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceSecurityConfigsResponseBody body;

    public static DescribeInstanceSecurityConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSecurityConfigsResponse self = new DescribeInstanceSecurityConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSecurityConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSecurityConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceSecurityConfigsResponse setBody(DescribeInstanceSecurityConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSecurityConfigsResponseBody getBody() {
        return this.body;
    }

}
