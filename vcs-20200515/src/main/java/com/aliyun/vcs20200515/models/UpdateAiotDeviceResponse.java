// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateAiotDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAiotDeviceResponseBody body;

    public static UpdateAiotDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiotDeviceResponse self = new UpdateAiotDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAiotDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAiotDeviceResponse setBody(UpdateAiotDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAiotDeviceResponseBody getBody() {
        return this.body;
    }

}
