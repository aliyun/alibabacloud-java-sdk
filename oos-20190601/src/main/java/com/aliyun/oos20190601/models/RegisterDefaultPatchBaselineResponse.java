// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class RegisterDefaultPatchBaselineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterDefaultPatchBaselineResponseBody body;

    public static RegisterDefaultPatchBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterDefaultPatchBaselineResponse self = new RegisterDefaultPatchBaselineResponse();
        return TeaModel.build(map, self);
    }

    public RegisterDefaultPatchBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterDefaultPatchBaselineResponse setBody(RegisterDefaultPatchBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterDefaultPatchBaselineResponseBody getBody() {
        return this.body;
    }

}
