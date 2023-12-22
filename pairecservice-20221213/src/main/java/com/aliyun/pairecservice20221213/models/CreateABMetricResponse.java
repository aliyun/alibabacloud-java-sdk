// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateABMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateABMetricResponseBody body;

    public static CreateABMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateABMetricResponse self = new CreateABMetricResponse();
        return TeaModel.build(map, self);
    }

    public CreateABMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateABMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateABMetricResponse setBody(CreateABMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateABMetricResponseBody getBody() {
        return this.body;
    }

}
