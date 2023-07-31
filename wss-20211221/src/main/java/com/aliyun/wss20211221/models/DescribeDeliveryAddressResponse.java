// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeDeliveryAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeliveryAddressResponseBody body;

    public static DescribeDeliveryAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeliveryAddressResponse self = new DescribeDeliveryAddressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeliveryAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeliveryAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeliveryAddressResponse setBody(DescribeDeliveryAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeliveryAddressResponseBody getBody() {
        return this.body;
    }

}
