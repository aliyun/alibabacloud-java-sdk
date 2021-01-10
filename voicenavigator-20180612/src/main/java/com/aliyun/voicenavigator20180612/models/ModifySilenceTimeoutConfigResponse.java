// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifySilenceTimeoutConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifySilenceTimeoutConfigResponse setBody(ModifySilenceTimeoutConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySilenceTimeoutConfigResponseBody getBody() {
        return this.body;
    }

}
