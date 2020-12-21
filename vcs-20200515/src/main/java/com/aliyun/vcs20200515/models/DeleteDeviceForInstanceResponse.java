// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteDeviceForInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDeviceForInstanceResponseBody body;

    public static DeleteDeviceForInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceForInstanceResponse self = new DeleteDeviceForInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceForInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceForInstanceResponse setBody(DeleteDeviceForInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceForInstanceResponseBody getBody() {
        return this.body;
    }

}
