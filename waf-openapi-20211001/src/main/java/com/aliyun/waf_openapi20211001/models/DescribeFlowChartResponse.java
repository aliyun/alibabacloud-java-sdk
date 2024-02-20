// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFlowChartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFlowChartResponseBody body;

    public static DescribeFlowChartResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowChartResponse self = new DescribeFlowChartResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowChartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFlowChartResponse setBody(DescribeFlowChartResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowChartResponseBody getBody() {
        return this.body;
    }

}
