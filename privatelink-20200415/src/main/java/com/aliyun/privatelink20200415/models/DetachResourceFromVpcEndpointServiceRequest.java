// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DetachResourceFromVpcEndpointServiceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a unique token for each request. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Performs a dry run. The system checks the request for potential issues, including missing required parameters, incorrect request format, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends the request. If the request passes the check, an HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the region where the endpoint service is deployed. Call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to get a region ID.</p>
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
     * <p>The type of the service resource.</p>
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
     * 
     * <strong>example:</strong>
     * <p>slb</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the endpoint service from which you want to remove the service resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The ID of the zone. This parameter is required if the service resource is an ALB, a NLB, or a GWLB. Call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to get a zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-c</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DetachResourceFromVpcEndpointServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachResourceFromVpcEndpointServiceRequest self = new DetachResourceFromVpcEndpointServiceRequest();
        return TeaModel.build(map, self);
    }

    public DetachResourceFromVpcEndpointServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetachResourceFromVpcEndpointServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DetachResourceFromVpcEndpointServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachResourceFromVpcEndpointServiceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DetachResourceFromVpcEndpointServiceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DetachResourceFromVpcEndpointServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DetachResourceFromVpcEndpointServiceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
