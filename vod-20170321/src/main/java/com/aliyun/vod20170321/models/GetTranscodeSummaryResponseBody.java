// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NonExistVideoIds")
    public java.util.List<String> nonExistVideoIds;

    @NameInMap("TranscodeSummaryList")
    public java.util.List<GetTranscodeSummaryResponseBodyTranscodeSummaryList> transcodeSummaryList;

    public static GetTranscodeSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeSummaryResponseBody self = new GetTranscodeSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTranscodeSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTranscodeSummaryResponseBody setNonExistVideoIds(java.util.List<String> nonExistVideoIds) {
        this.nonExistVideoIds = nonExistVideoIds;
        return this;
    }
    public java.util.List<String> getNonExistVideoIds() {
        return this.nonExistVideoIds;
    }

    public GetTranscodeSummaryResponseBody setTranscodeSummaryList(java.util.List<GetTranscodeSummaryResponseBodyTranscodeSummaryList> transcodeSummaryList) {
        this.transcodeSummaryList = transcodeSummaryList;
        return this;
    }
    public java.util.List<GetTranscodeSummaryResponseBodyTranscodeSummaryList> getTranscodeSummaryList() {
        return this.transcodeSummaryList;
    }

    public static class GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Height")
        public String height;

        @NameInMap("TranscodeProgress")
        public Long transcodeProgress;

        @NameInMap("TranscodeTemplateId")
        public String transcodeTemplateId;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("CompleteTime")
        public String completeTime;

        @NameInMap("Width")
        public String width;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("TranscodeJobStatus")
        public String transcodeJobStatus;

        @NameInMap("Filesize")
        public Long filesize;

        @NameInMap("Format")
        public String format;

        @NameInMap("WatermarkIdList")
        public java.util.List<String> watermarkIdList;

        public static GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList self = new GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList();
            return TeaModel.build(map, self);
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setTranscodeProgress(Long transcodeProgress) {
            this.transcodeProgress = transcodeProgress;
            return this;
        }
        public Long getTranscodeProgress() {
            return this.transcodeProgress;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setTranscodeTemplateId(String transcodeTemplateId) {
            this.transcodeTemplateId = transcodeTemplateId;
            return this;
        }
        public String getTranscodeTemplateId() {
            return this.transcodeTemplateId;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setTranscodeJobStatus(String transcodeJobStatus) {
            this.transcodeJobStatus = transcodeJobStatus;
            return this;
        }
        public String getTranscodeJobStatus() {
            return this.transcodeJobStatus;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setFilesize(Long filesize) {
            this.filesize = filesize;
            return this;
        }
        public Long getFilesize() {
            return this.filesize;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setWatermarkIdList(java.util.List<String> watermarkIdList) {
            this.watermarkIdList = watermarkIdList;
            return this;
        }
        public java.util.List<String> getWatermarkIdList() {
            return this.watermarkIdList;
        }

    }

    public static class GetTranscodeSummaryResponseBodyTranscodeSummaryList extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("VideoId")
        public String videoId;

        @NameInMap("CompleteTime")
        public String completeTime;

        @NameInMap("TranscodeStatus")
        public String transcodeStatus;

        @NameInMap("TranscodeTemplateGroupId")
        public String transcodeTemplateGroupId;

        @NameInMap("TranscodeJobInfoSummaryList")
        public java.util.List<GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList> transcodeJobInfoSummaryList;

        public static GetTranscodeSummaryResponseBodyTranscodeSummaryList build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeSummaryResponseBodyTranscodeSummaryList self = new GetTranscodeSummaryResponseBodyTranscodeSummaryList();
            return TeaModel.build(map, self);
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryList setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryList setTranscodeStatus(String transcodeStatus) {
            this.transcodeStatus = transcodeStatus;
            return this;
        }
        public String getTranscodeStatus() {
            return this.transcodeStatus;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryList setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }
        public String getTranscodeTemplateGroupId() {
            return this.transcodeTemplateGroupId;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryList setTranscodeJobInfoSummaryList(java.util.List<GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList> transcodeJobInfoSummaryList) {
            this.transcodeJobInfoSummaryList = transcodeJobInfoSummaryList;
            return this;
        }
        public java.util.List<GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList> getTranscodeJobInfoSummaryList() {
            return this.transcodeJobInfoSummaryList;
        }

    }

}
