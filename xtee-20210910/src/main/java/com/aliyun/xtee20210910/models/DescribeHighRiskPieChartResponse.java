// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeHighRiskPieChartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHighRiskPieChartResponseBody body;

    public static DescribeHighRiskPieChartResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighRiskPieChartResponse self = new DescribeHighRiskPieChartResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHighRiskPieChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHighRiskPieChartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHighRiskPieChartResponse setBody(DescribeHighRiskPieChartResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHighRiskPieChartResponseBody getBody() {
        return this.body;
    }

}
