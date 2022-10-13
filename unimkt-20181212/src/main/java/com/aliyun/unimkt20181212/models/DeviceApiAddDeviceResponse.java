// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class DeviceApiAddDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeviceApiAddDeviceResponseBody body;

    public static DeviceApiAddDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeviceApiAddDeviceResponse self = new DeviceApiAddDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeviceApiAddDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeviceApiAddDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeviceApiAddDeviceResponse setBody(DeviceApiAddDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeviceApiAddDeviceResponseBody getBody() {
        return this.body;
    }

}
