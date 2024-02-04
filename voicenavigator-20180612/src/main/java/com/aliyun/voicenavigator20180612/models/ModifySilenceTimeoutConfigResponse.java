// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifySilenceTimeoutConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySilenceTimeoutConfigResponseBody body;

    public static ModifySilenceTimeoutConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySilenceTimeoutConfigResponse self = new ModifySilenceTimeoutConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifySilenceTimeoutConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySilenceTimeoutConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySilenceTimeoutConfigResponse setBody(ModifySilenceTimeoutConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySilenceTimeoutConfigResponseBody getBody() {
        return this.body;
    }

}
