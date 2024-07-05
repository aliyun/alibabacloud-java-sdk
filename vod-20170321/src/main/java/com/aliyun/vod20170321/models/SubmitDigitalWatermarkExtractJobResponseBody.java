// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDigitalWatermarkExtractJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the watermark extraction job.</p>
     * 
     * <strong>example:</strong>
     * <p>ad90a501b1b9472374ad005046****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-****-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitDigitalWatermarkExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDigitalWatermarkExtractJobResponseBody self = new SubmitDigitalWatermarkExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDigitalWatermarkExtractJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitDigitalWatermarkExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
