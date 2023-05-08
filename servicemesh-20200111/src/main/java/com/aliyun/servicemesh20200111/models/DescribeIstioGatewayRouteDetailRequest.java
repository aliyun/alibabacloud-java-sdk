// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIstioGatewayRouteDetailRequest extends TeaModel {
    /**
     * <p>The fixed duration for request delay.</p>
     */
    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    /**
     * <p>The duration for request delay is expressed as 2 raised to the power of x. You must specify the value of x.</p>
     */
    @NameInMap("RouteName")
    public String routeName;

    /**
     * <p>The duration to delay a request.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeIstioGatewayRouteDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIstioGatewayRouteDetailRequest self = new DescribeIstioGatewayRouteDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIstioGatewayRouteDetailRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public DescribeIstioGatewayRouteDetailRequest setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }
    public String getRouteName() {
        return this.routeName;
    }

    public DescribeIstioGatewayRouteDetailRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
