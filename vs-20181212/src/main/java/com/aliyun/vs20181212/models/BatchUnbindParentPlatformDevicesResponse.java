// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindParentPlatformDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchUnbindParentPlatformDevicesResponseBody body;

    public static BatchUnbindParentPlatformDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindParentPlatformDevicesResponse self = new BatchUnbindParentPlatformDevicesResponse();
        return TeaModel.build(map, self);
    }

    public BatchUnbindParentPlatformDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUnbindParentPlatformDevicesResponse setBody(BatchUnbindParentPlatformDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUnbindParentPlatformDevicesResponseBody getBody() {
        return this.body;
    }

}
