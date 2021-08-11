// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DetachControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachControlPolicyResponseBody body;

    public static DetachControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachControlPolicyResponse self = new DetachControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DetachControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachControlPolicyResponse setBody(DetachControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachControlPolicyResponseBody getBody() {
        return this.body;
    }

}
