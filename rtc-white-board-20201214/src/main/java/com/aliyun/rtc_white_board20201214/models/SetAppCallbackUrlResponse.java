// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class SetAppCallbackUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetAppCallbackUrlResponseBody body;

    public static SetAppCallbackUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAppCallbackUrlResponse self = new SetAppCallbackUrlResponse();
        return TeaModel.build(map, self);
    }

    public SetAppCallbackUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAppCallbackUrlResponse setBody(SetAppCallbackUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAppCallbackUrlResponseBody getBody() {
        return this.body;
    }

}
