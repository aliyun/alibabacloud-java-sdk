// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class EnableVpcEndpointZoneConnectionRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request.
    // 
    // You can use the client to generate a value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to check the request without performing the operation. Default values:
    // 
    // *   **true**: sends a request for check purposes only. If you select this option, the connection request is not accepted after the request passes the check. The system checks the required parameters, request syntax, and limits. If the request fails to pass the check, the corresponding error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.
    // *   **false**: sends a common request. If the request passes the check, a 2xx HTTP status code is returned, and the operation is performed. This is the default value.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The ID of the endpoint.
    @NameInMap("EndpointId")
    public String endpointId;

    // The ID of the region where the endpoint connection request is accepted. You can call the [DescribeRegions](~~120468~~) operation to obtain the region ID.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the endpoint service.
    @NameInMap("ServiceId")
    public String serviceId;

    // The ID of the zone associated with the endpoint.
    @NameInMap("ZoneId")
    public String zoneId;

    public static EnableVpcEndpointZoneConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableVpcEndpointZoneConnectionRequest self = new EnableVpcEndpointZoneConnectionRequest();
        return TeaModel.build(map, self);
    }

    public EnableVpcEndpointZoneConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableVpcEndpointZoneConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public EnableVpcEndpointZoneConnectionRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public EnableVpcEndpointZoneConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableVpcEndpointZoneConnectionRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public EnableVpcEndpointZoneConnectionRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
