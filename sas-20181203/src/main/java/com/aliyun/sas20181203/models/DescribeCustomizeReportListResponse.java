// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizeReportListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomizeReportListResponseBody body;

    public static DescribeCustomizeReportListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeReportListResponse self = new DescribeCustomizeReportListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeReportListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomizeReportListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomizeReportListResponse setBody(DescribeCustomizeReportListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomizeReportListResponseBody getBody() {
        return this.body;
    }

}
