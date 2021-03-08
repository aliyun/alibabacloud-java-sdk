// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitMediaDNADeleteJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("JobId")
    public String jobId;

    public static SubmitMediaDNADeleteJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaDNADeleteJobResponseBody self = new SubmitMediaDNADeleteJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitMediaDNADeleteJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitMediaDNADeleteJobResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitMediaDNADeleteJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
