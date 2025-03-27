// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeNetworkFlowTopNMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNetworkFlowTopNMetricResponseBody body;

    public static DescribeNetworkFlowTopNMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkFlowTopNMetricResponse self = new DescribeNetworkFlowTopNMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkFlowTopNMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkFlowTopNMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkFlowTopNMetricResponse setBody(DescribeNetworkFlowTopNMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkFlowTopNMetricResponseBody getBody() {
        return this.body;
    }

}
