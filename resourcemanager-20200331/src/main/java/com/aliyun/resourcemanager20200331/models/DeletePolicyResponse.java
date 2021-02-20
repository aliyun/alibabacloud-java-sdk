// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeletePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePolicyResponseBody body;

    public static DeletePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyResponse self = new DeletePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolicyResponse setBody(DeletePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolicyResponseBody getBody() {
        return this.body;
    }

}
