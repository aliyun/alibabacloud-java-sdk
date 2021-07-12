// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AddDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDeviceResponseBody body;

    public static AddDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceResponse self = new AddDeviceResponse();
        return TeaModel.build(map, self);
    }

    public AddDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDeviceResponse setBody(AddDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDeviceResponseBody getBody() {
        return this.body;
    }

}
