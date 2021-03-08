// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MediaAuditResult")
    public GetMediaAuditResultResponseBodyMediaAuditResult mediaAuditResult;

    public static GetMediaAuditResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultResponseBody self = new GetMediaAuditResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaAuditResultResponseBody setMediaAuditResult(GetMediaAuditResultResponseBodyMediaAuditResult mediaAuditResult) {
        this.mediaAuditResult = mediaAuditResult;
        return this;
    }
    public GetMediaAuditResultResponseBodyMediaAuditResult getMediaAuditResult() {
        return this.mediaAuditResult;
    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Score")
        public String score;

        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        public static GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult self = new GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultImageResult extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Result")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult> result;

        @NameInMap("Url")
        public String url;

        @NameInMap("Label")
        public String label;

        public static GetMediaAuditResultResponseBodyMediaAuditResultImageResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultImageResult self = new GetMediaAuditResultResponseBodyMediaAuditResultImageResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResult setResult(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult> getResult() {
            return this.result;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultAudioResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Score")
        public String score;

        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        public static GetMediaAuditResultResponseBodyMediaAuditResultAudioResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultAudioResult self = new GetMediaAuditResultResponseBodyMediaAuditResultAudioResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultAudioResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultAudioResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultAudioResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultAudioResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Label")
        public String label;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Count")
        public Integer count;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TopList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList> topList;

        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("CounterList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList> counterList;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult setTopList(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList> topList) {
            this.topList = topList;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList> getTopList() {
            return this.topList;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult setCounterList(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList> getCounterList() {
            return this.counterList;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Label")
        public String label;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Count")
        public Integer count;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TopList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList> topList;

        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("CounterList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList> counterList;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult setTopList(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList> topList) {
            this.topList = topList;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList> getTopList() {
            return this.topList;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult setCounterList(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList> getCounterList() {
            return this.counterList;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Label")
        public String label;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Count")
        public Integer count;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TopList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList> topList;

        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("CounterList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList> counterList;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult setTopList(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList> topList) {
            this.topList = topList;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList> getTopList() {
            return this.topList;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult setCounterList(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList> getCounterList() {
            return this.counterList;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Label")
        public String label;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Count")
        public Integer count;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TopList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList> topList;

        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("CounterList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList> counterList;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult setTopList(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList> topList) {
            this.topList = topList;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList> getTopList() {
            return this.topList;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult setCounterList(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList> getCounterList() {
            return this.counterList;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Label")
        public String label;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Count")
        public Integer count;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TopList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList> topList;

        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("CounterList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList> counterList;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult setTopList(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList> topList) {
            this.topList = topList;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList> getTopList() {
            return this.topList;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult setCounterList(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList> getCounterList() {
            return this.counterList;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResult extends TeaModel {
        @NameInMap("LogoResult")
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult logoResult;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("LiveResult")
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult liveResult;

        @NameInMap("PornResult")
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult pornResult;

        @NameInMap("AdResult")
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult adResult;

        @NameInMap("Label")
        public String label;

        @NameInMap("TerrorismResult")
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult terrorismResult;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResult self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult setLogoResult(GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult logoResult) {
            this.logoResult = logoResult;
            return this;
        }
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult getLogoResult() {
            return this.logoResult;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult setLiveResult(GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult liveResult) {
            this.liveResult = liveResult;
            return this;
        }
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult getLiveResult() {
            return this.liveResult;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult setPornResult(GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult pornResult) {
            this.pornResult = pornResult;
            return this;
        }
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult getPornResult() {
            return this.pornResult;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult setAdResult(GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult adResult) {
            this.adResult = adResult;
            return this;
        }
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult getAdResult() {
            return this.adResult;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult setTerrorismResult(GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult terrorismResult) {
            this.terrorismResult = terrorismResult;
            return this;
        }
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult getTerrorismResult() {
            return this.terrorismResult;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultTextResult extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Score")
        public String score;

        @NameInMap("Label")
        public String label;

        @NameInMap("Content")
        public String content;

        @NameInMap("Scene")
        public String scene;

        public static GetMediaAuditResultResponseBodyMediaAuditResultTextResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultTextResult self = new GetMediaAuditResultResponseBodyMediaAuditResultTextResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultTextResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultTextResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultTextResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultTextResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultTextResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultTextResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("ImageResult")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultImageResult> imageResult;

        @NameInMap("AudioResult")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultAudioResult> audioResult;

        @NameInMap("VideoResult")
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult videoResult;

        @NameInMap("AbnormalModules")
        public String abnormalModules;

        @NameInMap("Label")
        public String label;

        @NameInMap("TextResult")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultTextResult> textResult;

        public static GetMediaAuditResultResponseBodyMediaAuditResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResult self = new GetMediaAuditResultResponseBodyMediaAuditResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setImageResult(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultImageResult> imageResult) {
            this.imageResult = imageResult;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultImageResult> getImageResult() {
            return this.imageResult;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setAudioResult(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultAudioResult> audioResult) {
            this.audioResult = audioResult;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultAudioResult> getAudioResult() {
            return this.audioResult;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setVideoResult(GetMediaAuditResultResponseBodyMediaAuditResultVideoResult videoResult) {
            this.videoResult = videoResult;
            return this;
        }
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult getVideoResult() {
            return this.videoResult;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setAbnormalModules(String abnormalModules) {
            this.abnormalModules = abnormalModules;
            return this;
        }
        public String getAbnormalModules() {
            return this.abnormalModules;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setTextResult(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultTextResult> textResult) {
            this.textResult = textResult;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultTextResult> getTextResult() {
            return this.textResult;
        }

    }

}
