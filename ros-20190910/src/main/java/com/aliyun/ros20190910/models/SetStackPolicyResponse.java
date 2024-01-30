// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetStackPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetStackPolicyResponseBody body;

    public static SetStackPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetStackPolicyResponse self = new SetStackPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SetStackPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetStackPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetStackPolicyResponse setBody(SetStackPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetStackPolicyResponseBody getBody() {
        return this.body;
    }

}
