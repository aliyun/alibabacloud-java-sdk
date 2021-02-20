// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DisableMPURuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableMPURuleResponseBody body;

    public static DisableMPURuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableMPURuleResponse self = new DisableMPURuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableMPURuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableMPURuleResponse setBody(DisableMPURuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableMPURuleResponseBody getBody() {
        return this.body;
    }

}
