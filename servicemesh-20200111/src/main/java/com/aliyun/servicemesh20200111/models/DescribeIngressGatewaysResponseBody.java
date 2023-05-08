// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIngressGatewaysResponseBody extends TeaModel {
    /**
     * <p>The information about the ingress gateways of the ASM instance.</p>
     */
    @NameInMap("IngressGateways")
    public java.util.List<java.util.Map<String, ?>> ingressGateways;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIngressGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIngressGatewaysResponseBody self = new DescribeIngressGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIngressGatewaysResponseBody setIngressGateways(java.util.List<java.util.Map<String, ?>> ingressGateways) {
        this.ingressGateways = ingressGateways;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getIngressGateways() {
        return this.ingressGateways;
    }

    public DescribeIngressGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
