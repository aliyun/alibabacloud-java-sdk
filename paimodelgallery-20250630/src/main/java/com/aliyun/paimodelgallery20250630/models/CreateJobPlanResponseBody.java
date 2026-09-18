// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class CreateJobPlanResponseBody extends TeaModel {
    /**
     * <p>The job plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>jp-xxxxxx</p>
     */
    @NameInMap("JobPlanId")
    public String jobPlanId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82-9624-EC2B1779848E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateJobPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJobPlanResponseBody self = new CreateJobPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJobPlanResponseBody setJobPlanId(String jobPlanId) {
        this.jobPlanId = jobPlanId;
        return this;
    }
    public String getJobPlanId() {
        return this.jobPlanId;
    }

    public CreateJobPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
