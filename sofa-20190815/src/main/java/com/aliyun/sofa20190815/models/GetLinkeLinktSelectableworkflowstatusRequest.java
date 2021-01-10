// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktSelectableworkflowstatusRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("WorkflowId")
    public String workflowId;

    public static GetLinkeLinktSelectableworkflowstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktSelectableworkflowstatusRequest self = new GetLinkeLinktSelectableworkflowstatusRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktSelectableworkflowstatusRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public GetLinkeLinktSelectableworkflowstatusRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
