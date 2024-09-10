// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSoarStrategiesResponseBody body;

    public static DescribeSoarStrategiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarStrategiesResponse self = new DescribeSoarStrategiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSoarStrategiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSoarStrategiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSoarStrategiesResponse setBody(DescribeSoarStrategiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSoarStrategiesResponseBody getBody() {
        return this.body;
    }

}
