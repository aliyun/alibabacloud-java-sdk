// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class PayOrderCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PayOrderCallbackResponseBody body;

    public static PayOrderCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        PayOrderCallbackResponse self = new PayOrderCallbackResponse();
        return TeaModel.build(map, self);
    }

    public PayOrderCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PayOrderCallbackResponse setBody(PayOrderCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public PayOrderCallbackResponseBody getBody() {
        return this.body;
    }

}
