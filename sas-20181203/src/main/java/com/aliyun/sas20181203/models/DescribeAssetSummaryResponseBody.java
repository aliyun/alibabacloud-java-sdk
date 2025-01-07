// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetSummaryResponseBody extends TeaModel {
    /**
     * <p>The statistical information about the assets.</p>
     */
    @NameInMap("AssetsSummary")
    public DescribeAssetSummaryResponseBodyAssetsSummary assetsSummary;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
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
         * <p>The total number of protected assets in all regions.</p>
         * <blockquote>
         * <p> Security Center supports the Hangzhou and Singapore service centers, which separately correspond to the China and Outside China data management centers. In the Hangzhou service center, Security Center provides protection capabilities for assets that are deployed in the regions covered by the China data management center. In the Singapore service center, Security Center provides protection capabilities for assets that are deployed in the regions covered by the Outside China data management center. You can determine whether the current region is covered by the China data management center or by the Outside China data management center based on the endpoint of Security Center. For more information about the supported regions for each data management center, see <a href="https://help.aliyun.com/document_detail/42302.html">What is Security Center?</a></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2064</p>
         */
        @NameInMap("TotalAssetAllRegion")
        public Integer totalAssetAllRegion;

        /**
         * <p>The total number of cores of protected assets in all regions.</p>
         * <blockquote>
         * <p> Security Center supports the Hangzhou and Singapore service centers, which separately correspond to the China and Outside China data management centers. In the Hangzhou service center, Security Center provides protection capabilities for assets that are deployed in the regions covered by the China data management center. In the Singapore service center, Security Center provides protection capabilities for assets that are deployed in the regions covered by the Outside China data management center. You can determine whether the current region is covered by the China data management center or by the Outside China data management center based on the endpoint of Security Center. For more information about the supported regions for each data management center, see <a href="https://help.aliyun.com/document_detail/42302.html">What is Security Center?</a></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3200</p>
         */
        @NameInMap("TotalCoreAllRegion")
        public Integer totalCoreAllRegion;

        /**
         * <p>The total number of cores of protected assets in the current region.</p>
         * <blockquote>
         * <p> Security Center supports the Hangzhou and Singapore service centers, which separately correspond to the China and Outside China data management centers. In the Hangzhou service center, Security Center provides protection capabilities for assets that are deployed in the regions covered by the China data management center. In the Singapore service center, Security Center provides protection capabilities for assets that are deployed in the regions covered by the Outside China data management center. You can determine whether the current region is covered by the China data management center or by the Outside China data management center based on the endpoint of Security Center. For more information about the supported regions for each data management center, see <a href="https://help.aliyun.com/document_detail/42302.html">What is Security Center?</a></p>
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
