// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class SubmitSparkJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    public static SubmitSparkJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkJobResponse self = new SubmitSparkJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSparkJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSparkJobResponse setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
