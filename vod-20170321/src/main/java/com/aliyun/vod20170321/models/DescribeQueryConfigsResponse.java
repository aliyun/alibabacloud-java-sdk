// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeQueryConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeQueryConfigsResponseBody body;

    public static DescribeQueryConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryConfigsResponse self = new DescribeQueryConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQueryConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQueryConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQueryConfigsResponse setBody(DescribeQueryConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQueryConfigsResponseBody getBody() {
        return this.body;
    }

}
