// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInspectionScheduleReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInspectionScheduleReportsResponseBody body;

    public static DescribeInspectionScheduleReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionScheduleReportsResponse self = new DescribeInspectionScheduleReportsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionScheduleReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInspectionScheduleReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInspectionScheduleReportsResponse setBody(DescribeInspectionScheduleReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInspectionScheduleReportsResponseBody getBody() {
        return this.body;
    }

}
