// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeInstanceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceInfoResponseBody body;

    public static DescribeInstanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceInfoResponse self = new DescribeInstanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceInfoResponse setBody(DescribeInstanceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceInfoResponseBody getBody() {
        return this.body;
    }

}
