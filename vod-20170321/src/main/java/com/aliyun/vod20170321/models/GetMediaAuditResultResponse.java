// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaAuditResult")
    @Validation(required = true)
    public GetMediaAuditResultResponseMediaAuditResult mediaAuditResult;

    public static GetMediaAuditResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultResponse self = new GetMediaAuditResultResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMediaAuditResultResponseMediaAuditResultAudioResult extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Scene")
        @Validation(required = true)
        public String scene;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        public static GetMediaAuditResultResponseMediaAuditResultAudioResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultAudioResult self = new GetMediaAuditResultResponseMediaAuditResultAudioResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultImageResultResult extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Scene")
        @Validation(required = true)
        public String scene;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        public static GetMediaAuditResultResponseMediaAuditResultImageResultResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultImageResultResult self = new GetMediaAuditResultResponseMediaAuditResultImageResultResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultImageResult extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        @NameInMap("Result")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultImageResultResult> result;

        public static GetMediaAuditResultResponseMediaAuditResultImageResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultImageResult self = new GetMediaAuditResultResponseMediaAuditResultImageResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultTextResult extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Scene")
        @Validation(required = true)
        public String scene;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static GetMediaAuditResultResponseMediaAuditResultTextResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultTextResult self = new GetMediaAuditResultResponseMediaAuditResultTextResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultCounterList extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultCounterList self = new GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultCounterList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultTopList extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultTopList self = new GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultTopList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultPornResult extends TeaModel {
        @NameInMap("AverageScore")
        @Validation(required = true)
        public String averageScore;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("MaxScore")
        @Validation(required = true)
        public String maxScore;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("CounterList")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultCounterList> counterList;

        @NameInMap("TopList")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultVideoResultPornResultTopList> topList;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultPornResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultPornResult self = new GetMediaAuditResultResponseMediaAuditResultVideoResultPornResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultAdResultCounterList extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultAdResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultAdResultCounterList self = new GetMediaAuditResultResponseMediaAuditResultVideoResultAdResultCounterList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultAdResultTopList extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultAdResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultAdResultTopList self = new GetMediaAuditResultResponseMediaAuditResultVideoResultAdResultTopList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultAdResult extends TeaModel {
        @NameInMap("AverageScore")
        @Validation(required = true)
        public String averageScore;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("MaxScore")
        @Validation(required = true)
        public String maxScore;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("CounterList")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultVideoResultAdResultCounterList> counterList;

        @NameInMap("TopList")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultVideoResultAdResultTopList> topList;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultAdResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultAdResult self = new GetMediaAuditResultResponseMediaAuditResultVideoResultAdResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultLogoResultCounterList extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultLogoResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultLogoResultCounterList self = new GetMediaAuditResultResponseMediaAuditResultVideoResultLogoResultCounterList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultLogoResultTopList extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultLogoResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultLogoResultTopList self = new GetMediaAuditResultResponseMediaAuditResultVideoResultLogoResultTopList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultLogoResult extends TeaModel {
        @NameInMap("AverageScore")
        @Validation(required = true)
        public String averageScore;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("MaxScore")
        @Validation(required = true)
        public String maxScore;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("CounterList")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultVideoResultLogoResultCounterList> counterList;

        @NameInMap("TopList")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultVideoResultLogoResultTopList> topList;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultLogoResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultLogoResult self = new GetMediaAuditResultResponseMediaAuditResultVideoResultLogoResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultLiveResultCounterList extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultLiveResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultLiveResultCounterList self = new GetMediaAuditResultResponseMediaAuditResultVideoResultLiveResultCounterList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultLiveResultTopList extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultLiveResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultLiveResultTopList self = new GetMediaAuditResultResponseMediaAuditResultVideoResultLiveResultTopList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultLiveResult extends TeaModel {
        @NameInMap("AverageScore")
        @Validation(required = true)
        public String averageScore;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("MaxScore")
        @Validation(required = true)
        public String maxScore;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("CounterList")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultVideoResultLiveResultCounterList> counterList;

        @NameInMap("TopList")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultVideoResultLiveResultTopList> topList;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultLiveResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultLiveResult self = new GetMediaAuditResultResponseMediaAuditResultVideoResultLiveResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultCounterList extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultCounterList self = new GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultCounterList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultTopList extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultTopList self = new GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultTopList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResult extends TeaModel {
        @NameInMap("AverageScore")
        @Validation(required = true)
        public String averageScore;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("MaxScore")
        @Validation(required = true)
        public String maxScore;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("CounterList")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultCounterList> counterList;

        @NameInMap("TopList")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResultTopList> topList;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResult self = new GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResultVideoResult extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("PornResult")
        @Validation(required = true)
        public GetMediaAuditResultResponseMediaAuditResultVideoResultPornResult pornResult;

        @NameInMap("AdResult")
        @Validation(required = true)
        public GetMediaAuditResultResponseMediaAuditResultVideoResultAdResult adResult;

        @NameInMap("LogoResult")
        @Validation(required = true)
        public GetMediaAuditResultResponseMediaAuditResultVideoResultLogoResult logoResult;

        @NameInMap("LiveResult")
        @Validation(required = true)
        public GetMediaAuditResultResponseMediaAuditResultVideoResultLiveResult liveResult;

        @NameInMap("TerrorismResult")
        @Validation(required = true)
        public GetMediaAuditResultResponseMediaAuditResultVideoResultTerrorismResult terrorismResult;

        public static GetMediaAuditResultResponseMediaAuditResultVideoResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResultVideoResult self = new GetMediaAuditResultResponseMediaAuditResultVideoResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMediaAuditResultResponseMediaAuditResult extends TeaModel {
        @NameInMap("AbnormalModules")
        @Validation(required = true)
        public String abnormalModules;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("AudioResult")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultAudioResult> audioResult;

        @NameInMap("ImageResult")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultImageResult> imageResult;

        @NameInMap("TextResult")
        @Validation(required = true)
        public java.util.List<GetMediaAuditResultResponseMediaAuditResultTextResult> textResult;

        @NameInMap("VideoResult")
        @Validation(required = true)
        public GetMediaAuditResultResponseMediaAuditResultVideoResult videoResult;

        public static GetMediaAuditResultResponseMediaAuditResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseMediaAuditResult self = new GetMediaAuditResultResponseMediaAuditResult();
            return TeaModel.build(map, self);
        }

    }

}
