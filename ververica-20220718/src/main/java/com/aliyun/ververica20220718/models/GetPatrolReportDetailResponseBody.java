// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetPatrolReportDetailResponseBody extends TeaModel {
    /**
     * <p>The inspection report details.</p>
     */
    @NameInMap("data")
    public GetPatrolReportDetailResponseBodyData data;

    /**
     * <p>The business error code. This value is not empty when success is false. This value is empty when success is true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The business error message. This value is not empty when success is false. This value is empty when success is true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The business status code, which is always 200. Use success to determine whether the business request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the business request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetPatrolReportDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPatrolReportDetailResponseBody self = new GetPatrolReportDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPatrolReportDetailResponseBody setData(GetPatrolReportDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPatrolReportDetailResponseBodyData getData() {
        return this.data;
    }

    public GetPatrolReportDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPatrolReportDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPatrolReportDetailResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetPatrolReportDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPatrolReportDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPatrolReportDetailResponseBodyDataOverviewProblemSummary extends TeaModel {
        /**
         * <p>The number of jobs with delay and backpressure.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("delayAndBackpressure")
        public Integer delayAndBackpressure;

        /**
         * <p>The number of unhealthy jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("unhealthy")
        public Integer unhealthy;

        /**
         * <p>The number of jobs with unhealthy checkpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("unhealthyCheckpoints")
        public Integer unhealthyCheckpoints;

        public static GetPatrolReportDetailResponseBodyDataOverviewProblemSummary build(java.util.Map<String, ?> map) throws Exception {
            GetPatrolReportDetailResponseBodyDataOverviewProblemSummary self = new GetPatrolReportDetailResponseBodyDataOverviewProblemSummary();
            return TeaModel.build(map, self);
        }

        public GetPatrolReportDetailResponseBodyDataOverviewProblemSummary setDelayAndBackpressure(Integer delayAndBackpressure) {
            this.delayAndBackpressure = delayAndBackpressure;
            return this;
        }
        public Integer getDelayAndBackpressure() {
            return this.delayAndBackpressure;
        }

        public GetPatrolReportDetailResponseBodyDataOverviewProblemSummary setUnhealthy(Integer unhealthy) {
            this.unhealthy = unhealthy;
            return this;
        }
        public Integer getUnhealthy() {
            return this.unhealthy;
        }

        public GetPatrolReportDetailResponseBodyDataOverviewProblemSummary setUnhealthyCheckpoints(Integer unhealthyCheckpoints) {
            this.unhealthyCheckpoints = unhealthyCheckpoints;
            return this;
        }
        public Integer getUnhealthyCheckpoints() {
            return this.unhealthyCheckpoints;
        }

    }

    public static class GetPatrolReportDetailResponseBodyDataOverviewRiskSummary extends TeaModel {
        /**
         * <p>The number of critical-level jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("critical")
        public Integer critical;

        /**
         * <p>The number of info-level jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("info")
        public Integer info;

        /**
         * <p>The number of warning-level jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("warning")
        public Integer warning;

        public static GetPatrolReportDetailResponseBodyDataOverviewRiskSummary build(java.util.Map<String, ?> map) throws Exception {
            GetPatrolReportDetailResponseBodyDataOverviewRiskSummary self = new GetPatrolReportDetailResponseBodyDataOverviewRiskSummary();
            return TeaModel.build(map, self);
        }

        public GetPatrolReportDetailResponseBodyDataOverviewRiskSummary setCritical(Integer critical) {
            this.critical = critical;
            return this;
        }
        public Integer getCritical() {
            return this.critical;
        }

        public GetPatrolReportDetailResponseBodyDataOverviewRiskSummary setInfo(Integer info) {
            this.info = info;
            return this;
        }
        public Integer getInfo() {
            return this.info;
        }

        public GetPatrolReportDetailResponseBodyDataOverviewRiskSummary setWarning(Integer warning) {
            this.warning = warning;
            return this;
        }
        public Integer getWarning() {
            return this.warning;
        }

    }

    public static class GetPatrolReportDetailResponseBodyDataOverview extends TeaModel {
        /**
         * <p>The problem summary.</p>
         */
        @NameInMap("problemSummary")
        public GetPatrolReportDetailResponseBodyDataOverviewProblemSummary problemSummary;

        /**
         * <p>The risk summary.</p>
         */
        @NameInMap("riskSummary")
        public GetPatrolReportDetailResponseBodyDataOverviewRiskSummary riskSummary;

        /**
         * <p>The total number of jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("total")
        public Integer total;

        public static GetPatrolReportDetailResponseBodyDataOverview build(java.util.Map<String, ?> map) throws Exception {
            GetPatrolReportDetailResponseBodyDataOverview self = new GetPatrolReportDetailResponseBodyDataOverview();
            return TeaModel.build(map, self);
        }

        public GetPatrolReportDetailResponseBodyDataOverview setProblemSummary(GetPatrolReportDetailResponseBodyDataOverviewProblemSummary problemSummary) {
            this.problemSummary = problemSummary;
            return this;
        }
        public GetPatrolReportDetailResponseBodyDataOverviewProblemSummary getProblemSummary() {
            return this.problemSummary;
        }

        public GetPatrolReportDetailResponseBodyDataOverview setRiskSummary(GetPatrolReportDetailResponseBodyDataOverviewRiskSummary riskSummary) {
            this.riskSummary = riskSummary;
            return this;
        }
        public GetPatrolReportDetailResponseBodyDataOverviewRiskSummary getRiskSummary() {
            return this.riskSummary;
        }

        public GetPatrolReportDetailResponseBodyDataOverview setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class GetPatrolReportDetailResponseBodyDataScopeConfig extends TeaModel {
        /**
         * <p>The list of deployment IDs. This parameter is valid only when scopeType is set to DEPLOYMENTS.</p>
         */
        @NameInMap("deploymentIds")
        public java.util.List<String> deploymentIds;

        /**
         * <p>The tag mapping. This parameter is valid only when scopeType is set to TAGS. The key is the tag name, and the value is the list of tag values.</p>
         */
        @NameInMap("tags")
        public java.util.Map<String, java.util.List<String>> tags;

        public static GetPatrolReportDetailResponseBodyDataScopeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPatrolReportDetailResponseBodyDataScopeConfig self = new GetPatrolReportDetailResponseBodyDataScopeConfig();
            return TeaModel.build(map, self);
        }

        public GetPatrolReportDetailResponseBodyDataScopeConfig setDeploymentIds(java.util.List<String> deploymentIds) {
            this.deploymentIds = deploymentIds;
            return this;
        }
        public java.util.List<String> getDeploymentIds() {
            return this.deploymentIds;
        }

        public GetPatrolReportDetailResponseBodyDataScopeConfig setTags(java.util.Map<String, java.util.List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getTags() {
            return this.tags;
        }

    }

    public static class GetPatrolReportDetailResponseBodyDataUnhealthyJobs extends TeaModel {
        /**
         * <p>The analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>The job has experienced continuous backpressure in the last 30 minutes.</p>
         */
        @NameInMap("analysis")
        public String analysis;

        /**
         * <p>The deployment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18b8ceaa-207d-417b-833e-a5845bb31beb</p>
         */
        @NameInMap("deploymentId")
        public String deploymentId;

        /**
         * <p>The deployment name.</p>
         * 
         * <strong>example:</strong>
         * <p>rlt_cust_no_apitime</p>
         */
        @NameInMap("deploymentName")
        public String deploymentName;

        /**
         * <p>The problem description.</p>
         * 
         * <strong>example:</strong>
         * <p>Job backpressure</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>db201864-e0df-4f8c-81f0-d62103095ff6</p>
         */
        @NameInMap("jobId")
        public String jobId;

        /**
         * <p>The recommendation.</p>
         * 
         * <strong>example:</strong>
         * <p>Check the processing capacity of the downstream operator.</p>
         */
        @NameInMap("recommendation")
        public String recommendation;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("riskLevel")
        public String riskLevel;

        /**
         * <p>The list of tags diagnosed by AI for the job.</p>
         */
        @NameInMap("tags")
        public java.util.List<String> tags;

        public static GetPatrolReportDetailResponseBodyDataUnhealthyJobs build(java.util.Map<String, ?> map) throws Exception {
            GetPatrolReportDetailResponseBodyDataUnhealthyJobs self = new GetPatrolReportDetailResponseBodyDataUnhealthyJobs();
            return TeaModel.build(map, self);
        }

        public GetPatrolReportDetailResponseBodyDataUnhealthyJobs setAnalysis(String analysis) {
            this.analysis = analysis;
            return this;
        }
        public String getAnalysis() {
            return this.analysis;
        }

        public GetPatrolReportDetailResponseBodyDataUnhealthyJobs setDeploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public String getDeploymentId() {
            return this.deploymentId;
        }

        public GetPatrolReportDetailResponseBodyDataUnhealthyJobs setDeploymentName(String deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }
        public String getDeploymentName() {
            return this.deploymentName;
        }

        public GetPatrolReportDetailResponseBodyDataUnhealthyJobs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPatrolReportDetailResponseBodyDataUnhealthyJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetPatrolReportDetailResponseBodyDataUnhealthyJobs setRecommendation(String recommendation) {
            this.recommendation = recommendation;
            return this;
        }
        public String getRecommendation() {
            return this.recommendation;
        }

        public GetPatrolReportDetailResponseBodyDataUnhealthyJobs setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public GetPatrolReportDetailResponseBodyDataUnhealthyJobs setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

    public static class GetPatrolReportDetailResponseBodyData extends TeaModel {
        /**
         * <p>The completion time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1785981634652</p>
         */
        @NameInMap("completedAt")
        public String completedAt;

        /**
         * <p>The creation time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1772936711518</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default-namespace</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The inspection overview.</p>
         */
        @NameInMap("overview")
        public GetPatrolReportDetailResponseBodyDataOverview overview;

        /**
         * <p>The report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>inspection-cf8f8843-64e4-4b45-9500-06790107130f</p>
         */
        @NameInMap("reportId")
        public String reportId;

        /**
         * <p>The inspection scope configuration.</p>
         */
        @NameInMap("scopeConfig")
        public GetPatrolReportDetailResponseBodyDataScopeConfig scopeConfig;

        /**
         * <p>The inspection scope type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("scopeType")
        public String scopeType;

        /**
         * <p>The trigger type.</p>
         * 
         * <strong>example:</strong>
         * <p>CRON</p>
         */
        @NameInMap("triggerType")
        public String triggerType;

        /**
         * <p>The list of unhealthy jobs.</p>
         */
        @NameInMap("unhealthyJobs")
        public java.util.List<GetPatrolReportDetailResponseBodyDataUnhealthyJobs> unhealthyJobs;

        /**
         * <p>The update time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1758248445816</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a14bd5d90a****</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static GetPatrolReportDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPatrolReportDetailResponseBodyData self = new GetPatrolReportDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPatrolReportDetailResponseBodyData setCompletedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public String getCompletedAt() {
            return this.completedAt;
        }

        public GetPatrolReportDetailResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetPatrolReportDetailResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetPatrolReportDetailResponseBodyData setOverview(GetPatrolReportDetailResponseBodyDataOverview overview) {
            this.overview = overview;
            return this;
        }
        public GetPatrolReportDetailResponseBodyDataOverview getOverview() {
            return this.overview;
        }

        public GetPatrolReportDetailResponseBodyData setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public GetPatrolReportDetailResponseBodyData setScopeConfig(GetPatrolReportDetailResponseBodyDataScopeConfig scopeConfig) {
            this.scopeConfig = scopeConfig;
            return this;
        }
        public GetPatrolReportDetailResponseBodyDataScopeConfig getScopeConfig() {
            return this.scopeConfig;
        }

        public GetPatrolReportDetailResponseBodyData setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public GetPatrolReportDetailResponseBodyData setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public GetPatrolReportDetailResponseBodyData setUnhealthyJobs(java.util.List<GetPatrolReportDetailResponseBodyDataUnhealthyJobs> unhealthyJobs) {
            this.unhealthyJobs = unhealthyJobs;
            return this;
        }
        public java.util.List<GetPatrolReportDetailResponseBodyDataUnhealthyJobs> getUnhealthyJobs() {
            return this.unhealthyJobs;
        }

        public GetPatrolReportDetailResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetPatrolReportDetailResponseBodyData setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
