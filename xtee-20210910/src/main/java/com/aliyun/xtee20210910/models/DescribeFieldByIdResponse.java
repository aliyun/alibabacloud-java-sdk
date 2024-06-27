// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeFieldByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFieldByIdResponseBody body;

    public static DescribeFieldByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldByIdResponse self = new DescribeFieldByIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFieldByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFieldByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFieldByIdResponse setBody(DescribeFieldByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFieldByIdResponseBody getBody() {
        return this.body;
    }

}
