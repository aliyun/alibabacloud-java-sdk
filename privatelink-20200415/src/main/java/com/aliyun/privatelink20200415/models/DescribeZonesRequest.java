// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    /**
     * <p>Specifies whether this is a cross-region scenario. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossRegion")
    public Boolean crossRegion;

    /**
     * <p>Specifies whether to query the active zones for the initiator side or the service side in a cross-region connection. Valid values:</p>
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
     * <p>The ID of the region where the zones reside. You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The zones supported by PrivateLink in a region depend on the backend service resource type. You can specify the service resource type when querying the zones supported by PrivateLink. Valid values:</p>
     * <ul>
     * <li><strong>slb</strong> (default): Classic Load Balancer (CLB), the service resource type is classic load balancing.</li>
     * <li><strong>alb</strong>: Application Load Balancer (ALB), the service resource type is application load balancing.</li>
     * <li><strong>nlb</strong>: Network Load Balancer (NLB), the service resource type is network load balancing.</li>
     * <li><strong>gwlb</strong>: Gateway Load Balancer (GWLB), the service resource type is gateway load balancing.</li>
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
