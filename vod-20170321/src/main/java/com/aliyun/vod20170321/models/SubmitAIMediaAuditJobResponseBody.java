// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIMediaAuditJobResponseBody extends TeaModel {
    // The ID of the task.
    @NameInMap("JobId")
    public String jobId;

    // The ID of the video.
    @NameInMap("MediaId")
    public String mediaId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAIMediaAuditJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIMediaAuditJobResponseBody self = new SubmitAIMediaAuditJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIMediaAuditJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitAIMediaAuditJobResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitAIMediaAuditJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
