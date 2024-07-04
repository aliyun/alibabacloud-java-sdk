// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobSanityCheckResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dlc-20210126170216-xxxxxx</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>B3789344-F1xxxBE-5xx2-A04D-xxxxx</p>
     */
    @NameInMap("RequestID")
    public String requestID;

    @NameInMap("SanityCheckResult")
    public java.util.List<SanityCheckResultItem> sanityCheckResult;

    public static GetJobSanityCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobSanityCheckResultResponseBody self = new GetJobSanityCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobSanityCheckResultResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetJobSanityCheckResultResponseBody setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    public String getRequestID() {
        return this.requestID;
    }

    public GetJobSanityCheckResultResponseBody setSanityCheckResult(java.util.List<SanityCheckResultItem> sanityCheckResult) {
        this.sanityCheckResult = sanityCheckResult;
        return this;
    }
    public java.util.List<SanityCheckResultItem> getSanityCheckResult() {
        return this.sanityCheckResult;
    }

}
