// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListExperimentsResponseBody extends TeaModel {
    @NameInMap("Experiments")
    public java.util.List<ListExperimentsResponseBodyExperiments> experiments;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListExperimentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentsResponseBody self = new ListExperimentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExperimentsResponseBody setExperiments(java.util.List<ListExperimentsResponseBodyExperiments> experiments) {
        this.experiments = experiments;
        return this;
    }
    public java.util.List<ListExperimentsResponseBodyExperiments> getExperiments() {
        return this.experiments;
    }

    public ListExperimentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExperimentsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListExperimentsResponseBodyExperiments extends TeaModel {
        @NameInMap("BucketType")
        public String bucketType;

        @NameInMap("Buckets")
        public String buckets;

        @NameInMap("Condition")
        public String condition;

        @NameInMap("CoreMetricId")
        public String coreMetricId;

        @NameInMap("CrowdIds")
        public String crowdIds;

        @NameInMap("DebugUsers")
        public String debugUsers;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExperimentId")
        public String experimentId;

        @NameInMap("Flow")
        public Integer flow;

        @NameInMap("FocusMetricIds")
        public String focusMetricIds;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("LayerId")
        public String layerId;

        @NameInMap("LayerName")
        public String layerName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListExperimentsResponseBodyExperiments build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentsResponseBodyExperiments self = new ListExperimentsResponseBodyExperiments();
            return TeaModel.build(map, self);
        }

        public ListExperimentsResponseBodyExperiments setBucketType(String bucketType) {
            this.bucketType = bucketType;
            return this;
        }
        public String getBucketType() {
            return this.bucketType;
        }

        public ListExperimentsResponseBodyExperiments setBuckets(String buckets) {
            this.buckets = buckets;
            return this;
        }
        public String getBuckets() {
            return this.buckets;
        }

        public ListExperimentsResponseBodyExperiments setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public ListExperimentsResponseBodyExperiments setCoreMetricId(String coreMetricId) {
            this.coreMetricId = coreMetricId;
            return this;
        }
        public String getCoreMetricId() {
            return this.coreMetricId;
        }

        public ListExperimentsResponseBodyExperiments setCrowdIds(String crowdIds) {
            this.crowdIds = crowdIds;
            return this;
        }
        public String getCrowdIds() {
            return this.crowdIds;
        }

        public ListExperimentsResponseBodyExperiments setDebugUsers(String debugUsers) {
            this.debugUsers = debugUsers;
            return this;
        }
        public String getDebugUsers() {
            return this.debugUsers;
        }

        public ListExperimentsResponseBodyExperiments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListExperimentsResponseBodyExperiments setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListExperimentsResponseBodyExperiments setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListExperimentsResponseBodyExperiments setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public ListExperimentsResponseBodyExperiments setFlow(Integer flow) {
            this.flow = flow;
            return this;
        }
        public Integer getFlow() {
            return this.flow;
        }

        public ListExperimentsResponseBodyExperiments setFocusMetricIds(String focusMetricIds) {
            this.focusMetricIds = focusMetricIds;
            return this;
        }
        public String getFocusMetricIds() {
            return this.focusMetricIds;
        }

        public ListExperimentsResponseBodyExperiments setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListExperimentsResponseBodyExperiments setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListExperimentsResponseBodyExperiments setLayerId(String layerId) {
            this.layerId = layerId;
            return this;
        }
        public String getLayerId() {
            return this.layerId;
        }

        public ListExperimentsResponseBodyExperiments setLayerName(String layerName) {
            this.layerName = layerName;
            return this;
        }
        public String getLayerName() {
            return this.layerName;
        }

        public ListExperimentsResponseBodyExperiments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExperimentsResponseBodyExperiments setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListExperimentsResponseBodyExperiments setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListExperimentsResponseBodyExperiments setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListExperimentsResponseBodyExperiments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListExperimentsResponseBodyExperiments setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
