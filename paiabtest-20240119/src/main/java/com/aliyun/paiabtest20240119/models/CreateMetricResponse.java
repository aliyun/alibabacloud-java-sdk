// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMetricResponseBody body;

    public static CreateMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricResponse self = new CreateMetricResponse();
        return TeaModel.build(map, self);
    }

    public CreateMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMetricResponse setBody(CreateMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMetricResponseBody getBody() {
        return this.body;
    }

}
