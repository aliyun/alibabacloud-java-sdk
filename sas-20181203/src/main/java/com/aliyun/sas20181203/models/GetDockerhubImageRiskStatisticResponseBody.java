// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetDockerhubImageRiskStatisticResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447DD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the risk source.</p>
     */
    @NameInMap("RiskRankInfo")
    public GetDockerhubImageRiskStatisticResponseBodyRiskRankInfo riskRankInfo;

    public static GetDockerhubImageRiskStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDockerhubImageRiskStatisticResponseBody self = new GetDockerhubImageRiskStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDockerhubImageRiskStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDockerhubImageRiskStatisticResponseBody setRiskRankInfo(GetDockerhubImageRiskStatisticResponseBodyRiskRankInfo riskRankInfo) {
        this.riskRankInfo = riskRankInfo;
        return this;
    }
    public GetDockerhubImageRiskStatisticResponseBodyRiskRankInfo getRiskRankInfo() {
        return this.riskRankInfo;
    }

    public static class GetDockerhubImageRiskStatisticResponseBodyRiskRankInfo extends TeaModel {
        /**
         * <p>The number of baseline risks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Baseline")
        public Integer baseline;

        /**
         * <p>The timestamp when the scan was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1693997625000</p>
         */
        @NameInMap("ScanTime")
        public Long scanTime;

        /**
         * <p>The timestamp when the scan was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1693997625000</p>
         */
        @NameInMap("ScanTimeTimestamp")
        public Long scanTimeTimestamp;

        /**
         * <p>The number of scanned Docker Hub images.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalScanned")
        public Integer totalScanned;

        /**
         * <p>The number of high-risk vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VulAsap")
        public Integer vulAsap;

        public static GetDockerhubImageRiskStatisticResponseBodyRiskRankInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDockerhubImageRiskStatisticResponseBodyRiskRankInfo self = new GetDockerhubImageRiskStatisticResponseBodyRiskRankInfo();
            return TeaModel.build(map, self);
        }

        public GetDockerhubImageRiskStatisticResponseBodyRiskRankInfo setBaseline(Integer baseline) {
            this.baseline = baseline;
            return this;
        }
        public Integer getBaseline() {
            return this.baseline;
        }

        public GetDockerhubImageRiskStatisticResponseBodyRiskRankInfo setScanTime(Long scanTime) {
            this.scanTime = scanTime;
            return this;
        }
        public Long getScanTime() {
            return this.scanTime;
        }

        public GetDockerhubImageRiskStatisticResponseBodyRiskRankInfo setScanTimeTimestamp(Long scanTimeTimestamp) {
            this.scanTimeTimestamp = scanTimeTimestamp;
            return this;
        }
        public Long getScanTimeTimestamp() {
            return this.scanTimeTimestamp;
        }

        public GetDockerhubImageRiskStatisticResponseBodyRiskRankInfo setTotalScanned(Integer totalScanned) {
            this.totalScanned = totalScanned;
            return this;
        }
        public Integer getTotalScanned() {
            return this.totalScanned;
        }

        public GetDockerhubImageRiskStatisticResponseBodyRiskRankInfo setVulAsap(Integer vulAsap) {
            this.vulAsap = vulAsap;
            return this;
        }
        public Integer getVulAsap() {
            return this.vulAsap;
        }

    }

}
