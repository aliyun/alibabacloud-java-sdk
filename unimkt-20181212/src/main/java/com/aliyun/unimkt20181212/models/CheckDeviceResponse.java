// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CheckDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckDeviceResponseBody body;

    public static CheckDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDeviceResponse self = new CheckDeviceResponse();
        return TeaModel.build(map, self);
    }

    public CheckDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDeviceResponse setBody(CheckDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDeviceResponseBody getBody() {
        return this.body;
    }

}
