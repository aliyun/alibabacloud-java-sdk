// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class TerminateWorkflowInstanceRequest extends TeaModel {
    @NameInMap("terminateWorkflowInstanceParam")
    public TerminateWorkflowInstanceParam terminateWorkflowInstanceParam;

    public static TerminateWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateWorkflowInstanceRequest self = new TerminateWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public TerminateWorkflowInstanceRequest setTerminateWorkflowInstanceParam(TerminateWorkflowInstanceParam terminateWorkflowInstanceParam) {
        this.terminateWorkflowInstanceParam = terminateWorkflowInstanceParam;
        return this;
    }
    public TerminateWorkflowInstanceParam getTerminateWorkflowInstanceParam() {
        return this.terminateWorkflowInstanceParam;
    }

}
