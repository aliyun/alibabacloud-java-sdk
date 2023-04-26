// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTaskResponseBody extends TeaModel {
    /**
     * <p>The size of the output file. Unit: byte.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The length of the output file. Unit: seconds.</p>
     */
    @NameInMap("TranscodeTask")
    public GetTranscodeTaskResponseBodyTranscodeTask transcodeTask;

    public static GetTranscodeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeTaskResponseBody self = new GetTranscodeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTranscodeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTranscodeTaskResponseBody setTranscodeTask(GetTranscodeTaskResponseBodyTranscodeTask transcodeTask) {
        this.transcodeTask = transcodeTask;
        return this;
    }
    public GetTranscodeTaskResponseBodyTranscodeTask getTranscodeTask() {
        return this.transcodeTask;
    }

    public static class GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile extends TeaModel {
        /**
         * <p>The ID of the transcoding job.</p>
         */
        @NameInMap("AudioStreamList")
        public String audioStreamList;

        /**
         * <p>The time when the transcoding task was complete. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The frame rate of the output file. Unit: frames per second.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The audio streams.</p>
         */
        @NameInMap("Encryption")
        public String encryption;

        /**
         * <p>Queries details about transcoding jobs based on the transcoding task ID.</p>
         */
        @NameInMap("Filesize")
        public Long filesize;

        /**
         * <p>The IDs of the watermarks used by the output file.</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The error message returned when the transcoding job failed.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The ID of the transcoding task.</p>
         */
        @NameInMap("OutputFileUrl")
        public String outputFileUrl;

        /**
         * <p>The time when the transcoding task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("SubtitleStreamList")
        public String subtitleStreamList;

        /**
         * <p>The time when the transcoding job was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("VideoStreamList")
        public String videoStreamList;

        @NameInMap("WatermarkIdList")
        public java.util.List<String> watermarkIdList;

        /**
         * <p>Details about transcoding tasks.</p>
         */
        @NameInMap("Width")
        public String width;

        public static GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile self = new GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile();
            return TeaModel.build(map, self);
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile setAudioStreamList(String audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public String getAudioStreamList() {
            return this.audioStreamList;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile setEncryption(String encryption) {
            this.encryption = encryption;
            return this;
        }
        public String getEncryption() {
            return this.encryption;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile setFilesize(Long filesize) {
            this.filesize = filesize;
            return this;
        }
        public Long getFilesize() {
            return this.filesize;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile setOutputFileUrl(String outputFileUrl) {
            this.outputFileUrl = outputFileUrl;
            return this;
        }
        public String getOutputFileUrl() {
            return this.outputFileUrl;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile setSubtitleStreamList(String subtitleStreamList) {
            this.subtitleStreamList = subtitleStreamList;
            return this;
        }
        public String getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile setVideoStreamList(String videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public String getVideoStreamList() {
            return this.videoStreamList;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile setWatermarkIdList(java.util.List<String> watermarkIdList) {
            this.watermarkIdList = watermarkIdList;
            return this;
        }
        public java.util.List<String> getWatermarkIdList() {
            return this.watermarkIdList;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList extends TeaModel {
        /**
         * <p>The progress of the transcoding job. Valid values: `[0,100]`.</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The status of the transcoding job.</p>
         * <br>
         * <p>*   **Transcoding**</p>
         * <p>*   **TranscodeSuccess**</p>
         * <p>*   **TranscodeFail**</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The encryption method of the output file. Valid values:</p>
         * <br>
         * <p>*   **AliyunVoDEncryption**: Alibaba Cloud proprietary cryptography</p>
         * <p>*   **HLSEncryption**: HTTP Live Streaming (HLS) encryption</p>
         */
        @NameInMap("Definition")
        public String definition;

        /**
         * <p>Details about transcoding jobs.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The height of the output video. Unit: pixels.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The IDs of the watermarks used by the output file.</p>
         */
        @NameInMap("InputFileUrl")
        public String inputFileUrl;

        /**
         * <p>The ID of the transcoding template group.</p>
         */
        @NameInMap("OutputFile")
        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile outputFile;

        /**
         * <p>The subtitle streams.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The ID of the audio or video file.</p>
         */
        @NameInMap("TranscodeJobId")
        public String transcodeJobId;

        /**
         * <p>The priority of the transcoding job.</p>
         */
        @NameInMap("TranscodeJobStatus")
        public String transcodeJobStatus;

        /**
         * <p>The average bitrate of the output file. Unit: Kbit/s.</p>
         */
        @NameInMap("TranscodeProgress")
        public Long transcodeProgress;

        /**
         * <p>The status of the transcoding task. Valid values:</p>
         * <br>
         * <p>*   **Processing**: In progress.</p>
         * <p>*   **Partial**: Some transcoding jobs were complete.</p>
         * <p>*   **CompleteAllSucc**: All transcoding jobs were successful.</p>
         * <p>*   **CompleteAllFail**: All transcoding jobs failed. If an exception occurs in the source file, no transcoding job is initiated and the transcoding task fails.</p>
         * <p>*   **CompletePartialSucc**: All transcoding jobs were complete but only some were successful.</p>
         */
        @NameInMap("TranscodeTemplateId")
        public String transcodeTemplateId;

        public static GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList self = new GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList();
            return TeaModel.build(map, self);
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList setInputFileUrl(String inputFileUrl) {
            this.inputFileUrl = inputFileUrl;
            return this;
        }
        public String getInputFileUrl() {
            return this.inputFileUrl;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList setOutputFile(GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile getOutputFile() {
            return this.outputFile;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList setTranscodeJobId(String transcodeJobId) {
            this.transcodeJobId = transcodeJobId;
            return this;
        }
        public String getTranscodeJobId() {
            return this.transcodeJobId;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList setTranscodeJobStatus(String transcodeJobStatus) {
            this.transcodeJobStatus = transcodeJobStatus;
            return this;
        }
        public String getTranscodeJobStatus() {
            return this.transcodeJobStatus;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList setTranscodeProgress(Long transcodeProgress) {
            this.transcodeProgress = transcodeProgress;
            return this;
        }
        public Long getTranscodeProgress() {
            return this.transcodeProgress;
        }

        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList setTranscodeTemplateId(String transcodeTemplateId) {
            this.transcodeTemplateId = transcodeTemplateId;
            return this;
        }
        public String getTranscodeTemplateId() {
            return this.transcodeTemplateId;
        }

    }

    public static class GetTranscodeTaskResponseBodyTranscodeTask extends TeaModel {
        /**
         * <p>The Object Storage Service (OSS) URL of the input file.</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The operation that you want to perform. Set the value to **GetTranscodeTask**.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The mode in which the transcoding task is triggered. Valid values:</p>
         * <br>
         * <p>*   **Auto**: The transcoding task is automatically triggered when the video is uploaded.</p>
         * <p>*   **Manual**: The transcoding task is triggered by calling the SubmitTranscodeJobs operation.</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The information about the output file.</p>
         */
        @NameInMap("TranscodeJobInfoList")
        public java.util.List<GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList> transcodeJobInfoList;

        /**
         * <p>The container format of the output file.</p>
         */
        @NameInMap("TranscodeTaskId")
        public String transcodeTaskId;

        /**
         * <p>The ID of the transcoding task. You can use one of the following methods to obtain the ID:</p>
         * <br>
         * <p>*   Obtain the value of TranscodeTaskId from the response to the [SubmitTranscodeJobs](~~68570~~) operation.</p>
         * <p>*   Obtain the value of TranscodeTaskId from the response to the [ListTranscodeTask](~~109120~~) operation.</p>
         */
        @NameInMap("TranscodeTemplateGroupId")
        public String transcodeTemplateGroupId;

        /**
         * <p>The video streams.</p>
         */
        @NameInMap("Trigger")
        public String trigger;

        /**
         * <p>The ID of the transcoding template.</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        public static GetTranscodeTaskResponseBodyTranscodeTask build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeTaskResponseBodyTranscodeTask self = new GetTranscodeTaskResponseBodyTranscodeTask();
            return TeaModel.build(map, self);
        }

        public GetTranscodeTaskResponseBodyTranscodeTask setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetTranscodeTaskResponseBodyTranscodeTask setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetTranscodeTaskResponseBodyTranscodeTask setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetTranscodeTaskResponseBodyTranscodeTask setTranscodeJobInfoList(java.util.List<GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList> transcodeJobInfoList) {
            this.transcodeJobInfoList = transcodeJobInfoList;
            return this;
        }
        public java.util.List<GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList> getTranscodeJobInfoList() {
            return this.transcodeJobInfoList;
        }

        public GetTranscodeTaskResponseBodyTranscodeTask setTranscodeTaskId(String transcodeTaskId) {
            this.transcodeTaskId = transcodeTaskId;
            return this;
        }
        public String getTranscodeTaskId() {
            return this.transcodeTaskId;
        }

        public GetTranscodeTaskResponseBodyTranscodeTask setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }
        public String getTranscodeTemplateGroupId() {
            return this.transcodeTemplateGroupId;
        }

        public GetTranscodeTaskResponseBodyTranscodeTask setTrigger(String trigger) {
            this.trigger = trigger;
            return this;
        }
        public String getTrigger() {
            return this.trigger;
        }

        public GetTranscodeTaskResponseBodyTranscodeTask setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}
