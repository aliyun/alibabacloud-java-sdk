// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNatGatewayAssociateNetworkInterfacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNatGatewayAssociateNetworkInterfacesResponseBody body;

    public static DescribeNatGatewayAssociateNetworkInterfacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewayAssociateNetworkInterfacesResponse self = new DescribeNatGatewayAssociateNetworkInterfacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNatGatewayAssociateNetworkInterfacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNatGatewayAssociateNetworkInterfacesResponse setBody(DescribeNatGatewayAssociateNetworkInterfacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNatGatewayAssociateNetworkInterfacesResponseBody getBody() {
        return this.body;
    }

}
