// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDeviceResponseBody body;

    public static ModifyDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceResponse self = new ModifyDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDeviceResponse setBody(ModifyDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDeviceResponseBody getBody() {
        return this.body;
    }

}
