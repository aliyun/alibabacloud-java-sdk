// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionReportSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNisInspectionReportSummaryResponseBody body;

    public static DescribeNisInspectionReportSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionReportSummaryResponse self = new DescribeNisInspectionReportSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionReportSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNisInspectionReportSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNisInspectionReportSummaryResponse setBody(DescribeNisInspectionReportSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNisInspectionReportSummaryResponseBody getBody() {
        return this.body;
    }

}
