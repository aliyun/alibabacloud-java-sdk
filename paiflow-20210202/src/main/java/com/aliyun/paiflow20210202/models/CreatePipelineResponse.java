// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class CreatePipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePipelineResponseBody body;

    public static CreatePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineResponse self = new CreatePipelineResponse();
        return TeaModel.build(map, self);
    }

    public CreatePipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePipelineResponse setBody(CreatePipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePipelineResponseBody getBody() {
        return this.body;
    }

}
