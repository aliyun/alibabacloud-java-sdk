// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeRouteDistributionStrategiesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Strategies")
    public DescribeRouteDistributionStrategiesResponseBodyStrategies strategies;

    public static DescribeRouteDistributionStrategiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteDistributionStrategiesResponseBody self = new DescribeRouteDistributionStrategiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouteDistributionStrategiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeRouteDistributionStrategiesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouteDistributionStrategiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteDistributionStrategiesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouteDistributionStrategiesResponseBody setStrategies(DescribeRouteDistributionStrategiesResponseBodyStrategies strategies) {
        this.strategies = strategies;
        return this;
    }
    public DescribeRouteDistributionStrategiesResponseBodyStrategies getStrategies() {
        return this.strategies;
    }

    public static class DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("StrategyPublishStatus")
        public String strategyPublishStatus;

        @NameInMap("RouteDistribution")
        public String routeDistribution;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("SmartAGId")
        public String smartAGId;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("IsConflict")
        public Boolean isConflict;

        @NameInMap("DestCidrBlock")
        public String destCidrBlock;

        @NameInMap("ConflictInfo")
        public String conflictInfo;

        @NameInMap("HcInstanceId")
        public String hcInstanceId;

        @NameInMap("RouteSource")
        public String routeSource;

        public static DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy self = new DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy();
            return TeaModel.build(map, self);
        }

        public DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy setStrategyPublishStatus(String strategyPublishStatus) {
            this.strategyPublishStatus = strategyPublishStatus;
            return this;
        }
        public String getStrategyPublishStatus() {
            return this.strategyPublishStatus;
        }

        public DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy setRouteDistribution(String routeDistribution) {
            this.routeDistribution = routeDistribution;
            return this;
        }
        public String getRouteDistribution() {
            return this.routeDistribution;
        }

        public DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy setSmartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }
        public String getSmartAGId() {
            return this.smartAGId;
        }

        public DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy setIsConflict(Boolean isConflict) {
            this.isConflict = isConflict;
            return this;
        }
        public Boolean getIsConflict() {
            return this.isConflict;
        }

        public DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy setDestCidrBlock(String destCidrBlock) {
            this.destCidrBlock = destCidrBlock;
            return this;
        }
        public String getDestCidrBlock() {
            return this.destCidrBlock;
        }

        public DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy setConflictInfo(String conflictInfo) {
            this.conflictInfo = conflictInfo;
            return this;
        }
        public String getConflictInfo() {
            return this.conflictInfo;
        }

        public DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy setHcInstanceId(String hcInstanceId) {
            this.hcInstanceId = hcInstanceId;
            return this;
        }
        public String getHcInstanceId() {
            return this.hcInstanceId;
        }

        public DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy setRouteSource(String routeSource) {
            this.routeSource = routeSource;
            return this;
        }
        public String getRouteSource() {
            return this.routeSource;
        }

    }

    public static class DescribeRouteDistributionStrategiesResponseBodyStrategies extends TeaModel {
        @NameInMap("Strategy")
        public java.util.List<DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy> strategy;

        public static DescribeRouteDistributionStrategiesResponseBodyStrategies build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteDistributionStrategiesResponseBodyStrategies self = new DescribeRouteDistributionStrategiesResponseBodyStrategies();
            return TeaModel.build(map, self);
        }

        public DescribeRouteDistributionStrategiesResponseBodyStrategies setStrategy(java.util.List<DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy> strategy) {
            this.strategy = strategy;
            return this;
        }
        public java.util.List<DescribeRouteDistributionStrategiesResponseBodyStrategiesStrategy> getStrategy() {
            return this.strategy;
        }

    }

}
