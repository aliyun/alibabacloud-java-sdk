// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIngressGatewaysResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IngressGateways")
    public java.util.List<java.util.Map<String, ?>> ingressGateways;

    public static DescribeIngressGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIngressGatewaysResponseBody self = new DescribeIngressGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIngressGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIngressGatewaysResponseBody setIngressGateways(java.util.List<java.util.Map<String, ?>> ingressGateways) {
        this.ingressGateways = ingressGateways;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getIngressGateways() {
        return this.ingressGateways;
    }

}
