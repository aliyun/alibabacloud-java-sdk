// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyTTSConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTTSConfigResponseBody body;

    public static ModifyTTSConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTTSConfigResponse self = new ModifyTTSConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTTSConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTTSConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTTSConfigResponse setBody(ModifyTTSConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTTSConfigResponseBody getBody() {
        return this.body;
    }

}
