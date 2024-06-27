// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafDeOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSafDeOrderResponseBody body;

    public static DescribeSafDeOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafDeOrderResponse self = new DescribeSafDeOrderResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSafDeOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSafDeOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSafDeOrderResponse setBody(DescribeSafDeOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSafDeOrderResponseBody getBody() {
        return this.body;
    }

}
