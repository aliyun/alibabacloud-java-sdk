// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAvgExecuteCostReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAvgExecuteCostReportResponseBody body;

    public static DescribeAvgExecuteCostReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvgExecuteCostReportResponse self = new DescribeAvgExecuteCostReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvgExecuteCostReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvgExecuteCostReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvgExecuteCostReportResponse setBody(DescribeAvgExecuteCostReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvgExecuteCostReportResponseBody getBody() {
        return this.body;
    }

}
