// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIJobList")
    @Validation(required = true)
    public SubmitAIJobResponseAIJobList AIJobList;

    public static SubmitAIJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIJobResponse self = new SubmitAIJobResponse();
        return TeaModel.build(map, self);
    }

    public static class SubmitAIJobResponseAIJobListAIJob extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        public static SubmitAIJobResponseAIJobListAIJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIJobResponseAIJobListAIJob self = new SubmitAIJobResponseAIJobListAIJob();
            return TeaModel.build(map, self);
        }

    }

    public static class SubmitAIJobResponseAIJobList extends TeaModel {
        @NameInMap("AIJob")
        @Validation(required = true)
        public java.util.List<SubmitAIJobResponseAIJobListAIJob> AIJob;

        public static SubmitAIJobResponseAIJobList build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIJobResponseAIJobList self = new SubmitAIJobResponseAIJobList();
            return TeaModel.build(map, self);
        }

    }

}
