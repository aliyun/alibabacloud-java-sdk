// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateRouteTableRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RouteTableId")
    @Validation(required = true)
    public String routeTableId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String vSwitchId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AssociateRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateRouteTableRequest self = new AssociateRouteTableRequest();
        return TeaModel.build(map, self);
    }

    public AssociateRouteTableRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateRouteTableRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public AssociateRouteTableRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public AssociateRouteTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
