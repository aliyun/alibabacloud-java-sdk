// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListMediaDNADeleteJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NonExistAIJobIds")
    public ListMediaDNADeleteJobResponseBodyNonExistAIJobIds nonExistAIJobIds;

    @NameInMap("AIJobList")
    public ListMediaDNADeleteJobResponseBodyAIJobList AIJobList;

    public static ListMediaDNADeleteJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaDNADeleteJobResponseBody self = new ListMediaDNADeleteJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaDNADeleteJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMediaDNADeleteJobResponseBody setNonExistAIJobIds(ListMediaDNADeleteJobResponseBodyNonExistAIJobIds nonExistAIJobIds) {
        this.nonExistAIJobIds = nonExistAIJobIds;
        return this;
    }
    public ListMediaDNADeleteJobResponseBodyNonExistAIJobIds getNonExistAIJobIds() {
        return this.nonExistAIJobIds;
    }

    public ListMediaDNADeleteJobResponseBody setAIJobList(ListMediaDNADeleteJobResponseBodyAIJobList AIJobList) {
        this.AIJobList = AIJobList;
        return this;
    }
    public ListMediaDNADeleteJobResponseBodyAIJobList getAIJobList() {
        return this.AIJobList;
    }

    public static class ListMediaDNADeleteJobResponseBodyNonExistAIJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static ListMediaDNADeleteJobResponseBodyNonExistAIJobIds build(java.util.Map<String, ?> map) throws Exception {
            ListMediaDNADeleteJobResponseBodyNonExistAIJobIds self = new ListMediaDNADeleteJobResponseBodyNonExistAIJobIds();
            return TeaModel.build(map, self);
        }

        public ListMediaDNADeleteJobResponseBodyNonExistAIJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class ListMediaDNADeleteJobResponseBodyAIJobListAIJob extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("FpDBId")
        public String fpDBId;

        public static ListMediaDNADeleteJobResponseBodyAIJobListAIJob build(java.util.Map<String, ?> map) throws Exception {
            ListMediaDNADeleteJobResponseBodyAIJobListAIJob self = new ListMediaDNADeleteJobResponseBodyAIJobListAIJob();
            return TeaModel.build(map, self);
        }

        public ListMediaDNADeleteJobResponseBodyAIJobListAIJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMediaDNADeleteJobResponseBodyAIJobListAIJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListMediaDNADeleteJobResponseBodyAIJobListAIJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListMediaDNADeleteJobResponseBodyAIJobListAIJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListMediaDNADeleteJobResponseBodyAIJobListAIJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListMediaDNADeleteJobResponseBodyAIJobListAIJob setFpDBId(String fpDBId) {
            this.fpDBId = fpDBId;
            return this;
        }
        public String getFpDBId() {
            return this.fpDBId;
        }

    }

    public static class ListMediaDNADeleteJobResponseBodyAIJobList extends TeaModel {
        @NameInMap("AIJob")
        public java.util.List<ListMediaDNADeleteJobResponseBodyAIJobListAIJob> AIJob;

        public static ListMediaDNADeleteJobResponseBodyAIJobList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaDNADeleteJobResponseBodyAIJobList self = new ListMediaDNADeleteJobResponseBodyAIJobList();
            return TeaModel.build(map, self);
        }

        public ListMediaDNADeleteJobResponseBodyAIJobList setAIJob(java.util.List<ListMediaDNADeleteJobResponseBodyAIJobListAIJob> AIJob) {
            this.AIJob = AIJob;
            return this;
        }
        public java.util.List<ListMediaDNADeleteJobResponseBodyAIJobListAIJob> getAIJob() {
            return this.AIJob;
        }

    }

}
