// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetPolicyUserScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPolicyUserScopeResponseBody body;

    public static GetPolicyUserScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyUserScopeResponse self = new GetPolicyUserScopeResponse();
        return TeaModel.build(map, self);
    }

    public GetPolicyUserScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPolicyUserScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPolicyUserScopeResponse setBody(GetPolicyUserScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolicyUserScopeResponseBody getBody() {
        return this.body;
    }

}
