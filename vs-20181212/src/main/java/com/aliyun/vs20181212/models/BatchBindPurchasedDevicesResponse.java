// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindPurchasedDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchBindPurchasedDevicesResponseBody body;

    public static BatchBindPurchasedDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchBindPurchasedDevicesResponse self = new BatchBindPurchasedDevicesResponse();
        return TeaModel.build(map, self);
    }

    public BatchBindPurchasedDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchBindPurchasedDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchBindPurchasedDevicesResponse setBody(BatchBindPurchasedDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchBindPurchasedDevicesResponseBody getBody() {
        return this.body;
    }

}
