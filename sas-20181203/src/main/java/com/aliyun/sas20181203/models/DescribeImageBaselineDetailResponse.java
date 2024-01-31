// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageBaselineDetailResponseBody body;

    public static DescribeImageBaselineDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBaselineDetailResponse self = new DescribeImageBaselineDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageBaselineDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageBaselineDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageBaselineDetailResponse setBody(DescribeImageBaselineDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageBaselineDetailResponseBody getBody() {
        return this.body;
    }

}
