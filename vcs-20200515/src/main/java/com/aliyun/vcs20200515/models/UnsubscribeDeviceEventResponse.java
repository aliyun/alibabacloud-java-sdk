// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UnsubscribeDeviceEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnsubscribeDeviceEventResponseBody body;

    public static UnsubscribeDeviceEventResponse build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeDeviceEventResponse self = new UnsubscribeDeviceEventResponse();
        return TeaModel.build(map, self);
    }

    public UnsubscribeDeviceEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnsubscribeDeviceEventResponse setBody(UnsubscribeDeviceEventResponseBody body) {
        this.body = body;
        return this;
    }
    public UnsubscribeDeviceEventResponseBody getBody() {
        return this.body;
    }

}
