// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRiskLineChartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskLineChartResponseBody body;

    public static DescribeRiskLineChartResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskLineChartResponse self = new DescribeRiskLineChartResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskLineChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskLineChartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskLineChartResponse setBody(DescribeRiskLineChartResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskLineChartResponseBody getBody() {
        return this.body;
    }

}
