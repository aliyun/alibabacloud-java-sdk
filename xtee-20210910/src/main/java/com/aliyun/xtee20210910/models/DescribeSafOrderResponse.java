// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSafOrderResponseBody body;

    public static DescribeSafOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafOrderResponse self = new DescribeSafOrderResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSafOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSafOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSafOrderResponse setBody(DescribeSafOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSafOrderResponseBody getBody() {
        return this.body;
    }

}
