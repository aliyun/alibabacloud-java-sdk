// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListMetricsResponseBody extends TeaModel {
    @NameInMap("Metrics")
    public java.util.List<ListMetricsResponseBodyMetrics> metrics;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetricsResponseBody self = new ListMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetricsResponseBody setMetrics(java.util.List<ListMetricsResponseBodyMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<ListMetricsResponseBodyMetrics> getMetrics() {
        return this.metrics;
    }

    public ListMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetricsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMetricsResponseBodyMetrics extends TeaModel {
        @NameInMap("Definition")
        public String definition;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("MetricGroupId")
        public String metricGroupId;

        @NameInMap("MetricId")
        public String metricId;

        @NameInMap("Name")
        public String name;

        @NameInMap("SourceTableMetaId")
        public String sourceTableMetaId;

        @NameInMap("SourceTableMetaName")
        public String sourceTableMetaName;

        public static ListMetricsResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListMetricsResponseBodyMetrics self = new ListMetricsResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public ListMetricsResponseBodyMetrics setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public ListMetricsResponseBodyMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMetricsResponseBodyMetrics setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListMetricsResponseBodyMetrics setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListMetricsResponseBodyMetrics setMetricGroupId(String metricGroupId) {
            this.metricGroupId = metricGroupId;
            return this;
        }
        public String getMetricGroupId() {
            return this.metricGroupId;
        }

        public ListMetricsResponseBodyMetrics setMetricId(String metricId) {
            this.metricId = metricId;
            return this;
        }
        public String getMetricId() {
            return this.metricId;
        }

        public ListMetricsResponseBodyMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMetricsResponseBodyMetrics setSourceTableMetaId(String sourceTableMetaId) {
            this.sourceTableMetaId = sourceTableMetaId;
            return this;
        }
        public String getSourceTableMetaId() {
            return this.sourceTableMetaId;
        }

        public ListMetricsResponseBodyMetrics setSourceTableMetaName(String sourceTableMetaName) {
            this.sourceTableMetaName = sourceTableMetaName;
            return this;
        }
        public String getSourceTableMetaName() {
            return this.sourceTableMetaName;
        }

    }

}
