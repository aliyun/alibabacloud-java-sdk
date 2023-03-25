// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineCheckResultResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the check results of image baselines.</p>
     */
    @NameInMap("BaselineResult")
    public java.util.List<DescribeImageBaselineCheckResultResponseBodyBaselineResult> baselineResult;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeImageBaselineCheckResultResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageBaselineCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBaselineCheckResultResponseBody self = new DescribeImageBaselineCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageBaselineCheckResultResponseBody setBaselineResult(java.util.List<DescribeImageBaselineCheckResultResponseBodyBaselineResult> baselineResult) {
        this.baselineResult = baselineResult;
        return this;
    }
    public java.util.List<DescribeImageBaselineCheckResultResponseBodyBaselineResult> getBaselineResult() {
        return this.baselineResult;
    }

    public DescribeImageBaselineCheckResultResponseBody setPageInfo(DescribeImageBaselineCheckResultResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeImageBaselineCheckResultResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeImageBaselineCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageBaselineCheckResultResponseBodyBaselineResult extends TeaModel {
        /**
         * <p>The key of the type for the image baseline.</p>
         */
        @NameInMap("BaselineClassAlias")
        public String baselineClassAlias;

        /**
         * <p>The number of check items.</p>
         */
        @NameInMap("BaselineItemCount")
        public Integer baselineItemCount;

        /**
         * <p>The alias of the image baseline.</p>
         */
        @NameInMap("BaselineNameAlias")
        public String baselineNameAlias;

        /**
         * <p>The key of the image baseline.</p>
         */
        @NameInMap("BaselineNameKey")
        public String baselineNameKey;

        /**
         * <p>The severity of the image baseline. Valid values:</p>
         * <br>
         * <p>*   **high**</p>
         * <p>*   **medium**</p>
         * <p>*   **low**</p>
         */
        @NameInMap("BaselineNameLevel")
        public String baselineNameLevel;

        /**
         * <p>The timestamp when the first scan was performed. Unit: milliseconds.</p>
         */
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        /**
         * <p>The number of high-risk images that are affected.</p>
         */
        @NameInMap("HighRiskItemCount")
        public Integer highRiskItemCount;

        /**
         * <p>The timestamp when the last scan was performed. Unit: milliseconds.</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The number of low-risk images that are affected.</p>
         */
        @NameInMap("LowRiskItemCount")
        public Integer lowRiskItemCount;

        /**
         * <p>The number of medium-risk images that are affected.</p>
         */
        @NameInMap("MiddleRiskItemCount")
        public Integer middleRiskItemCount;

        /**
         * <p>The status of the baseline risks. Valid values:</p>
         * <br>
         * <p>*   **0**: unfixed</p>
         * <p>*   **1**: fixed</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeImageBaselineCheckResultResponseBodyBaselineResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageBaselineCheckResultResponseBodyBaselineResult self = new DescribeImageBaselineCheckResultResponseBodyBaselineResult();
            return TeaModel.build(map, self);
        }

        public DescribeImageBaselineCheckResultResponseBodyBaselineResult setBaselineClassAlias(String baselineClassAlias) {
            this.baselineClassAlias = baselineClassAlias;
            return this;
        }
        public String getBaselineClassAlias() {
            return this.baselineClassAlias;
        }

        public DescribeImageBaselineCheckResultResponseBodyBaselineResult setBaselineItemCount(Integer baselineItemCount) {
            this.baselineItemCount = baselineItemCount;
            return this;
        }
        public Integer getBaselineItemCount() {
            return this.baselineItemCount;
        }

        public DescribeImageBaselineCheckResultResponseBodyBaselineResult setBaselineNameAlias(String baselineNameAlias) {
            this.baselineNameAlias = baselineNameAlias;
            return this;
        }
        public String getBaselineNameAlias() {
            return this.baselineNameAlias;
        }

        public DescribeImageBaselineCheckResultResponseBodyBaselineResult setBaselineNameKey(String baselineNameKey) {
            this.baselineNameKey = baselineNameKey;
            return this;
        }
        public String getBaselineNameKey() {
            return this.baselineNameKey;
        }

        public DescribeImageBaselineCheckResultResponseBodyBaselineResult setBaselineNameLevel(String baselineNameLevel) {
            this.baselineNameLevel = baselineNameLevel;
            return this;
        }
        public String getBaselineNameLevel() {
            return this.baselineNameLevel;
        }

        public DescribeImageBaselineCheckResultResponseBodyBaselineResult setFirstScanTime(Long firstScanTime) {
            this.firstScanTime = firstScanTime;
            return this;
        }
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        public DescribeImageBaselineCheckResultResponseBodyBaselineResult setHighRiskItemCount(Integer highRiskItemCount) {
            this.highRiskItemCount = highRiskItemCount;
            return this;
        }
        public Integer getHighRiskItemCount() {
            return this.highRiskItemCount;
        }

        public DescribeImageBaselineCheckResultResponseBodyBaselineResult setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public DescribeImageBaselineCheckResultResponseBodyBaselineResult setLowRiskItemCount(Integer lowRiskItemCount) {
            this.lowRiskItemCount = lowRiskItemCount;
            return this;
        }
        public Integer getLowRiskItemCount() {
            return this.lowRiskItemCount;
        }

        public DescribeImageBaselineCheckResultResponseBodyBaselineResult setMiddleRiskItemCount(Integer middleRiskItemCount) {
            this.middleRiskItemCount = middleRiskItemCount;
            return this;
        }
        public Integer getMiddleRiskItemCount() {
            return this.middleRiskItemCount;
        }

        public DescribeImageBaselineCheckResultResponseBodyBaselineResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class DescribeImageBaselineCheckResultResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageBaselineCheckResultResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageBaselineCheckResultResponseBodyPageInfo self = new DescribeImageBaselineCheckResultResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageBaselineCheckResultResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageBaselineCheckResultResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageBaselineCheckResultResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageBaselineCheckResultResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
