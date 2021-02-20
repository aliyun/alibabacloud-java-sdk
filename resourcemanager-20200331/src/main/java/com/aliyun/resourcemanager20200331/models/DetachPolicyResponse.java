// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DetachPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachPolicyResponseBody body;

    public static DetachPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyResponse self = new DetachPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DetachPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachPolicyResponse setBody(DetachPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachPolicyResponseBody getBody() {
        return this.body;
    }

}
