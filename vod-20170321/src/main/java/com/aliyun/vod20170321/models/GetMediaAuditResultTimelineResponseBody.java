// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultTimelineResponseBody extends TeaModel {
    /**
     * <p>The position in the video. Unit: milliseconds.</p>
     */
    @NameInMap("MediaAuditResultTimeline")
    public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimeline mediaAuditResultTimeline;

    /**
     * <p>The position in the video. Unit: milliseconds.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaAuditResultTimelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultTimelineResponseBody self = new GetMediaAuditResultTimelineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditResultTimelineResponseBody setMediaAuditResultTimeline(GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimeline mediaAuditResultTimeline) {
        this.mediaAuditResultTimeline = mediaAuditResultTimeline;
        return this;
    }
    public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimeline getMediaAuditResultTimeline() {
        return this.mediaAuditResultTimeline;
    }

    public GetMediaAuditResultTimelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineAd extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        public static GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineAd build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineAd self = new GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineAd();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineAd setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineAd setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineAd setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLive extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        public static GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLive build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLive self = new GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLive();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLive setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLive setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLive setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLogo extends TeaModel {
        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **normal**: normal content</p>
         * <p>*   **ad**: ad or text violation</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The score of the review result category. Valid values: `[0, 100]`. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLogo build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLogo self = new GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLogo();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLogo setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLogo setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLogo setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelinePorn extends TeaModel {
        /**
         * <p>The collection of logo timelines.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The category of the review result. Valid values:</p>
         * <br>
         * <p>*   **normal**</p>
         * <p>*   **terrorism**</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The operation that you want to perform. Set the value to **GetMediaAuditResultTimeline**.</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelinePorn build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelinePorn self = new GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelinePorn();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelinePorn setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelinePorn setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelinePorn setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineTerrorism extends TeaModel {
        /**
         * <p>The collection of pornographic content timelines.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The collection of review result timelines.</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The collection of undesirable scene timelines.</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineTerrorism build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineTerrorism self = new GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineTerrorism();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineTerrorism setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineTerrorism setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineTerrorism setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimeline extends TeaModel {
        @NameInMap("Ad")
        public java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineAd> ad;

        /**
         * <p>Queries the timelines of all snapshots that violate content regulations.</p>
         */
        @NameInMap("Live")
        public java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLive> live;

        /**
         * <p>The score of the review result category. Valid values: `[0, 100]`. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
         */
        @NameInMap("Logo")
        public java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLogo> logo;

        /**
         * <p>The score of the review result category. Valid values: `[0, 100]`. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
         */
        @NameInMap("Porn")
        public java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelinePorn> porn;

        /**
         * <p>The ID of the video.</p>
         */
        @NameInMap("Terrorism")
        public java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineTerrorism> terrorism;

        public static GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimeline build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimeline self = new GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimeline();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimeline setAd(java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineAd> ad) {
            this.ad = ad;
            return this;
        }
        public java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineAd> getAd() {
            return this.ad;
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimeline setLive(java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLive> live) {
            this.live = live;
            return this;
        }
        public java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLive> getLive() {
            return this.live;
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimeline setLogo(java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLogo> logo) {
            this.logo = logo;
            return this;
        }
        public java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLogo> getLogo() {
            return this.logo;
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimeline setPorn(java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelinePorn> porn) {
            this.porn = porn;
            return this;
        }
        public java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelinePorn> getPorn() {
            return this.porn;
        }

        public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimeline setTerrorism(java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineTerrorism> terrorism) {
            this.terrorism = terrorism;
            return this;
        }
        public java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineTerrorism> getTerrorism() {
            return this.terrorism;
        }

    }

}
