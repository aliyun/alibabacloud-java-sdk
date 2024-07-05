// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F4C6D5BE-BF13-45*****6C-516EA8906DCD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about transcoding tasks.</p>
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
         * <p>The audio streams.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;AudioStreamList&quot;: &quot;[{\&quot;Bitrate\&quot;:\&quot;64.533\&quot;,\&quot;ChannelLayout\&quot;:\&quot;stereo\&quot;,\&quot;Channels\&quot;:\&quot;2\&quot;,\&quot;CodecLongName\&quot;:\&quot;AAC (Advanced Audio Coding)\&quot;,\&quot;CodecName\&quot;:\&quot;aac\&quot;,\&quot;CodecTag\&quot;:\&quot;0x6134706d\&quot;,\&quot;CodecTagString\&quot;:\&quot;mp4a\&quot;,\&quot;CodecTimeBase\&quot;:\&quot;1/44100\&quot;,\&quot;Duration\&quot;:\&quot;12.615533\&quot;,\&quot;Index\&quot;:\&quot;1\&quot;,\&quot;Lang\&quot;:\&quot;und\&quot;,\&quot;SampleFmt\&quot;:\&quot;fltp\&quot;,\&quot;Samplerate\&quot;:\&quot;44100\&quot;,\&quot;StartTime\&quot;:\&quot;-0.046440\&quot;,\&quot;Timebase\&quot;:\&quot;1/44100\&quot;}]</p>
         */
        @NameInMap("AudioStreamList")
        public String audioStreamList;

        /**
         * <p>The average bitrate of the output file. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>964</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The length of the output file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The encryption method of the output file. Valid values:</p>
         * <ul>
         * <li><strong>AliyunVoDEncryption</strong>: Alibaba Cloud proprietary cryptography</li>
         * <li><strong>HLSEncryption</strong>: HTTP Live Streaming (HLS) encryption</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;EncryptType\&quot;:\&quot;AliyunVoDEncryption\&quot;}</p>
         */
        @NameInMap("Encryption")
        public String encryption;

        /**
         * <p>The size of the output file. Unit: byte.</p>
         * 
         * <strong>example:</strong>
         * <p>851076</p>
         */
        @NameInMap("Filesize")
        public Long filesize;

        /**
         * <p>The container format of the output file.</p>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The frame rate of the output file. Unit: frames per second.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The height of the output video. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>360</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The OSS URL of the output file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://outin-40564*****e1403e7.oss-cn-shanghai.aliyuncs.com/883f5d*****f20aaa352f/c3be4f073*****7d5193ec8-%7BDestMd5%7D-od-S00000001-200000.mp4">http://outin-40564*****e1403e7.oss-cn-shanghai.aliyuncs.com/883f5d*****f20aaa352f/c3be4f073*****7d5193ec8-{DestMd5}-od-S00000001-200000.mp4</a></p>
         */
        @NameInMap("OutputFileUrl")
        public String outputFileUrl;

        /**
         * <p>The subtitle streams.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("SubtitleStreamList")
        public String subtitleStreamList;

        /**
         * <p>The video streams.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;AvgFPS\&quot;:\&quot;30.0\&quot;,\&quot;Bitrate\&quot;:\&quot;933.814\&quot;,\&quot;CodecLongName\&quot;:\&quot;H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10\&quot;,\&quot;CodecName\&quot;:\&quot;h264\&quot;,\&quot;CodecTag\&quot;:\&quot;0x31637661\&quot;,\&quot;CodecTagString\&quot;:\&quot;avc1\&quot;,\&quot;CodecTimeBase\&quot;:\&quot;1/60\&quot;,\&quot;Dar\&quot;:\&quot;9:16\&quot;,\&quot;Duration\&quot;:\&quot;12.033333\&quot;,\&quot;Fps\&quot;:\&quot;30.0\&quot;,\&quot;HasBFrames\&quot;:\&quot;2\&quot;,\&quot;Height\&quot;:\&quot;360\&quot;,\&quot;Index\&quot;:\&quot;0\&quot;,\&quot;Lang\&quot;:\&quot;und\&quot;,\&quot;Level\&quot;:\&quot;30\&quot;,\&quot;PixFmt\&quot;:\&quot;yuv420p\&quot;,\&quot;Profile\&quot;:\&quot;High\&quot;,\&quot;Sar\&quot;:\&quot;81:256\&quot;,\&quot;StartTime\&quot;:\&quot;0.000000\&quot;,\&quot;Timebase\&quot;:\&quot;1/15360\&quot;,\&quot;Width\&quot;:\&quot;640\&quot;}]</p>
         */
        @NameInMap("VideoStreamList")
        public String videoStreamList;

        /**
         * <p>The IDs of the watermarks used by the output file.</p>
         */
        @NameInMap("WatermarkIdList")
        public java.util.List<String> watermarkIdList;

        /**
         * <p>The width of the output video. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>640</p>
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
         * <p>The time when the transcoding job was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-26T08:30:16Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the transcoding job was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-26T08:27:16Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The video resolution. Valid values:</p>
         * <ul>
         * <li><strong>LD</strong>: low definition</li>
         * <li><strong>SD</strong>: standard definition</li>
         * <li><strong>HD</strong>: high definition</li>
         * <li><strong>FHD</strong>: ultra high definition</li>
         * <li><strong>OD</strong>: original definition</li>
         * <li><strong>2K</strong>: 2K</li>
         * <li><strong>4K</strong>: 4K</li>
         * <li><strong>SQ</strong>: standard sound quality</li>
         * <li><strong>HQ</strong>: high sound quality</li>
         * <li><strong>AUTO</strong>: adaptive bitrate Adaptive bitrate streams are returned only if PackageSetting is set in the transcoding template. For more information, see <a href="https://help.aliyun.com/document_detail/52839.html">Basic structures</a>.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter indicates the definition that is configured in the transcoding template and does not indicate the actual resolution of the output video.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>LD</p>
         */
        @NameInMap("Definition")
        public String definition;

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
         * <p>The Object Storage Service (OSS) URL of the input file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://outin-40564*****e1403e7.oss-cn-shanghai.aliyuncs.com/customerTrans/5b95e568f8e*****47f38e/31f1184c-*****b2a2-f94-c213f.wmv">http://outin-40564*****e1403e7.oss-cn-shanghai.aliyuncs.com/customerTrans/5b95e568f8e*****47f38e/31f1184c-*****b2a2-f94-c213f.wmv</a></p>
         */
        @NameInMap("InputFileUrl")
        public String inputFileUrl;

        /**
         * <p>The information about the output file.</p>
         */
        @NameInMap("OutputFile")
        public GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoListOutputFile outputFile;

        /**
         * <p>The priority of the transcoding job.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The ID of the transcoding job.</p>
         * 
         * <strong>example:</strong>
         * <p>38f0e513c88*****85515f9d50be188</p>
         */
        @NameInMap("TranscodeJobId")
        public String transcodeJobId;

        /**
         * <p>The status of the transcoding job.</p>
         * <ul>
         * <li><strong>Transcoding</strong></li>
         * <li><strong>TranscodeSuccess</strong></li>
         * <li><strong>TranscodeFail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Transcoding</p>
         */
        @NameInMap("TranscodeJobStatus")
        public String transcodeJobStatus;

        /**
         * <p>The progress of the transcoding job. Valid values: <code>[0,100]</code>.</p>
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
         * <p>174b0534fea3*****b51c8f0ad1374</p>
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
         * <p>Details about transcoding jobs.</p>
         */
        @NameInMap("TranscodeJobInfoList")
        public java.util.List<GetTranscodeTaskResponseBodyTranscodeTaskTranscodeJobInfoList> transcodeJobInfoList;

        /**
         * <p>The ID of the transcoding task.</p>
         * 
         * <strong>example:</strong>
         * <p>b1b65ab107e14*****3dbb900f6c1fe0</p>
         */
        @NameInMap("TranscodeTaskId")
        public String transcodeTaskId;

        /**
         * <p>The ID of the transcoding template group.</p>
         * 
         * <strong>example:</strong>
         * <p>b500c7094bd241*****3e9900752d7c3</p>
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
         * <p>883f5d98107*****b7f20aaa352f</p>
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
