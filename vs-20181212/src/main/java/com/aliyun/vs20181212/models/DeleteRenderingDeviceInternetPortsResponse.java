// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteRenderingDeviceInternetPortsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRenderingDeviceInternetPortsResponseBody body;

    public static DeleteRenderingDeviceInternetPortsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRenderingDeviceInternetPortsResponse self = new DeleteRenderingDeviceInternetPortsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRenderingDeviceInternetPortsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRenderingDeviceInternetPortsResponse setBody(DeleteRenderingDeviceInternetPortsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRenderingDeviceInternetPortsResponseBody getBody() {
        return this.body;
    }

}
