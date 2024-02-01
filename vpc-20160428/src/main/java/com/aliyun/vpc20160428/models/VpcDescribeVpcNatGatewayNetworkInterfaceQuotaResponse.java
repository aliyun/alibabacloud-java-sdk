// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody body;

    public static VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse self = new VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse();
        return TeaModel.build(map, self);
    }

    public VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse setBody(VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody getBody() {
        return this.body;
    }

}
