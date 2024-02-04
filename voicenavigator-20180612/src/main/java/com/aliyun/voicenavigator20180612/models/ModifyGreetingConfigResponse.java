// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyGreetingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyGreetingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGreetingConfigResponse setBody(ModifyGreetingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGreetingConfigResponseBody getBody() {
        return this.body;
    }

}
