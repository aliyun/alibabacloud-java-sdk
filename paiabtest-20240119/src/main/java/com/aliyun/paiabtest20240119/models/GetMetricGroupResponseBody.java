// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class GetMetricGroupResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("MetricGroupId")
    public String metricGroupId;

    @NameInMap("Metrics")
    public java.util.List<GetMetricGroupResponseBodyMetrics> metrics;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetMetricGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetricGroupResponseBody self = new GetMetricGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetricGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetMetricGroupResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetMetricGroupResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetMetricGroupResponseBody setMetricGroupId(String metricGroupId) {
        this.metricGroupId = metricGroupId;
        return this;
    }
    public String getMetricGroupId() {
        return this.metricGroupId;
    }

    public GetMetricGroupResponseBody setMetrics(java.util.List<GetMetricGroupResponseBodyMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<GetMetricGroupResponseBodyMetrics> getMetrics() {
        return this.metrics;
    }

    public GetMetricGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetMetricGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetricGroupResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetMetricGroupResponseBodyMetrics extends TeaModel {
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

        @NameInMap("RelatedExperimentNumber")
        public Long relatedExperimentNumber;

        @NameInMap("SourceTableMetaId")
        public String sourceTableMetaId;

        public static GetMetricGroupResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetMetricGroupResponseBodyMetrics self = new GetMetricGroupResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public GetMetricGroupResponseBodyMetrics setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public GetMetricGroupResponseBodyMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMetricGroupResponseBodyMetrics setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetMetricGroupResponseBodyMetrics setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetMetricGroupResponseBodyMetrics setMetricId(String metricId) {
            this.metricId = metricId;
            return this;
        }
        public String getMetricId() {
            return this.metricId;
        }

        public GetMetricGroupResponseBodyMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetricGroupResponseBodyMetrics setRelatedExperimentNumber(Long relatedExperimentNumber) {
            this.relatedExperimentNumber = relatedExperimentNumber;
            return this;
        }
        public Long getRelatedExperimentNumber() {
            return this.relatedExperimentNumber;
        }

        public GetMetricGroupResponseBodyMetrics setSourceTableMetaId(String sourceTableMetaId) {
            this.sourceTableMetaId = sourceTableMetaId;
            return this;
        }
        public String getSourceTableMetaId() {
            return this.sourceTableMetaId;
        }

    }

}
