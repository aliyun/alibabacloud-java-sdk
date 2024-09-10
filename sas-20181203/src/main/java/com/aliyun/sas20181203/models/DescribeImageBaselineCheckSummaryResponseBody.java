// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineCheckSummaryResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the check results of image baselines.</p>
     */
    @NameInMap("BaselineResultSummary")
    public java.util.List<DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary> baselineResultSummary;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeImageBaselineCheckSummaryResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5BD95679-D63A-4151-97D0-188432F4A57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageBaselineCheckSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBaselineCheckSummaryResponseBody self = new DescribeImageBaselineCheckSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageBaselineCheckSummaryResponseBody setBaselineResultSummary(java.util.List<DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary> baselineResultSummary) {
        this.baselineResultSummary = baselineResultSummary;
        return this;
    }
    public java.util.List<DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary> getBaselineResultSummary() {
        return this.baselineResultSummary;
    }

    public DescribeImageBaselineCheckSummaryResponseBody setPageInfo(DescribeImageBaselineCheckSummaryResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeImageBaselineCheckSummaryResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeImageBaselineCheckSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary extends TeaModel {
        /**
         * <p>The category of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Unauthorized access</p>
         */
        @NameInMap("BaselineClassAlias")
        public String baselineClassAlias;

        /**
         * <p>The keyword of the baseline category.</p>
         * 
         * <strong>example:</strong>
         * <p>hc_image_exploit</p>
         */
        @NameInMap("BaselineClassKey")
        public String baselineClassKey;

        /**
         * <p>The name of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Unauthorized access</p>
         */
        @NameInMap("BaselineNameAlias")
        public String baselineNameAlias;

        /**
         * <p>The keyword of the baseline name.</p>
         * 
         * <strong>example:</strong>
         * <p>hc_image_exploit</p>
         */
        @NameInMap("BaselineNameKey")
        public String baselineNameKey;

        /**
         * <p>The severity of the image baseline. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("BaselineNameLevel")
        public String baselineNameLevel;

        /**
         * <p>The timestamp generated when the first scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1626628760000</p>
         */
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        /**
         * <p>The number of images on which <strong>high</strong> baseline risks are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("HighRiskImage")
        public Integer highRiskImage;

        /**
         * <p>The timestamp generated when the last scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1626628760000</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The number of images on which <strong>low</strong> baseline risks are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LowRiskImage")
        public Integer lowRiskImage;

        /**
         * <p>The number of images on which <strong>medium</strong> baseline risks are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MiddleRiskImage")
        public Integer middleRiskImage;

        /**
         * <p>The status of the baseline risks. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unfixed</li>
         * <li><strong>1</strong>: fixed</li>
         * <li><strong>2</strong>: pending verification</li>
         * <li><strong>3</strong>: fixing failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary self = new DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary();
            return TeaModel.build(map, self);
        }

        public DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary setBaselineClassAlias(String baselineClassAlias) {
            this.baselineClassAlias = baselineClassAlias;
            return this;
        }
        public String getBaselineClassAlias() {
            return this.baselineClassAlias;
        }

        public DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary setBaselineClassKey(String baselineClassKey) {
            this.baselineClassKey = baselineClassKey;
            return this;
        }
        public String getBaselineClassKey() {
            return this.baselineClassKey;
        }

        public DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary setBaselineNameAlias(String baselineNameAlias) {
            this.baselineNameAlias = baselineNameAlias;
            return this;
        }
        public String getBaselineNameAlias() {
            return this.baselineNameAlias;
        }

        public DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary setBaselineNameKey(String baselineNameKey) {
            this.baselineNameKey = baselineNameKey;
            return this;
        }
        public String getBaselineNameKey() {
            return this.baselineNameKey;
        }

        public DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary setBaselineNameLevel(String baselineNameLevel) {
            this.baselineNameLevel = baselineNameLevel;
            return this;
        }
        public String getBaselineNameLevel() {
            return this.baselineNameLevel;
        }

        public DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary setFirstScanTime(Long firstScanTime) {
            this.firstScanTime = firstScanTime;
            return this;
        }
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        public DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary setHighRiskImage(Integer highRiskImage) {
            this.highRiskImage = highRiskImage;
            return this;
        }
        public Integer getHighRiskImage() {
            return this.highRiskImage;
        }

        public DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary setLowRiskImage(Integer lowRiskImage) {
            this.lowRiskImage = lowRiskImage;
            return this;
        }
        public Integer getLowRiskImage() {
            return this.lowRiskImage;
        }

        public DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary setMiddleRiskImage(Integer middleRiskImage) {
            this.middleRiskImage = middleRiskImage;
            return this;
        }
        public Integer getMiddleRiskImage() {
            return this.middleRiskImage;
        }

        public DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class DescribeImageBaselineCheckSummaryResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageBaselineCheckSummaryResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageBaselineCheckSummaryResponseBodyPageInfo self = new DescribeImageBaselineCheckSummaryResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageBaselineCheckSummaryResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageBaselineCheckSummaryResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageBaselineCheckSummaryResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageBaselineCheckSummaryResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
