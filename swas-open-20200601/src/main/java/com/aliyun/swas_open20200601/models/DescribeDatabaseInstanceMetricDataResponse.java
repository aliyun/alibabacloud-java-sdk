// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstanceMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDatabaseInstanceMetricDataResponseBody body;

    public static DescribeDatabaseInstanceMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabaseInstanceMetricDataResponse self = new DescribeDatabaseInstanceMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDatabaseInstanceMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDatabaseInstanceMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDatabaseInstanceMetricDataResponse setBody(DescribeDatabaseInstanceMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDatabaseInstanceMetricDataResponseBody getBody() {
        return this.body;
    }

}
