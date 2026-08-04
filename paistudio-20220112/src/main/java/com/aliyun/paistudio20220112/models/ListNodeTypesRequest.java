// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListNodeTypesRequest extends TeaModel {
    /**
     * <p>The accelerator type used to filter the results. Valid values: <code>CPU</code> and <code>GPU</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>GPU</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    /**
     * <p>The GPU type used to filter the results. Fuzzy matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>A10</p>
     */
    @NameInMap("GPUType")
    public String GPUType;

    /**
     * <p>A comma-separated list of node types. If omitted, all node types are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.large,ecs.gn7i-c32g1.8xlarge</p>
     */
    @NameInMap("NodeTypes")
    public String nodeTypes;

    /**
     * <p>The quota ID. You must specify either this parameter or <code>ResourceGroupIds</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>quota123</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>A comma-separated list of resource group IDs. You must specify either this parameter or <code>QuotaId</code>. The <code>UserId</code> for the specified <code>ResourceGroupId</code> must match the <code>UserId</code> of the requesting user. All specified <code>resource group</code> instances must be of the same type and associated with the same Virtual Private Cloud (VPC).</p>
     * 
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
