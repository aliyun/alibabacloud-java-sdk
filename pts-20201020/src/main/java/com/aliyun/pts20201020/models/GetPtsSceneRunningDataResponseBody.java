// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneRunningDataResponseBody extends TeaModel {
    /**
     * <p>The location information of stress testers.</p>
     */
    @NameInMap("AgentLocation")
    public java.util.List<GetPtsSceneRunningDataResponseBodyAgentLocation> agentLocation;

    /**
     * <p>The number of healthy engines.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AliveAgents")
    public Integer aliveAgents;

    /**
     * <p>The average RT.</p>
     * 
     * <strong>example:</strong>
     * <p>45</p>
     */
    @NameInMap("AverageRt")
    public Long averageRt;

    /**
     * <p>The start time of the stress testing that is displayed as a timestamp. Unit: ms.</p>
     * 
     * <strong>example:</strong>
     * <p>1651895518339</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The stress testing details of the GetPtsSceneRunningData operation.</p>
     */
    @NameInMap("ChainMonitorDataList")
    public java.util.List<GetPtsSceneRunningDataResponseBodyChainMonitorDataList> chainMonitorDataList;

    /**
     * <p>The system status code. If the request was successful, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4001</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total concurrency.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Concurrency")
    public Integer concurrency;

    /**
     * <p>The maximum concurrency.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ConcurrencyLimit")
    public Integer concurrencyLimit;

    /**
     * <p>The total number of failed businesses.</p>
     * 
     * <strong>example:</strong>
     * <p>78</p>
     */
    @NameInMap("FailedBusinessCount")
    public Long failedBusinessCount;

    /**
     * <p>The number of failed requests.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("FailedRequestCount")
    public Long failedRequestCount;

    /**
     * <p>Indicates whether a report is generated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasReport")
    public Boolean hasReport;

    /**
     * <p>The HTTP status code. If the request was successful, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message. If the request was successful, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>no message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The size of the request body.</p>
     * 
     * <strong>example:</strong>
     * <p>89kb</p>
     */
    @NameInMap("RequestBps")
    public String requestBps;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC4E3177-6745-4925-B423-4E89VV34221A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The size of the response body.</p>
     * 
     * <strong>example:</strong>
     * <p>8kb</p>
     */
    @NameInMap("ResponseBps")
    public String responseBps;

    /**
     * <p>The 90th percentile of reaction time (RT).</p>
     * 
     * <strong>example:</strong>
     * <p>45</p>
     */
    @NameInMap("Seg90Rt")
    public Long seg90Rt;

    /**
     * <p>The scenario status. The default parameter value is 7.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of stress testers.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalAgents")
    public Integer totalAgents;

    /**
     * <p>The total number of queries per second (QPS).</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalRealQps")
    public Integer totalRealQps;

    /**
     * <p>The total number of requests.</p>
     * 
     * <strong>example:</strong>
     * <p>8900</p>
     */
    @NameInMap("TotalRequestCount")
    public Long totalRequestCount;

    /**
     * <p>The maximum transactions per second (TPS).</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("TpsLimit")
    public Integer tpsLimit;

    /**
     * <p>The consumed Virtual User Minutes (VUM).</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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

    public GetPtsSceneRunningDataResponseBody setTotalRealQps(Integer totalRealQps) {
        this.totalRealQps = totalRealQps;
        return this;
    }
    public Integer getTotalRealQps() {
        return this.totalRealQps;
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
        /**
         * <p>The number of stress testers.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The provider of the stress tester.</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The province in which the stress tester resides.</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <p>The region in which the stress tester resides.</p>
         */
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
        /**
         * <p>The number of failed businesses.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("FailedBusinessCount")
        public Long failedBusinessCount;

        /**
         * <p>The RPS of failed businesses.</p>
         * 
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("FailedBusinessQps")
        public Float failedBusinessQps;

        /**
         * <p>The number of successful businesses.</p>
         * 
         * <strong>example:</strong>
         * <p>908</p>
         */
        @NameInMap("SucceedBusinessCount")
        public Long succeedBusinessCount;

        /**
         * <p>The RPS of the successful businesses.</p>
         * 
         * <strong>example:</strong>
         * <p>89</p>
         */
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
        /**
         * <p>The API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ANBDC8B</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The API name.</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The average RT.</p>
         * 
         * <strong>example:</strong>
         * <p>46</p>
         */
        @NameInMap("AverageRt")
        public Integer averageRt;

        /**
         * <p>The check point results.</p>
         */
        @NameInMap("CheckPointResult")
        public GetPtsSceneRunningDataResponseBodyChainMonitorDataListCheckPointResult checkPointResult;

        /**
         * <p>The concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Concurrency")
        public Float concurrency;

        /**
         * <p>The RPS of successful and failed requests.</p>
         * 
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("ConfigQps")
        public Integer configQps;

        /**
         * <p>The number of successful requests.</p>
         * 
         * <strong>example:</strong>
         * <p>7890</p>
         */
        @NameInMap("Count2XX")
        public Long count2XX;

        /**
         * <p>The total number of failed requests.</p>
         * 
         * <strong>example:</strong>
         * <p>456</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        /**
         * <p>The RPS of failed requests.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("FailedQps")
        public Float failedQps;

        /**
         * <p>The maximum RT.</p>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("MaxRt")
        public Integer maxRt;

        /**
         * <p>The minimum RT.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("MinRt")
        public Integer minRt;

        /**
         * <p>The API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>78509</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The Requests Per Second (RPS) of successful requests.</p>
         * 
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("Qps2XX")
        public Float qps2XX;

        /**
         * <p>The actual RPS.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("RealQps")
        public Float realQps;

        /**
         * <p>The point in time at which the stress testing is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1278908899</p>
         */
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
