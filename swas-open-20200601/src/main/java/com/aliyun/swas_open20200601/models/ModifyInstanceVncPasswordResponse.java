// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyInstanceVncPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceVncPasswordResponseBody body;

    public static ModifyInstanceVncPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVncPasswordResponse self = new ModifyInstanceVncPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVncPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceVncPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceVncPasswordResponse setBody(ModifyInstanceVncPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceVncPasswordResponseBody getBody() {
        return this.body;
    }

}
