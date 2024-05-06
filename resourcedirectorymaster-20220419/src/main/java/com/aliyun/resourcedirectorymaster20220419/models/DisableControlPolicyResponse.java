// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DisableControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableControlPolicyResponseBody body;

    public static DisableControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableControlPolicyResponse self = new DisableControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DisableControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableControlPolicyResponse setBody(DisableControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableControlPolicyResponseBody getBody() {
        return this.body;
    }

}
