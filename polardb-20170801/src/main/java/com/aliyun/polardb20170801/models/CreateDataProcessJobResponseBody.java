// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDataProcessJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the created data processing task.</p>
     * 
     * <strong>example:</strong>
     * <p>job-123456</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataProcessJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataProcessJobResponseBody self = new CreateDataProcessJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataProcessJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateDataProcessJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
