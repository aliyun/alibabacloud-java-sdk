// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateControlPolicyResponseBody body;

    public static CreateControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateControlPolicyResponse self = new CreateControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateControlPolicyResponse setBody(CreateControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateControlPolicyResponseBody getBody() {
        return this.body;
    }

}
