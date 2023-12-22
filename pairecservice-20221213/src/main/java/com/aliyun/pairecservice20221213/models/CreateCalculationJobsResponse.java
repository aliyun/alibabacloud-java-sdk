// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateCalculationJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCalculationJobsResponseBody body;

    public static CreateCalculationJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCalculationJobsResponse self = new CreateCalculationJobsResponse();
        return TeaModel.build(map, self);
    }

    public CreateCalculationJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCalculationJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCalculationJobsResponse setBody(CreateCalculationJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCalculationJobsResponseBody getBody() {
        return this.body;
    }

}
