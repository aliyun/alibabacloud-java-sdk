// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePurchasedDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribePurchasedDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePurchasedDevicesResponse setBody(DescribePurchasedDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePurchasedDevicesResponseBody getBody() {
        return this.body;
    }

}
