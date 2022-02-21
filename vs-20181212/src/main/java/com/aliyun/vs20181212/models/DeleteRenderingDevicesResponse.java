// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteRenderingDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRenderingDevicesResponseBody body;

    public static DeleteRenderingDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRenderingDevicesResponse self = new DeleteRenderingDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRenderingDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRenderingDevicesResponse setBody(DeleteRenderingDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRenderingDevicesResponseBody getBody() {
        return this.body;
    }

}
