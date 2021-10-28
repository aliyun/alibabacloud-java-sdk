// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class SwitchToSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchToSubscriptionResponseBody body;

    public static SwitchToSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchToSubscriptionResponse self = new SwitchToSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public SwitchToSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchToSubscriptionResponse setBody(SwitchToSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchToSubscriptionResponseBody getBody() {
        return this.body;
    }

}
