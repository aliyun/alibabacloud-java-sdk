// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DisableVpcEndpointConnectionRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceId")
    public String serviceId;

    public static DisableVpcEndpointConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableVpcEndpointConnectionRequest self = new DisableVpcEndpointConnectionRequest();
        return TeaModel.build(map, self);
    }

    public DisableVpcEndpointConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisableVpcEndpointConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DisableVpcEndpointConnectionRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DisableVpcEndpointConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DisableVpcEndpointConnectionRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
