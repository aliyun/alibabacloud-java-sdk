// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktWorkflowRequest extends TeaModel {
    @NameInMap("WorkflowId")
    public String workflowId;

    public static GetLinkeLinktWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktWorkflowRequest self = new GetLinkeLinktWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktWorkflowRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
