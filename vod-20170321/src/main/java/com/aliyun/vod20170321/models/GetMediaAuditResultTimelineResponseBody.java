// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultTimelineResponseBody extends TeaModel {
    /**
     * <p>The collection of review result timelines.</p>
     */
    @NameInMap("MediaAuditResultTimeline")
    public GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimeline mediaAuditResultTimeline;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6438BD76-D523-46FC-956F-****</p>
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
        /**
         * <p>The category of the review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>ad</strong>: ad or text violation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ad</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the review result category. Valid values: <code>[0, 100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position in the video. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The category of the review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong></li>
         * <li><strong>terrorism</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pip</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the review result category. Valid values: <code>[0, 100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position in the video. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
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
         * <p>The category of the review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong></li>
         * <li><strong>logo</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>logo</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the review result category. Valid values: <code>[0, 100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position in the video. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
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
         * <p>The category of the review result. Valid values:</p>
         * <ul>
         * <li><strong>porn</strong></li>
         * <li><strong>sexy</strong></li>
         * <li><strong>normal</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the review result category. Valid values: <code>[0, 100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position in the video. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3005</p>
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
         * <p>The category of the review result. Valid values:</p>
         * <ul>
         * <li><strong>terrorism</strong>: terrorist content</li>
         * <li><strong>outfit</strong>: special costume</li>
         * <li><strong>logo</strong>: special logo</li>
         * <li><strong>weapon</strong>: weapon</li>
         * <li><strong>politics</strong>: politically sensitive content</li>
         * <li><strong>others</strong>: other terrorist and politically sensitive content</li>
         * <li><strong>normal</strong>: normal content</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the review result category.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The position in the video. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3005</p>
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
        /**
         * <p>The collection of ad timelines.</p>
         */
        @NameInMap("Ad")
        public java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineAd> ad;

        /**
         * <p>The collection of undesirable scene timelines.</p>
         */
        @NameInMap("Live")
        public java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLive> live;

        /**
         * <p>The collection of logo timelines.</p>
         */
        @NameInMap("Logo")
        public java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelineLogo> logo;

        /**
         * <p>The collection of pornographic content timelines.</p>
         */
        @NameInMap("Porn")
        public java.util.List<GetMediaAuditResultTimelineResponseBodyMediaAuditResultTimelinePorn> porn;

        /**
         * <p>The collection of terrorist content timelines.</p>
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
