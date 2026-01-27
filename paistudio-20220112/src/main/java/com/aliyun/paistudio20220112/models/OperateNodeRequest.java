// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class OperateNodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cordon</p>
     */
    @NameInMap("Operation")
    public String operation;

    @NameInMap("OperationParameters")
    public NodeOperationParameters operationParameters;

    /**
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
