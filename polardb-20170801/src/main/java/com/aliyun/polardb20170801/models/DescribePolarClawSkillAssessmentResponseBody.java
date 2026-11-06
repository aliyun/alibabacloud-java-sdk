// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawSkillAssessmentResponseBody extends TeaModel {
    /**
     * <p>The assessment result.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;zhReportContent&quot;:&quot;# Skill Security Assessment Report\n\n&gt; <strong>Risk Level:</strong> ...}</p>
     */
    @NameInMap("AssessmentResult")
    public String assessmentResult;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePolarClawSkillAssessmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawSkillAssessmentResponseBody self = new DescribePolarClawSkillAssessmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawSkillAssessmentResponseBody setAssessmentResult(String assessmentResult) {
        this.assessmentResult = assessmentResult;
        return this;
    }
    public String getAssessmentResult() {
        return this.assessmentResult;
    }

    public DescribePolarClawSkillAssessmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
