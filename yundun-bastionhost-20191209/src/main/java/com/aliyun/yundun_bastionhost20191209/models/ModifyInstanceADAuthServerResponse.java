// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceADAuthServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceADAuthServerResponseBody body;

    public static ModifyInstanceADAuthServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceADAuthServerResponse self = new ModifyInstanceADAuthServerResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceADAuthServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceADAuthServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceADAuthServerResponse setBody(ModifyInstanceADAuthServerResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceADAuthServerResponseBody getBody() {
        return this.body;
    }

}
