// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayStockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayStockResponseBody body;

    public static DescribeGatewayStockResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayStockResponse self = new DescribeGatewayStockResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayStockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayStockResponse setBody(DescribeGatewayStockResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayStockResponseBody getBody() {
        return this.body;
    }

}
