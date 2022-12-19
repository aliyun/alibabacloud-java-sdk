// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineCheckSummaryResponseBody extends TeaModel {
    // An array that consists of the check results of image baselines.
    @NameInMap("BaselineResultSummary")
    public java.util.List<DescribeImageBaselineCheckSummaryResponseBodyBaselineResultSummary> baselineResultSummary;

    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeImageBaselineCheckSummaryResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
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
        // The category of the baseline.
        @NameInMap("BaselineClassAlias")
        public String baselineClassAlias;

        // The keyword of the baseline category.
        @NameInMap("BaselineClassKey")
        public String baselineClassKey;

        // The name of the baseline.
        @NameInMap("BaselineNameAlias")
        public String baselineNameAlias;

        // The keyword of the baseline name.
        @NameInMap("BaselineNameKey")
        public String baselineNameKey;

        // The severity of the image baseline. Valid values:
        // 
        // *   **high**
        // *   **medium**
        // *   **low**
        @NameInMap("BaselineNameLevel")
        public String baselineNameLevel;

        // The timestamp when the first scan was performed. Unit: milliseconds.
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        // The number of images on which **high** baseline risks are detected.
        @NameInMap("HighRiskImage")
        public Integer highRiskImage;

        // The timestamp when the last scan was performed. Unit: milliseconds.
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        // The number of images on which **low** baseline risks are detected.
        @NameInMap("LowRiskImage")
        public Integer lowRiskImage;

        // The number of images on which **medium** baseline risks are detected.
        @NameInMap("MiddleRiskImage")
        public Integer middleRiskImage;

        // The status of the baseline risks. Valid values:
        // 
        // *   **0**: unfixed
        // *   **1**: fixed
        // *   **2**: pending verification
        // *   **3**: fixing failed
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
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page. Default value: **20**.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
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
