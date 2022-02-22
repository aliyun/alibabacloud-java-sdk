// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class StartBillingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartBillingResponseBody body;

    public static StartBillingResponse build(java.util.Map<String, ?> map) throws Exception {
        StartBillingResponse self = new StartBillingResponse();
        return TeaModel.build(map, self);
    }

    public StartBillingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartBillingResponse setBody(StartBillingResponseBody body) {
        this.body = body;
        return this;
    }
    public StartBillingResponseBody getBody() {
        return this.body;
    }

}
