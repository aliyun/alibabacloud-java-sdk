// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIngressGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIngressGatewaysResponseBody body;

    public static DescribeIngressGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIngressGatewaysResponse self = new DescribeIngressGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIngressGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIngressGatewaysResponse setBody(DescribeIngressGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIngressGatewaysResponseBody getBody() {
        return this.body;
    }

}
