// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePurchasedDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePurchasedDevicesResponseBody body;

    public static DescribePurchasedDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedDevicesResponse self = new DescribePurchasedDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePurchasedDevicesResponse setBody(DescribePurchasedDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePurchasedDevicesResponseBody getBody() {
        return this.body;
    }

}
