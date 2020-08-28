// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TranscodeTaskId")
    @Validation(required = true)
    public String transcodeTaskId;

    @NameInMap("TranscodeJobs")
    @Validation(required = true)
    public SubmitTranscodeJobsResponseTranscodeJobs transcodeJobs;

    public static SubmitTranscodeJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranscodeJobsResponse self = new SubmitTranscodeJobsResponse();
        return TeaModel.build(map, self);
    }

    public static class SubmitTranscodeJobsResponseTranscodeJobsTranscodeJob extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        public static SubmitTranscodeJobsResponseTranscodeJobsTranscodeJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobsResponseTranscodeJobsTranscodeJob self = new SubmitTranscodeJobsResponseTranscodeJobsTranscodeJob();
            return TeaModel.build(map, self);
        }

    }

    public static class SubmitTranscodeJobsResponseTranscodeJobs extends TeaModel {
        @NameInMap("TranscodeJob")
        @Validation(required = true)
        public java.util.List<SubmitTranscodeJobsResponseTranscodeJobsTranscodeJob> transcodeJob;

        public static SubmitTranscodeJobsResponseTranscodeJobs build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranscodeJobsResponseTranscodeJobs self = new SubmitTranscodeJobsResponseTranscodeJobs();
            return TeaModel.build(map, self);
        }

    }

}
