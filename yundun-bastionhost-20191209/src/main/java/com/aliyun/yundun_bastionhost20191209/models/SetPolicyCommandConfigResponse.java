// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyCommandConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetPolicyCommandConfigResponseBody body;

    public static SetPolicyCommandConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyCommandConfigResponse self = new SetPolicyCommandConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetPolicyCommandConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPolicyCommandConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetPolicyCommandConfigResponse setBody(SetPolicyCommandConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPolicyCommandConfigResponseBody getBody() {
        return this.body;
    }

}
