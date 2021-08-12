// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SetStreamModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetStreamModeResponseBody body;

    public static SetStreamModeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetStreamModeResponse self = new SetStreamModeResponse();
        return TeaModel.build(map, self);
    }

    public SetStreamModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetStreamModeResponse setBody(SetStreamModeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetStreamModeResponseBody getBody() {
        return this.body;
    }

}
