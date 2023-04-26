// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTranscodeTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the transcoding template group.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the transcoding task.</p>
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
         * <p>Queries transcoding tasks based on the media ID. This operation does not return specific job information.</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The ID of the audio or video file. You can use one of the following methods to obtain the ID of the file:</p>
         * <br>
         * <p>*   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</p>
         * <p>*   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you call to obtain the upload URL and credential.</p>
         * <p>*   Obtain the value of VideoId by calling the [SearchMedia](~~86044~~) operation. This method is applicable to files that have been uploaded.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The number of entries to return on each page. Maximum value: **50**. Default value: **10**.</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TranscodeTaskId")
        public String transcodeTaskId;

        @NameInMap("TranscodeTemplateGroupId")
        public String transcodeTemplateGroupId;

        /**
         * <p>The status of the transcoding task. Valid values:</p>
         * <br>
         * <p>*   **Processing**: In progress.</p>
         * <p>*   **Partial**: Some transcoding jobs were complete.</p>
         * <p>*   **CompleteAllSucc**: All transcoding jobs were successful.</p>
         * <p>*   **CompleteAllFail**: All transcoding jobs failed. If an exception occurs in the source file, no transcoding job is initiated and the transcoding task fails.</p>
         * <p>*   **CompletePartialSucc**: All transcoding jobs were complete but only some were successful.</p>
         */
        @NameInMap("Trigger")
        public String trigger;

        /**
         * <p>The ID of the request.</p>
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
