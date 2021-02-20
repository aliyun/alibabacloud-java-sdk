// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ReceiveNotifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReceiveNotifyResponseBody body;

    public static ReceiveNotifyResponse build(java.util.Map<String, ?> map) throws Exception {
        ReceiveNotifyResponse self = new ReceiveNotifyResponse();
        return TeaModel.build(map, self);
    }

    public ReceiveNotifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReceiveNotifyResponse setBody(ReceiveNotifyResponseBody body) {
        this.body = body;
        return this;
    }
    public ReceiveNotifyResponseBody getBody() {
        return this.body;
    }

}
