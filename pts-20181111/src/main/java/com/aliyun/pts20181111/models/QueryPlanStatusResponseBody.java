// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20181111.models;

import com.aliyun.tea.*;

public class QueryPlanStatusResponseBody extends TeaModel {
    @NameInMap("AgentLocations")
    public QueryPlanStatusResponseBodyAgentLocations agentLocations;

    @NameInMap("AliveAgentCount")
    public Integer aliveAgentCount;

    @NameInMap("AverageRt")
    public Integer averageRt;

    @NameInMap("BpsRequest")
    public String bpsRequest;

    @NameInMap("BpsResponse")
    public String bpsResponse;

    @NameInMap("Code")
    public String code;

    @NameInMap("Concurrency")
    public Integer concurrency;

    @NameInMap("ConcurrencyLimit")
    public Integer concurrencyLimit;

    @NameInMap("CurrentTime")
    public Long currentTime;

    @NameInMap("FailedBusinessCount")
    public Integer failedBusinessCount;

    @NameInMap("FailedRequestCount")
    public Integer failedRequestCount;

    @NameInMap("Message")
    public String message;

    @NameInMap("MonitorData")
    public QueryPlanStatusResponseBodyMonitorData monitorData;

    @NameInMap("ReportId")
    public Long reportId;

    @NameInMap("RequestCount")
    public String requestCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Seg90Rt")
    public Integer seg90Rt;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Tips")
    public String tips;

    @NameInMap("TotalAgentCount")
    public Integer totalAgentCount;

    @NameInMap("Tps")
    public Integer tps;

    @NameInMap("TpsLimit")
    public Integer tpsLimit;

    @NameInMap("Vum")
    public Integer vum;

    public static QueryPlanStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPlanStatusResponseBody self = new QueryPlanStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPlanStatusResponseBody setAgentLocations(QueryPlanStatusResponseBodyAgentLocations agentLocations) {
        this.agentLocations = agentLocations;
        return this;
    }
    public QueryPlanStatusResponseBodyAgentLocations getAgentLocations() {
        return this.agentLocations;
    }

    public QueryPlanStatusResponseBody setAliveAgentCount(Integer aliveAgentCount) {
        this.aliveAgentCount = aliveAgentCount;
        return this;
    }
    public Integer getAliveAgentCount() {
        return this.aliveAgentCount;
    }

    public QueryPlanStatusResponseBody setAverageRt(Integer averageRt) {
        this.averageRt = averageRt;
        return this;
    }
    public Integer getAverageRt() {
        return this.averageRt;
    }

    public QueryPlanStatusResponseBody setBpsRequest(String bpsRequest) {
        this.bpsRequest = bpsRequest;
        return this;
    }
    public String getBpsRequest() {
        return this.bpsRequest;
    }

    public QueryPlanStatusResponseBody setBpsResponse(String bpsResponse) {
        this.bpsResponse = bpsResponse;
        return this;
    }
    public String getBpsResponse() {
        return this.bpsResponse;
    }

    public QueryPlanStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPlanStatusResponseBody setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Integer getConcurrency() {
        return this.concurrency;
    }

    public QueryPlanStatusResponseBody setConcurrencyLimit(Integer concurrencyLimit) {
        this.concurrencyLimit = concurrencyLimit;
        return this;
    }
    public Integer getConcurrencyLimit() {
        return this.concurrencyLimit;
    }

    public QueryPlanStatusResponseBody setCurrentTime(Long currentTime) {
        this.currentTime = currentTime;
        return this;
    }
    public Long getCurrentTime() {
        return this.currentTime;
    }

    public QueryPlanStatusResponseBody setFailedBusinessCount(Integer failedBusinessCount) {
        this.failedBusinessCount = failedBusinessCount;
        return this;
    }
    public Integer getFailedBusinessCount() {
        return this.failedBusinessCount;
    }

    public QueryPlanStatusResponseBody setFailedRequestCount(Integer failedRequestCount) {
        this.failedRequestCount = failedRequestCount;
        return this;
    }
    public Integer getFailedRequestCount() {
        return this.failedRequestCount;
    }

    public QueryPlanStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPlanStatusResponseBody setMonitorData(QueryPlanStatusResponseBodyMonitorData monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public QueryPlanStatusResponseBodyMonitorData getMonitorData() {
        return this.monitorData;
    }

    public QueryPlanStatusResponseBody setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public QueryPlanStatusResponseBody setRequestCount(String requestCount) {
        this.requestCount = requestCount;
        return this;
    }
    public String getRequestCount() {
        return this.requestCount;
    }

    public QueryPlanStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPlanStatusResponseBody setSeg90Rt(Integer seg90Rt) {
        this.seg90Rt = seg90Rt;
        return this;
    }
    public Integer getSeg90Rt() {
        return this.seg90Rt;
    }

    public QueryPlanStatusResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryPlanStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPlanStatusResponseBody setTips(String tips) {
        this.tips = tips;
        return this;
    }
    public String getTips() {
        return this.tips;
    }

    public QueryPlanStatusResponseBody setTotalAgentCount(Integer totalAgentCount) {
        this.totalAgentCount = totalAgentCount;
        return this;
    }
    public Integer getTotalAgentCount() {
        return this.totalAgentCount;
    }

    public QueryPlanStatusResponseBody setTps(Integer tps) {
        this.tps = tps;
        return this;
    }
    public Integer getTps() {
        return this.tps;
    }

    public QueryPlanStatusResponseBody setTpsLimit(Integer tpsLimit) {
        this.tpsLimit = tpsLimit;
        return this;
    }
    public Integer getTpsLimit() {
        return this.tpsLimit;
    }

    public QueryPlanStatusResponseBody setVum(Integer vum) {
        this.vum = vum;
        return this;
    }
    public Integer getVum() {
        return this.vum;
    }

    public static class QueryPlanStatusResponseBodyAgentLocations extends TeaModel {
        @NameInMap("AgentLocation")
        public java.util.List<java.util.Map<String, ?>> agentLocation;

        public static QueryPlanStatusResponseBodyAgentLocations build(java.util.Map<String, ?> map) throws Exception {
            QueryPlanStatusResponseBodyAgentLocations self = new QueryPlanStatusResponseBodyAgentLocations();
            return TeaModel.build(map, self);
        }

        public QueryPlanStatusResponseBodyAgentLocations setAgentLocation(java.util.List<java.util.Map<String, ?>> agentLocation) {
            this.agentLocation = agentLocation;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getAgentLocation() {
            return this.agentLocation;
        }

    }

    public static class QueryPlanStatusResponseBodyMonitorData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<java.util.Map<String, ?>> data;

        public static QueryPlanStatusResponseBodyMonitorData build(java.util.Map<String, ?> map) throws Exception {
            QueryPlanStatusResponseBodyMonitorData self = new QueryPlanStatusResponseBodyMonitorData();
            return TeaModel.build(map, self);
        }

        public QueryPlanStatusResponseBodyMonitorData setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

    }

}
