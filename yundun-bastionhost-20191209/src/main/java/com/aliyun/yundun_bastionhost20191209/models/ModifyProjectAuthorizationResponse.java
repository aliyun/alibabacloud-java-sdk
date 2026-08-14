// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyProjectAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyProjectAuthorizationResponseBody body;

    public static ModifyProjectAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProjectAuthorizationResponse self = new ModifyProjectAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProjectAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProjectAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyProjectAuthorizationResponse setBody(ModifyProjectAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProjectAuthorizationResponseBody getBody() {
        return this.body;
    }

}
