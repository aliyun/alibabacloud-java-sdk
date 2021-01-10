// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CallbackMsSpiOmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CallbackMsSpiOmsResponseBody body;

    public static CallbackMsSpiOmsResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackMsSpiOmsResponse self = new CallbackMsSpiOmsResponse();
        return TeaModel.build(map, self);
    }

    public CallbackMsSpiOmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CallbackMsSpiOmsResponse setBody(CallbackMsSpiOmsResponseBody body) {
        this.body = body;
        return this;
    }
    public CallbackMsSpiOmsResponseBody getBody() {
        return this.body;
    }

}
