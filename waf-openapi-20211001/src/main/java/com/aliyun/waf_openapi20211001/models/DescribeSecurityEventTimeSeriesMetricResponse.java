// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventTimeSeriesMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecurityEventTimeSeriesMetricResponseBody body;

    public static DescribeSecurityEventTimeSeriesMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventTimeSeriesMetricResponse self = new DescribeSecurityEventTimeSeriesMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventTimeSeriesMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityEventTimeSeriesMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityEventTimeSeriesMetricResponse setBody(DescribeSecurityEventTimeSeriesMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityEventTimeSeriesMetricResponseBody getBody() {
        return this.body;
    }

}
