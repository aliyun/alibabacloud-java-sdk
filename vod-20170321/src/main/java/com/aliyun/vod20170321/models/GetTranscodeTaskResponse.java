// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TranscodeTask")
    @Validation(required = true)
    public GetTranscodeTaskResponseTranscodeTask transcodeTask;

    public static GetTranscodeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeTaskResponse self = new GetTranscodeTaskResponse();
        return TeaModel.build(map, self);
    }

    public static class GetTranscodeTaskResponseTranscodeTaskTranscodeJobInfoListOutputFile extends TeaModel {
        @NameInMap("Width")
        @Validation(required = true)
        public String width;

        @NameInMap("Height")
        @Validation(required = true)
        public String height;

        @NameInMap("Bitrate")
        @Validation(required = true)
        public String bitrate;

        @NameInMap("Fps")
        @Validation(required = true)
        public String fps;

        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        @NameInMap("Filesize")
        @Validation(required = true)
        public Long filesize;

        @NameInMap("Encryption")
        @Validation(required = true)
        public String encryption;

        @NameInMap("AudioStreamList")
        @Validation(required = true)
        public String audioStreamList;

        @NameInMap("VideoStreamList")
        @Validation(required = true)
        public String videoStreamList;

        @NameInMap("SubtitleStreamList")
        @Validation(required = true)
        public String subtitleStreamList;

        @NameInMap("OutputFileUrl")
        @Validation(required = true)
        public String outputFileUrl;

        @NameInMap("WatermarkIdList")
        @Validation(required = true)
        public java.util.List<String> watermarkIdList;

        public static GetTranscodeTaskResponseTranscodeTaskTranscodeJobInfoListOutputFile build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeTaskResponseTranscodeTaskTranscodeJobInfoListOutputFile self = new GetTranscodeTaskResponseTranscodeTaskTranscodeJobInfoListOutputFile();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTranscodeTaskResponseTranscodeTaskTranscodeJobInfoList extends TeaModel {
        @NameInMap("TranscodeJobId")
        @Validation(required = true)
        public String transcodeJobId;

        @NameInMap("TranscodeTemplateId")
        @Validation(required = true)
        public String transcodeTemplateId;

        @NameInMap("TranscodeJobStatus")
        @Validation(required = true)
        public String transcodeJobStatus;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("CompleteTime")
        @Validation(required = true)
        public String completeTime;

        @NameInMap("TranscodeProgress")
        @Validation(required = true)
        public Long transcodeProgress;

        @NameInMap("InputFileUrl")
        @Validation(required = true)
        public String inputFileUrl;

        @NameInMap("Priority")
        @Validation(required = true)
        public String priority;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("Definition")
        @Validation(required = true)
        public String definition;

        @NameInMap("OutputFile")
        @Validation(required = true)
        public GetTranscodeTaskResponseTranscodeTaskTranscodeJobInfoListOutputFile outputFile;

        public static GetTranscodeTaskResponseTranscodeTaskTranscodeJobInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeTaskResponseTranscodeTaskTranscodeJobInfoList self = new GetTranscodeTaskResponseTranscodeTaskTranscodeJobInfoList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTranscodeTaskResponseTranscodeTask extends TeaModel {
        @NameInMap("TranscodeTaskId")
        @Validation(required = true)
        public String transcodeTaskId;

        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        @NameInMap("TaskStatus")
        @Validation(required = true)
        public String taskStatus;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("CompleteTime")
        @Validation(required = true)
        public String completeTime;

        @NameInMap("Trigger")
        @Validation(required = true)
        public String trigger;

        @NameInMap("TranscodeTemplateGroupId")
        @Validation(required = true)
        public String transcodeTemplateGroupId;

        @NameInMap("TranscodeJobInfoList")
        @Validation(required = true)
        public java.util.List<GetTranscodeTaskResponseTranscodeTaskTranscodeJobInfoList> transcodeJobInfoList;

        public static GetTranscodeTaskResponseTranscodeTask build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeTaskResponseTranscodeTask self = new GetTranscodeTaskResponseTranscodeTask();
            return TeaModel.build(map, self);
        }

    }

}
