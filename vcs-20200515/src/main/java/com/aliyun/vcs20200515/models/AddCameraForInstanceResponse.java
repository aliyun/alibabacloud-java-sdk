// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddCameraForInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCameraForInstanceResponseBody body;

    public static AddCameraForInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCameraForInstanceResponse self = new AddCameraForInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AddCameraForInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCameraForInstanceResponse setBody(AddCameraForInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCameraForInstanceResponseBody getBody() {
        return this.body;
    }

}
