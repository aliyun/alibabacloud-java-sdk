// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class SetAppStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetAppStatusResponseBody body;

    public static SetAppStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAppStatusResponse self = new SetAppStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetAppStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAppStatusResponse setBody(SetAppStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAppStatusResponseBody getBody() {
        return this.body;
    }

}
