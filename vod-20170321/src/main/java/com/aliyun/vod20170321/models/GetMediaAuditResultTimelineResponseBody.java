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
         * <li><strong>normal</strong>: normal content.</li>
         * <li><strong>ad</strong>: other ads.</li>
         * <li><strong>politics</strong>: political content in text.</li>
         * <li><strong>porn</strong>: pornographic content in text.</li>
         * <li><strong>abuse</strong>: abuse in text.</li>
         * <li><strong>terrorism</strong>: terrorist content in text.</li>
         * <li><strong>contraband</strong>: prohibited content in text.</li>
         * <li><strong>spam</strong>: spam content.</li>
         * <li><strong>npx</strong>: illegal ad.</li>
         * <li><strong>qrcode</strong>: QR code.</li>
         * <li><strong>programCode</strong>: mini program code.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ad</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the video snapshot in the ad review result. Valid values: <code>[0,100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The timestamp of the snapshot in the video. Unit: milliseconds.</p>
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
         * <p>The categories of undesired content review results. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content.</li>
         * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen.</li>
         * <li><strong>PIP</strong>: picture-in-picture.</li>
         * <li><strong>smoking</strong>: smoking.</li>
         * <li><strong>drivelive</strong>: live broadcasting in a running vehicle.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pip</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the video snapshot in the undesirable content review result. Valid values: <code>[0,100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The timestamp of the snapshot in the video. Unit: milliseconds.</p>
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
         * <li><strong>normal</strong>: normal content.</li>
         * <li><strong>TV</strong>: controlled TV station logo.</li>
         * <li><strong>trademark</strong>: trademark.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>logo</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the video snapshot in the logo review result. Valid values: <code>[0,100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The timestamp of the snapshot in the video. Unit: milliseconds.</p>
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
         * <p>The score of the video snapshot in the pornographic content review result. Valid values: <code>[0,100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The timestamp of the snapshot in the video. Unit: milliseconds.</p>
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
         * <li><strong>normal</strong></li>
         * <li><strong>bloody</strong></li>
         * <li><strong>explosion</strong></li>
         * <li><strong>outfit</strong></li>
         * <li><strong>logo</strong></li>
         * <li><strong>weapon</strong></li>
         * <li><strong>politics</strong></li>
         * <li><strong>violence</strong></li>
         * <li><strong>crowd</strong></li>
         * <li><strong>parade</strong></li>
         * <li><strong>carcrash</strong></li>
         * <li><strong>flag</strong></li>
         * <li><strong>location</strong></li>
         * <li><strong>others</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score of the video snapshot in the terrorist content review result. Valid values: <code>[0,100]</code>. The value is rounded down to 10 decimal places. The score is representative of the confidence.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>The timestamp of the snapshot in the video. Unit: milliseconds.</p>
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
         * <p>The collection of undesirable content timelines.</p>
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
