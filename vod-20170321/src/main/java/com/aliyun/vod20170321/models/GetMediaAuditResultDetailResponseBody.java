// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the review results.</p>
     */
    @NameInMap("MediaAuditResultDetail")
    public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetail mediaAuditResultDetail;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6438BD76-D523-46FC-956F-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaAuditResultDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultDetailResponseBody self = new GetMediaAuditResultDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditResultDetailResponseBody setMediaAuditResultDetail(GetMediaAuditResultDetailResponseBodyMediaAuditResultDetail mediaAuditResultDetail) {
        this.mediaAuditResultDetail = mediaAuditResultDetail;
        return this;
    }
    public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetail getMediaAuditResultDetail() {
        return this.mediaAuditResultDetail;
    }

    public GetMediaAuditResultDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList extends TeaModel {
        /**
         * <p>The classification of the ad review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>ad</strong>: Other ads.</li>
         * <li><strong>politics</strong>: Text contains politically sensitive content.</li>
         * <li><strong>porn</strong>: Text contains pornographic content.</li>
         * <li><strong>abuse</strong>: Text contains abusive content.</li>
         * <li><strong>terrorism</strong>: Text contains terrorism-related content.</li>
         * <li><strong>contraband</strong>: Text contains prohibited content.</li>
         * <li><strong>spam</strong>: Text contains other spam content.</li>
         * <li><strong>npx</strong>: Psoriasis ads.</li>
         * <li><strong>qrcode</strong>: Contains a QR code.</li>
         * <li><strong>programCode</strong>: Contains a mini program code.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("AdLabel")
        public String adLabel;

        /**
         * <p>The hit score of the video screenshot for the ad review result. Value range: <code>[0-100]</code>, with a precision of 10 decimal places. The hit result indicates the probability of the corresponding classification label. A higher value indicates higher accuracy.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AdScore")
        public String adScore;

        /**
         * <p>The classification of the undesirable scene review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>meaningless</strong>: The image has no content (for example, a black screen or white screen).</li>
         * <li><strong>PIP</strong>: Picture-in-Picture (PiP).</li>
         * <li><strong>smoking</strong>: Smoking.</li>
         * <li><strong>drivelive</strong>: In-car live streaming.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("LiveLabel")
        public String liveLabel;

        /**
         * <p>The hit score of the video screenshot for the undesirable scene review result. Value range: <code>[0-100]</code>, with a precision of 10 decimal places. The hit result indicates the probability of the corresponding classification label. A higher value indicates higher accuracy.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("LiveScore")
        public String liveScore;

        /**
         * <p>The classification of the logo review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>TV</strong>: Contains a regulated logo.</li>
         * <li><strong>trademark</strong>: Contains a trademark.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("LogoLabel")
        public String logoLabel;

        /**
         * <p>The hit score of the video screenshot for the logo review result. Value range: <code>[0-100]</code>, with a precision of 10 decimal places. The hit result indicates the probability of the corresponding classification label. A higher value indicates higher accuracy.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("LogoScore")
        public String logoScore;

        /**
         * <p>The classification of the pornography review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>porn</strong>: Pornographic.</li>
         * <li><strong>sexy</strong>: Sexy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("PornLabel")
        public String pornLabel;

        /**
         * <p>The hit score of the video screenshot for the pornography review result. Value range: <code>[0-100]</code>, with a precision of 10 decimal places. The hit result indicates the probability of the corresponding classification label. A higher value indicates higher accuracy.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("PornScore")
        public String pornScore;

        /**
         * <p>The classification of the terrorism review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>bloody</strong>: Bloody.</li>
         * <li><strong>explosion</strong>: Explosion and smoke.</li>
         * <li><strong>outfit</strong>: Special attire.</li>
         * <li><strong>logo</strong>: Special logo.</li>
         * <li><strong>weapon</strong>: Weapon.</li>
         * <li><strong>politics</strong>: Politically sensitive.</li>
         * <li><strong>violence</strong>: Fighting.</li>
         * <li><strong>crowd</strong>: Crowd gathering.</li>
         * <li><strong>parade</strong>: Parade.</li>
         * <li><strong>carcrash</strong>: Car crash scene.</li>
         * <li><strong>flag</strong>: Flag.</li>
         * <li><strong>location</strong>: Landmark.</li>
         * <li><strong>others</strong>: Others.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("TerrorismLabel")
        public String terrorismLabel;

        /**
         * <p>The hit score of the video screenshot for the terrorism review result. Value range: <code>[0-100]</code>, with a precision of 10 decimal places. The hit result indicates the probability of the corresponding classification label. A higher value indicates higher accuracy.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("TerrorismScore")
        public String terrorismScore;

        /**
         * <p>The position of the video screenshot in the video. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3005</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The URL of the video screenshot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg">http://temp-testbucket.oss-cn-shanghai.aliyuncs.com/aivideocensor/****.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList self = new GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList setAdLabel(String adLabel) {
            this.adLabel = adLabel;
            return this;
        }
        public String getAdLabel() {
            return this.adLabel;
        }

        public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList setAdScore(String adScore) {
            this.adScore = adScore;
            return this;
        }
        public String getAdScore() {
            return this.adScore;
        }

        public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList setLiveLabel(String liveLabel) {
            this.liveLabel = liveLabel;
            return this;
        }
        public String getLiveLabel() {
            return this.liveLabel;
        }

        public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList setLiveScore(String liveScore) {
            this.liveScore = liveScore;
            return this;
        }
        public String getLiveScore() {
            return this.liveScore;
        }

        public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList setLogoLabel(String logoLabel) {
            this.logoLabel = logoLabel;
            return this;
        }
        public String getLogoLabel() {
            return this.logoLabel;
        }

        public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList setLogoScore(String logoScore) {
            this.logoScore = logoScore;
            return this;
        }
        public String getLogoScore() {
            return this.logoScore;
        }

        public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList setPornLabel(String pornLabel) {
            this.pornLabel = pornLabel;
            return this;
        }
        public String getPornLabel() {
            return this.pornLabel;
        }

        public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList setPornScore(String pornScore) {
            this.pornScore = pornScore;
            return this;
        }
        public String getPornScore() {
            return this.pornScore;
        }

        public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList setTerrorismLabel(String terrorismLabel) {
            this.terrorismLabel = terrorismLabel;
            return this;
        }
        public String getTerrorismLabel() {
            return this.terrorismLabel;
        }

        public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList setTerrorismScore(String terrorismScore) {
            this.terrorismScore = terrorismScore;
            return this;
        }
        public String getTerrorismScore() {
            return this.terrorismScore;
        }

        public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetMediaAuditResultDetailResponseBodyMediaAuditResultDetail extends TeaModel {
        /**
         * <p>The list of video review result details.</p>
         */
        @NameInMap("List")
        public java.util.List<GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList> list;

        /**
         * <p>The total number of video review result screenshots.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static GetMediaAuditResultDetailResponseBodyMediaAuditResultDetail build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultDetailResponseBodyMediaAuditResultDetail self = new GetMediaAuditResultDetailResponseBodyMediaAuditResultDetail();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetail setList(java.util.List<GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList> getList() {
            return this.list;
        }

        public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetail setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
