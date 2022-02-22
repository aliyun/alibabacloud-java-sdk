// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class StopBillingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopBillingResponseBody body;

    public static StopBillingResponse build(java.util.Map<String, ?> map) throws Exception {
        StopBillingResponse self = new StopBillingResponse();
        return TeaModel.build(map, self);
    }

    public StopBillingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopBillingResponse setBody(StopBillingResponseBody body) {
        this.body = body;
        return this;
    }
    public StopBillingResponseBody getBody() {
        return this.body;
    }

}
