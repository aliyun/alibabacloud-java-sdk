// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RemoveSuspendPointOnWorkflowInstanceRequest extends TeaModel {
    @NameInMap("removeSuspendPointOnWorkflowInstanceParam")
    public RemoveSuspendPointOnWorkflowInstanceParam removeSuspendPointOnWorkflowInstanceParam;

    public static RemoveSuspendPointOnWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSuspendPointOnWorkflowInstanceRequest self = new RemoveSuspendPointOnWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSuspendPointOnWorkflowInstanceRequest setRemoveSuspendPointOnWorkflowInstanceParam(RemoveSuspendPointOnWorkflowInstanceParam removeSuspendPointOnWorkflowInstanceParam) {
        this.removeSuspendPointOnWorkflowInstanceParam = removeSuspendPointOnWorkflowInstanceParam;
        return this;
    }
    public RemoveSuspendPointOnWorkflowInstanceParam getRemoveSuspendPointOnWorkflowInstanceParam() {
        return this.removeSuspendPointOnWorkflowInstanceParam;
    }

}
