// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class CreateJobPlanResponseBody extends TeaModel {
    @NameInMap("JobPlanId")
    public String jobPlanId;

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
