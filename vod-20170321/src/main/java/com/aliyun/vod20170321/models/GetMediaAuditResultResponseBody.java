// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultResponseBody extends TeaModel {
    /**
     * <p>The review results.</p>
     */
    @NameInMap("MediaAuditResult")
    public GetMediaAuditResultResponseBodyMediaAuditResult mediaAuditResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaAuditResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultResponseBody self = new GetMediaAuditResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditResultResponseBody setMediaAuditResult(GetMediaAuditResultResponseBodyMediaAuditResult mediaAuditResult) {
        this.mediaAuditResult = mediaAuditResult;
        return this;
    }
    public GetMediaAuditResultResponseBodyMediaAuditResult getMediaAuditResult() {
        return this.mediaAuditResult;
    }

    public GetMediaAuditResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultAudioResult extends TeaModel {
        /**
         * <p>The category of the review result.</p>
         * <br>
         * <p>*   **normal**</p>
         * <p>*   **spam**</p>
         * <p>*   **ad**</p>
         * <p>*   **politics**</p>
         * <p>*   **terrorism**</p>
         * <p>*   **abuse**</p>
         * <p>*   **porn**</p>
         * <p>*   **flood**</p>
         * <p>*   **contraband**</p>
         * <p>*   **meaningless**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The review scenario. The value is **antispam**.</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The score.</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>*   **block**</p>
         * <p>*   **review**</p>
         * <p>*   **pass**</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static GetMediaAuditResultResponseBodyMediaAuditResultAudioResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultAudioResult self = new GetMediaAuditResultResponseBodyMediaAuditResultAudioResult();
            return TeaModel.build(map, self);
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

        public GetMediaAuditResultResponseBodyMediaAuditResultAudioResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultAudioResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult extends TeaModel {
        /**
         * <p>The category of the review result.</p>
         * <br>
         * <p>Valid values if scene is **porn**:</p>
         * <br>
         * <p>*   **porn**</p>
         * <p>*   **sexy**</p>
         * <p>*   **normal**</p>
         * <br>
         * <p>Valid values if scene is **terrorism**:</p>
         * <br>
         * <p>*   **normal**</p>
         * <p>*   **bloody**</p>
         * <p>*   **explosion**</p>
         * <p>*   **outfit**</p>
         * <p>*   **logo**</p>
         * <p>*   **weapon**</p>
         * <p>*   **politics**</p>
         * <p>*   **violence**</p>
         * <p>*   **crowd**</p>
         * <p>*   **parade**</p>
         * <p>*   **carcrash**</p>
         * <p>*   **flag**</p>
         * <p>*   **location**</p>
         * <p>*   **others**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The review scenario. Valid values:</p>
         * <br>
         * <p>*   **terrorism**</p>
         * <p>*   **porn**</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The score of the image of the category that is indicated by Label.</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>*   **block**</p>
         * <p>*   **review**</p>
         * <p>*   **pass**</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult self = new GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult();
            return TeaModel.build(map, self);
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

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultImageResult extends TeaModel {
        /**
         * <p>The category of the review result. Separate multiple values with commas (,). Valid values:</p>
         * <br>
         * <p>*   **porn**</p>
         * <p>*   **terrorism**</p>
         * <p>*   **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>Details of image review results.</p>
         */
        @NameInMap("Result")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult> result;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>*   **block**</p>
         * <p>*   **review**</p>
         * <p>*   **pass**</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The type of the image. The value is **cover**.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the image.</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetMediaAuditResultResponseBodyMediaAuditResultImageResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultImageResult self = new GetMediaAuditResultResponseBodyMediaAuditResultImageResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResult setResult(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultImageResultResult> getResult() {
            return this.result;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultImageResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultTextResult extends TeaModel {
        /**
         * <p>The text content for review.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>- **spam**</p>
         * <p>- **ad**</p>
         * <p>- **abuse**</p>
         * <p>- **flood**</p>
         * <p>- **contraband**</p>
         * <p>- **meaningless**</p>
         * <p>- **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The review scenario. The value is **antispam**.</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The score of the image of the category that is indicated by Label.</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>- **block**</p>
         * <p>- **review**</p>
         * <p>- **pass**</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The type of the text. The value is **title**.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetMediaAuditResultResponseBodyMediaAuditResultTextResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultTextResult self = new GetMediaAuditResultResponseBodyMediaAuditResultTextResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultTextResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultTextResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultTextResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultTextResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultTextResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultTextResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList extends TeaModel {
        /**
         * <p>The number of frames.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>- **ad**</p>
         * <p>- **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList extends TeaModel {
        /**
         * <p>The category of the review result. </p>
         * <br>
         * <p>- **ad**</p>
         * <p>- **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the image of the category that is indicated by Label.</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position in the video. Unit: milliseconds.</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The URL of the image.</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
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

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult extends TeaModel {
        /**
         * <p>The average score of the review results.</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The statistics about tag frames.</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultCounterList> counterList;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>- **ad**</p>
         * <p>- **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The highest review score.</p>
         */
        @NameInMap("MaxScore")
        public String maxScore;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>- **block**</p>
         * <p>- **review**</p>
         * <p>- **pass**</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The information about the image with the highest score of the category that is indicated by Label.</p>
         */
        @NameInMap("TopList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResultTopList> topList;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult();
            return TeaModel.build(map, self);
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

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList extends TeaModel {
        /**
         * <p>The number of frames.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>- **live**: The content contains undesirable scenes.</p>
         * <p>- **normal**: normal content.</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList extends TeaModel {
        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>- **live**: The content contains undesirable scenes.</p>
         * <p>- **normal**: normal content.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the image of the category that is indicated by Label.</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position in the video. Unit: milliseconds.</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The URL of the image.</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
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

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult extends TeaModel {
        /**
         * <p>The average score of the review results.</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The statistics about tag frames.</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultCounterList> counterList;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>- **live**: The content contains undesirable scenes.</p>
         * <p>- **normal**: normal content.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The highest review score.</p>
         */
        @NameInMap("MaxScore")
        public String maxScore;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>- **block**</p>
         * <p>- **review**</p>
         * <p>- **pass**</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The information about the image with the highest score of the category that is indicated by Label.</p>
         */
        @NameInMap("TopList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResultTopList> topList;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult();
            return TeaModel.build(map, self);
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

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList extends TeaModel {
        /**
         * <p>The number of frames.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>- **logo**</p>
         * <p>- **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList extends TeaModel {
        /**
         * <p>The category of the review result.</p>
         * <br>
         * <p>- **logo**</p>
         * <p>- **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the image of the category that is indicated by Label.</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position in the video. Unit: milliseconds.</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The URL of the image.</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
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

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult extends TeaModel {
        /**
         * <p>The average score of the review results.</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The statistics about tag frames.</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultCounterList> counterList;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>- **logo**</p>
         * <p>- **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The highest review score.</p>
         */
        @NameInMap("MaxScore")
        public String maxScore;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>- **block**</p>
         * <p>- **review**</p>
         * <p>- **pass**</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The information about the image with the highest score of the category that is indicated by Label.</p>
         */
        @NameInMap("TopList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResultTopList> topList;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult();
            return TeaModel.build(map, self);
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

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList extends TeaModel {
        /**
         * <p>The number of frames.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>- **porn**</p>
         * <p>- **sexy**</p>
         * <p>- **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList extends TeaModel {
        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>- **porn**</p>
         * <p>- **sexy**</p>
         * <p>- **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the image of the category that is indicated by Label.</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position in the video. Unit: milliseconds.</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The URL of the image.</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
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

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult extends TeaModel {
        /**
         * <p>The average score of the review results.</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The statistics about tag frames.</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultCounterList> counterList;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>- **porn**</p>
         * <p>- **sexy**</p>
         * <p>- **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The highest review score.</p>
         */
        @NameInMap("MaxScore")
        public String maxScore;

        /**
         * <p>The recommendation for review results.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The information about the image with the highest score of the category that is indicated by Label.</p>
         */
        @NameInMap("TopList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResultTopList> topList;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult();
            return TeaModel.build(map, self);
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

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList extends TeaModel {
        /**
         * <p>The number of frames.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>- **normal**</p>
         * <p>- **bloody**</p>
         * <p>- **explosion**</p>
         * <p>- **outfit**</p>
         * <p>- **logo**</p>
         * <p>- **weapon**</p>
         * <p>- **politics**</p>
         * <p>- **violence**</p>
         * <p>- **crowd**</p>
         * <p>- **parade**</p>
         * <p>- **carcrash**</p>
         * <p>- **flag**</p>
         * <p>- **location**</p>
         * <p>- **others**</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList extends TeaModel {
        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>- **normal**</p>
         * <p>- **bloody**</p>
         * <p>- **explosion**</p>
         * <p>- **outfit**</p>
         * <p>- **logo**</p>
         * <p>- **weapon**</p>
         * <p>- **politics**</p>
         * <p>- **violence**</p>
         * <p>- **crowd**</p>
         * <p>- **parade**</p>
         * <p>- **carcrash**</p>
         * <p>- **flag**</p>
         * <p>- **location**</p>
         * <p>- **others**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the image of the category that is indicated by Label.</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position in the video. Unit: milliseconds.</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The URL of the image.</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
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

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult extends TeaModel {
        /**
         * <p>The average score of the review results.</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The statistics about tag frames.</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultCounterList> counterList;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>- **normal**</p>
         * <p>- **bloody**</p>
         * <p>- **explosion**</p>
         * <p>- **outfit**</p>
         * <p>- **logo**</p>
         * <p>- **weapon**</p>
         * <p>- **politics**</p>
         * <p>- **violence**</p>
         * <p>- **crowd**</p>
         * <p>- **parade**</p>
         * <p>- **carcrash**</p>
         * <p>- **flag**</p>
         * <p>- **location**</p>
         * <p>- **others**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The highest review score.</p>
         */
        @NameInMap("MaxScore")
        public String maxScore;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>- **block**</p>
         * <p>- **review**</p>
         * <p>- **pass**</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The information about the image with the highest score of the category that is indicated by Label.</p>
         */
        @NameInMap("TopList")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResultTopList> topList;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult();
            return TeaModel.build(map, self);
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

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResultVideoResult extends TeaModel {
        /**
         * <p>The results of ad review.</p>
         */
        @NameInMap("AdResult")
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultAdResult adResult;

        /**
         * <p>The category of the review result. Separate multiple values with commas (,). Valid values: </p>
         * <br>
         * <p>- **porn**</p>
         * <p>- **terrorism**</p>
         * <p>- **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The results of undesired content review.</p>
         */
        @NameInMap("LiveResult")
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult liveResult;

        /**
         * <p>The results of logo review.</p>
         */
        @NameInMap("LogoResult")
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult logoResult;

        /**
         * <p>The results of pornographic content review.</p>
         */
        @NameInMap("PornResult")
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult pornResult;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>- **block**</p>
         * <p>- **review**</p>
         * <p>- **pass**</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The results of terrorist content review.</p>
         */
        @NameInMap("TerrorismResult")
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult terrorismResult;

        public static GetMediaAuditResultResponseBodyMediaAuditResultVideoResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResultVideoResult self = new GetMediaAuditResultResponseBodyMediaAuditResultVideoResult();
            return TeaModel.build(map, self);
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

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult setLiveResult(GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult liveResult) {
            this.liveResult = liveResult;
            return this;
        }
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLiveResult getLiveResult() {
            return this.liveResult;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult setLogoResult(GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult logoResult) {
            this.logoResult = logoResult;
            return this;
        }
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultLogoResult getLogoResult() {
            return this.logoResult;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult setPornResult(GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult pornResult) {
            this.pornResult = pornResult;
            return this;
        }
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultPornResult getPornResult() {
            return this.pornResult;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult setTerrorismResult(GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult terrorismResult) {
            this.terrorismResult = terrorismResult;
            return this;
        }
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResultTerrorismResult getTerrorismResult() {
            return this.terrorismResult;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResult extends TeaModel {
        /**
         * <p>The content that violates the regulations. Separate multiple values with commas (,). Valid values:</p>
         * <br>
         * <p>*   **video**</p>
         * <p>*   **image-cover**</p>
         * <p>*   **text-title**</p>
         */
        @NameInMap("AbnormalModules")
        public String abnormalModules;

        /**
         * <p>The results of audio review.</p>
         */
        @NameInMap("AudioResult")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultAudioResult> audioResult;

        /**
         * <p>The results of image review.</p>
         */
        @NameInMap("ImageResult")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultImageResult> imageResult;

        /**
         * <p>The category of the review result. Separate multiple values with commas (,). Valid values:</p>
         * <br>
         * <p>*   **porn**</p>
         * <p>*   **terrorism**</p>
         * <p>*   **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>*   **block**</p>
         * <p>*   **review**</p>
         * <p>*   **pass**</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The results of text review.</p>
         */
        @NameInMap("TextResult")
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultTextResult> textResult;

        /**
         * <p>The results of video review.</p>
         */
        @NameInMap("VideoResult")
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult videoResult;

        public static GetMediaAuditResultResponseBodyMediaAuditResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResult self = new GetMediaAuditResultResponseBodyMediaAuditResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setAbnormalModules(String abnormalModules) {
            this.abnormalModules = abnormalModules;
            return this;
        }
        public String getAbnormalModules() {
            return this.abnormalModules;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setAudioResult(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultAudioResult> audioResult) {
            this.audioResult = audioResult;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultAudioResult> getAudioResult() {
            return this.audioResult;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setImageResult(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultImageResult> imageResult) {
            this.imageResult = imageResult;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultImageResult> getImageResult() {
            return this.imageResult;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setTextResult(java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultTextResult> textResult) {
            this.textResult = textResult;
            return this;
        }
        public java.util.List<GetMediaAuditResultResponseBodyMediaAuditResultTextResult> getTextResult() {
            return this.textResult;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setVideoResult(GetMediaAuditResultResponseBodyMediaAuditResultVideoResult videoResult) {
            this.videoResult = videoResult;
            return this;
        }
        public GetMediaAuditResultResponseBodyMediaAuditResultVideoResult getVideoResult() {
            return this.videoResult;
        }

    }

}
