// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageResponseBody body;

    public static DescribeImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageResponse self = new DescribeImageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageResponse setBody(DescribeImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageResponseBody getBody() {
        return this.body;
    }

}
