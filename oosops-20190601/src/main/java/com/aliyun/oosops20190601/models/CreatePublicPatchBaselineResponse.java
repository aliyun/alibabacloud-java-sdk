// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class CreatePublicPatchBaselineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePublicPatchBaselineResponseBody body;

    public static CreatePublicPatchBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePublicPatchBaselineResponse self = new CreatePublicPatchBaselineResponse();
        return TeaModel.build(map, self);
    }

    public CreatePublicPatchBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePublicPatchBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePublicPatchBaselineResponse setBody(CreatePublicPatchBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePublicPatchBaselineResponseBody getBody() {
        return this.body;
    }

}
