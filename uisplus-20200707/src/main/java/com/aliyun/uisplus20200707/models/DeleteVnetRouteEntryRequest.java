// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DeleteVnetRouteEntryRequest extends TeaModel {
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

    public static DeleteVnetRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVnetRouteEntryRequest self = new DeleteVnetRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVnetRouteEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteVnetRouteEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteVnetRouteEntryRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public DeleteVnetRouteEntryRequest setVnetId(String vnetId) {
        this.vnetId = vnetId;
        return this;
    }
    public String getVnetId() {
        return this.vnetId;
    }

    public DeleteVnetRouteEntryRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

}
