// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class SuspendWorkflowInstanceRequest extends TeaModel {
    @NameInMap("suspendWorkflowInstanceParam")
    public SuspendWorkflowInstanceParam suspendWorkflowInstanceParam;

    public static SuspendWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendWorkflowInstanceRequest self = new SuspendWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SuspendWorkflowInstanceRequest setSuspendWorkflowInstanceParam(SuspendWorkflowInstanceParam suspendWorkflowInstanceParam) {
        this.suspendWorkflowInstanceParam = suspendWorkflowInstanceParam;
        return this;
    }
    public SuspendWorkflowInstanceParam getSuspendWorkflowInstanceParam() {
        return this.suspendWorkflowInstanceParam;
    }

}
