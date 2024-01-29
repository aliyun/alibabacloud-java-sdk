// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DetachControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DetachControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachControlPolicyResponse setBody(DetachControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachControlPolicyResponseBody getBody() {
        return this.body;
    }

}
