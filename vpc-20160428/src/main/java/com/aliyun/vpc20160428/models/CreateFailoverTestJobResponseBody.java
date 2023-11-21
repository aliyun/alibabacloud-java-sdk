// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateFailoverTestJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateFailoverTestJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFailoverTestJobResponseBody self = new CreateFailoverTestJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFailoverTestJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateFailoverTestJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
