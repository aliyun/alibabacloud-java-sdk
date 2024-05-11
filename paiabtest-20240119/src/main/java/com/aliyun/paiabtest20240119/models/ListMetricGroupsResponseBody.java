// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListMetricGroupsResponseBody extends TeaModel {
    @NameInMap("MetricGroups")
    public java.util.List<ListMetricGroupsResponseBodyMetricGroups> metricGroups;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListMetricGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetricGroupsResponseBody self = new ListMetricGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetricGroupsResponseBody setMetricGroups(java.util.List<ListMetricGroupsResponseBodyMetricGroups> metricGroups) {
        this.metricGroups = metricGroups;
        return this;
    }
    public java.util.List<ListMetricGroupsResponseBodyMetricGroups> getMetricGroups() {
        return this.metricGroups;
    }

    public ListMetricGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetricGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMetricGroupsResponseBodyMetricGroupsMetrics extends TeaModel {
        @NameInMap("Definition")
        public String definition;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("MetricId")
        public String metricId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RelatedExperimentsNumber")
        public Long relatedExperimentsNumber;

        @NameInMap("SourceTableMetaId")
        public String sourceTableMetaId;

        public static ListMetricGroupsResponseBodyMetricGroupsMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListMetricGroupsResponseBodyMetricGroupsMetrics self = new ListMetricGroupsResponseBodyMetricGroupsMetrics();
            return TeaModel.build(map, self);
        }

        public ListMetricGroupsResponseBodyMetricGroupsMetrics setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public ListMetricGroupsResponseBodyMetricGroupsMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMetricGroupsResponseBodyMetricGroupsMetrics setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListMetricGroupsResponseBodyMetricGroupsMetrics setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListMetricGroupsResponseBodyMetricGroupsMetrics setMetricId(String metricId) {
            this.metricId = metricId;
            return this;
        }
        public String getMetricId() {
            return this.metricId;
        }

        public ListMetricGroupsResponseBodyMetricGroupsMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMetricGroupsResponseBodyMetricGroupsMetrics setRelatedExperimentsNumber(Long relatedExperimentsNumber) {
            this.relatedExperimentsNumber = relatedExperimentsNumber;
            return this;
        }
        public Long getRelatedExperimentsNumber() {
            return this.relatedExperimentsNumber;
        }

        public ListMetricGroupsResponseBodyMetricGroupsMetrics setSourceTableMetaId(String sourceTableMetaId) {
            this.sourceTableMetaId = sourceTableMetaId;
            return this;
        }
        public String getSourceTableMetaId() {
            return this.sourceTableMetaId;
        }

    }

    public static class ListMetricGroupsResponseBodyMetricGroups extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("MetricGroupId")
        public String metricGroupId;

        @NameInMap("Metrics")
        public java.util.List<ListMetricGroupsResponseBodyMetricGroupsMetrics> metrics;

        @NameInMap("Name")
        public String name;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListMetricGroupsResponseBodyMetricGroups build(java.util.Map<String, ?> map) throws Exception {
            ListMetricGroupsResponseBodyMetricGroups self = new ListMetricGroupsResponseBodyMetricGroups();
            return TeaModel.build(map, self);
        }

        public ListMetricGroupsResponseBodyMetricGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMetricGroupsResponseBodyMetricGroups setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListMetricGroupsResponseBodyMetricGroups setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListMetricGroupsResponseBodyMetricGroups setMetricGroupId(String metricGroupId) {
            this.metricGroupId = metricGroupId;
            return this;
        }
        public String getMetricGroupId() {
            return this.metricGroupId;
        }

        public ListMetricGroupsResponseBodyMetricGroups setMetrics(java.util.List<ListMetricGroupsResponseBodyMetricGroupsMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<ListMetricGroupsResponseBodyMetricGroupsMetrics> getMetrics() {
            return this.metrics;
        }

        public ListMetricGroupsResponseBodyMetricGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMetricGroupsResponseBodyMetricGroups setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
