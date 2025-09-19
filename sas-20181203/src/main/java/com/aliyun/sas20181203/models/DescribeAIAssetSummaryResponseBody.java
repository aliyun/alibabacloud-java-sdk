// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAIAssetSummaryResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeAIAssetSummaryResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAIAssetSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIAssetSummaryResponseBody self = new DescribeAIAssetSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIAssetSummaryResponseBody setData(DescribeAIAssetSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAIAssetSummaryResponseBodyData getData() {
        return this.data;
    }

    public DescribeAIAssetSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAIAssetSummaryResponseBodyDataSensitiveSummary extends TeaModel {
        /**
         * <p>The number of images that have AI-related keys are stored in plaintext detected by image scan.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ContainerImageCnt")
        public Integer containerImageCnt;

        /**
         * <p>The number of servers that have AI-related keys are stored in plaintext detected by agentless scan.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EcsCnt")
        public Integer ecsCnt;

        /**
         * <p>The number of images that have AI-related keys are stored in plaintext detected by agentless scan.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ImageCnt")
        public Integer imageCnt;

        /**
         * <p>The number of snapshots that have AI-related keys are stored in plaintext detected by agentless scan.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("SnapshotCnt")
        public Integer snapshotCnt;

        /**
         * <p>The total number of assets that have AI-related keys are stored in plaintext.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("TotalCnt")
        public Integer totalCnt;

        public static DescribeAIAssetSummaryResponseBodyDataSensitiveSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIAssetSummaryResponseBodyDataSensitiveSummary self = new DescribeAIAssetSummaryResponseBodyDataSensitiveSummary();
            return TeaModel.build(map, self);
        }

        public DescribeAIAssetSummaryResponseBodyDataSensitiveSummary setContainerImageCnt(Integer containerImageCnt) {
            this.containerImageCnt = containerImageCnt;
            return this;
        }
        public Integer getContainerImageCnt() {
            return this.containerImageCnt;
        }

        public DescribeAIAssetSummaryResponseBodyDataSensitiveSummary setEcsCnt(Integer ecsCnt) {
            this.ecsCnt = ecsCnt;
            return this;
        }
        public Integer getEcsCnt() {
            return this.ecsCnt;
        }

        public DescribeAIAssetSummaryResponseBodyDataSensitiveSummary setImageCnt(Integer imageCnt) {
            this.imageCnt = imageCnt;
            return this;
        }
        public Integer getImageCnt() {
            return this.imageCnt;
        }

        public DescribeAIAssetSummaryResponseBodyDataSensitiveSummary setSnapshotCnt(Integer snapshotCnt) {
            this.snapshotCnt = snapshotCnt;
            return this;
        }
        public Integer getSnapshotCnt() {
            return this.snapshotCnt;
        }

        public DescribeAIAssetSummaryResponseBodyDataSensitiveSummary setTotalCnt(Integer totalCnt) {
            this.totalCnt = totalCnt;
            return this;
        }
        public Integer getTotalCnt() {
            return this.totalCnt;
        }

    }

    public static class DescribeAIAssetSummaryResponseBodyData extends TeaModel {
        /**
         * <p>The number of cloud assets with AI security posture management risks.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("AispmRiskAssetCnt")
        public Integer aispmRiskAssetCnt;

        /**
         * <p>The number of servers on which AI components are installed.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("EcsAssetCnt")
        public Integer ecsAssetCnt;

        /**
         * <p>The number of servers that have exposed AI components.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExposedRiskAssetCnt")
        public Integer exposedRiskAssetCnt;

        /**
         * <p>The number of AI images.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ImageAssetCnt")
        public Integer imageAssetCnt;

        /**
         * <p>The number of LINGJUN assets.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LingjunAssetCnt")
        public Integer lingjunAssetCnt;

        /**
         * <p>The number of container image assets in PAI.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaiContainerCnt")
        public Integer paiContainerCnt;

        /**
         * <p>The total number of cloud asset instances in Platform for AI (PAI).</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("PaiInstanceCnt")
        public Integer paiInstanceCnt;

        /**
         * <p>The number of serverless assets in PAI.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaiServerlessAssetCnt")
        public Integer paiServerlessAssetCnt;

        /**
         * <p>The statistics on assets that have AI-related keys are stored in plaintext.</p>
         */
        @NameInMap("SensitiveSummary")
        public DescribeAIAssetSummaryResponseBodyDataSensitiveSummary sensitiveSummary;

        /**
         * <p>The number of AI snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SnapshotAssetCnt")
        public Integer snapshotAssetCnt;

        /**
         * <p>The total number of AI assets.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("TotalAssetCnt")
        public Integer totalAssetCnt;

        /**
         * <p>The total number of assets with AI risks.</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("TotalRiskCnt")
        public Integer totalRiskCnt;

        /**
         * <p>The number of servers with AI application vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("VulRiskAssetCnt")
        public Integer vulRiskAssetCnt;

        public static DescribeAIAssetSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIAssetSummaryResponseBodyData self = new DescribeAIAssetSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAIAssetSummaryResponseBodyData setAispmRiskAssetCnt(Integer aispmRiskAssetCnt) {
            this.aispmRiskAssetCnt = aispmRiskAssetCnt;
            return this;
        }
        public Integer getAispmRiskAssetCnt() {
            return this.aispmRiskAssetCnt;
        }

        public DescribeAIAssetSummaryResponseBodyData setEcsAssetCnt(Integer ecsAssetCnt) {
            this.ecsAssetCnt = ecsAssetCnt;
            return this;
        }
        public Integer getEcsAssetCnt() {
            return this.ecsAssetCnt;
        }

        public DescribeAIAssetSummaryResponseBodyData setExposedRiskAssetCnt(Integer exposedRiskAssetCnt) {
            this.exposedRiskAssetCnt = exposedRiskAssetCnt;
            return this;
        }
        public Integer getExposedRiskAssetCnt() {
            return this.exposedRiskAssetCnt;
        }

        public DescribeAIAssetSummaryResponseBodyData setImageAssetCnt(Integer imageAssetCnt) {
            this.imageAssetCnt = imageAssetCnt;
            return this;
        }
        public Integer getImageAssetCnt() {
            return this.imageAssetCnt;
        }

        public DescribeAIAssetSummaryResponseBodyData setLingjunAssetCnt(Integer lingjunAssetCnt) {
            this.lingjunAssetCnt = lingjunAssetCnt;
            return this;
        }
        public Integer getLingjunAssetCnt() {
            return this.lingjunAssetCnt;
        }

        public DescribeAIAssetSummaryResponseBodyData setPaiContainerCnt(Integer paiContainerCnt) {
            this.paiContainerCnt = paiContainerCnt;
            return this;
        }
        public Integer getPaiContainerCnt() {
            return this.paiContainerCnt;
        }

        public DescribeAIAssetSummaryResponseBodyData setPaiInstanceCnt(Integer paiInstanceCnt) {
            this.paiInstanceCnt = paiInstanceCnt;
            return this;
        }
        public Integer getPaiInstanceCnt() {
            return this.paiInstanceCnt;
        }

        public DescribeAIAssetSummaryResponseBodyData setPaiServerlessAssetCnt(Integer paiServerlessAssetCnt) {
            this.paiServerlessAssetCnt = paiServerlessAssetCnt;
            return this;
        }
        public Integer getPaiServerlessAssetCnt() {
            return this.paiServerlessAssetCnt;
        }

        public DescribeAIAssetSummaryResponseBodyData setSensitiveSummary(DescribeAIAssetSummaryResponseBodyDataSensitiveSummary sensitiveSummary) {
            this.sensitiveSummary = sensitiveSummary;
            return this;
        }
        public DescribeAIAssetSummaryResponseBodyDataSensitiveSummary getSensitiveSummary() {
            return this.sensitiveSummary;
        }

        public DescribeAIAssetSummaryResponseBodyData setSnapshotAssetCnt(Integer snapshotAssetCnt) {
            this.snapshotAssetCnt = snapshotAssetCnt;
            return this;
        }
        public Integer getSnapshotAssetCnt() {
            return this.snapshotAssetCnt;
        }

        public DescribeAIAssetSummaryResponseBodyData setTotalAssetCnt(Integer totalAssetCnt) {
            this.totalAssetCnt = totalAssetCnt;
            return this;
        }
        public Integer getTotalAssetCnt() {
            return this.totalAssetCnt;
        }

        public DescribeAIAssetSummaryResponseBodyData setTotalRiskCnt(Integer totalRiskCnt) {
            this.totalRiskCnt = totalRiskCnt;
            return this;
        }
        public Integer getTotalRiskCnt() {
            return this.totalRiskCnt;
        }

        public DescribeAIAssetSummaryResponseBodyData setVulRiskAssetCnt(Integer vulRiskAssetCnt) {
            this.vulRiskAssetCnt = vulRiskAssetCnt;
            return this;
        }
        public Integer getVulRiskAssetCnt() {
            return this.vulRiskAssetCnt;
        }

    }

}
