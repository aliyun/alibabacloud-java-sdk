// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDNAInitializationJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitDNAInitializationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDNAInitializationJobResponseBody self = new SubmitDNAInitializationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDNAInitializationJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitDNAInitializationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
