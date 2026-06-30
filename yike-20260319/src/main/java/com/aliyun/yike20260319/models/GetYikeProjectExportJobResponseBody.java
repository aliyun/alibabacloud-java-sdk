// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeProjectExportJobResponseBody extends TeaModel {
    /**
     * <p>The export task object.</p>
     */
    @NameInMap("ProjectExportJob")
    public GetYikeProjectExportJobResponseBodyProjectExportJob projectExportJob;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>2876-6263-4B75-8F2C-CD0F7FCF</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetYikeProjectExportJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYikeProjectExportJobResponseBody self = new GetYikeProjectExportJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYikeProjectExportJobResponseBody setProjectExportJob(GetYikeProjectExportJobResponseBodyProjectExportJob projectExportJob) {
        this.projectExportJob = projectExportJob;
        return this;
    }
    public GetYikeProjectExportJobResponseBodyProjectExportJob getProjectExportJob() {
        return this.projectExportJob;
    }

    public GetYikeProjectExportJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetYikeProjectExportJobResponseBodyProjectExportJobExportResultSrtList extends TeaModel {
        /**
         * <p>The download URL of the SRT file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx?Expires=">http://xxx?Expires=</a></p>
         */
        @NameInMap("SrtUrl")
        public String srtUrl;

        /**
         * <p>The type enumeration. Currently, only VoiceOver is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>VoiceOver</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static GetYikeProjectExportJobResponseBodyProjectExportJobExportResultSrtList build(java.util.Map<String, ?> map) throws Exception {
            GetYikeProjectExportJobResponseBodyProjectExportJobExportResultSrtList self = new GetYikeProjectExportJobResponseBodyProjectExportJobExportResultSrtList();
            return TeaModel.build(map, self);
        }

        public GetYikeProjectExportJobResponseBodyProjectExportJobExportResultSrtList setSrtUrl(String srtUrl) {
            this.srtUrl = srtUrl;
            return this;
        }
        public String getSrtUrl() {
            return this.srtUrl;
        }

        public GetYikeProjectExportJobResponseBodyProjectExportJobExportResultSrtList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class GetYikeProjectExportJobResponseBodyProjectExportJobExportResult extends TeaModel {
        /**
         * <p>The download URL of the audio file.</p>
         * 
         * <strong>example:</strong>
         * <p>http://....MP3?Expires=</p>
         */
        @NameInMap("AudioUrl")
        public String audioUrl;

        /**
         * <p>The download URL of the PR project file (not supported).</p>
         * 
         * <strong>example:</strong>
         * <p>....</p>
         */
        @NameInMap("ProjectUrl")
        public String projectUrl;

        /**
         * <p>The subtitle list.</p>
         */
        @NameInMap("SrtList")
        public java.util.List<GetYikeProjectExportJobResponseBodyProjectExportJobExportResultSrtList> srtList;

        /**
         * <p>The editing timeline (not supported).</p>
         * 
         * <strong>example:</strong>
         * <p>....</p>
         */
        @NameInMap("Timeline")
        public String timeline;

        public static GetYikeProjectExportJobResponseBodyProjectExportJobExportResult build(java.util.Map<String, ?> map) throws Exception {
            GetYikeProjectExportJobResponseBodyProjectExportJobExportResult self = new GetYikeProjectExportJobResponseBodyProjectExportJobExportResult();
            return TeaModel.build(map, self);
        }

        public GetYikeProjectExportJobResponseBodyProjectExportJobExportResult setAudioUrl(String audioUrl) {
            this.audioUrl = audioUrl;
            return this;
        }
        public String getAudioUrl() {
            return this.audioUrl;
        }

        public GetYikeProjectExportJobResponseBodyProjectExportJobExportResult setProjectUrl(String projectUrl) {
            this.projectUrl = projectUrl;
            return this;
        }
        public String getProjectUrl() {
            return this.projectUrl;
        }

        public GetYikeProjectExportJobResponseBodyProjectExportJobExportResult setSrtList(java.util.List<GetYikeProjectExportJobResponseBodyProjectExportJobExportResultSrtList> srtList) {
            this.srtList = srtList;
            return this;
        }
        public java.util.List<GetYikeProjectExportJobResponseBodyProjectExportJobExportResultSrtList> getSrtList() {
            return this.srtList;
        }

        public GetYikeProjectExportJobResponseBodyProjectExportJobExportResult setTimeline(String timeline) {
            this.timeline = timeline;
            return this;
        }
        public String getTimeline() {
            return this.timeline;
        }

    }

    public static class GetYikeProjectExportJobResponseBodyProjectExportJob extends TeaModel {
        /**
         * <p>The task failure code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The export result.</p>
         */
        @NameInMap("ExportResult")
        public GetYikeProjectExportJobResponseBodyProjectExportJobExportResult exportResult;

        /**
         * <p>The project export type.</p>
         * 
         * <strong>example:</strong>
         * <p>PureAudio</p>
         */
        @NameInMap("ExportType")
        public String exportType;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The task failure message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter is not valid.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The online editing project ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The custom data.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;testKey\&quot;:\&quot;testValue\&quot;}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetYikeProjectExportJobResponseBodyProjectExportJob build(java.util.Map<String, ?> map) throws Exception {
            GetYikeProjectExportJobResponseBodyProjectExportJob self = new GetYikeProjectExportJobResponseBodyProjectExportJob();
            return TeaModel.build(map, self);
        }

        public GetYikeProjectExportJobResponseBodyProjectExportJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetYikeProjectExportJobResponseBodyProjectExportJob setExportResult(GetYikeProjectExportJobResponseBodyProjectExportJobExportResult exportResult) {
            this.exportResult = exportResult;
            return this;
        }
        public GetYikeProjectExportJobResponseBodyProjectExportJobExportResult getExportResult() {
            return this.exportResult;
        }

        public GetYikeProjectExportJobResponseBodyProjectExportJob setExportType(String exportType) {
            this.exportType = exportType;
            return this;
        }
        public String getExportType() {
            return this.exportType;
        }

        public GetYikeProjectExportJobResponseBodyProjectExportJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetYikeProjectExportJobResponseBodyProjectExportJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetYikeProjectExportJobResponseBodyProjectExportJob setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetYikeProjectExportJobResponseBodyProjectExportJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetYikeProjectExportJobResponseBodyProjectExportJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
