// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RemoveCameraForInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveCameraForInstanceResponseBody body;

    public static RemoveCameraForInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveCameraForInstanceResponse self = new RemoveCameraForInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RemoveCameraForInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveCameraForInstanceResponse setBody(RemoveCameraForInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveCameraForInstanceResponseBody getBody() {
        return this.body;
    }

}
