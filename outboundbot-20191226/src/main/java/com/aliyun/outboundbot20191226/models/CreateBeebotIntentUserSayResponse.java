// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateBeebotIntentUserSayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBeebotIntentUserSayResponseBody body;

    public static CreateBeebotIntentUserSayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBeebotIntentUserSayResponse self = new CreateBeebotIntentUserSayResponse();
        return TeaModel.build(map, self);
    }

    public CreateBeebotIntentUserSayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBeebotIntentUserSayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBeebotIntentUserSayResponse setBody(CreateBeebotIntentUserSayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBeebotIntentUserSayResponseBody getBody() {
        return this.body;
    }

}
