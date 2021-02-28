// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class SetScdnBotInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetScdnBotInfoResponseBody body;

    public static SetScdnBotInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SetScdnBotInfoResponse self = new SetScdnBotInfoResponse();
        return TeaModel.build(map, self);
    }

    public SetScdnBotInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetScdnBotInfoResponse setBody(SetScdnBotInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SetScdnBotInfoResponseBody getBody() {
        return this.body;
    }

}
