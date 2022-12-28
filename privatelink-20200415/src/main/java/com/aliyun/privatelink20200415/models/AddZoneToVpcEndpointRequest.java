// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class AddZoneToVpcEndpointRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request.
    // 
    // You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to only precheck this request. Valid values:
    // 
    // *   **true**: only prechecks the API request without performing the operation. The system prechecks whether your AccessKey pair is valid, whether the Resource Access Management (RAM) user is authorized, and whether required parameters are set. If the request fails to pass the precheck, an error code is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
    // *   **false** (default): sends the API request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The ID of the endpoint for which you want to add a zone.
    @NameInMap("EndpointId")
    public String endpointId;

    // The ID of the region where the endpoint is created.
    // 
    // You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The vSwitch in the zone to be added. The system automatically creates an endpoint elastic network interface (ENI) in the vSwitch.
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // The ID of the zone to be added.
    @NameInMap("ZoneId")
    public String zoneId;

    // The IP address of the endpoint ENI in the zone to be added.
    @NameInMap("ip")
    public String ip;

    public static AddZoneToVpcEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        AddZoneToVpcEndpointRequest self = new AddZoneToVpcEndpointRequest();
        return TeaModel.build(map, self);
    }

    public AddZoneToVpcEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddZoneToVpcEndpointRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AddZoneToVpcEndpointRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public AddZoneToVpcEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddZoneToVpcEndpointRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public AddZoneToVpcEndpointRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public AddZoneToVpcEndpointRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
