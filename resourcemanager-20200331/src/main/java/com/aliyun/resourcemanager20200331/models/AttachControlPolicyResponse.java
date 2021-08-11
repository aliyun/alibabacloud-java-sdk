// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AttachControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachControlPolicyResponseBody body;

    public static AttachControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachControlPolicyResponse self = new AttachControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public AttachControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachControlPolicyResponse setBody(AttachControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachControlPolicyResponseBody getBody() {
        return this.body;
    }

}
