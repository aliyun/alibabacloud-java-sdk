// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class RemoveZoneFromVpcEndpointRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static RemoveZoneFromVpcEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveZoneFromVpcEndpointRequest self = new RemoveZoneFromVpcEndpointRequest();
        return TeaModel.build(map, self);
    }

    public RemoveZoneFromVpcEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveZoneFromVpcEndpointRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RemoveZoneFromVpcEndpointRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public RemoveZoneFromVpcEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveZoneFromVpcEndpointRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
