// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventDetailByRequestIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventDetailByRequestIdResponseBody body;

    public static DescribeEventDetailByRequestIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventDetailByRequestIdResponse self = new DescribeEventDetailByRequestIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventDetailByRequestIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventDetailByRequestIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventDetailByRequestIdResponse setBody(DescribeEventDetailByRequestIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventDetailByRequestIdResponseBody getBody() {
        return this.body;
    }

}
