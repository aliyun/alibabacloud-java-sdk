// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RollbackWorkflowInstanceShrinkRequest extends TeaModel {
    @NameInMap("rollbackWorkflowInstanceParam")
    public String rollbackWorkflowInstanceParamShrink;

    public static RollbackWorkflowInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackWorkflowInstanceShrinkRequest self = new RollbackWorkflowInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RollbackWorkflowInstanceShrinkRequest setRollbackWorkflowInstanceParamShrink(String rollbackWorkflowInstanceParamShrink) {
        this.rollbackWorkflowInstanceParamShrink = rollbackWorkflowInstanceParamShrink;
        return this;
    }
    public String getRollbackWorkflowInstanceParamShrink() {
        return this.rollbackWorkflowInstanceParamShrink;
    }

}
