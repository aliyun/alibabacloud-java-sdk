// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindParentPlatformDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchBindParentPlatformDevicesResponseBody body;

    public static BatchBindParentPlatformDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchBindParentPlatformDevicesResponse self = new BatchBindParentPlatformDevicesResponse();
        return TeaModel.build(map, self);
    }

    public BatchBindParentPlatformDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchBindParentPlatformDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchBindParentPlatformDevicesResponse setBody(BatchBindParentPlatformDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchBindParentPlatformDevicesResponseBody getBody() {
        return this.body;
    }

}
