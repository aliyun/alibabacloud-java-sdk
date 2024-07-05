// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTranscodeTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about transcoding tasks.</p>
     */
    @NameInMap("TranscodeTaskList")
    public java.util.List<ListTranscodeTaskResponseBodyTranscodeTaskList> transcodeTaskList;

    public static ListTranscodeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTranscodeTaskResponseBody self = new ListTranscodeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTranscodeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTranscodeTaskResponseBody setTranscodeTaskList(java.util.List<ListTranscodeTaskResponseBodyTranscodeTaskList> transcodeTaskList) {
        this.transcodeTaskList = transcodeTaskList;
        return this;
    }
    public java.util.List<ListTranscodeTaskResponseBodyTranscodeTaskList> getTranscodeTaskList() {
        return this.transcodeTaskList;
    }

    public static class ListTranscodeTaskResponseBodyTranscodeTaskList extends TeaModel {
        /**
         * <p>The time when the transcoding task was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-23T12:40:12Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the transcoding task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-23T12:35:12Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The status of the transcoding task. Valid values:</p>
         * <ul>
         * <li><strong>Processing</strong>: In progress.</li>
         * <li><strong>Partial</strong>: Some transcoding jobs were complete.</li>
         * <li><strong>CompleteAllSucc</strong>: All transcoding jobs were successful.</li>
         * <li><strong>CompleteAllFail</strong>: All transcoding jobs failed. If an exception occurs in the source file, no transcoding job is initiated and the transcoding task fails.</li>
         * <li><strong>CompletePartialSucc</strong>: All transcoding jobs were complete but only some were successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Processing</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The ID of the transcoding task.</p>
         * 
         * <strong>example:</strong>
         * <p>b1b65ab107*****ba3dbb900f6c1fe0</p>
         */
        @NameInMap("TranscodeTaskId")
        public String transcodeTaskId;

        /**
         * <p>The ID of the transcoding template group.</p>
         * 
         * <strong>example:</strong>
         * <p>b500c7094bd24*****f3e9900752d7c3</p>
         */
        @NameInMap("TranscodeTemplateGroupId")
        public String transcodeTemplateGroupId;

        /**
         * <p>The mode in which the transcoding task is triggered. Valid values:</p>
         * <ul>
         * <li><strong>Auto</strong>: The transcoding task is automatically triggered when the video is uploaded.</li>
         * <li><strong>Manual</strong>: The transcoding task is triggered by calling the SubmitTranscodeJobs operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        @NameInMap("Trigger")
        public String trigger;

        /**
         * <p>The ID of the audio or video file.</p>
         * 
         * <strong>example:</strong>
         * <p>d4860fcc6a5*****bce9fed52e893824</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        public static ListTranscodeTaskResponseBodyTranscodeTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeTaskResponseBodyTranscodeTaskList self = new ListTranscodeTaskResponseBodyTranscodeTaskList();
            return TeaModel.build(map, self);
        }

        public ListTranscodeTaskResponseBodyTranscodeTaskList setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public ListTranscodeTaskResponseBodyTranscodeTaskList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListTranscodeTaskResponseBodyTranscodeTaskList setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListTranscodeTaskResponseBodyTranscodeTaskList setTranscodeTaskId(String transcodeTaskId) {
            this.transcodeTaskId = transcodeTaskId;
            return this;
        }
        public String getTranscodeTaskId() {
            return this.transcodeTaskId;
        }

        public ListTranscodeTaskResponseBodyTranscodeTaskList setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }
        public String getTranscodeTemplateGroupId() {
            return this.transcodeTemplateGroupId;
        }

        public ListTranscodeTaskResponseBodyTranscodeTaskList setTrigger(String trigger) {
            this.trigger = trigger;
            return this;
        }
        public String getTrigger() {
            return this.trigger;
        }

        public ListTranscodeTaskResponseBodyTranscodeTaskList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}
