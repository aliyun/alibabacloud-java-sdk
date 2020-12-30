// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCustomerGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustomerGatewayResponseBody body;

    public static DescribeCustomerGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerGatewayResponse self = new DescribeCustomerGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomerGatewayResponse setBody(DescribeCustomerGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomerGatewayResponseBody getBody() {
        return this.body;
    }

}
