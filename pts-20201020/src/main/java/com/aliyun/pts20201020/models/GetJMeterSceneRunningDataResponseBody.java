// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterSceneRunningDataResponseBody extends TeaModel {
    /**
     * <p>The system status code. If the request was successful, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The URL that is used to access the document.</p>
     */
    @NameInMap("DocumentUrl")
    public String documentUrl;

    /**
     * <p>The HTTP status code. If the request was successful, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message. If the request was successful, this parameter is not returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A8E16480-15C1-555A-922F-B736A005E52D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The running data.</p>
     */
    @NameInMap("RunningData")
    public GetJMeterSceneRunningDataResponseBodyRunningData runningData;

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

    public static GetJMeterSceneRunningDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJMeterSceneRunningDataResponseBody self = new GetJMeterSceneRunningDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJMeterSceneRunningDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetJMeterSceneRunningDataResponseBody setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
        return this;
    }
    public String getDocumentUrl() {
        return this.documentUrl;
    }

    public GetJMeterSceneRunningDataResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetJMeterSceneRunningDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJMeterSceneRunningDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJMeterSceneRunningDataResponseBody setRunningData(GetJMeterSceneRunningDataResponseBodyRunningData runningData) {
        this.runningData = runningData;
        return this;
    }
    public GetJMeterSceneRunningDataResponseBodyRunningData getRunningData() {
        return this.runningData;
    }

    public GetJMeterSceneRunningDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJMeterSceneRunningDataResponseBodyRunningData extends TeaModel {
        /**
         * <p>The number of stress testing engines.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AgentCount")
        public Integer agentCount;

        /**
         * <p>The stress testing engines.</p>
         */
        @NameInMap("AgentIdList")
        public java.util.List<String> agentIdList;

        /**
         * <p>The sampling status of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;failTps&quot;:0,&quot;successRtAvg&quot;:33,&quot;successRtMin&quot;:29,&quot;successRtSum&quot;:99407,         &quot;rtAvg&quot;:33.459104678559406,&quot;rtMin&quot;:29,&quot;failRtMax&quot;:0,&quot;duration&quot;:997,         &quot;samplerId&quot;:-1, &quot;successRtMax&quot;:133,&quot;fullStat&quot;:{       &quot;requestBytesSum&quot;:629926,&quot;successRtAvg&quot;:33,&quot;successRtMin&quot;:29,&quot;successRtSum&quot;:174551,&quot;count&quot;:5206,&quot;rtSeg99&quot;:53, &quot;successTps&quot;:2397.9732842008293,&quot;rtSeg90&quot;:36, &quot;rtSeg50&quot;:32,            &quot;rtSeg99Sum&quot;:53,&quot;rtAvg&quot;:33.528812908182864, &quot;rtMin&quot;:29,             &quot;failRtMax&quot;:0,&quot;duration&quot;:2171, &quot;successCount&quot;:5206,            &quot;rtSegStatCount&quot;:1,&quot;tps&quot;:2397.9732842008293 }, &quot;successCount&quot;:2971, &quot;failRtSum&quot;:0,&quot;failCount&quot;:0,&quot;count&quot;:2971,&quot;concurrency&quot;:100, &quot;successTps&quot;:2979.939819458375,&quot;tps&quot;:2979.939819458375,&quot;failRtAvg&quot;:0,         &quot;failRtMin&quot;:0,  &quot;rtMax&quot;:133}</p>
         */
        @NameInMap("AllSampleStat")
        public java.util.Map<String, ?> allSampleStat;

        /**
         * <p>The concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Concurrency")
        public Integer concurrency;

        /**
         * <p>The error message returned for the stress testing process. If the request was successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Engine lease failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Indicates whether an error occurs in the stress testing process.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasError")
        public Boolean hasError;

        /**
         * <p>Indicates whether the report is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasReport")
        public Boolean hasReport;

        /**
         * <p>The duration of the stress testing plan. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("HoldFor")
        public Integer holdFor;

        /**
         * <p>Indicates whether a debugging is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDebugging")
        public Boolean isDebugging;

        /**
         * <p>The stress testing task ID. This ID also means the report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DYYPLDKS</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The status of samplers.</p>
         */
        @NameInMap("SampleStatList")
        public java.util.List<java.util.Map<String, ?>> sampleStatList;

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DYYPZIH</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The current stage.</p>
         * 
         * <strong>example:</strong>
         * <p>任务执行</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>The timestamp when the stress testing is scheduled to start. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>1639970040000</p>
         */
        @NameInMap("StartTimeTS")
        public Long startTimeTS;

        /**
         * <p>The stress testing status of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The consumed Virtual User Minutes (VUM).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Vum")
        public Long vum;

        public static GetJMeterSceneRunningDataResponseBodyRunningData build(java.util.Map<String, ?> map) throws Exception {
            GetJMeterSceneRunningDataResponseBodyRunningData self = new GetJMeterSceneRunningDataResponseBodyRunningData();
            return TeaModel.build(map, self);
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setAgentCount(Integer agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Integer getAgentCount() {
            return this.agentCount;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setAgentIdList(java.util.List<String> agentIdList) {
            this.agentIdList = agentIdList;
            return this;
        }
        public java.util.List<String> getAgentIdList() {
            return this.agentIdList;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setAllSampleStat(java.util.Map<String, ?> allSampleStat) {
            this.allSampleStat = allSampleStat;
            return this;
        }
        public java.util.Map<String, ?> getAllSampleStat() {
            return this.allSampleStat;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setHasError(Boolean hasError) {
            this.hasError = hasError;
            return this;
        }
        public Boolean getHasError() {
            return this.hasError;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setHasReport(Boolean hasReport) {
            this.hasReport = hasReport;
            return this;
        }
        public Boolean getHasReport() {
            return this.hasReport;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setHoldFor(Integer holdFor) {
            this.holdFor = holdFor;
            return this;
        }
        public Integer getHoldFor() {
            return this.holdFor;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setIsDebugging(Boolean isDebugging) {
            this.isDebugging = isDebugging;
            return this;
        }
        public Boolean getIsDebugging() {
            return this.isDebugging;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setSampleStatList(java.util.List<java.util.Map<String, ?>> sampleStatList) {
            this.sampleStatList = sampleStatList;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSampleStatList() {
            return this.sampleStatList;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setStartTimeTS(Long startTimeTS) {
            this.startTimeTS = startTimeTS;
            return this;
        }
        public Long getStartTimeTS() {
            return this.startTimeTS;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJMeterSceneRunningDataResponseBodyRunningData setVum(Long vum) {
            this.vum = vum;
            return this;
        }
        public Long getVum() {
            return this.vum;
        }

    }

}
