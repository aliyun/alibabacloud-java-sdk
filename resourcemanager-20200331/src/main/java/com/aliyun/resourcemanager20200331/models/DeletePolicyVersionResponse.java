// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeletePolicyVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePolicyVersionResponseBody body;

    public static DeletePolicyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyVersionResponse self = new DeletePolicyVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolicyVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolicyVersionResponse setBody(DeletePolicyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolicyVersionResponseBody getBody() {
        return this.body;
    }

}
