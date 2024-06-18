// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteGadInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the global active database cluster. You can call the GadInstanceName operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gad-rm-bp1npi2j8********</p>
     */
    @NameInMap("GadInstanceName")
    public String gadInstanceName;

    /**
     * <p>The region ID of the central node of the global active database cluster. The central node refers to the primary node. You can call the DescribeGadInstances operation to query the region ID.</p>
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

    public static DeleteGadInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGadInstanceRequest self = new DeleteGadInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGadInstanceRequest setGadInstanceName(String gadInstanceName) {
        this.gadInstanceName = gadInstanceName;
        return this;
    }
    public String getGadInstanceName() {
        return this.gadInstanceName;
    }

    public DeleteGadInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteGadInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
