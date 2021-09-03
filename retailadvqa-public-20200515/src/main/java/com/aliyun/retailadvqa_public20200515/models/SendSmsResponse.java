// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SendSmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendSmsResponseBody body;

    public static SendSmsResponse build(java.util.Map<String, ?> map) throws Exception {
        SendSmsResponse self = new SendSmsResponse();
        return TeaModel.build(map, self);
    }

    public SendSmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendSmsResponse setBody(SendSmsResponseBody body) {
        this.body = body;
        return this;
    }
    public SendSmsResponseBody getBody() {
        return this.body;
    }

}
