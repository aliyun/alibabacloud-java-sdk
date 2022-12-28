// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DisableVpcEndpointZoneConnectionRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request.
    // 
    // You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to only precheck the request. Valid values:
    // 
    // *   **true**: only prechecks the API request without performing the operation. The system checks whether your AccessKey pair is valid, whether the Resource Access Management (RAM) user is authorized, and whether required parameters are set. If the request fails to pass the precheck, an error code is returned. If the request passes the check, the `DryRunOperation` error code is returned.
    // *   **false** (default): sends the request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The ID of the endpoint.
    @NameInMap("EndpointId")
    public String endpointId;

    // The region ID of the endpoint from which you want to reject connection requests.
    // 
    // You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // Specifies whether to disconnect the endpoint from previous connections after migration. Valid values:
    // 
    // *   **true**: yes
    // *   **false** (default): no
    // 
    // >  Set the value to true if you want to disconnect the endpoint from the previous connections in the zone after migration.
    @NameInMap("ReplacedResource")
    public Boolean replacedResource;

    // The ID of the endpoint service.
    @NameInMap("ServiceId")
    public String serviceId;

    // The ID of the zone associated with the endpoint.
    @NameInMap("ZoneId")
    public String zoneId;

    public static DisableVpcEndpointZoneConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableVpcEndpointZoneConnectionRequest self = new DisableVpcEndpointZoneConnectionRequest();
        return TeaModel.build(map, self);
    }

    public DisableVpcEndpointZoneConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisableVpcEndpointZoneConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DisableVpcEndpointZoneConnectionRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DisableVpcEndpointZoneConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DisableVpcEndpointZoneConnectionRequest setReplacedResource(Boolean replacedResource) {
        this.replacedResource = replacedResource;
        return this;
    }
    public Boolean getReplacedResource() {
        return this.replacedResource;
    }

    public DisableVpcEndpointZoneConnectionRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DisableVpcEndpointZoneConnectionRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
