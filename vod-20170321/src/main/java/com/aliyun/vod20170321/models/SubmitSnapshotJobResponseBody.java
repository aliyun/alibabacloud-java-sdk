// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the snapshot job.</p>
     */
    @NameInMap("SnapshotJob")
    public SubmitSnapshotJobResponseBodySnapshotJob snapshotJob;

    public static SubmitSnapshotJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSnapshotJobResponseBody self = new SubmitSnapshotJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSnapshotJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSnapshotJobResponseBody setSnapshotJob(SubmitSnapshotJobResponseBodySnapshotJob snapshotJob) {
        this.snapshotJob = snapshotJob;
        return this;
    }
    public SubmitSnapshotJobResponseBodySnapshotJob getSnapshotJob() {
        return this.snapshotJob;
    }

    public static class SubmitSnapshotJobResponseBodySnapshotJob extends TeaModel {
        /**
         * <p>The ID of the snapshot job.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static SubmitSnapshotJobResponseBodySnapshotJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseBodySnapshotJob self = new SubmitSnapshotJobResponseBodySnapshotJob();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobResponseBodySnapshotJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
