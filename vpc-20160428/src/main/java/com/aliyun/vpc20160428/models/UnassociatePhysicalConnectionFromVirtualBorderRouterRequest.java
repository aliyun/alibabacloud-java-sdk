// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociatePhysicalConnectionFromVirtualBorderRouterRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VbrId")
    @Validation(required = true)
    public String vbrId;

    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    public String physicalConnectionId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static UnassociatePhysicalConnectionFromVirtualBorderRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassociatePhysicalConnectionFromVirtualBorderRouterRequest self = new UnassociatePhysicalConnectionFromVirtualBorderRouterRequest();
        return TeaModel.build(map, self);
    }

    public UnassociatePhysicalConnectionFromVirtualBorderRouterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnassociatePhysicalConnectionFromVirtualBorderRouterRequest setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

    public UnassociatePhysicalConnectionFromVirtualBorderRouterRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public UnassociatePhysicalConnectionFromVirtualBorderRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
