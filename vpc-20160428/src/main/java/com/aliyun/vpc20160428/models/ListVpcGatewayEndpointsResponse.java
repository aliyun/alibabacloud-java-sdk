// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVpcGatewayEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVpcGatewayEndpointsResponseBody body;

    public static ListVpcGatewayEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcGatewayEndpointsResponse self = new ListVpcGatewayEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcGatewayEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcGatewayEndpointsResponse setBody(ListVpcGatewayEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcGatewayEndpointsResponseBody getBody() {
        return this.body;
    }

}
