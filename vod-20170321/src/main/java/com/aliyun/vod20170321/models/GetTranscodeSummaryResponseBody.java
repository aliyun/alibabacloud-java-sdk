// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeSummaryResponseBody extends TeaModel {
    /**
     * <p>The IDs of the audio or video files that do not exist.</p>
     */
    @NameInMap("NonExistVideoIds")
    public java.util.List<String> nonExistVideoIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The transcoding summary of the file.</p>
     */
    @NameInMap("TranscodeSummaryList")
    public java.util.List<GetTranscodeSummaryResponseBodyTranscodeSummaryList> transcodeSummaryList;

    public static GetTranscodeSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeSummaryResponseBody self = new GetTranscodeSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTranscodeSummaryResponseBody setNonExistVideoIds(java.util.List<String> nonExistVideoIds) {
        this.nonExistVideoIds = nonExistVideoIds;
        return this;
    }
    public java.util.List<String> getNonExistVideoIds() {
        return this.nonExistVideoIds;
    }

    public GetTranscodeSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTranscodeSummaryResponseBody setTranscodeSummaryList(java.util.List<GetTranscodeSummaryResponseBodyTranscodeSummaryList> transcodeSummaryList) {
        this.transcodeSummaryList = transcodeSummaryList;
        return this;
    }
    public java.util.List<GetTranscodeSummaryResponseBodyTranscodeSummaryList> getTranscodeSummaryList() {
        return this.transcodeSummaryList;
    }

    public static class GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList extends TeaModel {
        /**
         * <p>The average bitrate of the output video. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>749</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The time when the transcoding job was complete. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-27T03:40:51Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the transcoding job was created. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-27T03:34:46Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The duration of the output video. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The error code returned when the transcoding job failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the transcoding job failed.</p>
         * 
         * <strong>example:</strong>
         * <p>ErrorMessage</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The size of the output video. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1144259</p>
         */
        @NameInMap("Filesize")
        public Long filesize;

        /**
         * <p>The container format of the output video.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The frame rate of the output video. Unit: frames per second.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The height of the output video. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>960</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The status of the transcoding job. Valid values:</p>
         * <ul>
         * <li><strong>Transcoding</strong>: Transcoding is in process.</li>
         * <li><strong>TranscodeSuccess</strong>: The job was successful.</li>
         * <li><strong>TranscodeFail</strong>: The job failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Transcoding</p>
         */
        @NameInMap("TranscodeJobStatus")
        public String transcodeJobStatus;

        /**
         * <p>The transcoding progress. Valid values: <code>[0,100]</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TranscodeProgress")
        public Long transcodeProgress;

        /**
         * <p>The ID of the transcoding template.</p>
         * 
         * <strong>example:</strong>
         * <p>57496724ae2*****0968d6e08acc8f6</p>
         */
        @NameInMap("TranscodeTemplateId")
        public String transcodeTemplateId;

        /**
         * <p>The IDs of the watermarks that are applied to the output video.</p>
         */
        @NameInMap("WatermarkIdList")
        public java.util.List<String> watermarkIdList;

        /**
         * <p>The width of the output video. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>544</p>
         */
        @NameInMap("Width")
        public String width;

        public static GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList self = new GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList();
            return TeaModel.build(map, self);
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
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

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setTranscodeJobStatus(String transcodeJobStatus) {
            this.transcodeJobStatus = transcodeJobStatus;
            return this;
        }
        public String getTranscodeJobStatus() {
            return this.transcodeJobStatus;
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

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setWatermarkIdList(java.util.List<String> watermarkIdList) {
            this.watermarkIdList = watermarkIdList;
            return this;
        }
        public java.util.List<String> getWatermarkIdList() {
            return this.watermarkIdList;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetTranscodeSummaryResponseBodyTranscodeSummaryList extends TeaModel {
        /**
         * <p>The time when the transcoding task was complete. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-23T12:40:12Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the transcoding task was created. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-23T12:35:12Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The summaries of transcoding jobs.</p>
         */
        @NameInMap("TranscodeJobInfoSummaryList")
        public java.util.List<GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList> transcodeJobInfoSummaryList;

        /**
         * <p>The status of the transcoding task. Valid values:</p>
         * <ul>
         * <li><strong>Processing</strong>: Transcoding is in process.</li>
         * <li><strong>Partial</strong>: Some transcoding jobs were complete.</li>
         * <li><strong>CompleteAllSucc</strong>: All transcoding jobs were successful.</li>
         * <li><strong>CompleteAllFail</strong>: All transcoding jobs failed. If an exception occurs in the source file, no transcoding job is initiated and the transcoding task fails.</li>
         * <li><strong>CompletePartialSucc</strong>: All transcoding jobs were complete but only some were successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Processing</p>
         */
        @NameInMap("TranscodeStatus")
        public String transcodeStatus;

        /**
         * <p>The ID of the transcoding template group.</p>
         * 
         * <strong>example:</strong>
         * <p>44f9e406bbb*****736a9abe876ecc0</p>
         */
        @NameInMap("TranscodeTemplateGroupId")
        public String transcodeTemplateGroupId;

        /**
         * <p>The ID of the audio or video file.</p>
         * 
         * <strong>example:</strong>
         * <p>e1db68cc586644b83e562bcd94****</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        public static GetTranscodeSummaryResponseBodyTranscodeSummaryList build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeSummaryResponseBodyTranscodeSummaryList self = new GetTranscodeSummaryResponseBodyTranscodeSummaryList();
            return TeaModel.build(map, self);
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryList setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetTranscodeSummaryResponseBodyTranscodeSummaryList setTranscodeJobInfoSummaryList(java.util.List<GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList> transcodeJobInfoSummaryList) {
            this.transcodeJobInfoSummaryList = transcodeJobInfoSummaryList;
            return this;
        }
        public java.util.List<GetTranscodeSummaryResponseBodyTranscodeSummaryListTranscodeJobInfoSummaryList> getTranscodeJobInfoSummaryList() {
            return this.transcodeJobInfoSummaryList;
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

        public GetTranscodeSummaryResponseBodyTranscodeSummaryList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

    }

}
