// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAICaptionExtractionJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAICaptionExtractionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAICaptionExtractionJobResponseBody self = new SubmitAICaptionExtractionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAICaptionExtractionJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitAICaptionExtractionJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
