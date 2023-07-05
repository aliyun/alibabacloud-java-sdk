// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DisableVpcEndpointZoneConnectionRequest extends TeaModel {
    /**
     * <p>The ID of the endpoint service.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the endpoint.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>Specifies whether to disconnect the endpoint from previous connections after migration. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false** (default): no</p>
     * <br>
     * <p>>  Set the value to true if you want to disconnect the endpoint from the previous connections in the zone after migration.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReplacedResource")
    public Boolean replacedResource;

    /**
     * <p>The operation that you want to perform. Set the value to **DisableVpcEndpointZoneConnection**.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

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
