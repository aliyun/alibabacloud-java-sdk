// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIJobList")
    @Validation(required = true)
    public ListAIJobResponseAIJobList AIJobList;

    @NameInMap("NonExistAIJobIds")
    @Validation(required = true)
    public ListAIJobResponseNonExistAIJobIds nonExistAIJobIds;

    public static ListAIJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIJobResponse self = new ListAIJobResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAIJobResponseAIJobListAIJob extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

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

        @NameInMap("CompleteTime")
        @Validation(required = true)
        public String completeTime;

        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        public static ListAIJobResponseAIJobListAIJob build(java.util.Map<String, ?> map) throws Exception {
            ListAIJobResponseAIJobListAIJob self = new ListAIJobResponseAIJobListAIJob();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIJobResponseAIJobList extends TeaModel {
        @NameInMap("AIJob")
        @Validation(required = true)
        public java.util.List<ListAIJobResponseAIJobListAIJob> AIJob;

        public static ListAIJobResponseAIJobList build(java.util.Map<String, ?> map) throws Exception {
            ListAIJobResponseAIJobList self = new ListAIJobResponseAIJobList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAIJobResponseNonExistAIJobIds extends TeaModel {
        @NameInMap("String")
        @Validation(required = true)
        public java.util.List<String> string;

        public static ListAIJobResponseNonExistAIJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListAIJobResponseNonExistAIJobIds self = new ListAIJobResponseNonExistAIJobIds();
            return TeaModel.build(map, self);
        }

    }

}
