// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopDeviceResponseBody body;

    public static StopDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDeviceResponse self = new StopDeviceResponse();
        return TeaModel.build(map, self);
    }

    public StopDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDeviceResponse setBody(StopDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDeviceResponseBody getBody() {
        return this.body;
    }

}
