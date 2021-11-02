// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AudioStreamList")
        public String audioStreamList;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Encryption")
        public String encryption;

        @NameInMap("Filesize")
        public Long filesize;

        @NameInMap("Format")
        public String format;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Height")
        public String height;

        @NameInMap("OutputFileUrl")
        public String outputFileUrl;

        @NameInMap("SubtitleStreamList")
        public String subtitleStreamList;

        @NameInMap("VideoStreamList")
        public String videoStreamList;

        @NameInMap("WatermarkIdList")
        public java.util.List<String> watermarkIdList;

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
        @NameInMap("CompleteTime")
        public String completeTime;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Definition")
        public String definition;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("InputFileUrl")
        public String inputFileUrl;

        @NameInMap("OutputFile")
        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile outputFile;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("TranscodeJobId")
        public String transcodeJobId;

        @NameInMap("TranscodeJobStatus")
        public String transcodeJobStatus;

        @NameInMap("TranscodeProgress")
        public Long transcodeProgress;

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
        @NameInMap("CompleteTime")
        public String completeTime;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TranscodeJobInfoList")
        public java.util.List<GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList> transcodeJobInfoList;

        @NameInMap("TranscodeTaskId")
        public String transcodeTaskId;

        @NameInMap("TranscodeTemplateGroupId")
        public String transcodeTemplateGroupId;

        @NameInMap("Trigger")
        public String trigger;

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
