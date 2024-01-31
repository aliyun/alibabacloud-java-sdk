// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageBaselineCheckResultResponseBody body;

    public static DescribeImageBaselineCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBaselineCheckResultResponse self = new DescribeImageBaselineCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageBaselineCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageBaselineCheckResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageBaselineCheckResultResponse setBody(DescribeImageBaselineCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageBaselineCheckResultResponseBody getBody() {
        return this.body;
    }

}
