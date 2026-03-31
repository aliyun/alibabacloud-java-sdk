// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceOwnerUidRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn********60f</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a.com-waf,b.com-waf</p>
     */
    @NameInMap("ResourceNames")
    public String resourceNames;

    public static DescribeDefenseResourceOwnerUidRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceOwnerUidRequest self = new DescribeDefenseResourceOwnerUidRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceOwnerUidRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDefenseResourceOwnerUidRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDefenseResourceOwnerUidRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeDefenseResourceOwnerUidRequest setResourceNames(String resourceNames) {
        this.resourceNames = resourceNames;
        return this;
    }
    public String getResourceNames() {
        return this.resourceNames;
    }

}
