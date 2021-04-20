// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAiotDevicesResponseBody body;

    public static AddAiotDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAiotDevicesResponse self = new AddAiotDevicesResponse();
        return TeaModel.build(map, self);
    }

    public AddAiotDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAiotDevicesResponse setBody(AddAiotDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAiotDevicesResponseBody getBody() {
        return this.body;
    }

}
