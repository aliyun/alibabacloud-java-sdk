// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateTrainingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTrainingJobResponseBody body;

    public static CreateTrainingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainingJobResponse self = new CreateTrainingJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrainingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrainingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrainingJobResponse setBody(CreateTrainingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrainingJobResponseBody getBody() {
        return this.body;
    }

}
