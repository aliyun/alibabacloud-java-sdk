// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sms_intl20180501.models;

import com.aliyun.tea.*;

public class SendMessageToGlobeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendMessageToGlobeResponseBody body;

    public static SendMessageToGlobeResponse build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGlobeResponse self = new SendMessageToGlobeResponse();
        return TeaModel.build(map, self);
    }

    public SendMessageToGlobeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendMessageToGlobeResponse setBody(SendMessageToGlobeResponseBody body) {
        this.body = body;
        return this;
    }
    public SendMessageToGlobeResponseBody getBody() {
        return this.body;
    }

}
