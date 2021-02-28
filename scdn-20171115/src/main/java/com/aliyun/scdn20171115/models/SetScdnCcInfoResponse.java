// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class SetScdnCcInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetScdnCcInfoResponseBody body;

    public static SetScdnCcInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SetScdnCcInfoResponse self = new SetScdnCcInfoResponse();
        return TeaModel.build(map, self);
    }

    public SetScdnCcInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetScdnCcInfoResponse setBody(SetScdnCcInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SetScdnCcInfoResponseBody getBody() {
        return this.body;
    }

}
