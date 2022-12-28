// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class EnableVpcEndpointConnectionRequest extends TeaModel {
    // The bandwidth of the endpoint connection. Valid values: **1024‒10240**. Unit: Mbit/s.
    // 
    // >  The value range of this parameter is **100‒10240** Mbit/s. The default value of this parameter is **1024** Mbit/s. When the endpoint is connected with the endpoint service, the value of this parameter indicates the minimum bandwidth. When the default value of this parameter is used, the connection bandwidth range is **1024‒10240** Mbit/s.
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    // The client token that is used to ensure the idempotence of the request.
    // 
    // You can use the client to generate a value, but you must ensure that the value is unique among all requests. The token can contain only ASCII characters.
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to check the request without performing the operation. Valid values:
    // 
    // *   **true**: sends a request for check purposes only. If you select this option, the connection requests are not accepted after the request passes the check. The system checks the required parameters, request syntax, and limits. If the request fails to pass the check, the corresponding error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.
    // *   **false**: sends a common request. If the request passes the check, a 2xx HTTP status code is returned, and the operation is performed. This is the default value.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The ID of the endpoint.
    @NameInMap("EndpointId")
    public String endpointId;

    // The ID of the region where the connection requests are accepted.
    // 
    // You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the endpoint service.
    @NameInMap("ServiceId")
    public String serviceId;

    public static EnableVpcEndpointConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableVpcEndpointConnectionRequest self = new EnableVpcEndpointConnectionRequest();
        return TeaModel.build(map, self);
    }

    public EnableVpcEndpointConnectionRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public EnableVpcEndpointConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableVpcEndpointConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public EnableVpcEndpointConnectionRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public EnableVpcEndpointConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableVpcEndpointConnectionRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
