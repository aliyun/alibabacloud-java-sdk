// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasti20200512.models;

import com.aliyun.tea.*;

public class DescribeIpReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIpReportResponseBody body;

    public static DescribeIpReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpReportResponse self = new DescribeIpReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpReportResponse setBody(DescribeIpReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpReportResponseBody getBody() {
        return this.body;
    }

}
