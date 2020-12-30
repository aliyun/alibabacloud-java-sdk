// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcResponseBody extends TeaModel {
    @NameInMap("VRouterId")
    public String VRouterId;

    @NameInMap("RouteTableId")
    public String routeTableId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcResponseBody self = new CreateVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpcResponseBody setVRouterId(String VRouterId) {
        this.VRouterId = VRouterId;
        return this;
    }
    public String getVRouterId() {
        return this.VRouterId;
    }

    public CreateVpcResponseBody setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public CreateVpcResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpcResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
