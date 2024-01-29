// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteControlPolicyResponseBody body;

    public static DeleteControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteControlPolicyResponse self = new DeleteControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteControlPolicyResponse setBody(DeleteControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteControlPolicyResponseBody getBody() {
        return this.body;
    }

}
