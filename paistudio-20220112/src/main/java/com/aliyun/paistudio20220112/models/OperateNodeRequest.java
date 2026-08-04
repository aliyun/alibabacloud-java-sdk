// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class OperateNodeRequest extends TeaModel {
    /**
     * <p>The operation to perform.</p>
     * <ul>
     * <li><p>Cordon: Disables scheduling on the node.</p>
     * </li>
     * <li><p>Uncordon: Enables scheduling on the node.</p>
     * </li>
     * <li><p>Drain: Evicts pods from the node.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cordon</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The parameter settings for the node operation.</p>
     */
    @NameInMap("OperationParameters")
    public NodeOperationParameters operationParameters;

    /**
     * <p>The ID of the resource group that contains the node.</p>
     * 
     * <strong>example:</strong>
     * <p>rgaekzbrflewn6jjq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static OperateNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateNodeRequest self = new OperateNodeRequest();
        return TeaModel.build(map, self);
    }

    public OperateNodeRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public OperateNodeRequest setOperationParameters(NodeOperationParameters operationParameters) {
        this.operationParameters = operationParameters;
        return this;
    }
    public NodeOperationParameters getOperationParameters() {
        return this.operationParameters;
    }

    public OperateNodeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
