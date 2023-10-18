// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UploadMediaByURLResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the upload job.</p>
     */
    @NameInMap("UploadJobs")
    public java.util.List<UploadMediaByURLResponseBodyUploadJobs> uploadJobs;

    public static UploadMediaByURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadMediaByURLResponseBody self = new UploadMediaByURLResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadMediaByURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadMediaByURLResponseBody setUploadJobs(java.util.List<UploadMediaByURLResponseBodyUploadJobs> uploadJobs) {
        this.uploadJobs = uploadJobs;
        return this;
    }
    public java.util.List<UploadMediaByURLResponseBodyUploadJobs> getUploadJobs() {
        return this.uploadJobs;
    }

    public static class UploadMediaByURLResponseBodyUploadJobs extends TeaModel {
        /**
         * <p>The ID of the upload job.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The URL of the source file that is uploaded in the upload job.</p>
         */
        @NameInMap("SourceURL")
        public String sourceURL;

        public static UploadMediaByURLResponseBodyUploadJobs build(java.util.Map<String, ?> map) throws Exception {
            UploadMediaByURLResponseBodyUploadJobs self = new UploadMediaByURLResponseBodyUploadJobs();
            return TeaModel.build(map, self);
        }

        public UploadMediaByURLResponseBodyUploadJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public UploadMediaByURLResponseBodyUploadJobs setSourceURL(String sourceURL) {
            this.sourceURL = sourceURL;
            return this;
        }
        public String getSourceURL() {
            return this.sourceURL;
        }

    }

}
