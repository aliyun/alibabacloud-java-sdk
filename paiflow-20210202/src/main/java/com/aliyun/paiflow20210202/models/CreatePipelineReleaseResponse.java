// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class CreatePipelineReleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePipelineReleaseResponseBody body;

    public static CreatePipelineReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineReleaseResponse self = new CreatePipelineReleaseResponse();
        return TeaModel.build(map, self);
    }

    public CreatePipelineReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePipelineReleaseResponse setBody(CreatePipelineReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePipelineReleaseResponseBody getBody() {
        return this.body;
    }

}
