// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateControlPolicyResponseBody body;

    public static UpdateControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateControlPolicyResponse self = new UpdateControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateControlPolicyResponse setBody(UpdateControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateControlPolicyResponseBody getBody() {
        return this.body;
    }

}
