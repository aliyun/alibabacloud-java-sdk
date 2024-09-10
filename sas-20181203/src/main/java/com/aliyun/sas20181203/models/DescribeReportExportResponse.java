// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeReportExportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeReportExportResponseBody body;

    public static DescribeReportExportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportExportResponse self = new DescribeReportExportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReportExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReportExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReportExportResponse setBody(DescribeReportExportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReportExportResponseBody getBody() {
        return this.body;
    }

}
