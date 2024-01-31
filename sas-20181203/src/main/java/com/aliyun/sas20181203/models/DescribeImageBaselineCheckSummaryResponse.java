// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineCheckSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageBaselineCheckSummaryResponseBody body;

    public static DescribeImageBaselineCheckSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBaselineCheckSummaryResponse self = new DescribeImageBaselineCheckSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageBaselineCheckSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageBaselineCheckSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageBaselineCheckSummaryResponse setBody(DescribeImageBaselineCheckSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageBaselineCheckSummaryResponseBody getBody() {
        return this.body;
    }

}
