// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInspectionTaskReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInspectionTaskReportResponseBody body;

    public static DescribeInspectionTaskReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionTaskReportResponse self = new DescribeInspectionTaskReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionTaskReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInspectionTaskReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInspectionTaskReportResponse setBody(DescribeInspectionTaskReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInspectionTaskReportResponseBody getBody() {
        return this.body;
    }

}
