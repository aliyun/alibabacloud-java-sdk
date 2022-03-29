// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIstioGatewayRouteDetailRequest extends TeaModel {
    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    @NameInMap("RouteName")
    public String routeName;

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
