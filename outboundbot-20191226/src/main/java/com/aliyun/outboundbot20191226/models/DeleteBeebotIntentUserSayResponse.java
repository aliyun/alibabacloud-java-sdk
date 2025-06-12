// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteBeebotIntentUserSayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBeebotIntentUserSayResponseBody body;

    public static DeleteBeebotIntentUserSayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBeebotIntentUserSayResponse self = new DeleteBeebotIntentUserSayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBeebotIntentUserSayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBeebotIntentUserSayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBeebotIntentUserSayResponse setBody(DeleteBeebotIntentUserSayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBeebotIntentUserSayResponseBody getBody() {
        return this.body;
    }

}
