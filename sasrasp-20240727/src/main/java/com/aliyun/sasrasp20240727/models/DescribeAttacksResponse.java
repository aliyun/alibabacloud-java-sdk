// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasrasp20240727.models;

import com.aliyun.tea.*;

public class DescribeAttacksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAttacksResponseBody body;

    public static DescribeAttacksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttacksResponse self = new DescribeAttacksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAttacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAttacksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAttacksResponse setBody(DescribeAttacksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAttacksResponseBody getBody() {
        return this.body;
    }

}
