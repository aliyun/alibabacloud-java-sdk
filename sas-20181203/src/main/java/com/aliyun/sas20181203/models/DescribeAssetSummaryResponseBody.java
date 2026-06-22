// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetSummaryResponseBody extends TeaModel {
    /**
     * <p>The asset statistics information.</p>
     */
    @NameInMap("AssetsSummary")
    public DescribeAssetSummaryResponseBodyAssetsSummary assetsSummary;

    /**
     * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0FA7F1F4-488D-52CA-9BFC-3E47793B49D1</p>
     */
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
        /**
         * <p>The total number of assets across all regions.</p>
         * <blockquote>
         * <p>Security Center uses independent service centers in the Chinese mainland and outside the Chinese mainland. You can check the endpoint to which you are connected to determine the current service region. For more information about the regions included in each service region, see <a href="https://help.aliyun.com/document_detail/42302.html">What is Security Center?</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2064</p>
         */
        @NameInMap("TotalAssetAllRegion")
        public Integer totalAssetAllRegion;

        /**
         * <p>The total number of cores of assets across all regions.</p>
         * <blockquote>
         * <p>Security Center uses independent service centers in the Chinese mainland and outside the Chinese mainland. You can check the endpoint to which you are connected to determine the current service region. For more information about the regions included in each service region, see <a href="https://help.aliyun.com/document_detail/42302.html">What is Security Center?</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3200</p>
         */
        @NameInMap("TotalCoreAllRegion")
        public Integer totalCoreAllRegion;

        /**
         * <p>The total number of cores of assets in the current region.</p>
         * <blockquote>
         * <p>Security Center uses independent service centers in the Chinese mainland and outside the Chinese mainland. You can check the endpoint to which you are connected to determine the current service region. For more information about the regions included in each service region, see <a href="https://help.aliyun.com/document_detail/42302.html">What is Security Center?</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1022</p>
         */
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
