// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class EnableControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableControlPolicyResponseBody body;

    public static EnableControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableControlPolicyResponse self = new EnableControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public EnableControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableControlPolicyResponse setBody(EnableControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableControlPolicyResponseBody getBody() {
        return this.body;
    }

}
