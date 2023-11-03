// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOssBucketScanStatisticResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetOssBucketScanStatisticResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetOssBucketScanStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssBucketScanStatisticResponseBody self = new GetOssBucketScanStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssBucketScanStatisticResponseBody setData(GetOssBucketScanStatisticResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOssBucketScanStatisticResponseBodyData getData() {
        return this.data;
    }

    public GetOssBucketScanStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOssBucketScanStatisticResponseBodyData extends TeaModel {
        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("HighRisk")
        public Long highRisk;

        @NameInMap("LowRisk")
        public Long lowRisk;

        @NameInMap("MediumRisk")
        public Long mediumRisk;

        @NameInMap("NoScanBucket")
        public Integer noScanBucket;

        @NameInMap("RemainAuth")
        public Integer remainAuth;

        @NameInMap("RiskBucket")
        public Integer riskBucket;

        @NameInMap("ScanObject")
        public Long scanObject;

        @NameInMap("TotalBucket")
        public Integer totalBucket;

        @NameInMap("TotalObject")
        public Long totalObject;

        public static GetOssBucketScanStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOssBucketScanStatisticResponseBodyData self = new GetOssBucketScanStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOssBucketScanStatisticResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetOssBucketScanStatisticResponseBodyData setHighRisk(Long highRisk) {
            this.highRisk = highRisk;
            return this;
        }
        public Long getHighRisk() {
            return this.highRisk;
        }

        public GetOssBucketScanStatisticResponseBodyData setLowRisk(Long lowRisk) {
            this.lowRisk = lowRisk;
            return this;
        }
        public Long getLowRisk() {
            return this.lowRisk;
        }

        public GetOssBucketScanStatisticResponseBodyData setMediumRisk(Long mediumRisk) {
            this.mediumRisk = mediumRisk;
            return this;
        }
        public Long getMediumRisk() {
            return this.mediumRisk;
        }

        public GetOssBucketScanStatisticResponseBodyData setNoScanBucket(Integer noScanBucket) {
            this.noScanBucket = noScanBucket;
            return this;
        }
        public Integer getNoScanBucket() {
            return this.noScanBucket;
        }

        public GetOssBucketScanStatisticResponseBodyData setRemainAuth(Integer remainAuth) {
            this.remainAuth = remainAuth;
            return this;
        }
        public Integer getRemainAuth() {
            return this.remainAuth;
        }

        public GetOssBucketScanStatisticResponseBodyData setRiskBucket(Integer riskBucket) {
            this.riskBucket = riskBucket;
            return this;
        }
        public Integer getRiskBucket() {
            return this.riskBucket;
        }

        public GetOssBucketScanStatisticResponseBodyData setScanObject(Long scanObject) {
            this.scanObject = scanObject;
            return this;
        }
        public Long getScanObject() {
            return this.scanObject;
        }

        public GetOssBucketScanStatisticResponseBodyData setTotalBucket(Integer totalBucket) {
            this.totalBucket = totalBucket;
            return this;
        }
        public Integer getTotalBucket() {
            return this.totalBucket;
        }

        public GetOssBucketScanStatisticResponseBodyData setTotalObject(Long totalObject) {
            this.totalObject = totalObject;
            return this;
        }
        public Long getTotalObject() {
            return this.totalObject;
        }

    }

}
