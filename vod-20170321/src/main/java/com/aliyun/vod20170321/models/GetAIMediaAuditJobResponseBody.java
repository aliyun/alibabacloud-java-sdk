// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIMediaAuditJobResponseBody extends TeaModel {
    /**
     * <p>The information about the intelligent review job.</p>
     */
    @NameInMap("MediaAuditJob")
    public GetAIMediaAuditJobResponseBodyMediaAuditJob mediaAuditJob;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAIMediaAuditJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIMediaAuditJobResponseBody self = new GetAIMediaAuditJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIMediaAuditJobResponseBody setMediaAuditJob(GetAIMediaAuditJobResponseBodyMediaAuditJob mediaAuditJob) {
        this.mediaAuditJob = mediaAuditJob;
        return this;
    }
    public GetAIMediaAuditJobResponseBodyMediaAuditJob getMediaAuditJob() {
        return this.mediaAuditJob;
    }

    public GetAIMediaAuditJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult extends TeaModel {
        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **normal**</p>
         * <p>*   **spam**</p>
         * <p>*   **ad**</p>
         * <p>*   **politics**</p>
         * <p>*   **terrorism**</p>
         * <p>*   **abuse**</p>
         * <p>*   **porn**</p>
         * <p>*   **flood**: spam posts</p>
         * <p>*   **contraband**</p>
         * <p>*   **meaningless**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The review scenario. Valid value: **antispam**.</p>
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
         * <p>*   **block**: The content violates the regulations.</p>
         * <p>*   **review**: The content may violate the regulations.</p>
         * <p>*   **pass**: The content passes the review.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult();
            return TeaModel.build(map, self);
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

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult extends TeaModel {
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
         * <br>
         * <p>Valid values if scene is **ad**:</p>
         * <br>
         * <p>*   **normal**</p>
         * <p>*   **ad**</p>
         * <p>*   **politics**</p>
         * <p>*   **porn**</p>
         * <p>*   **abuse**</p>
         * <p>*   **terrorism**</p>
         * <p>*   **contraband**</p>
         * <p>*   **spam**</p>
         * <p>*   **npx**: illegal ad</p>
         * <p>*   **qrcode**: QR code</p>
         * <p>*   **programCode**</p>
         * <br>
         * <p>Valid values if scene is **live**:</p>
         * <br>
         * <p>*   **normal**</p>
         * <p>*   **meaningless**</p>
         * <p>*   **PIP**</p>
         * <p>*   **smoking**</p>
         * <p>*   **drivelive**</p>
         * <br>
         * <p>Valid values if scene is **logo**:</p>
         * <br>
         * <p>*   **normal**</p>
         * <p>*   **TV**</p>
         * <p>*   **trademark**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The review scenario. Valid values:</p>
         * <br>
         * <p>*   **porn**</p>
         * <p>*   **terrorism**</p>
         * <p>*   **ad**</p>
         * <p>*   **live**: undesirable scenes</p>
         * <p>*   **logo**</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The score of the image of the category that is indicated by Label. Valid values: `[0, 100]`. The score is representative of the confidence.</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>*   **block**: The content violates the regulations.</p>
         * <p>*   **review**: The content may violate the regulations.</p>
         * <p>*   **pass**: The content passes the review.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult();
            return TeaModel.build(map, self);
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

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult extends TeaModel {
        /**
         * <p>The category of the review result. Separate multiple values with commas (,). Valid values:</p>
         * <br>
         * <p>*   **porn**</p>
         * <p>*   **terrorism**</p>
         * <p>*   **ad**</p>
         * <p>*   **live**: undesirable scenes</p>
         * <p>*   **logo**</p>
         * <p>*   **audio**: audio anti-spam</p>
         * <p>*   **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>Details of image review results.</p>
         */
        @NameInMap("Result")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult> result;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>*   **block**: The content violates the regulations.</p>
         * <p>*   **review**: The content may violate the regulations.</p>
         * <p>*   **pass**: The content passes the review.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The type of the image. Valid value: **cover**.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the image.</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult();
            return TeaModel.build(map, self);
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

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
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

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult extends TeaModel {
        /**
         * <p>The text.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **spam**</p>
         * <p>*   **ad**</p>
         * <p>*   **abuse**</p>
         * <p>*   **flood**: spam posts</p>
         * <p>*   **contraband**</p>
         * <p>*   **meaningless**</p>
         * <p>*   **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The review scenario. Valid value: **antispam**.</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The score of the image of the category that is indicated by Label. Valid values: `[0, 100]`. The score is representative of the confidence.</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>*   **block**: The content violates the regulations.</p>
         * <p>*   **review**: The content may violate the regulations.</p>
         * <p>*   **pass**: The content passes the review.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The type of the text. The value is **title**.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList extends TeaModel {
        /**
         * <p>The number of images.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **ad**</p>
         * <p>*   **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList extends TeaModel {
        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **ad**</p>
         * <p>*   **normal**</p>
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

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
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

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult extends TeaModel {
        /**
         * <p>The average score of the review results.</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The statistics about tag frames.</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList> counterList;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **ad**</p>
         * <p>*   **normal**</p>
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
         * <p>*   **block**: The content violates the regulations.</p>
         * <p>*   **review**: The content may violate the regulations.</p>
         * <p>*   **pass**: The content passes the review.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The information about the image with the highest score of the category that is indicated by Label.</p>
         */
        @NameInMap("TopList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultTopList> topList;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult setCounterList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList> getCounterList() {
            return this.counterList;
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

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
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
        /**
         * <p>The number of images.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **live**: The content contains undesirable scenes.</p>
         * <p>*   **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList extends TeaModel {
        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **live**: The content contains undesirable scenes.</p>
         * <p>*   **normal**</p>
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

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
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

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult extends TeaModel {
        /**
         * <p>The average score of the review results.</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The categories of the review results and the number of images.</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList> counterList;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **live**: The content contains undesirable scenes.</p>
         * <p>*   **normal**</p>
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
         * <p>*   **block**: The content violates the regulations.</p>
         * <p>*   **review**: The content may violate the regulations.</p>
         * <p>*   **pass**: The content passes the review.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The information about the image with the highest score of the category that is indicated by Label.</p>
         */
        @NameInMap("TopList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultTopList> topList;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult setCounterList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList> getCounterList() {
            return this.counterList;
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

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
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
        /**
         * <p>The number of images.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **logo**</p>
         * <p>*   **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList extends TeaModel {
        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **logo**</p>
         * <p>*   **normal**</p>
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

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
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

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult extends TeaModel {
        /**
         * <p>The average score of the images of the category that is indicated by Label.</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The categories of the review results and the number of images.</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList> counterList;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **logo**</p>
         * <p>*   **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The highest score of the image of the category that is indicated by Label.</p>
         */
        @NameInMap("MaxScore")
        public String maxScore;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>*   **block**: The content violates the regulations.</p>
         * <p>*   **review**: The content may violate the regulations.</p>
         * <p>*   **pass**: The content passes the review.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The information about the image with the highest score of the category that is indicated by Label.</p>
         */
        @NameInMap("TopList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList> topList;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult setCounterList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList> getCounterList() {
            return this.counterList;
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

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult setTopList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList> topList) {
            this.topList = topList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultTopList> getTopList() {
            return this.topList;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList extends TeaModel {
        /**
         * <p>The number of images.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **porn**</p>
         * <p>*   **sexy**</p>
         * <p>*   **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList extends TeaModel {
        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **porn**</p>
         * <p>*   **sexy**</p>
         * <p>*   **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the image of the category that is indicated by Label. Valid values: `[0, 100]`. The value is accurate to 10 decimal places. The score is representative of the confidence.</p>
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

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
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

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult extends TeaModel {
        /**
         * <p>The average score of the images of the category that is indicated by Label. Valid values: `[0, 100]`. The value is accurate to 10 decimal places. The score is representative of the confidence.</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The categories of the review results and the number of images.</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList> counterList;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **porn**</p>
         * <p>*   **sexy**</p>
         * <p>*   **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The highest score of the image of the category that is indicated by Label. Valid values: `[0, 100]`. The value is accurate to 10 decimal places. The score is representative of the confidence.</p>
         */
        @NameInMap("MaxScore")
        public String maxScore;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>*   **block**: The content violates the regulations.</p>
         * <p>*   **review**: The content may violate the regulations.</p>
         * <p>*   **pass**: The content passes the review.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The information about the image with the highest score of the category that is indicated by Label.</p>
         */
        @NameInMap("TopList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList> topList;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult setCounterList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList> getCounterList() {
            return this.counterList;
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

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult setTopList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList> topList) {
            this.topList = topList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultTopList> getTopList() {
            return this.topList;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList extends TeaModel {
        /**
         * <p>The number of images.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **terrorism**</p>
         * <p>*   **outfit**</p>
         * <p>*   **logo**</p>
         * <p>*   **weapon**</p>
         * <p>*   **politics**</p>
         * <p>*   **others**</p>
         * <p>*   **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList extends TeaModel {
        /**
         * <p>The category of the review result. Valid values:</p>
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
         * <p>The score of the image of the category that is indicated by Label. Valid values: `[0, 100]`. The value is accurate to 10 decimal places. The score is representative of the confidence.</p>
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

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
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

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult extends TeaModel {
        /**
         * <p>The average score of the images of the category that is indicated by Label. Valid values: `[0, 100]`. The value is accurate to 10 decimal places. The score is representative of the confidence.</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The categories of the review results and the number of images.</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList> counterList;

        /**
         * <p>The category of the review result. Valid values:</p>
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
         * <p>The highest score of the image of the category that is indicated by Label. Valid values: `[0, 100]`. The value is accurate to 10 decimal places. The score is representative of the confidence.</p>
         */
        @NameInMap("MaxScore")
        public String maxScore;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>*   **block**: The content violates the regulations.</p>
         * <p>*   **review**: The content may violate the regulations.</p>
         * <p>*   **pass**: The content passes the review.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The information about the image with the highest score of the category that is indicated by Label.</p>
         */
        @NameInMap("TopList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList> topList;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult setCounterList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList> getCounterList() {
            return this.counterList;
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

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult setTopList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList> topList) {
            this.topList = topList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultTopList> getTopList() {
            return this.topList;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult extends TeaModel {
        /**
         * <p>The results of ad review.</p>
         */
        @NameInMap("AdResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult adResult;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **ad**</p>
         * <p>*   **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The results of undesired content review.</p>
         */
        @NameInMap("LiveResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult liveResult;

        /**
         * <p>The results of logo review.</p>
         */
        @NameInMap("LogoResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult logoResult;

        /**
         * <p>The results of pornography content review.</p>
         */
        @NameInMap("PornResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult pornResult;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>*   **block**: The content violates the regulations.</p>
         * <p>*   **review**: The content may violate the regulations.</p>
         * <p>*   **pass**: The content passes the review.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The results of terrorism content review.</p>
         */
        @NameInMap("TerrorismResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResult terrorismResult;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult setAdResult(GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult adResult) {
            this.adResult = adResult;
            return this;
        }
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult getAdResult() {
            return this.adResult;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
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

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult setPornResult(GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult pornResult) {
            this.pornResult = pornResult;
            return this;
        }
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult getPornResult() {
            return this.pornResult;
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

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobData extends TeaModel {
        /**
         * <p>The content that violates the regulations. Separate multiple values with commas (,). Valid values:</p>
         * <br>
         * <p>*   **video**: the video.</p>
         * <p>*   **image-cover**: the cover.</p>
         * <p>*   **text-title**: the title.</p>
         */
        @NameInMap("AbnormalModules")
        public String abnormalModules;

        /**
         * <p>The results of audio review.</p>
         */
        @NameInMap("AudioResult")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult> audioResult;

        /**
         * <p>The results of image review.</p>
         */
        @NameInMap("ImageResult")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult> imageResult;

        /**
         * <p>The category of the review result. Separate multiple values with commas (,). Valid values:</p>
         * <br>
         * <p>*   **porn**</p>
         * <p>*   **terrorism**</p>
         * <p>*   **ad**</p>
         * <p>*   **live**: undesirable scenes</p>
         * <p>*   **logo**</p>
         * <p>*   **audio**: audio anti-spam</p>
         * <p>*   **normal**</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The recommendation for review results. Valid values:</p>
         * <br>
         * <p>*   **block**: The content violates the regulations.</p>
         * <p>*   **review**: The content may violate the regulations.</p>
         * <p>*   **pass**: The content passes the review.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The results of text review.</p>
         */
        @NameInMap("TextResult")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult> textResult;

        /**
         * <p>The results of video review.</p>
         */
        @NameInMap("VideoResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult videoResult;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobData build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobData self = new GetAIMediaAuditJobResponseBodyMediaAuditJobData();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobData setAbnormalModules(String abnormalModules) {
            this.abnormalModules = abnormalModules;
            return this;
        }
        public String getAbnormalModules() {
            return this.abnormalModules;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobData setAudioResult(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult> audioResult) {
            this.audioResult = audioResult;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult> getAudioResult() {
            return this.audioResult;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobData setImageResult(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult> imageResult) {
            this.imageResult = imageResult;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult> getImageResult() {
            return this.imageResult;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobData setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobData setTextResult(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult> textResult) {
            this.textResult = textResult;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult> getTextResult() {
            return this.textResult;
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
        /**
         * <p>The error code. This parameter is returned if the value of Status is fail.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the job is complete. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the job started to run. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The job result data.</p>
         */
        @NameInMap("Data")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobData data;

        /**
         * <p>The ID of the job.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The ID of the video.</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The error message. This parameter is returned if the value of Status is fail.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The status of the job. Valid values:</p>
         * <br>
         * <p>*   **success**: The job is successful.</p>
         * <p>*   **fail**: The job failed.</p>
         * <p>*   **init**: The job is being initialized.</p>
         * <p>*   **Processing**: The job is in progress.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Only the job type is supported.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJob build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJob self = new GetAIMediaAuditJobResponseBodyMediaAuditJob();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setData(GetAIMediaAuditJobResponseBodyMediaAuditJobData data) {
            this.data = data;
            return this;
        }
        public GetAIMediaAuditJobResponseBodyMediaAuditJobData getData() {
            return this.data;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
