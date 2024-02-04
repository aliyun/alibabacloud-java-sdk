// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTenantMetricsResponseBody body;

    public static DescribeTenantMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantMetricsResponse self = new DescribeTenantMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTenantMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTenantMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTenantMetricsResponse setBody(DescribeTenantMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantMetricsResponseBody getBody() {
        return this.body;
    }

}
