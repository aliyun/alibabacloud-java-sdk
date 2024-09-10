// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListStrategyStatisticsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>571B2642-BF51-5BDD-906B-D2340DB9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics of the policies.</p>
     */
    @NameInMap("Strategies")
    public java.util.List<DescribeWhiteListStrategyStatisticsResponseBodyStrategies> strategies;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWhiteListStrategyStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListStrategyStatisticsResponseBody self = new DescribeWhiteListStrategyStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListStrategyStatisticsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeWhiteListStrategyStatisticsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWhiteListStrategyStatisticsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWhiteListStrategyStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhiteListStrategyStatisticsResponseBody setStrategies(java.util.List<DescribeWhiteListStrategyStatisticsResponseBodyStrategies> strategies) {
        this.strategies = strategies;
        return this;
    }
    public java.util.List<DescribeWhiteListStrategyStatisticsResponseBodyStrategies> getStrategies() {
        return this.strategies;
    }

    public DescribeWhiteListStrategyStatisticsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWhiteListStrategyStatisticsResponseBodyStrategies extends TeaModel {
        /**
         * <p>The number of the servers on which the policy takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("AssetCount")
        public Integer assetCount;

        /**
         * <p>The learning progress of the policy. Unit: percent (%).</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The status of the policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: learning</li>
         * <li><strong>2</strong>: paused</li>
         * <li><strong>3</strong>: learning completed</li>
         * <li><strong>4</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>11906</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>win</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        /**
         * <p>The intelligent learning duration. Unit: hour.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("StudyTime")
        public Integer studyTime;

        /**
         * <p>The number of suspicious processes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuspiciousProcCount")
        public Integer suspiciousProcCount;

        /**
         * <p>The number of trusted processes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TrustProcCount")
        public Integer trustProcCount;

        /**
         * <p>The number of malicious processes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("VirusProcCount")
        public Integer virusProcCount;

        public static DescribeWhiteListStrategyStatisticsResponseBodyStrategies build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteListStrategyStatisticsResponseBodyStrategies self = new DescribeWhiteListStrategyStatisticsResponseBodyStrategies();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteListStrategyStatisticsResponseBodyStrategies setAssetCount(Integer assetCount) {
            this.assetCount = assetCount;
            return this;
        }
        public Integer getAssetCount() {
            return this.assetCount;
        }

        public DescribeWhiteListStrategyStatisticsResponseBodyStrategies setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeWhiteListStrategyStatisticsResponseBodyStrategies setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeWhiteListStrategyStatisticsResponseBodyStrategies setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

        public DescribeWhiteListStrategyStatisticsResponseBodyStrategies setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public DescribeWhiteListStrategyStatisticsResponseBodyStrategies setStudyTime(Integer studyTime) {
            this.studyTime = studyTime;
            return this;
        }
        public Integer getStudyTime() {
            return this.studyTime;
        }

        public DescribeWhiteListStrategyStatisticsResponseBodyStrategies setSuspiciousProcCount(Integer suspiciousProcCount) {
            this.suspiciousProcCount = suspiciousProcCount;
            return this;
        }
        public Integer getSuspiciousProcCount() {
            return this.suspiciousProcCount;
        }

        public DescribeWhiteListStrategyStatisticsResponseBodyStrategies setTrustProcCount(Integer trustProcCount) {
            this.trustProcCount = trustProcCount;
            return this;
        }
        public Integer getTrustProcCount() {
            return this.trustProcCount;
        }

        public DescribeWhiteListStrategyStatisticsResponseBodyStrategies setVirusProcCount(Integer virusProcCount) {
            this.virusProcCount = virusProcCount;
            return this;
        }
        public Integer getVirusProcCount() {
            return this.virusProcCount;
        }

    }

}
