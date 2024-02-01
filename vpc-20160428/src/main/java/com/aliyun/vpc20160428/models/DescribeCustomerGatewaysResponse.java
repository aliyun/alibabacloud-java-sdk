// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCustomerGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomerGatewaysResponseBody body;

    public static DescribeCustomerGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerGatewaysResponse self = new DescribeCustomerGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomerGatewaysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomerGatewaysResponse setBody(DescribeCustomerGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomerGatewaysResponseBody getBody() {
        return this.body;
    }

}
