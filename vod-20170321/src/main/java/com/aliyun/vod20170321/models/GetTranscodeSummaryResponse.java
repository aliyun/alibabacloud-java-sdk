// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeSummaryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TranscodeSummaryList")
    @Validation(required = true)
    public java.util.List<GetTranscodeSummaryResponseTranscodeSummaryList> transcodeSummaryList;

    @NameInMap("NonExistVideoIds")
    @Validation(required = true)
    public java.util.List<String> nonExistVideoIds;

    public static GetTranscodeSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeSummaryResponse self = new GetTranscodeSummaryResponse();
        return TeaModel.build(map, self);
    }

    public static class GetTranscodeSummaryResponseTranscodeSummaryListTranscodeJobInfoSummaryList extends TeaModel {
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

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("Definition")
        @Validation(required = true)
        public String definition;

        @NameInMap("Encryption")
        @Validation(required = true)
        public String encryption;

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

        @NameInMap("WatermarkIdList")
        @Validation(required = true)
        public java.util.List<String> watermarkIdList;

        public static GetTranscodeSummaryResponseTranscodeSummaryListTranscodeJobInfoSummaryList build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeSummaryResponseTranscodeSummaryListTranscodeJobInfoSummaryList self = new GetTranscodeSummaryResponseTranscodeSummaryListTranscodeJobInfoSummaryList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTranscodeSummaryResponseTranscodeSummaryList extends TeaModel {
        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        @NameInMap("TranscodeStatus")
        @Validation(required = true)
        public String transcodeStatus;

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

        @NameInMap("TranscodeJobInfoSummaryList")
        @Validation(required = true)
        public java.util.List<GetTranscodeSummaryResponseTranscodeSummaryListTranscodeJobInfoSummaryList> transcodeJobInfoSummaryList;

        public static GetTranscodeSummaryResponseTranscodeSummaryList build(java.util.Map<String, ?> map) throws Exception {
            GetTranscodeSummaryResponseTranscodeSummaryList self = new GetTranscodeSummaryResponseTranscodeSummaryList();
            return TeaModel.build(map, self);
        }

    }

}
