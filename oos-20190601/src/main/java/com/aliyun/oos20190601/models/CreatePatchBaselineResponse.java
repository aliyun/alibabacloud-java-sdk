// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreatePatchBaselineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePatchBaselineResponseBody body;

    public static CreatePatchBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePatchBaselineResponse self = new CreatePatchBaselineResponse();
        return TeaModel.build(map, self);
    }

    public CreatePatchBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePatchBaselineResponse setBody(CreatePatchBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePatchBaselineResponseBody getBody() {
        return this.body;
    }

}
