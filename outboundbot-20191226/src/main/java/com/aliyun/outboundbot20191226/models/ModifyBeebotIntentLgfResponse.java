// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyBeebotIntentLgfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBeebotIntentLgfResponseBody body;

    public static ModifyBeebotIntentLgfResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBeebotIntentLgfResponse self = new ModifyBeebotIntentLgfResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBeebotIntentLgfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBeebotIntentLgfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBeebotIntentLgfResponse setBody(ModifyBeebotIntentLgfResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBeebotIntentLgfResponseBody getBody() {
        return this.body;
    }

}
