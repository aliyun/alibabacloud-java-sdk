// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateDefaultVpcResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The route table ID that is automatically created by the system after you create a default VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp1q1uirugzb1x32m****</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    /**
     * <p>The vRouter ID that is automatically created by the system after you create a default VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vrt-bp1lhl0taikrteen8****</p>
     */
    @NameInMap("VRouterId")
    public String VRouterId;

    /**
     * <p>The ID of the default VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp15zckdt37pq72zv****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateDefaultVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultVpcResponseBody self = new CreateDefaultVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDefaultVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDefaultVpcResponseBody setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public CreateDefaultVpcResponseBody setVRouterId(String VRouterId) {
        this.VRouterId = VRouterId;
        return this;
    }
    public String getVRouterId() {
        return this.VRouterId;
    }

    public CreateDefaultVpcResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
