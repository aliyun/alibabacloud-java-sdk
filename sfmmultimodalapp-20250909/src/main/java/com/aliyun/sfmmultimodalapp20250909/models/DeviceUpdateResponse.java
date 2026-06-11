// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class DeviceUpdateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeviceUpdateResponseBody body;

    public static DeviceUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeviceUpdateResponse self = new DeviceUpdateResponse();
        return TeaModel.build(map, self);
    }

    public DeviceUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeviceUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeviceUpdateResponse setBody(DeviceUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeviceUpdateResponseBody getBody() {
        return this.body;
    }

}
