// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class BandPrecheckResponseBody extends TeaModel {
    @NameInMap("ResultModule")
    public BandPrecheckResponseBodyResultModule resultModule;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BandPrecheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BandPrecheckResponseBody self = new BandPrecheckResponseBody();
        return TeaModel.build(map, self);
    }

    public BandPrecheckResponseBody setResultModule(BandPrecheckResponseBodyResultModule resultModule) {
        this.resultModule = resultModule;
        return this;
    }
    public BandPrecheckResponseBodyResultModule getResultModule() {
        return this.resultModule;
    }

    public BandPrecheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BandPrecheckResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BandPrecheckResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class BandPrecheckResponseBodyResultModuleBandOfferListBandOfferList extends TeaModel {
        @NameInMap("Direction")
        public String direction;

        @NameInMap("OfferId")
        public Long offerId;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("Duration")
        public Long duration;

        public static BandPrecheckResponseBodyResultModuleBandOfferListBandOfferList build(java.util.Map<String, ?> map) throws Exception {
            BandPrecheckResponseBodyResultModuleBandOfferListBandOfferList self = new BandPrecheckResponseBodyResultModuleBandOfferListBandOfferList();
            return TeaModel.build(map, self);
        }

        public BandPrecheckResponseBodyResultModuleBandOfferListBandOfferList setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public BandPrecheckResponseBodyResultModuleBandOfferListBandOfferList setOfferId(Long offerId) {
            this.offerId = offerId;
            return this;
        }
        public Long getOfferId() {
            return this.offerId;
        }

        public BandPrecheckResponseBodyResultModuleBandOfferListBandOfferList setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public BandPrecheckResponseBodyResultModuleBandOfferListBandOfferList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

    public static class BandPrecheckResponseBodyResultModuleBandOfferList extends TeaModel {
        @NameInMap("BandOfferList")
        public java.util.List<BandPrecheckResponseBodyResultModuleBandOfferListBandOfferList> bandOfferList;

        public static BandPrecheckResponseBodyResultModuleBandOfferList build(java.util.Map<String, ?> map) throws Exception {
            BandPrecheckResponseBodyResultModuleBandOfferList self = new BandPrecheckResponseBodyResultModuleBandOfferList();
            return TeaModel.build(map, self);
        }

        public BandPrecheckResponseBodyResultModuleBandOfferList setBandOfferList(java.util.List<BandPrecheckResponseBodyResultModuleBandOfferListBandOfferList> bandOfferList) {
            this.bandOfferList = bandOfferList;
            return this;
        }
        public java.util.List<BandPrecheckResponseBodyResultModuleBandOfferListBandOfferList> getBandOfferList() {
            return this.bandOfferList;
        }

    }

    public static class BandPrecheckResponseBodyResultModule extends TeaModel {
        @NameInMap("UploadBandwidth")
        public Integer uploadBandwidth;

        @NameInMap("BandId")
        public Long bandId;

        @NameInMap("BandOfferList")
        public BandPrecheckResponseBodyResultModuleBandOfferList bandOfferList;

        @NameInMap("DownloadBandwidth")
        public Integer downloadBandwidth;

        public static BandPrecheckResponseBodyResultModule build(java.util.Map<String, ?> map) throws Exception {
            BandPrecheckResponseBodyResultModule self = new BandPrecheckResponseBodyResultModule();
            return TeaModel.build(map, self);
        }

        public BandPrecheckResponseBodyResultModule setUploadBandwidth(Integer uploadBandwidth) {
            this.uploadBandwidth = uploadBandwidth;
            return this;
        }
        public Integer getUploadBandwidth() {
            return this.uploadBandwidth;
        }

        public BandPrecheckResponseBodyResultModule setBandId(Long bandId) {
            this.bandId = bandId;
            return this;
        }
        public Long getBandId() {
            return this.bandId;
        }

        public BandPrecheckResponseBodyResultModule setBandOfferList(BandPrecheckResponseBodyResultModuleBandOfferList bandOfferList) {
            this.bandOfferList = bandOfferList;
            return this;
        }
        public BandPrecheckResponseBodyResultModuleBandOfferList getBandOfferList() {
            return this.bandOfferList;
        }

        public BandPrecheckResponseBodyResultModule setDownloadBandwidth(Integer downloadBandwidth) {
            this.downloadBandwidth = downloadBandwidth;
            return this;
        }
        public Integer getDownloadBandwidth() {
            return this.downloadBandwidth;
        }

    }

}
