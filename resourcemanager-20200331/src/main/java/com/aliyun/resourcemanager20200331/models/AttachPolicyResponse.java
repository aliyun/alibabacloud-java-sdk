// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AttachPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachPolicyResponseBody body;

    public static AttachPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyResponse self = new AttachPolicyResponse();
        return TeaModel.build(map, self);
    }

    public AttachPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachPolicyResponse setBody(AttachPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachPolicyResponseBody getBody() {
        return this.body;
    }

}
