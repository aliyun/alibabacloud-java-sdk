// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BindParentPlatformDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindParentPlatformDeviceResponseBody body;

    public static BindParentPlatformDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindParentPlatformDeviceResponse self = new BindParentPlatformDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BindParentPlatformDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindParentPlatformDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindParentPlatformDeviceResponse setBody(BindParentPlatformDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindParentPlatformDeviceResponseBody getBody() {
        return this.body;
    }

}
