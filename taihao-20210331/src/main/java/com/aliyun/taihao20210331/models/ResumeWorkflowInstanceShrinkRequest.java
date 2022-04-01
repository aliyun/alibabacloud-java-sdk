// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ResumeWorkflowInstanceShrinkRequest extends TeaModel {
    @NameInMap("resumeWorkflowInstanceParam")
    public String resumeWorkflowInstanceParamShrink;

    public static ResumeWorkflowInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeWorkflowInstanceShrinkRequest self = new ResumeWorkflowInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ResumeWorkflowInstanceShrinkRequest setResumeWorkflowInstanceParamShrink(String resumeWorkflowInstanceParamShrink) {
        this.resumeWorkflowInstanceParamShrink = resumeWorkflowInstanceParamShrink;
        return this;
    }
    public String getResumeWorkflowInstanceParamShrink() {
        return this.resumeWorkflowInstanceParamShrink;
    }

}
