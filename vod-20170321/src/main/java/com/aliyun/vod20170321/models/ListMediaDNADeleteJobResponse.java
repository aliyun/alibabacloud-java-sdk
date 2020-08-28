// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListMediaDNADeleteJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AIJobList")
    @Validation(required = true)
    public ListMediaDNADeleteJobResponseAIJobList AIJobList;

    @NameInMap("NonExistAIJobIds")
    @Validation(required = true)
    public ListMediaDNADeleteJobResponseNonExistAIJobIds nonExistAIJobIds;

    public static ListMediaDNADeleteJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaDNADeleteJobResponse self = new ListMediaDNADeleteJobResponse();
        return TeaModel.build(map, self);
    }

    public static class ListMediaDNADeleteJobResponseAIJobListAIJob extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

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

        @NameInMap("FpDBId")
        @Validation(required = true)
        public String fpDBId;

        public static ListMediaDNADeleteJobResponseAIJobListAIJob build(java.util.Map<String, ?> map) throws Exception {
            ListMediaDNADeleteJobResponseAIJobListAIJob self = new ListMediaDNADeleteJobResponseAIJobListAIJob();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMediaDNADeleteJobResponseAIJobList extends TeaModel {
        @NameInMap("AIJob")
        @Validation(required = true)
        public java.util.List<ListMediaDNADeleteJobResponseAIJobListAIJob> AIJob;

        public static ListMediaDNADeleteJobResponseAIJobList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaDNADeleteJobResponseAIJobList self = new ListMediaDNADeleteJobResponseAIJobList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMediaDNADeleteJobResponseNonExistAIJobIds extends TeaModel {
        @NameInMap("String")
        @Validation(required = true)
        public java.util.List<String> string;

        public static ListMediaDNADeleteJobResponseNonExistAIJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListMediaDNADeleteJobResponseNonExistAIJobIds self = new ListMediaDNADeleteJobResponseNonExistAIJobIds();
            return TeaModel.build(map, self);
        }

    }

}
