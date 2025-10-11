// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeUpgradeReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUpgradeReportResponseBody body;

    public static DescribeUpgradeReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpgradeReportResponse self = new DescribeUpgradeReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpgradeReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUpgradeReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUpgradeReportResponse setBody(DescribeUpgradeReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUpgradeReportResponseBody getBody() {
        return this.body;
    }

}
