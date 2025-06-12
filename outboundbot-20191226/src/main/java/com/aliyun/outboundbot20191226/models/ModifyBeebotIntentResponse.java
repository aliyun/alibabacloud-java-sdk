// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyBeebotIntentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBeebotIntentResponseBody body;

    public static ModifyBeebotIntentResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBeebotIntentResponse self = new ModifyBeebotIntentResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBeebotIntentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBeebotIntentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBeebotIntentResponse setBody(ModifyBeebotIntentResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBeebotIntentResponseBody getBody() {
        return this.body;
    }

}
