// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIMediaAuditJobResponseBody extends TeaModel {
    /**
     * <p>The automated review job information.</p>
     */
    @NameInMap("MediaAuditJob")
    public GetAIMediaAuditJobResponseBodyMediaAuditJob mediaAuditJob;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EAA3E96A-02E2-41*****85-08E1D568ED3A</p>
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
         * <p>The review result category. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>spam</strong>: Spam content.</li>
         * <li><strong>ad</strong>: Ad.</li>
         * <li><strong>politics</strong>: Political content.</li>
         * <li><strong>terrorism</strong>: Terrorist content.</li>
         * <li><strong>abuse</strong>: Abuse.</li>
         * <li><strong>porn</strong>: Pornographic content.</li>
         * <li><strong>flood</strong>: Flooding.</li>
         * <li><strong>contraband</strong>: Contraband.</li>
         * <li><strong>meaningless</strong>: Meaningless.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The review scene. Fixed value: <strong>antispam</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>antispam</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The result score.</p>
         * 
         * <strong>example:</strong>
         * <p>99.91</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The review suggestion. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: Violation.</li>
         * <li><strong>review</strong>: Suspected violation.</li>
         * <li><strong>pass</strong>: Passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
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
         * <p>The review result category.</p>
         * <p>When the scene is <strong>porn</strong>, valid values:</p>
         * <ul>
         * <li><strong>porn</strong>: Pornographic.</li>
         * <li><strong>sexy</strong>: Sexy.</li>
         * <li><strong>normal</strong>: Normal.</li>
         * </ul>
         * <p>When the scene is <strong>terrorism</strong>, valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>bloody</strong>: Bloody.</li>
         * <li><strong>explosion</strong>: Explosion and smoke.</li>
         * <li><strong>outfit</strong>: Special outfit.</li>
         * <li><strong>logo</strong>: Special logo.</li>
         * <li><strong>weapon</strong>: Weapon.</li>
         * <li><strong>politics</strong>: Political content.</li>
         * <li><strong>violence</strong>: Violence.</li>
         * <li><strong>crowd</strong>: Crowd.</li>
         * <li><strong>parade</strong>: Parade.</li>
         * <li><strong>carcrash</strong>: Car crash.</li>
         * <li><strong>flag</strong>: Flag.</li>
         * <li><strong>location</strong>: Landmark.</li>
         * <li><strong>others</strong>: Others.</li>
         * </ul>
         * <p>When the scene is <strong>ad</strong>, valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>ad</strong>: Other ads.</li>
         * <li><strong>politics</strong>: Text containing political content.</li>
         * <li><strong>porn</strong>: Text containing pornographic content.</li>
         * <li><strong>abuse</strong>: Text containing abusive content.</li>
         * <li><strong>terrorism</strong>: Text containing terrorist content.</li>
         * <li><strong>contraband</strong>: Text containing contraband content.</li>
         * <li><strong>spam</strong>: Text containing other spam content.</li>
         * <li><strong>npx</strong>: Nuisance ad.</li>
         * <li><strong>qrcode</strong>: QR code included.</li>
         * <li><strong>programCode</strong>: Mini program code included.</li>
         * </ul>
         * <p>When the scene is <strong>live</strong>, valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>meaningless</strong>: No content in the image, such as a black or white screen.</li>
         * <li><strong>PIP</strong>: Picture-in-Picture (PiP).</li>
         * <li><strong>smoking</strong>: Smoking.</li>
         * <li><strong>drivelive</strong>: In-car live streaming.</li>
         * </ul>
         * <p>When the scene is <strong>logo</strong>, valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>TV</strong>: Regulated logo included.</li>
         * <li><strong>trademark</strong>: Trademark included.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The review scene. Valid values:</p>
         * <ul>
         * <li><strong>porn</strong>: Pornography detection.</li>
         * <li><strong>terrorism</strong>: Terrorist and political content detection.</li>
         * <li><strong>ad</strong>: Image and text violation detection.</li>
         * <li><strong>live</strong>: Undesirable scene detection.</li>
         * <li><strong>logo</strong>: Image logo detection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The score of the image that hits the label. Valid values: <code>[0, 100]</code>. The score indicates the probability that the image belongs to the corresponding label category. A higher score indicates higher accuracy.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The review suggestion. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: Violation.</li>
         * <li><strong>review</strong>: Suspected violation.</li>
         * <li><strong>pass</strong>: Passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
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
         * <p>The image review result category. Multiple values are separated by commas (,). Valid values:</p>
         * <ul>
         * <li><strong>porn</strong>: Pornographic content.</li>
         * <li><strong>terrorism</strong>: Terrorist and political content.</li>
         * <li><strong>ad</strong>: Image and text violation.</li>
         * <li><strong>live</strong>: Undesirable scene.</li>
         * <li><strong>logo</strong>: Image logo.</li>
         * <li><strong>normal</strong>: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The image review result details.</p>
         */
        @NameInMap("Result")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResultResult> result;

        /**
         * <p>The review suggestion. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: Violation.</li>
         * <li><strong>review</strong>: Suspected violation.</li>
         * <li><strong>pass</strong>: Passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The image category. Valid value: <strong>cover</strong> (thumbnail).</p>
         * 
         * <strong>example:</strong>
         * <p>cover</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.test.com/****.jpg">http://www.test.com/****.jpg</a></p>
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
         * <p>The text content.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The review result category. Valid values:</p>
         * <ul>
         * <li><strong>spam</strong>: Spam content.</li>
         * <li><strong>ad</strong>: Ad.</li>
         * <li><strong>abuse</strong>: Abuse.</li>
         * <li><strong>flood</strong>: Flooding.</li>
         * <li><strong>contraband</strong>: Contraband.</li>
         * <li><strong>meaningless</strong>: Meaningless.</li>
         * <li><strong>normal</strong>: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ad</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The review scene. Fixed value: <strong>antispam</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>antispam</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The score of the image that hits the label. Valid values: <code>[0, 100]</code>. The score indicates the probability that the image belongs to the corresponding label category. A higher score indicates higher accuracy.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The review suggestion. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: Violation.</li>
         * <li><strong>review</strong>: Suspected violation.</li>
         * <li><strong>pass</strong>: Passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The text categorization. Valid value: <strong>title</strong> (title).</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
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
         * <p>The number of video snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The ad review result category. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>ad</strong>: Other ads.</li>
         * <li><strong>politics</strong>: Text containing political content.</li>
         * <li><strong>porn</strong>: Text containing pornographic content.</li>
         * <li><strong>abuse</strong>: Text containing abusive content.</li>
         * <li><strong>terrorism</strong>: Text containing terrorist content.</li>
         * <li><strong>contraband</strong>: Text containing contraband content.</li>
         * <li><strong>spam</strong>: Text containing other spam content.</li>
         * <li><strong>npx</strong>: Nuisance ad.</li>
         * <li><strong>qrcode</strong>: QR code included.</li>
         * <li><strong>programCode</strong>: Mini program code included.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ad</p>
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
         * <p>The ad review result category. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>ad</strong>: Other ads.</li>
         * <li><strong>politics</strong>: Text containing political content.</li>
         * <li><strong>porn</strong>: Text containing pornographic content.</li>
         * <li><strong>abuse</strong>: Text containing abusive content.</li>
         * <li><strong>terrorism</strong>: Text containing terrorist content.</li>
         * <li><strong>contraband</strong>: Text containing contraband content.</li>
         * <li><strong>spam</strong>: Text containing other spam content.</li>
         * <li><strong>npx</strong>: Nuisance ad.</li>
         * <li><strong>qrcode</strong>: QR code included.</li>
         * <li><strong>programCode</strong>: Mini program code included.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ad</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the video snapshot that hits the label.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position of the video snapshot in the video. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The URL of the video snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg">http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg</a></p>
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
         * <p>The average score of the ad review result.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The categories of the review results and the number of video snapshots for each category.</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResultCounterList> counterList;

        /**
         * <p>The ad review result category. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>ad</strong>: Other ads.</li>
         * <li><strong>politics</strong>: Text containing political content.</li>
         * <li><strong>porn</strong>: Text containing pornographic content.</li>
         * <li><strong>abuse</strong>: Text containing abusive content.</li>
         * <li><strong>terrorism</strong>: Text containing terrorist content.</li>
         * <li><strong>contraband</strong>: Text containing contraband content.</li>
         * <li><strong>spam</strong>: Text containing other spam content.</li>
         * <li><strong>npx</strong>: Nuisance ad.</li>
         * <li><strong>qrcode</strong>: QR code included.</li>
         * <li><strong>programCode</strong>: Mini program code included.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ad</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The highest review score.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxScore")
        public String maxScore;

        /**
         * <p>The review suggestion. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: Violation.</li>
         * <li><strong>review</strong>: Suspected violation.</li>
         * <li><strong>pass</strong>: Passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The information about the video snapshots with the highest scores for the hit label.</p>
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

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultCounterList extends TeaModel {
        /**
         * <p>The number of video frames that correspond to the label.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The moderation result label.</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultCounterList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultCounterList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultCounterList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultCounterList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultCounterList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultTopList extends TeaModel {
        /**
         * <p>The moderation category.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The confidence score of the video snapshot that hits the label.</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position of the video snapshot in the video.</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The URL of the video snapshot.</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultTopList build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultTopList self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultTopList();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultTopList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultTopList setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultTopList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultTopList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResult extends TeaModel {
        /**
         * <p>The average confidence score of the hit frames. This parameter is not returned if no frames are hit.</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The aggregated count of violation labels, including Label (the Green label) and Count (the number of frames that hit the label).</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultCounterList> counterList;

        /**
         * <p>The union of hit Green native labels, separated by commas, such as pornographic_adultContent_tii. If no labels are hit, the value is normal.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The highest confidence score of the hit frames. This parameter is not returned if no frames are hit.</p>
         */
        @NameInMap("MaxScore")
        public String maxScore;

        /**
         * <p>The image moderation conclusion, which is mapped from frameResult.riskLevel: high to block, medium or low to review, and none to pass.</p>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The details of the hit frames, sorted in descending order of confidence score.</p>
         */
        @NameInMap("TopList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultTopList> topList;

        public static GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResult self = new GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResult();
            return TeaModel.build(map, self);
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResult setCounterList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultCounterList> counterList) {
            this.counterList = counterList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultCounterList> getCounterList() {
            return this.counterList;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResult setTopList(java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultTopList> topList) {
            this.topList = topList;
            return this;
        }
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResultTopList> getTopList() {
            return this.topList;
        }

    }

    public static class GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList extends TeaModel {
        /**
         * <p>The number of video snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The moderation category. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: normal</li>
         * <li><strong>meaningless</strong>: the image contains no content, such as a black or white screen</li>
         * <li><strong>PIP</strong>: Picture-in-Picture (PiP)</li>
         * <li><strong>smoking</strong>: smoking</li>
         * <li><strong>drivelive</strong>: live streaming inside a vehicle</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>smoking</p>
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
         * <p>The moderation category. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: normal</li>
         * <li><strong>meaningless</strong>: the image contains no content, such as a black or white screen</li>
         * <li><strong>PIP</strong>: Picture-in-Picture (PiP)</li>
         * <li><strong>smoking</strong>: smoking</li>
         * <li><strong>drivelive</strong>: live streaming inside a vehicle</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>smoking</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the video snapshot that hits the label.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position of the video snapshot in the video. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The URL of the video snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg">http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg</a></p>
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
         * <p>The average score of the moderation result.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The moderation categories and the number of video snapshots for each category.</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResultCounterList> counterList;

        /**
         * <p>The moderation category. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: normal</li>
         * <li><strong>meaningless</strong>: the image contains no content, such as a black or white screen</li>
         * <li><strong>PIP</strong>: Picture-in-Picture (PiP)</li>
         * <li><strong>smoking</strong>: smoking</li>
         * <li><strong>drivelive</strong>: live streaming inside a vehicle</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>smoking</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The highest review score.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxScore")
        public String maxScore;

        /**
         * <p>The moderation suggestion. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: The content violates regulations.</li>
         * <li><strong>review</strong>: The content is suspected of violating regulations.</li>
         * <li><strong>pass</strong>: The content passes the moderation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The information about the video snapshots with the highest scores for the hit label.</p>
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
         * <p>The number of video snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The logo moderation category. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: normal</li>
         * <li><strong>TV</strong>: the image contains a regulated logo</li>
         * <li><strong>trademark</strong>: the image contains a trademark</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TV</p>
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
         * <p>The logo moderation category. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: normal</li>
         * <li><strong>TV</strong>: the image contains a regulated logo</li>
         * <li><strong>trademark</strong>: the image contains a trademark</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TV</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the video snapshot that hits the label.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position of the video snapshot in the video. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The URL of the video snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg">http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg</a></p>
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
         * <p>The average score of the video snapshots that hit the label.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The moderation categories and the number of video snapshots for each category.</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResultCounterList> counterList;

        /**
         * <p>The logo moderation category. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: normal</li>
         * <li><strong>TV</strong>: the image contains a regulated logo</li>
         * <li><strong>trademark</strong>: the image contains a trademark</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TV</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The highest score of the video snapshots that hit the label.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxScore")
        public String maxScore;

        /**
         * <p>The logo moderation suggestion. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: The content violates regulations.</li>
         * <li><strong>review</strong>: The content is suspected of violating regulations.</li>
         * <li><strong>pass</strong>: The content passes the moderation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The information about the video snapshots with the highest scores for the hit label.</p>
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
         * <p>The number of video snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The pornography detection result. Valid values:</p>
         * <ul>
         * <li><strong>porn</strong>: Pornographic.</li>
         * <li><strong>sexy</strong>: Sexy.</li>
         * <li><strong>normal</strong>: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
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
         * <p>The pornography detection result. Valid values:</p>
         * <ul>
         * <li><strong>porn</strong>: Pornographic.</li>
         * <li><strong>sexy</strong>: Sexy.</li>
         * <li><strong>normal</strong>: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the video snapshot that hits the label. Valid values: <code>[0, 100]</code>. The precision is 10 decimal places. The score indicates the probability that the snapshot belongs to the corresponding label category. A higher score indicates higher accuracy.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position of the video snapshot in the video. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3005</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The URL of the video snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg">http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg</a></p>
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
         * <p>The average score of the video snapshots that hit the label. Valid values: <code>[0, 100]</code>. The precision is 10 decimal places. The score indicates the probability that the snapshot belongs to the corresponding label category. A higher score indicates higher accuracy.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The categories of the review results and the number of video snapshots for each category.</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResultCounterList> counterList;

        /**
         * <p>The pornography detection result. Valid values:</p>
         * <ul>
         * <li><strong>porn</strong>: Pornographic.</li>
         * <li><strong>sexy</strong>: Sexy.</li>
         * <li><strong>normal</strong>: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The highest score of the video snapshots that hit the label. Valid values: <code>[0, 100]</code>. The precision is 10 decimal places. The score indicates the probability that the snapshot belongs to the corresponding label category. A higher score indicates higher accuracy.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxScore")
        public String maxScore;

        /**
         * <p>The pornography detection suggestion. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: Violation.</li>
         * <li><strong>review</strong>: Suspected violation.</li>
         * <li><strong>pass</strong>: Passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The information about the video snapshots with the highest scores for the hit label.</p>
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
         * <p>The number of video snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The terrorist and political content review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>bloody</strong>: Bloody.</li>
         * <li><strong>explosion</strong>: Explosion and smoke.</li>
         * <li><strong>outfit</strong>: Special outfit.</li>
         * <li><strong>logo</strong>: Special logo.</li>
         * <li><strong>weapon</strong>: Weapon.</li>
         * <li><strong>politics</strong>: Political content.</li>
         * <li><strong>violence</strong>: Violence.</li>
         * <li><strong>crowd</strong>: Crowd.</li>
         * <li><strong>parade</strong>: Parade.</li>
         * <li><strong>carcrash</strong>: Car crash.</li>
         * <li><strong>flag</strong>: Flag.</li>
         * <li><strong>location</strong>: Landmark.</li>
         * <li><strong>others</strong>: Others.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>terrorism</p>
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
         * <p>The terrorist and political content review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>bloody</strong>: Bloody.</li>
         * <li><strong>explosion</strong>: Explosion and smoke.</li>
         * <li><strong>outfit</strong>: Special outfit.</li>
         * <li><strong>logo</strong>: Special logo.</li>
         * <li><strong>weapon</strong>: Weapon.</li>
         * <li><strong>politics</strong>: Political content.</li>
         * <li><strong>violence</strong>: Violence.</li>
         * <li><strong>crowd</strong>: Crowd.</li>
         * <li><strong>parade</strong>: Parade.</li>
         * <li><strong>carcrash</strong>: Car crash.</li>
         * <li><strong>flag</strong>: Flag.</li>
         * <li><strong>location</strong>: Landmark.</li>
         * <li><strong>others</strong>: Others.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the video snapshot that hits the label. Valid values: <code>[0, 100]</code>. The precision is 10 decimal places. The score indicates the probability that the snapshot belongs to the corresponding label category. A higher score indicates higher accuracy.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position of the video snapshot in the video. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The URL of the video snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://ali*****.com/aivideocensor/yytysursrutyrxuq/****.jpg">http://ali*****.com/aivideocensor/yytysursrutyrxuq/****.jpg</a></p>
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
         * <p>The average score of the video snapshots that hit the label. Valid values: <code>[0, 100]</code>. The precision is 10 decimal places. The score indicates the probability that the snapshot belongs to the corresponding label category. A higher score indicates higher accuracy.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AverageScore")
        public String averageScore;

        /**
         * <p>The categories of the terrorist and political content review results and the number of video snapshots for each category.</p>
         */
        @NameInMap("CounterList")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultTerrorismResultCounterList> counterList;

        /**
         * <p>The terrorist and political content review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>bloody</strong>: Bloody.</li>
         * <li><strong>explosion</strong>: Explosion and smoke.</li>
         * <li><strong>outfit</strong>: Special outfit.</li>
         * <li><strong>logo</strong>: Special logo.</li>
         * <li><strong>weapon</strong>: Weapon.</li>
         * <li><strong>politics</strong>: Political content.</li>
         * <li><strong>violence</strong>: Violence.</li>
         * <li><strong>crowd</strong>: Crowd.</li>
         * <li><strong>parade</strong>: Parade.</li>
         * <li><strong>carcrash</strong>: Car crash.</li>
         * <li><strong>flag</strong>: Flag.</li>
         * <li><strong>location</strong>: Landmark.</li>
         * <li><strong>others</strong>: Others.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The highest score of the video snapshots that hit the label. Valid values: <code>[0, 100]</code>. The precision is 10 decimal places. The score indicates the probability that the snapshot belongs to the corresponding label category. A higher score indicates higher accuracy.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxScore")
        public String maxScore;

        /**
         * <p>The terrorist and political content review suggestion. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: Violation.</li>
         * <li><strong>review</strong>: Suspected violation.</li>
         * <li><strong>pass</strong>: Passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The information about the video snapshots with the highest scores for the hit label.</p>
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
         * <p>The ad review result.</p>
         */
        @NameInMap("AdResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultAdResult adResult;

        /**
         * <p>The GreenEnhanced moderation result.</p>
         */
        @NameInMap("GreenEnhancedResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResult greenEnhancedResult;

        /**
         * <p>The review result category. Valid values:</p>
         * <ul>
         * <li><strong>porn</strong>: Pornographic content.</li>
         * <li><strong>terrorism</strong>: Terrorist and political content.</li>
         * <li><strong>ad</strong>: Image and text violation.</li>
         * <li><strong>live</strong>: Undesirable scene.</li>
         * <li><strong>logo</strong>: Image logo.</li>
         * <li><strong>normal</strong>: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The harmful content moderation result.</p>
         */
        @NameInMap("LiveResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLiveResult liveResult;

        /**
         * <p>The logo moderation result.</p>
         */
        @NameInMap("LogoResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultLogoResult logoResult;

        /**
         * <p>The pornography detection result.</p>
         */
        @NameInMap("PornResult")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultPornResult pornResult;

        /**
         * <p>The video review suggestion. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: Violation.</li>
         * <li><strong>review</strong>: Suspected violation.</li>
         * <li><strong>pass</strong>: Passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The terrorist and political content review result.</p>
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

        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResult setGreenEnhancedResult(GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResult greenEnhancedResult) {
            this.greenEnhancedResult = greenEnhancedResult;
            return this;
        }
        public GetAIMediaAuditJobResponseBodyMediaAuditJobDataVideoResultGreenEnhancedResult getGreenEnhancedResult() {
            return this.greenEnhancedResult;
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
         * <p>The reviewed content that contains violations. Multiple values are separated by commas (,). Valid values:</p>
         * <ul>
         * <li><strong>video</strong>: Video.</li>
         * <li><strong>image-cover</strong>: Thumbnail.</li>
         * <li><strong>text-title</strong>: Title.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("AbnormalModules")
        public String abnormalModules;

        /**
         * <p>The audio review result.</p>
         */
        @NameInMap("AudioResult")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataAudioResult> audioResult;

        /**
         * <p>The image review result.</p>
         */
        @NameInMap("ImageResult")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataImageResult> imageResult;

        /**
         * <p>The review result category. Multiple values are separated by commas (,). Valid values:</p>
         * <ul>
         * <li><strong>porn</strong>: Pornographic content.</li>
         * <li><strong>terrorism</strong>: Terrorist and political content.</li>
         * <li><strong>ad</strong>: Image and text violation.</li>
         * <li><strong>live</strong>: Undesirable scene.</li>
         * <li><strong>logo</strong>: Image logo.</li>
         * <li><strong>audio</strong>: Audio anti-spam.</li>
         * <li><strong>normal</strong>: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The review suggestion. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: Violation.</li>
         * <li><strong>review</strong>: Suspected violation.</li>
         * <li><strong>pass</strong>: Passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The text review result.</p>
         */
        @NameInMap("TextResult")
        public java.util.List<GetAIMediaAuditJobResponseBodyMediaAuditJobDataTextResult> textResult;

        /**
         * <p>The video review result.</p>
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
         * <p>The job error code. Check this field when the job status is fail.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The end time of the job. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T13:00:00Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The start time of the job. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The job result data.</p>
         */
        @NameInMap("Data")
        public GetAIMediaAuditJobResponseBodyMediaAuditJobData data;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bdbc266af6894*****943a70176d92e9</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The video ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fe028d09441d*****d1afffb138cd7e</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The job error message. Check this field when the job status is fail.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: Succeeded.</li>
         * <li><strong>fail</strong>: Failed.</li>
         * <li><strong>init</strong>: Initialized.</li>
         * <li><strong>processing</strong>: Processing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The job type. Currently, only automated review is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>AIMediaAudit</p>
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
