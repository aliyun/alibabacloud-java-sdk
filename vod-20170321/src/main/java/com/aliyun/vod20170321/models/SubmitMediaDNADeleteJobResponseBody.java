// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitMediaDNADeleteJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>6805B2EC-CE87-****-8FF6-9C0E97719A26</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>e5b1a2e7bee******b632c2710b9423f</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitMediaDNADeleteJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaDNADeleteJobResponseBody self = new SubmitMediaDNADeleteJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitMediaDNADeleteJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitMediaDNADeleteJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
