// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The regions in which PrivateLink is available vary based on the service resource type. When you query the regions in which PrivateLink is available, you can specify a service resource type. Valid values:</p>
     * <ul>
     * <li><p><strong>slb</strong> (default): indicates that the service resource type is Classic Load Balancer (CLB).</p>
     * </li>
     * <li><p><strong>alb</strong>: indicates that the service resource type is Application Load Balancer (ALB).</p>
     * </li>
     * <li><p><strong>nlb</strong>: indicates that the service resource type is Network Load Balancer (NLB).</p>
     * </li>
     * <li><p><strong>gwlb</strong>: indicates that the service resource type is Gateway Load Balancer (GWLB).</p>
     * </li>
     * <li><p><strong>ALL</strong>: indicates all of the preceding service resource types.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>slb</p>
     */
    @NameInMap("ServiceResourceType")
    public String serviceResourceType;

    public static DescribeRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsRequest self = new DescribeRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRegionsRequest setServiceResourceType(String serviceResourceType) {
        this.serviceResourceType = serviceResourceType;
        return this;
    }
    public String getServiceResourceType() {
        return this.serviceResourceType;
    }

}
