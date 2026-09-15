// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class CancelGenerationJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ag_77b5f78b***</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Canceled</p>
     */
    @NameInMap("Status")
    public String status;

    public static CancelGenerationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelGenerationJobResponseBody self = new CancelGenerationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelGenerationJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CancelGenerationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelGenerationJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
