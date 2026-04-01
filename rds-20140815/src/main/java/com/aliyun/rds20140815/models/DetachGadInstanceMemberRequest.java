// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DetachGadInstanceMemberRequest extends TeaModel {
    /**
     * <p>The ID of the global active database cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gad-rm-bp1npi2j8********</p>
     */
    @NameInMap("GadInstanceName")
    public String gadInstanceName;

    /**
     * <p>The ID of the instance that serves as the unit node you want to remove. You can call the DescribeGadInstances query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1npi2j8********</p>
     */
    @NameInMap("MemberInstanceName")
    public String memberInstanceName;

    /**
     * <p>The region ID of the central node. You can call the DescribeGadInstances operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. You can call the DescribeDBInstanceAttribute operation to query the resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DetachGadInstanceMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachGadInstanceMemberRequest self = new DetachGadInstanceMemberRequest();
        return TeaModel.build(map, self);
    }

    public DetachGadInstanceMemberRequest setGadInstanceName(String gadInstanceName) {
        this.gadInstanceName = gadInstanceName;
        return this;
    }
    public String getGadInstanceName() {
        return this.gadInstanceName;
    }

    public DetachGadInstanceMemberRequest setMemberInstanceName(String memberInstanceName) {
        this.memberInstanceName = memberInstanceName;
        return this;
    }
    public String getMemberInstanceName() {
        return this.memberInstanceName;
    }

    public DetachGadInstanceMemberRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachGadInstanceMemberRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
