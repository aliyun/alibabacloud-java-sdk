// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyVoiceCloneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVoiceCloneResponseBody body;

    public static ModifyVoiceCloneResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVoiceCloneResponse self = new ModifyVoiceCloneResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVoiceCloneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVoiceCloneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVoiceCloneResponse setBody(ModifyVoiceCloneResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVoiceCloneResponseBody getBody() {
        return this.body;
    }

}
