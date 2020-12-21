// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteNVRDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNVRDeviceResponseBody body;

    public static DeleteNVRDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNVRDeviceResponse self = new DeleteNVRDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNVRDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNVRDeviceResponse setBody(DeleteNVRDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNVRDeviceResponseBody getBody() {
        return this.body;
    }

}
