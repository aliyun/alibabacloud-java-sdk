// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SetProxyPatternResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetProxyPatternResponseBody body;

    public static SetProxyPatternResponse build(java.util.Map<String, ?> map) throws Exception {
        SetProxyPatternResponse self = new SetProxyPatternResponse();
        return TeaModel.build(map, self);
    }

    public SetProxyPatternResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetProxyPatternResponse setBody(SetProxyPatternResponseBody body) {
        this.body = body;
        return this;
    }
    public SetProxyPatternResponseBody getBody() {
        return this.body;
    }

}
