// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SendDigitalSmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendDigitalSmsResponseBody body;

    public static SendDigitalSmsResponse build(java.util.Map<String, ?> map) throws Exception {
        SendDigitalSmsResponse self = new SendDigitalSmsResponse();
        return TeaModel.build(map, self);
    }

    public SendDigitalSmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendDigitalSmsResponse setBody(SendDigitalSmsResponseBody body) {
        this.body = body;
        return this;
    }
    public SendDigitalSmsResponseBody getBody() {
        return this.body;
    }

}
