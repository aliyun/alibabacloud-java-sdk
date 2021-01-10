// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SendMqSofamqMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendMqSofamqMessageResponseBody body;

    public static SendMqSofamqMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendMqSofamqMessageResponse self = new SendMqSofamqMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendMqSofamqMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendMqSofamqMessageResponse setBody(SendMqSofamqMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendMqSofamqMessageResponseBody getBody() {
        return this.body;
    }

}
