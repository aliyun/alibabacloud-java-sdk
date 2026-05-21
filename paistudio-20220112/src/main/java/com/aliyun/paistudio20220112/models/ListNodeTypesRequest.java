// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListNodeTypesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>GPU</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    /**
     * <strong>example:</strong>
     * <p>A10</p>
     */
    @NameInMap("GPUType")
    public String GPUType;

    /**
     * <strong>example:</strong>
     * <p>ecs.c6.large,ecs.gn7i-c32g1.8xlarge</p>
     */
    @NameInMap("NodeTypes")
    public String nodeTypes;

    /**
     * <strong>example:</strong>
     * <p>quota123</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <strong>example:</strong>
     * <p>rg123,rg456</p>
     */
    @NameInMap("ResourceGroupIds")
    public String resourceGroupIds;

    public static ListNodeTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeTypesRequest self = new ListNodeTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeTypesRequest setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public ListNodeTypesRequest setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public ListNodeTypesRequest setNodeTypes(String nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }
    public String getNodeTypes() {
        return this.nodeTypes;
    }

    public ListNodeTypesRequest setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public ListNodeTypesRequest setResourceGroupIds(String resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public String getResourceGroupIds() {
        return this.resourceGroupIds;
    }

}
