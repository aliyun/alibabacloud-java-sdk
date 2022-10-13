// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class SearchAdvertisingResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Ext")
    public java.util.Map<String, String> ext;

    @NameInMap("Header")
    public SearchAdvertisingResponseBodyHeader header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public SearchAdvertisingResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static SearchAdvertisingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAdvertisingResponseBody self = new SearchAdvertisingResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAdvertisingResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchAdvertisingResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SearchAdvertisingResponseBody setExt(java.util.Map<String, String> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, String> getExt() {
        return this.ext;
    }

    public SearchAdvertisingResponseBody setHeader(SearchAdvertisingResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public SearchAdvertisingResponseBodyHeader getHeader() {
        return this.header;
    }

    public SearchAdvertisingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchAdvertisingResponseBody setResult(SearchAdvertisingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SearchAdvertisingResponseBodyResult getResult() {
        return this.result;
    }

    public SearchAdvertisingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchAdvertisingResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Version")
        public String version;

        public static SearchAdvertisingResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            SearchAdvertisingResponseBodyHeader self = new SearchAdvertisingResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public SearchAdvertisingResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public SearchAdvertisingResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public SearchAdvertisingResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public SearchAdvertisingResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class SearchAdvertisingResponseBodyResultSeatbidBidAdsTrackers extends TeaModel {
        @NameInMap("Impressions")
        public java.util.List<String> impressions;

        public static SearchAdvertisingResponseBodyResultSeatbidBidAdsTrackers build(java.util.Map<String, ?> map) throws Exception {
            SearchAdvertisingResponseBodyResultSeatbidBidAdsTrackers self = new SearchAdvertisingResponseBodyResultSeatbidBidAdsTrackers();
            return TeaModel.build(map, self);
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAdsTrackers setImpressions(java.util.List<String> impressions) {
            this.impressions = impressions;
            return this;
        }
        public java.util.List<String> getImpressions() {
            return this.impressions;
        }

    }

    public static class SearchAdvertisingResponseBodyResultSeatbidBidAdsIcon extends TeaModel {
        @NameInMap("url")
        public String url;

        public static SearchAdvertisingResponseBodyResultSeatbidBidAdsIcon build(java.util.Map<String, ?> map) throws Exception {
            SearchAdvertisingResponseBodyResultSeatbidBidAdsIcon self = new SearchAdvertisingResponseBodyResultSeatbidBidAdsIcon();
            return TeaModel.build(map, self);
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAdsIcon setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SearchAdvertisingResponseBodyResultSeatbidBidAds extends TeaModel {
        @NameInMap("Brandid")
        public String brandid;

        @NameInMap("Commission")
        public String commission;

        @NameInMap("Crid")
        public String crid;

        @NameInMap("Crurl")
        public String crurl;

        @NameInMap("Id")
        public String id;

        @NameInMap("Interacttype")
        public Integer interacttype;

        @NameInMap("Labeltype")
        public String labeltype;

        @NameInMap("Landingurls")
        public java.util.List<String> landingurls;

        @NameInMap("Marketingtype")
        public String marketingtype;

        @NameInMap("Objective")
        public String objective;

        @NameInMap("Style")
        public String style;

        @NameInMap("Title")
        public String title;

        @NameInMap("Trackers")
        public SearchAdvertisingResponseBodyResultSeatbidBidAdsTrackers trackers;

        @NameInMap("Type")
        public String type;

        @NameInMap("icon")
        public SearchAdvertisingResponseBodyResultSeatbidBidAdsIcon icon;

        public static SearchAdvertisingResponseBodyResultSeatbidBidAds build(java.util.Map<String, ?> map) throws Exception {
            SearchAdvertisingResponseBodyResultSeatbidBidAds self = new SearchAdvertisingResponseBodyResultSeatbidBidAds();
            return TeaModel.build(map, self);
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAds setBrandid(String brandid) {
            this.brandid = brandid;
            return this;
        }
        public String getBrandid() {
            return this.brandid;
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAds setCommission(String commission) {
            this.commission = commission;
            return this;
        }
        public String getCommission() {
            return this.commission;
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAds setCrid(String crid) {
            this.crid = crid;
            return this;
        }
        public String getCrid() {
            return this.crid;
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAds setCrurl(String crurl) {
            this.crurl = crurl;
            return this;
        }
        public String getCrurl() {
            return this.crurl;
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAds setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAds setInteracttype(Integer interacttype) {
            this.interacttype = interacttype;
            return this;
        }
        public Integer getInteracttype() {
            return this.interacttype;
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAds setLabeltype(String labeltype) {
            this.labeltype = labeltype;
            return this;
        }
        public String getLabeltype() {
            return this.labeltype;
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAds setLandingurls(java.util.List<String> landingurls) {
            this.landingurls = landingurls;
            return this;
        }
        public java.util.List<String> getLandingurls() {
            return this.landingurls;
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAds setMarketingtype(String marketingtype) {
            this.marketingtype = marketingtype;
            return this;
        }
        public String getMarketingtype() {
            return this.marketingtype;
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAds setObjective(String objective) {
            this.objective = objective;
            return this;
        }
        public String getObjective() {
            return this.objective;
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAds setStyle(String style) {
            this.style = style;
            return this;
        }
        public String getStyle() {
            return this.style;
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAds setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAds setTrackers(SearchAdvertisingResponseBodyResultSeatbidBidAdsTrackers trackers) {
            this.trackers = trackers;
            return this;
        }
        public SearchAdvertisingResponseBodyResultSeatbidBidAdsTrackers getTrackers() {
            return this.trackers;
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAds setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchAdvertisingResponseBodyResultSeatbidBidAds setIcon(SearchAdvertisingResponseBodyResultSeatbidBidAdsIcon icon) {
            this.icon = icon;
            return this;
        }
        public SearchAdvertisingResponseBodyResultSeatbidBidAdsIcon getIcon() {
            return this.icon;
        }

    }

    public static class SearchAdvertisingResponseBodyResultSeatbidBid extends TeaModel {
        @NameInMap("Ads")
        public java.util.List<SearchAdvertisingResponseBodyResultSeatbidBidAds> ads;

        @NameInMap("Impid")
        public String impid;

        public static SearchAdvertisingResponseBodyResultSeatbidBid build(java.util.Map<String, ?> map) throws Exception {
            SearchAdvertisingResponseBodyResultSeatbidBid self = new SearchAdvertisingResponseBodyResultSeatbidBid();
            return TeaModel.build(map, self);
        }

        public SearchAdvertisingResponseBodyResultSeatbidBid setAds(java.util.List<SearchAdvertisingResponseBodyResultSeatbidBidAds> ads) {
            this.ads = ads;
            return this;
        }
        public java.util.List<SearchAdvertisingResponseBodyResultSeatbidBidAds> getAds() {
            return this.ads;
        }

        public SearchAdvertisingResponseBodyResultSeatbidBid setImpid(String impid) {
            this.impid = impid;
            return this;
        }
        public String getImpid() {
            return this.impid;
        }

    }

    public static class SearchAdvertisingResponseBodyResultSeatbid extends TeaModel {
        @NameInMap("Bid")
        public java.util.List<SearchAdvertisingResponseBodyResultSeatbidBid> bid;

        public static SearchAdvertisingResponseBodyResultSeatbid build(java.util.Map<String, ?> map) throws Exception {
            SearchAdvertisingResponseBodyResultSeatbid self = new SearchAdvertisingResponseBodyResultSeatbid();
            return TeaModel.build(map, self);
        }

        public SearchAdvertisingResponseBodyResultSeatbid setBid(java.util.List<SearchAdvertisingResponseBodyResultSeatbidBid> bid) {
            this.bid = bid;
            return this;
        }
        public java.util.List<SearchAdvertisingResponseBodyResultSeatbidBid> getBid() {
            return this.bid;
        }

    }

    public static class SearchAdvertisingResponseBodyResult extends TeaModel {
        @NameInMap("Bidid")
        public String bidid;

        @NameInMap("Id")
        public String id;

        @NameInMap("Seatbid")
        public java.util.List<SearchAdvertisingResponseBodyResultSeatbid> seatbid;

        public static SearchAdvertisingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SearchAdvertisingResponseBodyResult self = new SearchAdvertisingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SearchAdvertisingResponseBodyResult setBidid(String bidid) {
            this.bidid = bidid;
            return this;
        }
        public String getBidid() {
            return this.bidid;
        }

        public SearchAdvertisingResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchAdvertisingResponseBodyResult setSeatbid(java.util.List<SearchAdvertisingResponseBodyResultSeatbid> seatbid) {
            this.seatbid = seatbid;
            return this;
        }
        public java.util.List<SearchAdvertisingResponseBodyResultSeatbid> getSeatbid() {
            return this.seatbid;
        }

    }

}
