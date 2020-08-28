// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SnapshotJob")
    @Validation(required = true)
    public SubmitSnapshotJobResponseSnapshotJob snapshotJob;

    public static SubmitSnapshotJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSnapshotJobResponse self = new SubmitSnapshotJobResponse();
        return TeaModel.build(map, self);
    }

    public static class SubmitSnapshotJobResponseSnapshotJob extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        public static SubmitSnapshotJobResponseSnapshotJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobResponseSnapshotJob self = new SubmitSnapshotJobResponseSnapshotJob();
            return TeaModel.build(map, self);
        }

    }

}
