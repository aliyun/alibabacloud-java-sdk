// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateDefaultVpcResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The route table ID that is automatically created by the system after you create a default VPC.</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    /**
     * <p>The vRouter ID that is automatically created by the system after you create a default VPC.</p>
     */
    @NameInMap("VRouterId")
    public String VRouterId;

    /**
     * <p>The ID of the default VPC.</p>
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
