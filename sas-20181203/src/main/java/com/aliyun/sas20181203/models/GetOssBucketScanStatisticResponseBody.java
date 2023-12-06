// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOssBucketScanStatisticResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetOssBucketScanStatisticResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The expiration time of the purchased quota.</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The number of high-risk objects.</p>
         */
        @NameInMap("HighRisk")
        public Long highRisk;

        /**
         * <p>The number of low-risk objects.</p>
         */
        @NameInMap("LowRisk")
        public Long lowRisk;

        /**
         * <p>The number of medium-risk objects.</p>
         */
        @NameInMap("MediumRisk")
        public Long mediumRisk;

        /**
         * <p>The number of buckets that are not checked.</p>
         */
        @NameInMap("NoScanBucket")
        public Integer noScanBucket;

        /**
         * <p>The remaining quota.</p>
         */
        @NameInMap("RemainAuth")
        public Integer remainAuth;

        /**
         * <p>The number of buckets in which at-risk objects exist.</p>
         */
        @NameInMap("RiskBucket")
        public Integer riskBucket;

        /**
         * <p>The number of objects that are checked.</p>
         */
        @NameInMap("ScanObject")
        public Long scanObject;

        /**
         * <p>The total number of buckets.</p>
         */
        @NameInMap("TotalBucket")
        public Integer totalBucket;

        /**
         * <p>The total number of objects in the bucket.</p>
         */
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
