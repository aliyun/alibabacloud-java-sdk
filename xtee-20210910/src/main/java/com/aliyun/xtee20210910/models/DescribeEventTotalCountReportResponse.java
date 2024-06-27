// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventTotalCountReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventTotalCountReportResponseBody body;

    public static DescribeEventTotalCountReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventTotalCountReportResponse self = new DescribeEventTotalCountReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventTotalCountReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventTotalCountReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventTotalCountReportResponse setBody(DescribeEventTotalCountReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventTotalCountReportResponseBody getBody() {
        return this.body;
    }

}
