// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizeReportConfigDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomizeReportConfigDetailResponseBody body;

    public static DescribeCustomizeReportConfigDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeReportConfigDetailResponse self = new DescribeCustomizeReportConfigDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeReportConfigDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomizeReportConfigDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomizeReportConfigDetailResponse setBody(DescribeCustomizeReportConfigDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomizeReportConfigDetailResponseBody getBody() {
        return this.body;
    }

}
