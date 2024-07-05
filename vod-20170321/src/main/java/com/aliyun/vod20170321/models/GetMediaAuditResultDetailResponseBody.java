// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultDetailResponseBody extends TeaModel {
    /**
     * <p>Details about review results.</p>
     */
    @NameInMap("MediaAuditResultDetail")
    public GetMediaAuditResultDetailResponseBodyMediaAuditResultDetail mediaAuditResultDetail;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The category of the ad review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>ad</strong>: ad or text violation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("AdLabel")
        public String adLabel;

        /**
         * <p>The score of the review result category. It is representative of the confidence. Valid values: <code>[0.00-100.00].</code> The value is rounded down to 10 decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AdScore")
        public String adScore;

        /**
         * <p>The category of the undesirable scene review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: The video does not contain undesirable scenes.</li>
         * <li><strong>live</strong>: The video contains undesirable scenes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("LiveLabel")
        public String liveLabel;

        /**
         * <p>The score of the review result category. It is representative of the confidence. Valid values: <code>[0.00-100.00].</code> The value is rounded down to 10 decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("LiveScore")
        public String liveScore;

        /**
         * <p>The category of the logo review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong></li>
         * <li><strong>tlogo</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("LogoLabel")
        public String logoLabel;

        /**
         * <p>The score of the review result category. It is representative of the confidence. Valid values: <code>[0.00-100.00].</code> The value is rounded down to 10 decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("LogoScore")
        public String logoScore;

        /**
         * <p>The category of the pornographic content review result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong></li>
         * <li><strong>porn</strong></li>
         * <li><strong>sexy</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("PornLabel")
        public String pornLabel;

        /**
         * <p>The score of the review result category. It is representative of the confidence. Valid values: <code>[0.00-100.00].</code> The value is rounded down to 10 decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("PornScore")
        public String pornScore;

        /**
         * <p>The category of the terrorist content review result.</p>
         * <ul>
         * <li><strong>normal</strong>: normal</li>
         * <li><strong>terrorism</strong>: terrorist content</li>
         * <li><strong>outfit</strong>: special costume</li>
         * <li><strong>logo</strong>: special logo</li>
         * <li><strong>weapon</strong>: weapon</li>
         * <li><strong>politics</strong>: politically sensitive content</li>
         * <li><strong>others</strong>: other terrorist content and politically sensitive content</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("TerrorismLabel")
        public String terrorismLabel;

        /**
         * <p>The score of the review result category. It is representative of the confidence. Valid values: <code>[0.00-100.00].</code> The value is rounded down to 10 decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("TerrorismScore")
        public String terrorismScore;

        /**
         * <p>The position in the video. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3005</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The URL of the image.</p>
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
         * <p>The review results returned.</p>
         */
        @NameInMap("List")
        public java.util.List<GetMediaAuditResultDetailResponseBodyMediaAuditResultDetailList> list;

        /**
         * <p>The total number of snapshots returned.</p>
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
