// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateControlPolicyResponse setBody(CreateControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateControlPolicyResponseBody getBody() {
        return this.body;
    }

}
