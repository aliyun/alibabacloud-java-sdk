// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class UpdateJobResponseBody extends TeaModel {
    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc*************</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID, which is used for diagnostics and Q\&amp;A.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobResponseBody self = new UpdateJobResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
