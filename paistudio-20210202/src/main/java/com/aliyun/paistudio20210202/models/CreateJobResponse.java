// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CreateJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateJobResponseBody body;

    public static CreateJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateJobResponse self = new CreateJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateJobResponse setBody(CreateJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateJobResponseBody getBody() {
        return this.body;
    }

}
