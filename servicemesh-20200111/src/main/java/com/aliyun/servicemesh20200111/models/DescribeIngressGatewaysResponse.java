// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIngressGatewaysResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IngressGateways")
    @Validation(required = true)
    public java.util.List<java.util.Map<String, ?>> ingressGateways;

    public static DescribeIngressGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIngressGatewaysResponse self = new DescribeIngressGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIngressGatewaysResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIngressGatewaysResponse setIngressGateways(java.util.List<java.util.Map<String, ?>> ingressGateways) {
        this.ingressGateways = ingressGateways;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getIngressGateways() {
        return this.ingressGateways;
    }

}
