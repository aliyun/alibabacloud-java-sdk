// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyEipForwardModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEipForwardModeResponseBody body;

    public static ModifyEipForwardModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEipForwardModeResponse self = new ModifyEipForwardModeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEipForwardModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEipForwardModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEipForwardModeResponse setBody(ModifyEipForwardModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEipForwardModeResponseBody getBody() {
        return this.body;
    }

}
