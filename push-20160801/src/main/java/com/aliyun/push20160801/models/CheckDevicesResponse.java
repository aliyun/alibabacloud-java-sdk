// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CheckDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckDevicesResponseBody body;

    public static CheckDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDevicesResponse self = new CheckDevicesResponse();
        return TeaModel.build(map, self);
    }

    public CheckDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDevicesResponse setBody(CheckDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDevicesResponseBody getBody() {
        return this.body;
    }

}
