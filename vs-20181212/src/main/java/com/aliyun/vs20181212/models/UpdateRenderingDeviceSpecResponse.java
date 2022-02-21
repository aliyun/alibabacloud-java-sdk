// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateRenderingDeviceSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRenderingDeviceSpecResponseBody body;

    public static UpdateRenderingDeviceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRenderingDeviceSpecResponse self = new UpdateRenderingDeviceSpecResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRenderingDeviceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRenderingDeviceSpecResponse setBody(UpdateRenderingDeviceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRenderingDeviceSpecResponseBody getBody() {
        return this.body;
    }

}
