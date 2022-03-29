// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIstioGatewayDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIstioGatewayDomainsResponseBody body;

    public static DescribeIstioGatewayDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIstioGatewayDomainsResponse self = new DescribeIstioGatewayDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIstioGatewayDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIstioGatewayDomainsResponse setBody(DescribeIstioGatewayDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIstioGatewayDomainsResponseBody getBody() {
        return this.body;
    }

}
