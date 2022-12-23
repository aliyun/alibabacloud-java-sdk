// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTranscodeTaskResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Details about transcoding tasks.
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
        // The time when the transcoding task was complete. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CompleteTime")
        public String completeTime;

        // The time when the transcoding task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The status of the transcoding task. Valid values:
        // *   **Processing**: In progress.
        // *   **Partial**: Some transcoding jobs were complete.
        // *   **CompleteAllSucc**: All transcoding jobs were successful.
        // *   **CompleteAllFail**: All transcoding jobs failed. If an exception occurs in the source file, no transcoding job is initiated and the transcoding task fails.
        // *   **CompletePartialSucc**: All transcoding jobs were complete but only some were successful.
        @NameInMap("TaskStatus")
        public String taskStatus;

        // The ID of the transcoding task.
        @NameInMap("TranscodeTaskId")
        public String transcodeTaskId;

        // The ID of the transcoding template group.
        @NameInMap("TranscodeTemplateGroupId")
        public String transcodeTemplateGroupId;

        // The mode in which the transcoding task is triggered. Valid values:
        // *   **Auto**: The transcoding task is automatically triggered when the video is uploaded.
        // *   **Manual**: The transcoding task is triggered by calling the SubmitTranscodeJobs operation.
        @NameInMap("Trigger")
        public String trigger;

        // The ID of the audio or video file.
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
