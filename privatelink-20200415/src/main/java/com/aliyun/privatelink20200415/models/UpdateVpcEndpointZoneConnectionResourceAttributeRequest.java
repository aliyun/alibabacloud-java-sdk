// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointZoneConnectionResourceAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The endpoint ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-hp33b2e43fays7s8****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The region ID of the endpoint connection whose bandwidth you want to modify.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource allocation mode. You can change the resource allocation mode only if the endpoint connection is in the <strong>Disconnected</strong> state. Valid values:</p>
     * <ul>
     * <li><strong>Auto</strong>: automatically and randomly allocates service resources. In this mode, the specified service resource is deleted.</li>
     * <li><strong>Manual</strong>: manually allocates service resources. If you set the value to Manual, you must also specify the <strong>ResourceId</strong> and <strong>ResourceType</strong> parameters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("ResourceAllocateMode")
    public String resourceAllocateMode;

    /**
     * <p>The ID of the service resource that you want to manually allocate or migrate in the zone where the endpoint connection is deployed.</p>
     * <blockquote>
     * <p>If <strong>ResourceAllocateMode</strong> is set to <strong>Mannual</strong>, or <strong>ResourceReplaceMode</strong> is set, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lb-hp32z1wp5peaoox2q****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The migration mode of the service resource. Valid values:</p>
     * <ul>
     * <li><strong>Graceful</strong>: smooth migration. Service resources in the zone are smoothly migrated.</li>
     * <li><strong>Force</strong>: forced migration. Service resources in the zone are forcefully migrated.</li>
     * </ul>
     * <blockquote>
     * <p> You need to specify this parameter only if you want to migrate service resources and the endpoint connection is in the <strong>Connected</strong> state. If you specify this parameter, you must also specify the <strong>ResourceId</strong> and <strong>ResourceType</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Graceful</p>
     */
    @NameInMap("ResourceReplaceMode")
    public String resourceReplaceMode;

    /**
     * <p>The type of the service resource. Valid values:</p>
     * <ul>
     * <li><strong>slb</strong>: a CLB instance that supports PrivateLink. In addition, the CLB instance is deployed in a VPC.</li>
     * <li><strong>alb</strong>: an Application Load Balancer (ALB) instance that supports PrivateLink. In addition, the ALB instance is deployed in a VPC.</li>
     * </ul>
     * <blockquote>
     * <p>If <strong>ResourceAllocateMode</strong> is set to <strong>Mannual</strong>, or <strong>ResourceReplaceMode</strong> is set, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>slb</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The endpoint service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
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
