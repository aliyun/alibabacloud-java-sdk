// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListPatrolReportsResponseBody extends TeaModel {
    /**
     * <p>The paginated data of inspection reports.</p>
     */
    @NameInMap("data")
    public ListPatrolReportsResponseBodyData data;

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
     * <p>The business status code, which is always 200. Use the success field to determine whether the business request was successful.</p>
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

    public static ListPatrolReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPatrolReportsResponseBody self = new ListPatrolReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPatrolReportsResponseBody setData(ListPatrolReportsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPatrolReportsResponseBodyData getData() {
        return this.data;
    }

    public ListPatrolReportsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListPatrolReportsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListPatrolReportsResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListPatrolReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPatrolReportsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPatrolReportsResponseBodyDataItemsScopeConfig extends TeaModel {
        /**
         * <p>The list of deployment IDs. This field is valid only when scopeType is set to DEPLOYMENTS.</p>
         */
        @NameInMap("deploymentIds")
        public java.util.List<String> deploymentIds;

        /**
         * <p>The tag mapping. This field is valid only when scopeType is set to TAGS. The key is the tag name, and the value is a list of tag values.</p>
         */
        @NameInMap("tags")
        public java.util.Map<String, java.util.List<String>> tags;

        public static ListPatrolReportsResponseBodyDataItemsScopeConfig build(java.util.Map<String, ?> map) throws Exception {
            ListPatrolReportsResponseBodyDataItemsScopeConfig self = new ListPatrolReportsResponseBodyDataItemsScopeConfig();
            return TeaModel.build(map, self);
        }

        public ListPatrolReportsResponseBodyDataItemsScopeConfig setDeploymentIds(java.util.List<String> deploymentIds) {
            this.deploymentIds = deploymentIds;
            return this;
        }
        public java.util.List<String> getDeploymentIds() {
            return this.deploymentIds;
        }

        public ListPatrolReportsResponseBodyDataItemsScopeConfig setTags(java.util.Map<String, java.util.List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getTags() {
            return this.tags;
        }

    }

    public static class ListPatrolReportsResponseBodyDataItems extends TeaModel {
        /**
         * <p>The inspection completion time.</p>
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
         * <p>1755158793586</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The number of inspected jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("inspectedJobs")
        public Integer inspectedJobs;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default-namespace</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The number of jobs with delay and backpressure.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("problemDelayBackpressureCount")
        public Integer problemDelayBackpressureCount;

        /**
         * <p>The number of jobs with unhealthy checkpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("problemUnhealthyCheckpointCount")
        public Integer problemUnhealthyCheckpointCount;

        /**
         * <p>The number of unhealthy jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("problemUnhealthyCount")
        public Integer problemUnhealthyCount;

        /**
         * <p>The report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e7fd2601edc24a37baaba7eec5f64312</p>
         */
        @NameInMap("reportId")
        public String reportId;

        /**
         * <p>The number of jobs with a Critical risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("riskCriticalCount")
        public Integer riskCriticalCount;

        /**
         * <p>The number of jobs with an Info risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("riskInfoCount")
        public Integer riskInfoCount;

        /**
         * <p>The number of jobs with a Warning risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("riskWarningCount")
        public Integer riskWarningCount;

        /**
         * <p>The inspection scope configuration.</p>
         */
        @NameInMap("scopeConfig")
        public ListPatrolReportsResponseBodyDataItemsScopeConfig scopeConfig;

        /**
         * <p>The inspection scope type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("scopeType")
        public String scopeType;

        /**
         * <p>The inspection start time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1755158793586</p>
         */
        @NameInMap("startedAt")
        public String startedAt;

        /**
         * <p>The report status.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The total number of jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("totalJobs")
        public Integer totalJobs;

        /**
         * <p>The trigger type.</p>
         * 
         * <strong>example:</strong>
         * <p>CRON</p>
         */
        @NameInMap("triggerType")
        public String triggerType;

        /**
         * <p>The update time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1784168829417</p>
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

        public static ListPatrolReportsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListPatrolReportsResponseBodyDataItems self = new ListPatrolReportsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListPatrolReportsResponseBodyDataItems setCompletedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public String getCompletedAt() {
            return this.completedAt;
        }

        public ListPatrolReportsResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListPatrolReportsResponseBodyDataItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListPatrolReportsResponseBodyDataItems setInspectedJobs(Integer inspectedJobs) {
            this.inspectedJobs = inspectedJobs;
            return this;
        }
        public Integer getInspectedJobs() {
            return this.inspectedJobs;
        }

        public ListPatrolReportsResponseBodyDataItems setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListPatrolReportsResponseBodyDataItems setProblemDelayBackpressureCount(Integer problemDelayBackpressureCount) {
            this.problemDelayBackpressureCount = problemDelayBackpressureCount;
            return this;
        }
        public Integer getProblemDelayBackpressureCount() {
            return this.problemDelayBackpressureCount;
        }

        public ListPatrolReportsResponseBodyDataItems setProblemUnhealthyCheckpointCount(Integer problemUnhealthyCheckpointCount) {
            this.problemUnhealthyCheckpointCount = problemUnhealthyCheckpointCount;
            return this;
        }
        public Integer getProblemUnhealthyCheckpointCount() {
            return this.problemUnhealthyCheckpointCount;
        }

        public ListPatrolReportsResponseBodyDataItems setProblemUnhealthyCount(Integer problemUnhealthyCount) {
            this.problemUnhealthyCount = problemUnhealthyCount;
            return this;
        }
        public Integer getProblemUnhealthyCount() {
            return this.problemUnhealthyCount;
        }

        public ListPatrolReportsResponseBodyDataItems setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public ListPatrolReportsResponseBodyDataItems setRiskCriticalCount(Integer riskCriticalCount) {
            this.riskCriticalCount = riskCriticalCount;
            return this;
        }
        public Integer getRiskCriticalCount() {
            return this.riskCriticalCount;
        }

        public ListPatrolReportsResponseBodyDataItems setRiskInfoCount(Integer riskInfoCount) {
            this.riskInfoCount = riskInfoCount;
            return this;
        }
        public Integer getRiskInfoCount() {
            return this.riskInfoCount;
        }

        public ListPatrolReportsResponseBodyDataItems setRiskWarningCount(Integer riskWarningCount) {
            this.riskWarningCount = riskWarningCount;
            return this;
        }
        public Integer getRiskWarningCount() {
            return this.riskWarningCount;
        }

        public ListPatrolReportsResponseBodyDataItems setScopeConfig(ListPatrolReportsResponseBodyDataItemsScopeConfig scopeConfig) {
            this.scopeConfig = scopeConfig;
            return this;
        }
        public ListPatrolReportsResponseBodyDataItemsScopeConfig getScopeConfig() {
            return this.scopeConfig;
        }

        public ListPatrolReportsResponseBodyDataItems setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public ListPatrolReportsResponseBodyDataItems setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public ListPatrolReportsResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPatrolReportsResponseBodyDataItems setTotalJobs(Integer totalJobs) {
            this.totalJobs = totalJobs;
            return this;
        }
        public Integer getTotalJobs() {
            return this.totalJobs;
        }

        public ListPatrolReportsResponseBodyDataItems setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public ListPatrolReportsResponseBodyDataItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListPatrolReportsResponseBodyDataItems setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class ListPatrolReportsResponseBodyData extends TeaModel {
        /**
         * <p>The list of inspection reports.</p>
         */
        @NameInMap("items")
        public java.util.List<ListPatrolReportsResponseBodyDataItems> items;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public Integer page;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("size")
        public Integer size;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ListPatrolReportsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPatrolReportsResponseBodyData self = new ListPatrolReportsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPatrolReportsResponseBodyData setItems(java.util.List<ListPatrolReportsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListPatrolReportsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListPatrolReportsResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListPatrolReportsResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListPatrolReportsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
