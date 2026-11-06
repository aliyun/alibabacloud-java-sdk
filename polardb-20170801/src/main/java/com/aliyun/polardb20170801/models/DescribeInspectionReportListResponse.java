// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeInspectionReportListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInspectionReportListResponseBody body;

    public static DescribeInspectionReportListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionReportListResponse self = new DescribeInspectionReportListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionReportListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInspectionReportListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInspectionReportListResponse setBody(DescribeInspectionReportListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInspectionReportListResponseBody getBody() {
        return this.body;
    }

}
