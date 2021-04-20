// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteAiotDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAiotDeviceResponseBody body;

    public static DeleteAiotDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiotDeviceResponse self = new DeleteAiotDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAiotDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAiotDeviceResponse setBody(DeleteAiotDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAiotDeviceResponseBody getBody() {
        return this.body;
    }

}
