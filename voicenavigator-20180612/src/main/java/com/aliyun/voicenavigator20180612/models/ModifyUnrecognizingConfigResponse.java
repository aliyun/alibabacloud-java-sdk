// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyUnrecognizingConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyUnrecognizingConfigResponseBody body;

    public static ModifyUnrecognizingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUnrecognizingConfigResponse self = new ModifyUnrecognizingConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUnrecognizingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUnrecognizingConfigResponse setBody(ModifyUnrecognizingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUnrecognizingConfigResponseBody getBody() {
        return this.body;
    }

}
