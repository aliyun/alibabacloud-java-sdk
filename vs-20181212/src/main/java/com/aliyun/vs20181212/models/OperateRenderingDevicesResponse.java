// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class OperateRenderingDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OperateRenderingDevicesResponseBody body;

    public static OperateRenderingDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateRenderingDevicesResponse self = new OperateRenderingDevicesResponse();
        return TeaModel.build(map, self);
    }

    public OperateRenderingDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateRenderingDevicesResponse setBody(OperateRenderingDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateRenderingDevicesResponseBody getBody() {
        return this.body;
    }

}
