// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePurchasedDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribePurchasedDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePurchasedDeviceResponse setBody(DescribePurchasedDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePurchasedDeviceResponseBody getBody() {
        return this.body;
    }

}
