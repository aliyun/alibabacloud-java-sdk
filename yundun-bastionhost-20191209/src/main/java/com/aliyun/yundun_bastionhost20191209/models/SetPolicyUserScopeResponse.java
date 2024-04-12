// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyUserScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetPolicyUserScopeResponseBody body;

    public static SetPolicyUserScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyUserScopeResponse self = new SetPolicyUserScopeResponse();
        return TeaModel.build(map, self);
    }

    public SetPolicyUserScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPolicyUserScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetPolicyUserScopeResponse setBody(SetPolicyUserScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPolicyUserScopeResponseBody getBody() {
        return this.body;
    }

}
