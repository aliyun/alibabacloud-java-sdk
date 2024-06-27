// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDetailStartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDetailStartResponseBody body;

    public static DescribeDetailStartResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDetailStartResponse self = new DescribeDetailStartResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDetailStartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDetailStartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDetailStartResponse setBody(DescribeDetailStartResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDetailStartResponseBody getBody() {
        return this.body;
    }

}
