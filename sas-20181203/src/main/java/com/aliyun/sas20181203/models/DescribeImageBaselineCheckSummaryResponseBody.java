// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineCheckSummaryResponseBody extends TeaModel {
    /**
     * <p>The name of the baseline.</p>
     */
    @NameInMap("BaselineResultSummary")
    public java.util.List<DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary> baselineResultSummary;

    /**
     * <p>The search condition for the image baseline.</p>
     */
    @NameInMap("PageInfo")
    public DescribeImageBaselineCheckSummaryResponseBodyPageInfo pageInfo;

    /**
     * <p>The types of the assets that you want to scan.</p>
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
        @NameInMap("BaselineClassAlias")
        public String baselineClassAlias;

        @NameInMap("BaselineClassKey")
        public String baselineClassKey;

        @NameInMap("BaselineNameAlias")
        public String baselineNameAlias;

        @NameInMap("BaselineNameKey")
        public String baselineNameKey;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("BaselineNameLevel")
        public String baselineNameLevel;

        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        /**
         * <p>DescribeImageBaselineCheckSummary</p>
         */
        @NameInMap("HighRiskImage")
        public Integer highRiskImage;

        /**
         * <p>Queries the check results of image baselines that are included in an image scan task.</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        @NameInMap("LowRiskImage")
        public Integer lowRiskImage;

        /**
         * <p>The number of entries returned per page. Default value: **20**.</p>
         */
        @NameInMap("MiddleRiskImage")
        public Integer middleRiskImage;

        /**
         * <p>The number of entries to return on each page. Default value: **20**.</p>
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
         * <p>The pagination information.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The type of the search condition. Valid values:</p>
         * <br>
         * <p>*   **BaselineNameAlias**: baseline name</p>
         * <p>*   **BaselineClassAlias**: baseline category</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The ID of the container cluster.</p>
         * <br>
         * <p>>  You can call the [DescribeGroupedContainerInstances](~~182997~~) operation to query the IDs of container clusters.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The number of entries returned on the current page.</p>
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
