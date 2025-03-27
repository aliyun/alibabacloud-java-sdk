// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventTopNMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecurityEventTopNMetricResponseBody body;

    public static DescribeSecurityEventTopNMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventTopNMetricResponse self = new DescribeSecurityEventTopNMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventTopNMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityEventTopNMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityEventTopNMetricResponse setBody(DescribeSecurityEventTopNMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityEventTopNMetricResponseBody getBody() {
        return this.body;
    }

}
