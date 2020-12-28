// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageSendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsMessageSendResponseBody body;

    public static OnsMessageSendResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageSendResponse self = new OnsMessageSendResponse();
        return TeaModel.build(map, self);
    }

    public OnsMessageSendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsMessageSendResponse setBody(OnsMessageSendResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsMessageSendResponseBody getBody() {
        return this.body;
    }

}
