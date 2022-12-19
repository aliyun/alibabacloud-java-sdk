// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetSummaryResponseBody extends TeaModel {
    // The statistical information about the assets.
    @NameInMap("AssetsSummary")
    public DescribeAssetSummaryResponseBodyAssetsSummary assetsSummary;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAssetSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetSummaryResponseBody self = new DescribeAssetSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetSummaryResponseBody setAssetsSummary(DescribeAssetSummaryResponseBodyAssetsSummary assetsSummary) {
        this.assetsSummary = assetsSummary;
        return this;
    }
    public DescribeAssetSummaryResponseBodyAssetsSummary getAssetsSummary() {
        return this.assetsSummary;
    }

    public DescribeAssetSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAssetSummaryResponseBodyAssetsSummary extends TeaModel {
        // The total number of protected assets in all regions.
        @NameInMap("TotalAssetAllRegion")
        public Integer totalAssetAllRegion;

        // The total number of cores of protected assets in all regions.
        @NameInMap("TotalCoreAllRegion")
        public Integer totalCoreAllRegion;

        // The total number of cores of protected assets in the current region.
        @NameInMap("TotalCoreNum")
        public Integer totalCoreNum;

        public static DescribeAssetSummaryResponseBodyAssetsSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetSummaryResponseBodyAssetsSummary self = new DescribeAssetSummaryResponseBodyAssetsSummary();
            return TeaModel.build(map, self);
        }

        public DescribeAssetSummaryResponseBodyAssetsSummary setTotalAssetAllRegion(Integer totalAssetAllRegion) {
            this.totalAssetAllRegion = totalAssetAllRegion;
            return this;
        }
        public Integer getTotalAssetAllRegion() {
            return this.totalAssetAllRegion;
        }

        public DescribeAssetSummaryResponseBodyAssetsSummary setTotalCoreAllRegion(Integer totalCoreAllRegion) {
            this.totalCoreAllRegion = totalCoreAllRegion;
            return this;
        }
        public Integer getTotalCoreAllRegion() {
            return this.totalCoreAllRegion;
        }

        public DescribeAssetSummaryResponseBodyAssetsSummary setTotalCoreNum(Integer totalCoreNum) {
            this.totalCoreNum = totalCoreNum;
            return this;
        }
        public Integer getTotalCoreNum() {
            return this.totalCoreNum;
        }

    }

}
