// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateGlobalAccelerationInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ServiceLocation")
    @Validation(required = true)
    public String serviceLocation;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public String bandwidth;

    @NameInMap("BandwidthType")
    public String bandwidthType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateGlobalAccelerationInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalAccelerationInstanceRequest self = new CreateGlobalAccelerationInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateGlobalAccelerationInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGlobalAccelerationInstanceRequest setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
        return this;
    }
    public String getServiceLocation() {
        return this.serviceLocation;
    }

    public CreateGlobalAccelerationInstanceRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public CreateGlobalAccelerationInstanceRequest setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    public CreateGlobalAccelerationInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGlobalAccelerationInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGlobalAccelerationInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
