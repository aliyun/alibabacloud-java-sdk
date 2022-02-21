// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AddRenderingDeviceInternetPortsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddRenderingDeviceInternetPortsResponseBody body;

    public static AddRenderingDeviceInternetPortsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRenderingDeviceInternetPortsResponse self = new AddRenderingDeviceInternetPortsResponse();
        return TeaModel.build(map, self);
    }

    public AddRenderingDeviceInternetPortsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRenderingDeviceInternetPortsResponse setBody(AddRenderingDeviceInternetPortsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRenderingDeviceInternetPortsResponseBody getBody() {
        return this.body;
    }

}
