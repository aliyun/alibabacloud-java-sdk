// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListNodePodsRequest extends TeaModel {
    /**
     * <p>The GPU index number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GPUIndexes")
    public String GPUIndexes;

    /**
     * <p>The resource type used by the pod.</p>
     * 
     * <strong>example:</strong>
     * <p>ForceQuotaOversold</p>
     */
    @NameInMap("OversoldTypes")
    public String oversoldTypes;

    /**
     * <p>The ID of the resource group to which the node belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lingj19q90jp66nq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListNodePodsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodePodsRequest self = new ListNodePodsRequest();
        return TeaModel.build(map, self);
    }

    public ListNodePodsRequest setGPUIndexes(String GPUIndexes) {
        this.GPUIndexes = GPUIndexes;
        return this;
    }
    public String getGPUIndexes() {
        return this.GPUIndexes;
    }

    public ListNodePodsRequest setOversoldTypes(String oversoldTypes) {
        this.oversoldTypes = oversoldTypes;
        return this;
    }
    public String getOversoldTypes() {
        return this.oversoldTypes;
    }

    public ListNodePodsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
