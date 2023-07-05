// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointConnectionAttributeRequest extends TeaModel {
    /**
     * <p>WB01218782</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The operation that you want to perform. Set the value to **UpdateVpcEndpointConnectionAttribute**.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the endpoint.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>UpdateVpcEndpointConnectionAttribute</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Modifies the maximum bandwidth of an endpoint connection.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static UpdateVpcEndpointConnectionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointConnectionAttributeRequest self = new UpdateVpcEndpointConnectionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointConnectionAttributeRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public UpdateVpcEndpointConnectionAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateVpcEndpointConnectionAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateVpcEndpointConnectionAttributeRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public UpdateVpcEndpointConnectionAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateVpcEndpointConnectionAttributeRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
