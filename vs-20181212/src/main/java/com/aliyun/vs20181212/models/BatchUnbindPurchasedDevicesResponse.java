// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindPurchasedDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchUnbindPurchasedDevicesResponseBody body;

    public static BatchUnbindPurchasedDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindPurchasedDevicesResponse self = new BatchUnbindPurchasedDevicesResponse();
        return TeaModel.build(map, self);
    }

    public BatchUnbindPurchasedDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUnbindPurchasedDevicesResponse setBody(BatchUnbindPurchasedDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUnbindPurchasedDevicesResponseBody getBody() {
        return this.body;
    }

}
