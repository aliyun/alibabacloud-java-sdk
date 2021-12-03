// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointServiceAttributeRequest extends TeaModel {
    @NameInMap("AutoAcceptEnabled")
    public Boolean autoAcceptEnabled;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectBandwidth")
    public Integer connectBandwidth;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceDescription")
    public String serviceDescription;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ZoneAffinityEnabled")
    public Boolean zoneAffinityEnabled;

    public static UpdateVpcEndpointServiceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointServiceAttributeRequest self = new UpdateVpcEndpointServiceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointServiceAttributeRequest setAutoAcceptEnabled(Boolean autoAcceptEnabled) {
        this.autoAcceptEnabled = autoAcceptEnabled;
        return this;
    }
    public Boolean getAutoAcceptEnabled() {
        return this.autoAcceptEnabled;
    }

    public UpdateVpcEndpointServiceAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateVpcEndpointServiceAttributeRequest setConnectBandwidth(Integer connectBandwidth) {
        this.connectBandwidth = connectBandwidth;
        return this;
    }
    public Integer getConnectBandwidth() {
        return this.connectBandwidth;
    }

    public UpdateVpcEndpointServiceAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateVpcEndpointServiceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateVpcEndpointServiceAttributeRequest setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public UpdateVpcEndpointServiceAttributeRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateVpcEndpointServiceAttributeRequest setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
        this.zoneAffinityEnabled = zoneAffinityEnabled;
        return this;
    }
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

}
