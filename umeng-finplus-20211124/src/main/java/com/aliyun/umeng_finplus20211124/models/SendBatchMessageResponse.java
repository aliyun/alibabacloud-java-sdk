// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211124.models;

import com.aliyun.tea.*;

public class SendBatchMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendBatchMessageResponseBody body;

    public static SendBatchMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendBatchMessageResponse self = new SendBatchMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendBatchMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendBatchMessageResponse setBody(SendBatchMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendBatchMessageResponseBody getBody() {
        return this.body;
    }

}
