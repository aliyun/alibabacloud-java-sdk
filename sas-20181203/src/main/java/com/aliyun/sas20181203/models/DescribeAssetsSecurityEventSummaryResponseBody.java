// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetsSecurityEventSummaryResponseBody extends TeaModel {
    /**
     * <p>An array that consists of risk information about containers.</p>
     */
    @NameInMap("Assets")
    public java.util.List<DescribeAssetsSecurityEventSummaryResponseBodyAssets> assets;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAssetsSecurityEventSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetsSecurityEventSummaryResponseBody self = new DescribeAssetsSecurityEventSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetsSecurityEventSummaryResponseBody setAssets(java.util.List<DescribeAssetsSecurityEventSummaryResponseBodyAssets> assets) {
        this.assets = assets;
        return this;
    }
    public java.util.List<DescribeAssetsSecurityEventSummaryResponseBodyAssets> getAssets() {
        return this.assets;
    }

    public DescribeAssetsSecurityEventSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAssetsSecurityEventSummaryResponseBodyAssets extends TeaModel {
        /**
         * <p>The type of the asset. Valid values:</p>
         * <br>
         * <p>*   **namespace**: namespace</p>
         * <p>*   **clusters**: cluster</p>
         * <p>*   **applications**: application</p>
         * <p>*   **pods**: container group</p>
         * <p>*   **containers**: container</p>
         * <p>*   **images**: image</p>
         * <p>*   **hosts**: node</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The number of assets that are at risk.</p>
         */
        @NameInMap("RiskCount")
        public Long riskCount;

        /**
         * <p>The total number of assets.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeAssetsSecurityEventSummaryResponseBodyAssets build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetsSecurityEventSummaryResponseBodyAssets self = new DescribeAssetsSecurityEventSummaryResponseBodyAssets();
            return TeaModel.build(map, self);
        }

        public DescribeAssetsSecurityEventSummaryResponseBodyAssets setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public DescribeAssetsSecurityEventSummaryResponseBodyAssets setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public DescribeAssetsSecurityEventSummaryResponseBodyAssets setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
