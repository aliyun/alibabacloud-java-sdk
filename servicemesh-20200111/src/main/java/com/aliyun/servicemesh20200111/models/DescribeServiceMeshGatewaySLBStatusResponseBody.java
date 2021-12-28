// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshGatewaySLBStatusResponseBody extends TeaModel {
    @NameInMap("GatewaySLB")
    public java.util.Map<String, GatewaySLBValue> gatewaySLB;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceMeshGatewaySLBStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshGatewaySLBStatusResponseBody self = new DescribeServiceMeshGatewaySLBStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshGatewaySLBStatusResponseBody setGatewaySLB(java.util.Map<String, GatewaySLBValue> gatewaySLB) {
        this.gatewaySLB = gatewaySLB;
        return this;
    }
    public java.util.Map<String, GatewaySLBValue> getGatewaySLB() {
        return this.gatewaySLB;
    }

    public DescribeServiceMeshGatewaySLBStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
