// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetsSecurityEventSummaryResponseBody extends TeaModel {
    @NameInMap("Assets")
    public java.util.List<DescribeAssetsSecurityEventSummaryResponseBodyAssets> assets;

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
        @NameInMap("AssetType")
        public String assetType;

        @NameInMap("RiskCount")
        public Long riskCount;

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
