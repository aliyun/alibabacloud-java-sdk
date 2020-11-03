// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class CreateVnetRouteEntryRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    @NameInMap("VnetId")
    @Validation(required = true)
    public String vnetId;

    @NameInMap("Destination")
    @Validation(required = true)
    public String destination;

    @NameInMap("NexthopType")
    @Validation(required = true)
    public String nexthopType;

    @NameInMap("Nexthop")
    public String nexthop;

    public static CreateVnetRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVnetRouteEntryRequest self = new CreateVnetRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateVnetRouteEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVnetRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVnetRouteEntryRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public CreateVnetRouteEntryRequest setVnetId(String vnetId) {
        this.vnetId = vnetId;
        return this;
    }
    public String getVnetId() {
        return this.vnetId;
    }

    public CreateVnetRouteEntryRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public CreateVnetRouteEntryRequest setNexthopType(String nexthopType) {
        this.nexthopType = nexthopType;
        return this;
    }
    public String getNexthopType() {
        return this.nexthopType;
    }

    public CreateVnetRouteEntryRequest setNexthop(String nexthop) {
        this.nexthop = nexthop;
        return this;
    }
    public String getNexthop() {
        return this.nexthop;
    }

}
