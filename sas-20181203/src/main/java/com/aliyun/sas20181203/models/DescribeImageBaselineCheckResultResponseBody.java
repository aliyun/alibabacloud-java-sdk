// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineCheckResultResponseBody extends TeaModel {
    @NameInMap("BaselineResult")
    public java.util.List<DescribeImageBaselineCheckResultResponseBodyBaselineResult> baselineResult;

    @NameInMap("PageInfo")
    public DescribeImageBaselineCheckResultResponseBodyPageInfo pageInfo;

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
        @NameInMap("BaselineClassAlias")
        public String baselineClassAlias;

        @NameInMap("BaselineItemCount")
        public Integer baselineItemCount;

        @NameInMap("BaselineNameAlias")
        public String baselineNameAlias;

        @NameInMap("BaselineNameKey")
        public String baselineNameKey;

        @NameInMap("BaselineNameLevel")
        public String baselineNameLevel;

        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        @NameInMap("HighRiskItemCount")
        public Integer highRiskItemCount;

        @NameInMap("LastScanTime")
        public Long lastScanTime;

        @NameInMap("LowRiskItemCount")
        public Integer lowRiskItemCount;

        @NameInMap("MiddleRiskItemCount")
        public Integer middleRiskItemCount;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
