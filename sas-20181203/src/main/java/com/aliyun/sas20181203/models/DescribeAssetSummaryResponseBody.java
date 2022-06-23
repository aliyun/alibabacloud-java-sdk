// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetSummaryResponseBody extends TeaModel {
    @NameInMap("AssetsSummary")
    public DescribeAssetSummaryResponseBodyAssetsSummary assetsSummary;

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
        @NameInMap("TotalAssetAllRegion")
        public Integer totalAssetAllRegion;

        @NameInMap("TotalCoreAllRegion")
        public Integer totalCoreAllRegion;

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
