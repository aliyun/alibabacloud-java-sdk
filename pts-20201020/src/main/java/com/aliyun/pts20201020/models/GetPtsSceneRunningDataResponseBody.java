// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneRunningDataResponseBody extends TeaModel {
    @NameInMap("AgentLocation")
    public java.util.List<GetPtsSceneRunningDataResponseBodyAgentLocation> agentLocation;

    @NameInMap("AliveAgents")
    public Integer aliveAgents;

    @NameInMap("AverageRt")
    public Long averageRt;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("ChainMonitorDataList")
    public java.util.List<GetPtsSceneRunningDataResponseBodyChainMonitorDataList> chainMonitorDataList;

    @NameInMap("Code")
    public String code;

    @NameInMap("Concurrency")
    public Integer concurrency;

    @NameInMap("ConcurrencyLimit")
    public Integer concurrencyLimit;

    @NameInMap("FailedBusinessCount")
    public Long failedBusinessCount;

    @NameInMap("FailedRequestCount")
    public Long failedRequestCount;

    @NameInMap("HasReport")
    public Boolean hasReport;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestBps")
    public String requestBps;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseBps")
    public String responseBps;

    @NameInMap("Seg90Rt")
    public Long seg90Rt;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalAgents")
    public Integer totalAgents;

    @NameInMap("TotalRequestCount")
    public Long totalRequestCount;

    @NameInMap("TpsLimit")
    public Integer tpsLimit;

    @NameInMap("Vum")
    public Long vum;

    public static GetPtsSceneRunningDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPtsSceneRunningDataResponseBody self = new GetPtsSceneRunningDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPtsSceneRunningDataResponseBody setAgentLocation(java.util.List<GetPtsSceneRunningDataResponseBodyAgentLocation> agentLocation) {
        this.agentLocation = agentLocation;
        return this;
    }
    public java.util.List<GetPtsSceneRunningDataResponseBodyAgentLocation> getAgentLocation() {
        return this.agentLocation;
    }

    public GetPtsSceneRunningDataResponseBody setAliveAgents(Integer aliveAgents) {
        this.aliveAgents = aliveAgents;
        return this;
    }
    public Integer getAliveAgents() {
        return this.aliveAgents;
    }

    public GetPtsSceneRunningDataResponseBody setAverageRt(Long averageRt) {
        this.averageRt = averageRt;
        return this;
    }
    public Long getAverageRt() {
        return this.averageRt;
    }

    public GetPtsSceneRunningDataResponseBody setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetPtsSceneRunningDataResponseBody setChainMonitorDataList(java.util.List<GetPtsSceneRunningDataResponseBodyChainMonitorDataList> chainMonitorDataList) {
        this.chainMonitorDataList = chainMonitorDataList;
        return this;
    }
    public java.util.List<GetPtsSceneRunningDataResponseBodyChainMonitorDataList> getChainMonitorDataList() {
        return this.chainMonitorDataList;
    }

    public GetPtsSceneRunningDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPtsSceneRunningDataResponseBody setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Integer getConcurrency() {
        return this.concurrency;
    }

    public GetPtsSceneRunningDataResponseBody setConcurrencyLimit(Integer concurrencyLimit) {
        this.concurrencyLimit = concurrencyLimit;
        return this;
    }
    public Integer getConcurrencyLimit() {
        return this.concurrencyLimit;
    }

    public GetPtsSceneRunningDataResponseBody setFailedBusinessCount(Long failedBusinessCount) {
        this.failedBusinessCount = failedBusinessCount;
        return this;
    }
    public Long getFailedBusinessCount() {
        return this.failedBusinessCount;
    }

    public GetPtsSceneRunningDataResponseBody setFailedRequestCount(Long failedRequestCount) {
        this.failedRequestCount = failedRequestCount;
        return this;
    }
    public Long getFailedRequestCount() {
        return this.failedRequestCount;
    }

    public GetPtsSceneRunningDataResponseBody setHasReport(Boolean hasReport) {
        this.hasReport = hasReport;
        return this;
    }
    public Boolean getHasReport() {
        return this.hasReport;
    }

    public GetPtsSceneRunningDataResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPtsSceneRunningDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPtsSceneRunningDataResponseBody setRequestBps(String requestBps) {
        this.requestBps = requestBps;
        return this;
    }
    public String getRequestBps() {
        return this.requestBps;
    }

    public GetPtsSceneRunningDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPtsSceneRunningDataResponseBody setResponseBps(String responseBps) {
        this.responseBps = responseBps;
        return this;
    }
    public String getResponseBps() {
        return this.responseBps;
    }

    public GetPtsSceneRunningDataResponseBody setSeg90Rt(Long seg90Rt) {
        this.seg90Rt = seg90Rt;
        return this;
    }
    public Long getSeg90Rt() {
        return this.seg90Rt;
    }

    public GetPtsSceneRunningDataResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetPtsSceneRunningDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPtsSceneRunningDataResponseBody setTotalAgents(Integer totalAgents) {
        this.totalAgents = totalAgents;
        return this;
    }
    public Integer getTotalAgents() {
        return this.totalAgents;
    }

    public GetPtsSceneRunningDataResponseBody setTotalRequestCount(Long totalRequestCount) {
        this.totalRequestCount = totalRequestCount;
        return this;
    }
    public Long getTotalRequestCount() {
        return this.totalRequestCount;
    }

    public GetPtsSceneRunningDataResponseBody setTpsLimit(Integer tpsLimit) {
        this.tpsLimit = tpsLimit;
        return this;
    }
    public Integer getTpsLimit() {
        return this.tpsLimit;
    }

    public GetPtsSceneRunningDataResponseBody setVum(Long vum) {
        this.vum = vum;
        return this;
    }
    public Long getVum() {
        return this.vum;
    }

    public static class GetPtsSceneRunningDataResponseBodyAgentLocation extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("Province")
        public String province;

        @NameInMap("Region")
        public String region;

        public static GetPtsSceneRunningDataResponseBodyAgentLocation build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneRunningDataResponseBodyAgentLocation self = new GetPtsSceneRunningDataResponseBodyAgentLocation();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneRunningDataResponseBodyAgentLocation setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetPtsSceneRunningDataResponseBodyAgentLocation setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public GetPtsSceneRunningDataResponseBodyAgentLocation setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public GetPtsSceneRunningDataResponseBodyAgentLocation setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class GetPtsSceneRunningDataResponseBodyChainMonitorDataListCheckPointResult extends TeaModel {
        @NameInMap("FailedBusinessCount")
        public Long failedBusinessCount;

        @NameInMap("FailedBusinessQps")
        public Float failedBusinessQps;

        @NameInMap("SucceedBusinessCount")
        public Long succeedBusinessCount;

        @NameInMap("SucceedBusinessQps")
        public Float succeedBusinessQps;

        public static GetPtsSceneRunningDataResponseBodyChainMonitorDataListCheckPointResult build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneRunningDataResponseBodyChainMonitorDataListCheckPointResult self = new GetPtsSceneRunningDataResponseBodyChainMonitorDataListCheckPointResult();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataListCheckPointResult setFailedBusinessCount(Long failedBusinessCount) {
            this.failedBusinessCount = failedBusinessCount;
            return this;
        }
        public Long getFailedBusinessCount() {
            return this.failedBusinessCount;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataListCheckPointResult setFailedBusinessQps(Float failedBusinessQps) {
            this.failedBusinessQps = failedBusinessQps;
            return this;
        }
        public Float getFailedBusinessQps() {
            return this.failedBusinessQps;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataListCheckPointResult setSucceedBusinessCount(Long succeedBusinessCount) {
            this.succeedBusinessCount = succeedBusinessCount;
            return this;
        }
        public Long getSucceedBusinessCount() {
            return this.succeedBusinessCount;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataListCheckPointResult setSucceedBusinessQps(Float succeedBusinessQps) {
            this.succeedBusinessQps = succeedBusinessQps;
            return this;
        }
        public Float getSucceedBusinessQps() {
            return this.succeedBusinessQps;
        }

    }

    public static class GetPtsSceneRunningDataResponseBodyChainMonitorDataList extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("AverageRt")
        public Integer averageRt;

        @NameInMap("CheckPointResult")
        public GetPtsSceneRunningDataResponseBodyChainMonitorDataListCheckPointResult checkPointResult;

        @NameInMap("Concurrency")
        public Float concurrency;

        @NameInMap("ConfigQps")
        public Integer configQps;

        @NameInMap("Count2XX")
        public Long count2XX;

        @NameInMap("FailedCount")
        public Long failedCount;

        @NameInMap("FailedQps")
        public Float failedQps;

        @NameInMap("MaxRt")
        public Integer maxRt;

        @NameInMap("MinRt")
        public Integer minRt;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("Qps2XX")
        public Float qps2XX;

        @NameInMap("RealQps")
        public Float realQps;

        @NameInMap("TimePoint")
        public Long timePoint;

        public static GetPtsSceneRunningDataResponseBodyChainMonitorDataList build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneRunningDataResponseBodyChainMonitorDataList self = new GetPtsSceneRunningDataResponseBodyChainMonitorDataList();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataList setAverageRt(Integer averageRt) {
            this.averageRt = averageRt;
            return this;
        }
        public Integer getAverageRt() {
            return this.averageRt;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataList setCheckPointResult(GetPtsSceneRunningDataResponseBodyChainMonitorDataListCheckPointResult checkPointResult) {
            this.checkPointResult = checkPointResult;
            return this;
        }
        public GetPtsSceneRunningDataResponseBodyChainMonitorDataListCheckPointResult getCheckPointResult() {
            return this.checkPointResult;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataList setConcurrency(Float concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Float getConcurrency() {
            return this.concurrency;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataList setConfigQps(Integer configQps) {
            this.configQps = configQps;
            return this;
        }
        public Integer getConfigQps() {
            return this.configQps;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataList setCount2XX(Long count2XX) {
            this.count2XX = count2XX;
            return this;
        }
        public Long getCount2XX() {
            return this.count2XX;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataList setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataList setFailedQps(Float failedQps) {
            this.failedQps = failedQps;
            return this;
        }
        public Float getFailedQps() {
            return this.failedQps;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataList setMaxRt(Integer maxRt) {
            this.maxRt = maxRt;
            return this;
        }
        public Integer getMaxRt() {
            return this.maxRt;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataList setMinRt(Integer minRt) {
            this.minRt = minRt;
            return this;
        }
        public Integer getMinRt() {
            return this.minRt;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataList setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataList setQps2XX(Float qps2XX) {
            this.qps2XX = qps2XX;
            return this;
        }
        public Float getQps2XX() {
            return this.qps2XX;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataList setRealQps(Float realQps) {
            this.realQps = realQps;
            return this;
        }
        public Float getRealQps() {
            return this.realQps;
        }

        public GetPtsSceneRunningDataResponseBodyChainMonitorDataList setTimePoint(Long timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public Long getTimePoint() {
            return this.timePoint;
        }

    }

}
