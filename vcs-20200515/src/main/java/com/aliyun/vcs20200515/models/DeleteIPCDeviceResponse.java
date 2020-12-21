// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteIPCDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIPCDeviceResponseBody body;

    public static DeleteIPCDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIPCDeviceResponse self = new DeleteIPCDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIPCDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIPCDeviceResponse setBody(DeleteIPCDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIPCDeviceResponseBody getBody() {
        return this.body;
    }

}
