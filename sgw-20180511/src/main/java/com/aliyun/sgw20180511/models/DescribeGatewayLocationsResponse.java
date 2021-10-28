// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayLocationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayLocationsResponseBody body;

    public static DescribeGatewayLocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayLocationsResponse self = new DescribeGatewayLocationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayLocationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayLocationsResponse setBody(DescribeGatewayLocationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayLocationsResponseBody getBody() {
        return this.body;
    }

}
