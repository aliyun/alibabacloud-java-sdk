// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyGreetingConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyGreetingConfigResponseBody body;

    public static ModifyGreetingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGreetingConfigResponse self = new ModifyGreetingConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGreetingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGreetingConfigResponse setBody(ModifyGreetingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGreetingConfigResponseBody getBody() {
        return this.body;
    }

}
