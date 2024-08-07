// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIJobResponseBody extends TeaModel {
    /**
     * <p>The information about the AI jobs.</p>
     */
    @NameInMap("AIJobList")
    public SubmitAIJobResponseBodyAIJobList AIJobList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-BEF6-D73936****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIJobResponseBody self = new SubmitAIJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIJobResponseBody setAIJobList(SubmitAIJobResponseBodyAIJobList AIJobList) {
        this.AIJobList = AIJobList;
        return this;
    }
    public SubmitAIJobResponseBodyAIJobList getAIJobList() {
        return this.AIJobList;
    }

    public SubmitAIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitAIJobResponseBodyAIJobListAIJob extends TeaModel {
        /**
         * <p>The ID of the AI job.</p>
         * 
         * <strong>example:</strong>
         * <p>9e82640c85114bf5af23edfaf****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The ID of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>3D3D12340d92c641401fab46a0b847****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The type of the AI job. Valid values:</p>
         * <ul>
         * <li><strong>AIMediaDNA</strong>: The media fingerprinting job.</li>
         * <li><strong>AIVideoTag</strong>: The smart tagging job.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AIVideoTag</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitAIJobResponseBodyAIJobListAIJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAIJobResponseBodyAIJobListAIJob self = new SubmitAIJobResponseBodyAIJobListAIJob();
            return TeaModel.build(map, self);
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

        public SubmitAIJobResponseBodyAIJobListAIJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
