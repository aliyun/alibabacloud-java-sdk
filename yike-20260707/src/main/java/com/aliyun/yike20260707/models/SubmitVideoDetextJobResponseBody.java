// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoDetextJobResponseBody extends TeaModel {
    /**
     * <p>The video text erasure job ID. You can use this ID to call GetVideoDetextJob to query the job status.</p>
     * 
     * <strong>example:</strong>
     * <p>vdt_0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID, which is used for Tracing Analysis and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>req-detext-20260820-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitVideoDetextJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoDetextJobResponseBody self = new SubmitVideoDetextJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVideoDetextJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitVideoDetextJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
