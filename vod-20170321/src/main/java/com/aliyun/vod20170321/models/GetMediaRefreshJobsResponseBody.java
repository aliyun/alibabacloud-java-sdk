// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaRefreshJobsResponseBody extends TeaModel {
    /**
     * <p>The media refresh or prefetch jobs.</p>
     */
    @NameInMap("MediaRefreshJobs")
    public java.util.List<GetMediaRefreshJobsResponseBodyMediaRefreshJobs> mediaRefreshJobs;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaRefreshJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaRefreshJobsResponseBody self = new GetMediaRefreshJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaRefreshJobsResponseBody setMediaRefreshJobs(java.util.List<GetMediaRefreshJobsResponseBodyMediaRefreshJobs> mediaRefreshJobs) {
        this.mediaRefreshJobs = mediaRefreshJobs;
        return this;
    }
    public java.util.List<GetMediaRefreshJobsResponseBodyMediaRefreshJobs> getMediaRefreshJobs() {
        return this.mediaRefreshJobs;
    }

    public GetMediaRefreshJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaRefreshJobsResponseBodyMediaRefreshJobs extends TeaModel {
        /**
         * <p>The error code. This parameter is returned if the refresh or prefetch task fails.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. This parameter is returned if the refresh or prefetch task fails.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The filtering conditions for stream playback. The value is a JSON string. This parameter is used as a request parameter of the [RefreshMediaPlayUrls](~~RefreshMediaPlayUrls~~) operation.</p>
         */
        @NameInMap("FilterPolicy")
        public String filterPolicy;

        /**
         * <p>The time when the task was created.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the task was modified.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the media file.</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The ID of the job.</p>
         */
        @NameInMap("MediaRefreshJobId")
        public String mediaRefreshJobId;

        /**
         * <p>The status of the job. Valid values:</p>
         * <br>
         * <p>*   **success**</p>
         * <p>*   **fail**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The playback URLs that were refreshed or prefetched.</p>
         */
        @NameInMap("SuccessPlayUrls")
        public String successPlayUrls;

        /**
         * <p>The IDs of the refresh or prefetch tasks for the playback URLs of media files. Only one URL can be refreshed or prefetched in a task. This value is used in the [DescribeVodRefreshTasks](~~DescribeVodRefreshTasks~~) operation, which queries the status of refresh or prefetch tasks for playback URLs of media files.</p>
         */
        @NameInMap("TaskIds")
        public String taskIds;

        /**
         * <p>The type of the job. Valid values:</p>
         * <br>
         * <p>*   **Refresh**</p>
         * <p>*   **Preload**</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The user data that you passed when you submit a refresh or prefetch task.</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetMediaRefreshJobsResponseBodyMediaRefreshJobs build(java.util.Map<String, ?> map) throws Exception {
            GetMediaRefreshJobsResponseBodyMediaRefreshJobs self = new GetMediaRefreshJobsResponseBodyMediaRefreshJobs();
            return TeaModel.build(map, self);
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setFilterPolicy(String filterPolicy) {
            this.filterPolicy = filterPolicy;
            return this;
        }
        public String getFilterPolicy() {
            return this.filterPolicy;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setMediaRefreshJobId(String mediaRefreshJobId) {
            this.mediaRefreshJobId = mediaRefreshJobId;
            return this;
        }
        public String getMediaRefreshJobId() {
            return this.mediaRefreshJobId;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setSuccessPlayUrls(String successPlayUrls) {
            this.successPlayUrls = successPlayUrls;
            return this;
        }
        public String getSuccessPlayUrls() {
            return this.successPlayUrls;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setTaskIds(String taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public String getTaskIds() {
            return this.taskIds;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetMediaRefreshJobsResponseBodyMediaRefreshJobs setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
