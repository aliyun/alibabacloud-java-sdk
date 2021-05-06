// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class SetAppCallbackTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetAppCallbackTypeResponseBody body;

    public static SetAppCallbackTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAppCallbackTypeResponse self = new SetAppCallbackTypeResponse();
        return TeaModel.build(map, self);
    }

    public SetAppCallbackTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAppCallbackTypeResponse setBody(SetAppCallbackTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAppCallbackTypeResponseBody getBody() {
        return this.body;
    }

}
