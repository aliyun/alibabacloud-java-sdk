// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeletePurchasedDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePurchasedDeviceResponseBody body;

    public static DeletePurchasedDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePurchasedDeviceResponse self = new DeletePurchasedDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeletePurchasedDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePurchasedDeviceResponse setBody(DeletePurchasedDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePurchasedDeviceResponseBody getBody() {
        return this.body;
    }

}
