// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawCronJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePolarClawCronJobResponseBody body;

    public static CreatePolarClawCronJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarClawCronJobResponse self = new CreatePolarClawCronJobResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolarClawCronJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePolarClawCronJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePolarClawCronJobResponse setBody(CreatePolarClawCronJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePolarClawCronJobResponseBody getBody() {
        return this.body;
    }

}
