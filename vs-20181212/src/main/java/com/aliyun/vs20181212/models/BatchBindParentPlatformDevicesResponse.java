// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindParentPlatformDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchBindParentPlatformDevicesResponse setBody(BatchBindParentPlatformDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchBindParentPlatformDevicesResponseBody getBody() {
        return this.body;
    }

}
