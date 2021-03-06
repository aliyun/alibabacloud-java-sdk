// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AIJobList")
    public SubmitAIJobResponseBodyAIJobList AIJobList;

    public static SubmitAIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIJobResponseBody self = new SubmitAIJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAIJobResponseBody setAIJobList(SubmitAIJobResponseBodyAIJobList AIJobList) {
        this.AIJobList = AIJobList;
        return this;
    }
    public SubmitAIJobResponseBodyAIJobList getAIJobList() {
        return this.AIJobList;
    }

    public static class SubmitAIJobResponseBodyAIJobListAIJob extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MediaId")
        public String mediaId;

        public static SubmitAIJobResponseBodyAIJobListAIJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIJobResponseBodyAIJobListAIJob self = new SubmitAIJobResponseBodyAIJobListAIJob();
            return TeaModel.build(map, self);
        }

        public SubmitAIJobResponseBodyAIJobListAIJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitAIJobResponseBodyAIJobListAIJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitAIJobResponseBodyAIJobListAIJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

    public static class SubmitAIJobResponseBodyAIJobList extends TeaModel {
        @NameInMap("AIJob")
        public java.util.List<SubmitAIJobResponseBodyAIJobListAIJob> AIJob;

        public static SubmitAIJobResponseBodyAIJobList build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIJobResponseBodyAIJobList self = new SubmitAIJobResponseBodyAIJobList();
            return TeaModel.build(map, self);
        }

        public SubmitAIJobResponseBodyAIJobList setAIJob(java.util.List<SubmitAIJobResponseBodyAIJobListAIJob> AIJob) {
            this.AIJob = AIJob;
            return this;
        }
        public java.util.List<SubmitAIJobResponseBodyAIJobListAIJob> getAIJob() {
            return this.AIJob;
        }

    }

}
