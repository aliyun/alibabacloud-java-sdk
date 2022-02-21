// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AddRegisteredDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddRegisteredDeviceResponseBody body;

    public static AddRegisteredDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRegisteredDeviceResponse self = new AddRegisteredDeviceResponse();
        return TeaModel.build(map, self);
    }

    public AddRegisteredDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRegisteredDeviceResponse setBody(AddRegisteredDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRegisteredDeviceResponseBody getBody() {
        return this.body;
    }

}
