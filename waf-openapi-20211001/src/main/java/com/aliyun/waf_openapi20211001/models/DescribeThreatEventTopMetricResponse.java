// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeThreatEventTopMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeThreatEventTopMetricResponseBody body;

    public static DescribeThreatEventTopMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeThreatEventTopMetricResponse self = new DescribeThreatEventTopMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeThreatEventTopMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeThreatEventTopMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeThreatEventTopMetricResponse setBody(DescribeThreatEventTopMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeThreatEventTopMetricResponseBody getBody() {
        return this.body;
    }

}
