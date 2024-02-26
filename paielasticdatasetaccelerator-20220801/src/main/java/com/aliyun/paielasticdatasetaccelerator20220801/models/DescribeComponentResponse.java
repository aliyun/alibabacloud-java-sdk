// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class DescribeComponentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeComponentResponseBody body;

    public static DescribeComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentResponse self = new DescribeComponentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComponentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComponentResponse setBody(DescribeComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComponentResponseBody getBody() {
        return this.body;
    }

}
