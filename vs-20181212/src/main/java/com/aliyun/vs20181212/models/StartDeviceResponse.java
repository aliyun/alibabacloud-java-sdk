// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartDeviceResponseBody body;

    public static StartDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDeviceResponse self = new StartDeviceResponse();
        return TeaModel.build(map, self);
    }

    public StartDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDeviceResponse setBody(StartDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDeviceResponseBody getBody() {
        return this.body;
    }

}
