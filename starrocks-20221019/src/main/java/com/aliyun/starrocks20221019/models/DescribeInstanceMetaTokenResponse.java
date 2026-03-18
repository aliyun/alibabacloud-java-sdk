// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeInstanceMetaTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceMetaTokenResponseBody body;

    public static DescribeInstanceMetaTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMetaTokenResponse self = new DescribeInstanceMetaTokenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMetaTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceMetaTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceMetaTokenResponse setBody(DescribeInstanceMetaTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceMetaTokenResponseBody getBody() {
        return this.body;
    }

}
