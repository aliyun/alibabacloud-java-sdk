// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceTwoFactorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceTwoFactorResponseBody body;

    public static ModifyInstanceTwoFactorResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTwoFactorResponse self = new ModifyInstanceTwoFactorResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTwoFactorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceTwoFactorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceTwoFactorResponse setBody(ModifyInstanceTwoFactorResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceTwoFactorResponseBody getBody() {
        return this.body;
    }

}
