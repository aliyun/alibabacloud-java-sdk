// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSubscriptionPriceResponseBody body;

    public static DescribeSubscriptionPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionPriceResponse self = new DescribeSubscriptionPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubscriptionPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSubscriptionPriceResponse setBody(DescribeSubscriptionPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubscriptionPriceResponseBody getBody() {
        return this.body;
    }

}
