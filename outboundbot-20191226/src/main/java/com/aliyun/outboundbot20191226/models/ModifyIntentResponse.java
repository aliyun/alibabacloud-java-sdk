// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyIntentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyIntentResponseBody body;

    public static ModifyIntentResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIntentResponse self = new ModifyIntentResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIntentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIntentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIntentResponse setBody(ModifyIntentResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIntentResponseBody getBody() {
        return this.body;
    }

}
