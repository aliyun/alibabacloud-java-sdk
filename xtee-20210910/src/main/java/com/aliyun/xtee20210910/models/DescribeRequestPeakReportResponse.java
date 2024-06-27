// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRequestPeakReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRequestPeakReportResponseBody body;

    public static DescribeRequestPeakReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestPeakReportResponse self = new DescribeRequestPeakReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRequestPeakReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRequestPeakReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRequestPeakReportResponse setBody(DescribeRequestPeakReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRequestPeakReportResponseBody getBody() {
        return this.body;
    }

}
