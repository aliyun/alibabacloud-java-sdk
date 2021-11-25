// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateWatchPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWatchPolicyResponseBody body;

    public static CreateWatchPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWatchPolicyResponse self = new CreateWatchPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateWatchPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWatchPolicyResponse setBody(CreateWatchPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWatchPolicyResponseBody getBody() {
        return this.body;
    }

}
