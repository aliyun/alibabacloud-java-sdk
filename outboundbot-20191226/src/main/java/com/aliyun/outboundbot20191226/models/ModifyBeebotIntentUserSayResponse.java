// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyBeebotIntentUserSayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBeebotIntentUserSayResponseBody body;

    public static ModifyBeebotIntentUserSayResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBeebotIntentUserSayResponse self = new ModifyBeebotIntentUserSayResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBeebotIntentUserSayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBeebotIntentUserSayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBeebotIntentUserSayResponse setBody(ModifyBeebotIntentUserSayResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBeebotIntentUserSayResponseBody getBody() {
        return this.body;
    }

}
