// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktSwapworkflowstatuspositionRequest extends TeaModel {
    @NameInMap("WorkflowStatusId1")
    public String workflowStatusId1;

    @NameInMap("WorkflowStatusId2")
    public String workflowStatusId2;

    public static ExecLinkeLinktSwapworkflowstatuspositionRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktSwapworkflowstatuspositionRequest self = new ExecLinkeLinktSwapworkflowstatuspositionRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktSwapworkflowstatuspositionRequest setWorkflowStatusId1(String workflowStatusId1) {
        this.workflowStatusId1 = workflowStatusId1;
        return this;
    }
    public String getWorkflowStatusId1() {
        return this.workflowStatusId1;
    }

    public ExecLinkeLinktSwapworkflowstatuspositionRequest setWorkflowStatusId2(String workflowStatusId2) {
        this.workflowStatusId2 = workflowStatusId2;
        return this;
    }
    public String getWorkflowStatusId2() {
        return this.workflowStatusId2;
    }

}
