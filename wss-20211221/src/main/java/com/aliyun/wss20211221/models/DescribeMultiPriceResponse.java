// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeMultiPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMultiPriceResponseBody body;

    public static DescribeMultiPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiPriceResponse self = new DescribeMultiPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMultiPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMultiPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMultiPriceResponse setBody(DescribeMultiPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMultiPriceResponseBody getBody() {
        return this.body;
    }

}
