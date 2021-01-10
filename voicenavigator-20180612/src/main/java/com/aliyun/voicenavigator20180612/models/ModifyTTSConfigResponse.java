// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyTTSConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyTTSConfigResponse setBody(ModifyTTSConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTTSConfigResponseBody getBody() {
        return this.body;
    }

}
