// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageFixTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageFixTaskResponseBody body;

    public static DescribeImageFixTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFixTaskResponse self = new DescribeImageFixTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageFixTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageFixTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageFixTaskResponse setBody(DescribeImageFixTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageFixTaskResponseBody getBody() {
        return this.body;
    }

}
