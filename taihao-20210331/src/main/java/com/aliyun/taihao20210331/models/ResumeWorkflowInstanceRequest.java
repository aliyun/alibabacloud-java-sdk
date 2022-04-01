// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ResumeWorkflowInstanceRequest extends TeaModel {
    @NameInMap("resumeWorkflowInstanceParam")
    public ResumeWorkflowInstanceParam resumeWorkflowInstanceParam;

    public static ResumeWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeWorkflowInstanceRequest self = new ResumeWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ResumeWorkflowInstanceRequest setResumeWorkflowInstanceParam(ResumeWorkflowInstanceParam resumeWorkflowInstanceParam) {
        this.resumeWorkflowInstanceParam = resumeWorkflowInstanceParam;
        return this;
    }
    public ResumeWorkflowInstanceParam getResumeWorkflowInstanceParam() {
        return this.resumeWorkflowInstanceParam;
    }

}
