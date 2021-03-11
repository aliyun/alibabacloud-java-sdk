// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePurchasedDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePurchasedDeviceResponseBody body;

    public static DescribePurchasedDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedDeviceResponse self = new DescribePurchasedDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePurchasedDeviceResponse setBody(DescribePurchasedDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePurchasedDeviceResponseBody getBody() {
        return this.body;
    }

}
