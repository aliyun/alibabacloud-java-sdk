// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RollbackWorkflowInstanceRequest extends TeaModel {
    @NameInMap("rollbackWorkflowInstanceParam")
    public RollbackWorkflowInstanceParam rollbackWorkflowInstanceParam;

    public static RollbackWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackWorkflowInstanceRequest self = new RollbackWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RollbackWorkflowInstanceRequest setRollbackWorkflowInstanceParam(RollbackWorkflowInstanceParam rollbackWorkflowInstanceParam) {
        this.rollbackWorkflowInstanceParam = rollbackWorkflowInstanceParam;
        return this;
    }
    public RollbackWorkflowInstanceParam getRollbackWorkflowInstanceParam() {
        return this.rollbackWorkflowInstanceParam;
    }

}
