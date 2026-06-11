// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class DevicePageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DevicePageResponseBody body;

    public static DevicePageResponse build(java.util.Map<String, ?> map) throws Exception {
        DevicePageResponse self = new DevicePageResponse();
        return TeaModel.build(map, self);
    }

    public DevicePageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DevicePageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DevicePageResponse setBody(DevicePageResponseBody body) {
        this.body = body;
        return this;
    }
    public DevicePageResponseBody getBody() {
        return this.body;
    }

}
