// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitPreprocessJobsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PreprocessJobs")
    @Validation(required = true)
    public SubmitPreprocessJobsResponsePreprocessJobs preprocessJobs;

    public static SubmitPreprocessJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitPreprocessJobsResponse self = new SubmitPreprocessJobsResponse();
        return TeaModel.build(map, self);
    }

    public static class SubmitPreprocessJobsResponsePreprocessJobsPreprocessJob extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        public static SubmitPreprocessJobsResponsePreprocessJobsPreprocessJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitPreprocessJobsResponsePreprocessJobsPreprocessJob self = new SubmitPreprocessJobsResponsePreprocessJobsPreprocessJob();
            return TeaModel.build(map, self);
        }

    }

    public static class SubmitPreprocessJobsResponsePreprocessJobs extends TeaModel {
        @NameInMap("PreprocessJob")
        @Validation(required = true)
        public java.util.List<SubmitPreprocessJobsResponsePreprocessJobsPreprocessJob> preprocessJob;

        public static SubmitPreprocessJobsResponsePreprocessJobs build(java.util.Map<String, ?> map) throws Exception {
            SubmitPreprocessJobsResponsePreprocessJobs self = new SubmitPreprocessJobsResponsePreprocessJobs();
            return TeaModel.build(map, self);
        }

    }

}
