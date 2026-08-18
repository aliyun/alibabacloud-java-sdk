// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    /**
     * <p>Specifies whether this is a cross-region scenario. Default value: false.</p>
     * <p>Set CrossRegion to true and use it together with CrossRegionSide in the following scenarios:</p>
     * <ul>
     * <li><p><strong>As a service consumer</strong>: You need to create a cross-region endpoint to connect to an endpoint service in another region. To query the zones in the current region that support cross-region endpoints, set CrossRegion to true and CrossRegionSide to Endpoint.</p>
     * </li>
     * <li><p><strong>As a service provider</strong>: You need to share your endpoint service across regions with service consumers in other regions. To query the zones in the current region that support cross-region sharing, set CrossRegion to true and CrossRegionSide to EndpointService.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossRegion")
    public Boolean crossRegion;

    /**
     * <p>Specifies whether to query the active zone support for the initiator side or the service side in a cross-region connection. Valid values:</p>
     * <ul>
     * <li><strong>Endpoint</strong> (default): endpoint.</li>
     * <li><strong>EndpointService</strong>: endpoint service.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when CrossRegion is set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>EndpointService</p>
     */
    @NameInMap("CrossRegionSide")
    public String crossRegionSide;

    /**
     * <p>The ID of the region where the zones reside. You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The zone availability of PrivateLink in a region depends on the backend EPS resource type. You can specify the EPS resource type when querying the list of zones supported by PrivateLink. Valid values:</p>
     * <ul>
     * <li><strong>slb</strong> (default): the EPS resource type is Classic Load Balancer (CLB).</li>
     * <li><strong>alb</strong>: the EPS resource type is Application Load Balancer (ALB).</li>
     * <li><strong>nlb</strong>: the EPS resource type is Network Load Balancer (NLB).</li>
     * <li><strong>gwlb</strong>: the EPS resource type is Gateway Load Balancer (GWLB).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>slb</p>
     */
    @NameInMap("ServiceResourceType")
    public String serviceResourceType;

    public static DescribeZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesRequest self = new DescribeZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeZonesRequest setCrossRegion(Boolean crossRegion) {
        this.crossRegion = crossRegion;
        return this;
    }
    public Boolean getCrossRegion() {
        return this.crossRegion;
    }

    public DescribeZonesRequest setCrossRegionSide(String crossRegionSide) {
        this.crossRegionSide = crossRegionSide;
        return this;
    }
    public String getCrossRegionSide() {
        return this.crossRegionSide;
    }

    public DescribeZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeZonesRequest setServiceResourceType(String serviceResourceType) {
        this.serviceResourceType = serviceResourceType;
        return this;
    }
    public String getServiceResourceType() {
        return this.serviceResourceType;
    }

}
