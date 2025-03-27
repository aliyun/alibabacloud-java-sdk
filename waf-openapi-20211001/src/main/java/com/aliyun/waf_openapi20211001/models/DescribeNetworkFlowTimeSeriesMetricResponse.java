// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeNetworkFlowTimeSeriesMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNetworkFlowTimeSeriesMetricResponseBody body;

    public static DescribeNetworkFlowTimeSeriesMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkFlowTimeSeriesMetricResponse self = new DescribeNetworkFlowTimeSeriesMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkFlowTimeSeriesMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkFlowTimeSeriesMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkFlowTimeSeriesMetricResponse setBody(DescribeNetworkFlowTimeSeriesMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkFlowTimeSeriesMetricResponseBody getBody() {
        return this.body;
    }

}
