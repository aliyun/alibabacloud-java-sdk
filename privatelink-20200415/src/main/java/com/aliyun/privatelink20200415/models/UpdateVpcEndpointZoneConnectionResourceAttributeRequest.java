// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointZoneConnectionResourceAttributeRequest extends TeaModel {
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
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
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
     * <p>The region ID of the endpoint connection whose bandwidth you want to modify.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource allocation mode. You can change the resource allocation mode only if the endpoint connection is in the **Disconnected** state. Valid values:</p>
     * <br>
     * <p>*   **Auto**: automatically and randomly allocates the service resource. In this mode, the service resource is deleted.</p>
     * <p>*   **Mannual**: manually allocates the service resource. If you set the value to Mannual, you must also specify the **ResourceId** and **ResourceType** parameters.</p>
     */
    @NameInMap("ResourceAllocateMode")
    public String resourceAllocateMode;

    /**
     * <p>The ID of the service resource that you want to manually allocate or migrate in the zone where the endpoint connection is deployed.</p>
     * <br>
     * <p>> If **ResourceAllocateMode** is set to **Mannual**, or **ResourceReplaceMode** is set, this parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The migration mode of the service resource. Valid values:</p>
     * <br>
     * <p>*   **Graceful**: smoothly migrates the service resource in the zone.</p>
     * <p>*   **Force**: forcefully migrates the service resource in the zone.</p>
     * <br>
     * <p>> If you want to migrate the service resource, you need to set this parameter. This parameter is available only if the endpoint connection is in the **Connected** state. If you set this parameter, you must also specify the **ResourceId** and **ResourceType** parameters.</p>
     */
    @NameInMap("ResourceReplaceMode")
    public String resourceReplaceMode;

    /**
     * <p>The type of the service resource. Valid values:</p>
     * <br>
     * <p>*   **slb**: a CLB instance that supports PrivateLink. In addition, the CLB instance is deployed in a VPC.</p>
     * <p>*   **alb**: an Application Load Balancer (ALB) instance that supports PrivateLink. In addition, the ALB instance is deployed in a VPC.</p>
     * <br>
     * <p>> If **ResourceAllocateMode** is set to **Mannual**, or **ResourceReplaceMode** is set, this parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The endpoint service ID.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The zone ID.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static UpdateVpcEndpointZoneConnectionResourceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointZoneConnectionResourceAttributeRequest self = new UpdateVpcEndpointZoneConnectionResourceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setResourceAllocateMode(String resourceAllocateMode) {
        this.resourceAllocateMode = resourceAllocateMode;
        return this;
    }
    public String getResourceAllocateMode() {
        return this.resourceAllocateMode;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setResourceReplaceMode(String resourceReplaceMode) {
        this.resourceReplaceMode = resourceReplaceMode;
        return this;
    }
    public String getResourceReplaceMode() {
        return this.resourceReplaceMode;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
