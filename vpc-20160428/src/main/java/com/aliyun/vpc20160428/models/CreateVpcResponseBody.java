// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the route table that is automatically created by the system after the VPC is created.</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    /**
     * <p>The ID of the vRouter that is automatically created by the system after the VPC is created.</p>
     */
    @NameInMap("VRouterId")
    public String VRouterId;

    /**
     * <p>The ID of the created VPC.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcResponseBody self = new CreateVpcResponseBody();
        return TeaModel.build(map, self);
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

    public CreateVpcResponseBody setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public CreateVpcResponseBody setVRouterId(String VRouterId) {
        this.VRouterId = VRouterId;
        return this;
    }
    public String getVRouterId() {
        return this.VRouterId;
    }

    public CreateVpcResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
