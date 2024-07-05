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
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
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
         * 
         * <strong>example:</strong>
         * <p>PreloadQueueFull</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. This parameter is returned if the refresh or prefetch task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Preload queue is full, please try again later!</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The filtering conditions for stream playback. The value is a JSON string. This parameter is used as a request parameter of the <a href="~~RefreshMediaPlayUrls~~">RefreshMediaPlayUrls</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Formats&quot;:&quot;mp4,m3u8&quot;, &quot;Definitions&quot;:&quot;HD,SD&quot;,  &quot; StreamType&quot;:&quot;video&quot;,  &quot;ResultType&quot;:&quot;Single&quot;,  &quot; SliceFlag&quot;:false, &quot;SliceCount&quot;: 3}</p>
         */
        @NameInMap("FilterPolicy")
        public String filterPolicy;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-20T08:23:22Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-21T08:23:22Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>ca3a8f6e4957b658067095869****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>41d465e31957****</p>
         */
        @NameInMap("MediaRefreshJobId")
        public String mediaRefreshJobId;

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>fail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The playback URLs that were refreshed or prefetched.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://shenzhen.****.aliyuncdn.com/74401a4f546007bf845cd8840****.m3u8,https://shenzhen.****.aliyuncdn.com/24041e7d13582d86604d8****.m3u8">https://shenzhen.****.aliyuncdn.com/74401a4f546007bf845cd8840****.m3u8,https://shenzhen.****.aliyuncdn.com/24041e7d13582d86604d8****.m3u8</a></p>
         */
        @NameInMap("SuccessPlayUrls")
        public String successPlayUrls;

        /**
         * <p>The IDs of the refresh or prefetch tasks for the playback URLs of media files. Only one URL can be refreshed or prefetched in a task. This value is used in the <a href="~~DescribeVodRefreshTasks~~">DescribeVodRefreshTasks</a> operation, which queries the status of refresh or prefetch tasks for playback URLs of media files.</p>
         * 
         * <strong>example:</strong>
         * <p>70422****,9524****</p>
         */
        @NameInMap("TaskIds")
        public String taskIds;

        /**
         * <p>The type of the job. Valid values:</p>
         * <ul>
         * <li><strong>Refresh</strong></li>
         * <li><strong>Preload</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Preload</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The user data that you passed when you submit a refresh or prefetch task.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D">http://example.aliyundoc.com&quot;}</a>, &quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
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
