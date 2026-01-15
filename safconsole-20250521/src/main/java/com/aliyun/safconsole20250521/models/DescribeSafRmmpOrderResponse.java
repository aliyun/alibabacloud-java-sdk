// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeSafRmmpOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSafRmmpOrderResponseBody body;

    public static DescribeSafRmmpOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafRmmpOrderResponse self = new DescribeSafRmmpOrderResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSafRmmpOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSafRmmpOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSafRmmpOrderResponse setBody(DescribeSafRmmpOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSafRmmpOrderResponseBody getBody() {
        return this.body;
    }

}
