// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteGadInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the global active database cluster. You can call the [DescribeGadInstances](~~330105~~) operation to query the IDs of global active database clusters.</p>
     */
    @NameInMap("GadInstanceName")
    public String gadInstanceName;

    /**
     * <p>The region ID of the central node of the global active database cluster. You can call the [DescribeGadInstances](~~330105~~) operation to query the region IDs of global active database clusters.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
