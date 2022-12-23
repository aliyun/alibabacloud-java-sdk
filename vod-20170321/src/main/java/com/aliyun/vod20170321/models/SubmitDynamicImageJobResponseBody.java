// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobResponseBody extends TeaModel {
    // The information about the animated image job.
    @NameInMap("DynamicImageJob")
    public SubmitDynamicImageJobResponseBodyDynamicImageJob dynamicImageJob;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitDynamicImageJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDynamicImageJobResponseBody self = new SubmitDynamicImageJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDynamicImageJobResponseBody setDynamicImageJob(SubmitDynamicImageJobResponseBodyDynamicImageJob dynamicImageJob) {
        this.dynamicImageJob = dynamicImageJob;
        return this;
    }
    public SubmitDynamicImageJobResponseBodyDynamicImageJob getDynamicImageJob() {
        return this.dynamicImageJob;
    }

    public SubmitDynamicImageJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitDynamicImageJobResponseBodyDynamicImageJob extends TeaModel {
        // The ID of the animated image job.
        @NameInMap("JobId")
        public String jobId;

        public static SubmitDynamicImageJobResponseBodyDynamicImageJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitDynamicImageJobResponseBodyDynamicImageJob self = new SubmitDynamicImageJobResponseBodyDynamicImageJob();
            return TeaModel.build(map, self);
        }

        public SubmitDynamicImageJobResponseBodyDynamicImageJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
