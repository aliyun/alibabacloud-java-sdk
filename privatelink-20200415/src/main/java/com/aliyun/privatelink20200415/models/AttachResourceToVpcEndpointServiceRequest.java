// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class AttachResourceToVpcEndpointServiceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>ClientToken</strong> can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Performs a dry run to check the request for potential issues, including required parameters, request format, and service limits. The system does not add the service resource. If the check fails, an error message is returned. If the check passes, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request. After the request passes the check, an HTTP 2xx status code is returned and the service resource is added.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the region where the endpoint service is deployed.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/448570.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the service resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-hp32z1wp5peaoox2q****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the service resource. Valid values:</p>
     * <ul>
     * <li><p><strong>slb</strong>: Classic Load Balancer (CLB).</p>
     * </li>
     * <li><p><strong>alb</strong>: Application Load Balancer (ALB).</p>
     * </li>
     * <li><p><strong>nlb</strong>: Network Load Balancer (NLB).</p>
     * </li>
     * <li><p><strong>gwlb</strong>: Gateway Load Balancer (GWLB).</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>slb</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The endpoint service to which you want to add the service resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The zone where the service resource is located. This parameter is required if the service resource is an ALB, NLB, or GWLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static AttachResourceToVpcEndpointServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachResourceToVpcEndpointServiceRequest self = new AttachResourceToVpcEndpointServiceRequest();
        return TeaModel.build(map, self);
    }

    public AttachResourceToVpcEndpointServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AttachResourceToVpcEndpointServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AttachResourceToVpcEndpointServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachResourceToVpcEndpointServiceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public AttachResourceToVpcEndpointServiceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public AttachResourceToVpcEndpointServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public AttachResourceToVpcEndpointServiceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
