// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class EnableMPURuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableMPURuleResponseBody body;

    public static EnableMPURuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMPURuleResponse self = new EnableMPURuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableMPURuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMPURuleResponse setBody(EnableMPURuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMPURuleResponseBody getBody() {
        return this.body;
    }

}
