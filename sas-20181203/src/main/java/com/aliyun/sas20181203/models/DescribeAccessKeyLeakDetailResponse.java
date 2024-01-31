// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAccessKeyLeakDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccessKeyLeakDetailResponseBody body;

    public static DescribeAccessKeyLeakDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessKeyLeakDetailResponse self = new DescribeAccessKeyLeakDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessKeyLeakDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessKeyLeakDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccessKeyLeakDetailResponse setBody(DescribeAccessKeyLeakDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessKeyLeakDetailResponseBody getBody() {
        return this.body;
    }

}
