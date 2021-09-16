// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIMediaAuditJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MediaAuditJob")
    public GetAIMediaAuditJobResponseBodyMediaAuditJob mediaAuditJob;

    public static GetAIMediaAuditJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIMediaAuditJobResponseBody self = new GetAIMediaAuditJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIMediaAuditJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAIMediaAuditJobResponseBody setMediaAuditJob(GetAIMediaAuditJobResponseBodyMediaAuditJob mediaAuditJob) {
        this.mediaAuditJob = mediaAuditJob;
        return this;
    }
    public GetAIMediaAuditJobResponseBodyMediaAuditJob getMediaAuditJob() {
        return this.mediaAuditJob;
    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Label")
        public String label;

        @NameInMap("Result")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult> result;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult setResult(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult> getResult() {
            return this.result;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult extends TeaModel {
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

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Count")
        public Integer count;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Label")
        public String label;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList> counterList;

        @NameInMap("TopList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList> topList;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult setCounterList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList> getCounterList() {
            return this.counterList;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult setTopList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList> topList) {
            this.topList = topList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList> getTopList() {
            return this.topList;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Count")
        public Integer count;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Label")
        public String label;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList> counterList;

        @NameInMap("TopList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList> topList;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult setCounterList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList> getCounterList() {
            return this.counterList;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult setTopList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList> topList) {
            this.topList = topList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList> getTopList() {
            return this.topList;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Count")
        public Integer count;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Label")
        public String label;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList> counterList;

        @NameInMap("TopList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList> topList;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult setCounterList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList> getCounterList() {
            return this.counterList;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult setTopList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList> topList) {
            this.topList = topList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList> getTopList() {
            return this.topList;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Count")
        public Integer count;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Label")
        public String label;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList> counterList;

        @NameInMap("TopList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList> topList;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult setCounterList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList> getCounterList() {
            return this.counterList;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult setTopList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList> topList) {
            this.topList = topList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList> getTopList() {
            return this.topList;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Count")
        public Integer count;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Label")
        public String label;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList> counterList;

        @NameInMap("TopList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList> topList;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult setCounterList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList> getCounterList() {
            return this.counterList;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult setTopList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList> topList) {
            this.topList = topList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList> getTopList() {
            return this.topList;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TerrorismResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult terrorismResult;

        @NameInMap("PornResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult pornResult;

        @NameInMap("AdResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult adResult;

        @NameInMap("LiveResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult liveResult;

        @NameInMap("LogoResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult logoResult;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult setTerrorismResult(GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult terrorismResult) {
            this.terrorismResult = terrorismResult;
            return this;
        }
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult getTerrorismResult() {
            return this.terrorismResult;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult setPornResult(GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult pornResult) {
            this.pornResult = pornResult;
            return this;
        }
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult getPornResult() {
            return this.pornResult;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult setAdResult(GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult adResult) {
            this.adResult = adResult;
            return this;
        }
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult getAdResult() {
            return this.adResult;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult setLiveResult(GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult liveResult) {
            this.liveResult = liveResult;
            return this;
        }
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult getLiveResult() {
            return this.liveResult;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult setLogoResult(GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult logoResult) {
            this.logoResult = logoResult;
            return this;
        }
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult getLogoResult() {
            return this.logoResult;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobData extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("AbnormalModules")
        public String abnormalModules;

        @NameInMap("Label")
        public String label;

        @NameInMap("ImageResult")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult> imageResult;

        @NameInMap("TextResult")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult> textResult;

        @NameInMap("AudioResult")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult> audioResult;

        @NameInMap("VideoResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult videoResult;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobData build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobData self = new GetAIMediaAuditJobResponseBodyMediaAuditJobData();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobData setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobData setAbnormalModules(String abnormalModules) {
            this.abnormalModules = abnormalModules;
            return this;
        }
        public String getAbnormalModules() {
            return this.abnormalModules;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobData setImageResult(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult> imageResult) {
            this.imageResult = imageResult;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult> getImageResult() {
            return this.imageResult;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobData setTextResult(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult> textResult) {
            this.textResult = textResult;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult> getTextResult() {
            return this.textResult;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobData setAudioResult(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult> audioResult) {
            this.audioResult = audioResult;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult> getAudioResult() {
            return this.audioResult;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobData setVideoResult(GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult videoResult) {
            this.videoResult = videoResult;
            return this;
        }
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult getVideoResult() {
            return this.videoResult;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJob extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("CompleteTime")
        public String completeTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("Data")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobData data;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJob build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJob self = new GetAIMediaAuditJobResponseBodyMediaAuditJob();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setData(GetAIMediaAuditJobResponseBodyMediaAuditJobData data) {
            this.data = data;
            return this;
        }
        public GetAIMediaAuditJobResponseBodyMediaAuditJobData getData() {
            return this.data;
        }

    }

}
