// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointServiceAttributeRequest extends TeaModel {
    // Specifies whether to automatically accept endpoint connection requests. Valid values:
    // 
    // *   **true**: automatically accepts endpoint connection requests.
    // *   **false**: does not automatically accept endpoint connection requests.
    @NameInMap("AutoAcceptEnabled")
    public Boolean autoAcceptEnabled;

    // The client token that is used to ensure the idempotence of the request.
    // 
    // You can use the client to generate a value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters.
    @NameInMap("ClientToken")
    public String clientToken;

    // The default bandwidth of the endpoint connection. Valid values: **100** to **10240**. Unit: Mbit/s.
    @NameInMap("ConnectBandwidth")
    public Integer connectBandwidth;

    // Specifies whether to check the request without performing the operation. Valid values:
    // 
    // *   **true**: sends a request for check purposes only. If you select this option, the attributes of the endpoint service are not modified after the request passes the check. The system checks the required parameters, request syntax, and limits. If the request fails to pass the check, the corresponding error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.
    // *   **false**: sends a common request. If the request passes the check, a 2xx HTTP status code is returned, and the operation is performed. This is the default value.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The region ID of the endpoint service.
    // 
    // You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The description of the endpoint service.
    @NameInMap("ServiceDescription")
    public String serviceDescription;

    // The ID of the endpoint service.
    @NameInMap("ServiceId")
    public String serviceId;

    // Specifies whether to enable IPv6. Valid values:
    // 
    // *   **true**: enables IPv6.
    // *   **false**: disables IPv6. This is the default value.
    @NameInMap("ServiceSupportIPv6")
    public Boolean serviceSupportIPv6;

    // Specifies whether to enable zone affinity. Valid values:
    // 
    // *   **true**: enables zone affinity.
    // *   **false**: disables zone affinity. This is the default value.
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

    public UpdateVpcEndpointServiceAttributeRequest setServiceSupportIPv6(Boolean serviceSupportIPv6) {
        this.serviceSupportIPv6 = serviceSupportIPv6;
        return this;
    }
    public Boolean getServiceSupportIPv6() {
        return this.serviceSupportIPv6;
    }

    public UpdateVpcEndpointServiceAttributeRequest setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
        this.zoneAffinityEnabled = zoneAffinityEnabled;
        return this;
    }
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

}
