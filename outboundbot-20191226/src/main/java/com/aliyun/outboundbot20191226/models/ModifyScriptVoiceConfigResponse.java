// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyScriptVoiceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyScriptVoiceConfigResponseBody body;

    public static ModifyScriptVoiceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyScriptVoiceConfigResponse self = new ModifyScriptVoiceConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyScriptVoiceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScriptVoiceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyScriptVoiceConfigResponse setBody(ModifyScriptVoiceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScriptVoiceConfigResponseBody getBody() {
        return this.body;
    }

}
