// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageBaselineStrategyResponseBody body;

    public static DescribeImageBaselineStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBaselineStrategyResponse self = new DescribeImageBaselineStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageBaselineStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageBaselineStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageBaselineStrategyResponse setBody(DescribeImageBaselineStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageBaselineStrategyResponseBody getBody() {
        return this.body;
    }

}
