// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreatePolicyVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePolicyVersionResponseBody body;

    public static CreatePolicyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyVersionResponse self = new CreatePolicyVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolicyVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePolicyVersionResponse setBody(CreatePolicyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePolicyVersionResponseBody getBody() {
        return this.body;
    }

}
