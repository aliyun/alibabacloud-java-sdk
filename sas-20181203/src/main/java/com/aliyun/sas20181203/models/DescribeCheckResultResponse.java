// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCheckResultResponseBody body;

    public static DescribeCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckResultResponse self = new DescribeCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCheckResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCheckResultResponse setBody(DescribeCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCheckResultResponseBody getBody() {
        return this.body;
    }

}
