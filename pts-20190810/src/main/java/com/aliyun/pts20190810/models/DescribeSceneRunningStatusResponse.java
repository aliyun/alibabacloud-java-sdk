// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeSceneRunningStatusResponse extends TeaModel {
    @NameInMap("Tips")
    @Validation(required = true)
    public String tips;

    @NameInMap("TotalRequestCount")
    @Validation(required = true)
    public Long totalRequestCount;

    @NameInMap("Vum")
    @Validation(required = true)
    public Long vum;

    @NameInMap("RequestBps")
    @Validation(required = true)
    public String requestBps;

    @NameInMap("ResponseBps")
    @Validation(required = true)
    public String responseBps;

    @NameInMap("FailedRequestCount")
    @Validation(required = true)
    public Long failedRequestCount;

    @NameInMap("FailedBusinessCount")
    @Validation(required = true)
    public Long failedBusinessCount;

    @NameInMap("Concurrency")
    @Validation(required = true)
    public Integer concurrency;

    @NameInMap("ConcurrencyLimit")
    @Validation(required = true)
    public Integer concurrencyLimit;

    @NameInMap("Tps")
    @Validation(required = true)
    public Integer tps;

    @NameInMap("TpsLimit")
    @Validation(required = true)
    public Integer tpsLimit;

    @NameInMap("AliveAgents")
    @Validation(required = true)
    public Integer aliveAgents;

    @NameInMap("TotalAgents")
    @Validation(required = true)
    public Integer totalAgents;

    @NameInMap("Seg90Rt")
    @Validation(required = true)
    public Long seg90Rt;

    @NameInMap("AverageRt")
    @Validation(required = true)
    public Long averageRt;

    @NameInMap("ReportId")
    @Validation(required = true)
    public String reportId;

    @NameInMap("BeginTime")
    @Validation(required = true)
    public Long beginTime;

    @NameInMap("CurrentTime")
    @Validation(required = true)
    public Long currentTime;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("UseCustomPool")
    @Validation(required = true)
    public Boolean useCustomPool;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Status")
    @Validation(required = true)
    public Integer status;

    @NameInMap("HasReport")
    @Validation(required = true)
    public Boolean hasReport;

    @NameInMap("HasError")
    @Validation(required = true)
    public Boolean hasError;

    @NameInMap("AgentLocation")
    @Validation(required = true)
    public String agentLocation;

    @NameInMap("ChainMonitorDataList")
    @Validation(required = true)
    public java.util.List<DescribeSceneRunningStatusResponseChainMonitorDataList> chainMonitorDataList;

    public static DescribeSceneRunningStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneRunningStatusResponse self = new DescribeSceneRunningStatusResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSceneRunningStatusResponseChainMonitorDataListQpsSummary extends TeaModel {
        @NameInMap("StatusCode")
        @Validation(required = true)
        public Integer statusCode;

        @NameInMap("Qps")
        @Validation(required = true)
        public Double qps;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        public static DescribeSceneRunningStatusResponseChainMonitorDataListQpsSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneRunningStatusResponseChainMonitorDataListQpsSummary self = new DescribeSceneRunningStatusResponseChainMonitorDataListQpsSummary();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSceneRunningStatusResponseChainMonitorDataListCheckPointResult extends TeaModel {
        @NameInMap("SucceedBusinessCount")
        @Validation(required = true)
        public Long succeedBusinessCount;

        @NameInMap("FailedBusinessCount")
        @Validation(required = true)
        public Long failedBusinessCount;

        @NameInMap("SucceedBusinessQps")
        @Validation(required = true)
        public Double succeedBusinessQps;

        @NameInMap("FailedBusinessQps")
        @Validation(required = true)
        public Double failedBusinessQps;

        public static DescribeSceneRunningStatusResponseChainMonitorDataListCheckPointResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneRunningStatusResponseChainMonitorDataListCheckPointResult self = new DescribeSceneRunningStatusResponseChainMonitorDataListCheckPointResult();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSceneRunningStatusResponseChainMonitorDataList extends TeaModel {
        @NameInMap("ChainId")
        @Validation(required = true)
        public Long chainId;

        @NameInMap("TimePoint")
        @Validation(required = true)
        public Long timePoint;

        @NameInMap("ConfigQps")
        @Validation(required = true)
        public Integer configQps;

        @NameInMap("RealQps")
        @Validation(required = true)
        public Double realQps;

        @NameInMap("Concurrency")
        @Validation(required = true)
        public Double concurrency;

        @NameInMap("Qps2XX")
        @Validation(required = true)
        public Double qps2XX;

        @NameInMap("FailedQps")
        @Validation(required = true)
        public Double failedQps;

        @NameInMap("AverageRt")
        @Validation(required = true)
        public Integer averageRt;

        @NameInMap("MaxRt")
        @Validation(required = true)
        public Integer maxRt;

        @NameInMap("MinRt")
        @Validation(required = true)
        public Integer minRt;

        @NameInMap("Count2XX")
        @Validation(required = true)
        public Long count2XX;

        @NameInMap("FailedCount")
        @Validation(required = true)
        public Long failedCount;

        @NameInMap("QueueSize")
        @Validation(required = true)
        public Integer queueSize;

        @NameInMap("QueueCapacity")
        @Validation(required = true)
        public Integer queueCapacity;

        @NameInMap("QpsSummary")
        @Validation(required = true)
        public java.util.List<DescribeSceneRunningStatusResponseChainMonitorDataListQpsSummary> qpsSummary;

        @NameInMap("CheckPointResult")
        @Validation(required = true)
        public DescribeSceneRunningStatusResponseChainMonitorDataListCheckPointResult checkPointResult;

        public static DescribeSceneRunningStatusResponseChainMonitorDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneRunningStatusResponseChainMonitorDataList self = new DescribeSceneRunningStatusResponseChainMonitorDataList();
            return TeaModel.build(map, self);
        }

    }

}
