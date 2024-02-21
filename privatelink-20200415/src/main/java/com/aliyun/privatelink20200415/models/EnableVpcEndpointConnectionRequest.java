// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class EnableVpcEndpointConnectionRequest extends TeaModel {
    /**
     * <p>The bandwidth of the endpoint connection. Unit: Mbit/s. Valid values: **3072 to 10240**.</p>
     * <br>
     * <p>>  The bandwidth of an endpoint connection is in the range of **100 to 10,240** Mbit/s. The default bandwidth is **3,072** Mbit/s. When the endpoint is connected to the endpoint service, the default bandwidth is the minimum bandwidth. In this case, the connection bandwidth range is **3,072 to 10,240** Mbit/s. If Classic Load Balancer (CLB) instances or Application Load Balancer (ALB) instances are specified as service resources, you can modify the endpoint connection bandwidth based on your business requirements. This parameter is invalid if Network Load Balancer (NLB) instances are specified as service resources.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The endpoint ID.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The ID of the region where the connection request is accepted.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The endpoint service ID.</p>
     */
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
