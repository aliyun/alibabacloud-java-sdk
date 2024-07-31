// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudServerRegionsRequest extends TeaModel {
    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-5yd****7009</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The code of the region.</p>
     * <blockquote>
     * <p> This parameter is required if you set RegionType to region. The value is the code of the city.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>410</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the region. Valid values:</p>
     * <ul>
     * <li><strong>operator</strong>: the ISP.</li>
     * <li><strong>continents</strong>: the continent.</li>
     * <li><strong>region</strong>: the city.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>region</p>
     */
    @NameInMap("RegionType")
    public String regionType;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DescribeHybridCloudServerRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudServerRegionsRequest self = new DescribeHybridCloudServerRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudServerRegionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHybridCloudServerRegionsRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public DescribeHybridCloudServerRegionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHybridCloudServerRegionsRequest setRegionType(String regionType) {
        this.regionType = regionType;
        return this;
    }
    public String getRegionType() {
        return this.regionType;
    }

    public DescribeHybridCloudServerRegionsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
