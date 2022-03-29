// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIstioGatewayRoutesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIstioGatewayRoutesResponseBody body;

    public static DescribeIstioGatewayRoutesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIstioGatewayRoutesResponse self = new DescribeIstioGatewayRoutesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIstioGatewayRoutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIstioGatewayRoutesResponse setBody(DescribeIstioGatewayRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIstioGatewayRoutesResponseBody getBody() {
        return this.body;
    }

}
