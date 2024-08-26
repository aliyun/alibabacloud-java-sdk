// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionReportStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNisInspectionReportStatusResponseBody body;

    public static DescribeNisInspectionReportStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionReportStatusResponse self = new DescribeNisInspectionReportStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionReportStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNisInspectionReportStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNisInspectionReportStatusResponse setBody(DescribeNisInspectionReportStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNisInspectionReportStatusResponseBody getBody() {
        return this.body;
    }

}
