// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTTopologyResponseBody extends TeaModel {
    @NameInMap("EdgeMetrics")
    public java.util.List<DescribeDSTTopologyResponseBodyEdgeMetrics> edgeMetrics;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NodeMetrics")
    public java.util.List<DescribeDSTTopologyResponseBodyNodeMetrics> nodeMetrics;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Edges")
    public java.util.List<DescribeDSTTopologyResponseBodyEdges> edges;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Nodes")
    public java.util.List<DescribeDSTTopologyResponseBodyNodes> nodes;

    public static DescribeDSTTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTTopologyResponseBody self = new DescribeDSTTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDSTTopologyResponseBody setEdgeMetrics(java.util.List<DescribeDSTTopologyResponseBodyEdgeMetrics> edgeMetrics) {
        this.edgeMetrics = edgeMetrics;
        return this;
    }
    public java.util.List<DescribeDSTTopologyResponseBodyEdgeMetrics> getEdgeMetrics() {
        return this.edgeMetrics;
    }

    public DescribeDSTTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDSTTopologyResponseBody setNodeMetrics(java.util.List<DescribeDSTTopologyResponseBodyNodeMetrics> nodeMetrics) {
        this.nodeMetrics = nodeMetrics;
        return this;
    }
    public java.util.List<DescribeDSTTopologyResponseBodyNodeMetrics> getNodeMetrics() {
        return this.nodeMetrics;
    }

    public DescribeDSTTopologyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeDSTTopologyResponseBody setEdges(java.util.List<DescribeDSTTopologyResponseBodyEdges> edges) {
        this.edges = edges;
        return this;
    }
    public java.util.List<DescribeDSTTopologyResponseBodyEdges> getEdges() {
        return this.edges;
    }

    public DescribeDSTTopologyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeDSTTopologyResponseBody setNodes(java.util.List<DescribeDSTTopologyResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribeDSTTopologyResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public static class DescribeDSTTopologyResponseBodyEdgeMetricsValuesValue extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDSTTopologyResponseBodyEdgeMetricsValuesValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTopologyResponseBodyEdgeMetricsValuesValue self = new DescribeDSTTopologyResponseBodyEdgeMetricsValuesValue();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTopologyResponseBodyEdgeMetricsValuesValue setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDSTTopologyResponseBodyEdgeMetricsValuesValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDSTTopologyResponseBodyEdgeMetricsValues extends TeaModel {
        @NameInMap("Value")
        public java.util.List<DescribeDSTTopologyResponseBodyEdgeMetricsValuesValue> value;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeDSTTopologyResponseBodyEdgeMetricsValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTopologyResponseBodyEdgeMetricsValues self = new DescribeDSTTopologyResponseBodyEdgeMetricsValues();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTopologyResponseBodyEdgeMetricsValues setValue(java.util.List<DescribeDSTTopologyResponseBodyEdgeMetricsValuesValue> value) {
            this.value = value;
            return this;
        }
        public java.util.List<DescribeDSTTopologyResponseBodyEdgeMetricsValuesValue> getValue() {
            return this.value;
        }

        public DescribeDSTTopologyResponseBodyEdgeMetricsValues setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeDSTTopologyResponseBodyEdgeMetricsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDSTTopologyResponseBodyEdgeMetricsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTopologyResponseBodyEdgeMetricsTags self = new DescribeDSTTopologyResponseBodyEdgeMetricsTags();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTopologyResponseBodyEdgeMetricsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDSTTopologyResponseBodyEdgeMetricsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDSTTopologyResponseBodyEdgeMetrics extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Values")
        public java.util.List<DescribeDSTTopologyResponseBodyEdgeMetricsValues> values;

        @NameInMap("Tags")
        public java.util.List<DescribeDSTTopologyResponseBodyEdgeMetricsTags> tags;

        public static DescribeDSTTopologyResponseBodyEdgeMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTopologyResponseBodyEdgeMetrics self = new DescribeDSTTopologyResponseBodyEdgeMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTopologyResponseBodyEdgeMetrics setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDSTTopologyResponseBodyEdgeMetrics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDSTTopologyResponseBodyEdgeMetrics setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDSTTopologyResponseBodyEdgeMetrics setValues(java.util.List<DescribeDSTTopologyResponseBodyEdgeMetricsValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeDSTTopologyResponseBodyEdgeMetricsValues> getValues() {
            return this.values;
        }

        public DescribeDSTTopologyResponseBodyEdgeMetrics setTags(java.util.List<DescribeDSTTopologyResponseBodyEdgeMetricsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDSTTopologyResponseBodyEdgeMetricsTags> getTags() {
            return this.tags;
        }

    }

    public static class DescribeDSTTopologyResponseBodyNodeMetricsValuesValue extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDSTTopologyResponseBodyNodeMetricsValuesValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTopologyResponseBodyNodeMetricsValuesValue self = new DescribeDSTTopologyResponseBodyNodeMetricsValuesValue();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTopologyResponseBodyNodeMetricsValuesValue setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDSTTopologyResponseBodyNodeMetricsValuesValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDSTTopologyResponseBodyNodeMetricsValues extends TeaModel {
        @NameInMap("Value")
        public java.util.List<DescribeDSTTopologyResponseBodyNodeMetricsValuesValue> value;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeDSTTopologyResponseBodyNodeMetricsValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTopologyResponseBodyNodeMetricsValues self = new DescribeDSTTopologyResponseBodyNodeMetricsValues();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTopologyResponseBodyNodeMetricsValues setValue(java.util.List<DescribeDSTTopologyResponseBodyNodeMetricsValuesValue> value) {
            this.value = value;
            return this;
        }
        public java.util.List<DescribeDSTTopologyResponseBodyNodeMetricsValuesValue> getValue() {
            return this.value;
        }

        public DescribeDSTTopologyResponseBodyNodeMetricsValues setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeDSTTopologyResponseBodyNodeMetricsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDSTTopologyResponseBodyNodeMetricsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTopologyResponseBodyNodeMetricsTags self = new DescribeDSTTopologyResponseBodyNodeMetricsTags();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTopologyResponseBodyNodeMetricsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDSTTopologyResponseBodyNodeMetricsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDSTTopologyResponseBodyNodeMetrics extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Values")
        public java.util.List<DescribeDSTTopologyResponseBodyNodeMetricsValues> values;

        @NameInMap("Tags")
        public java.util.List<DescribeDSTTopologyResponseBodyNodeMetricsTags> tags;

        public static DescribeDSTTopologyResponseBodyNodeMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTopologyResponseBodyNodeMetrics self = new DescribeDSTTopologyResponseBodyNodeMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTopologyResponseBodyNodeMetrics setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDSTTopologyResponseBodyNodeMetrics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDSTTopologyResponseBodyNodeMetrics setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDSTTopologyResponseBodyNodeMetrics setValues(java.util.List<DescribeDSTTopologyResponseBodyNodeMetricsValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeDSTTopologyResponseBodyNodeMetricsValues> getValues() {
            return this.values;
        }

        public DescribeDSTTopologyResponseBodyNodeMetrics setTags(java.util.List<DescribeDSTTopologyResponseBodyNodeMetricsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDSTTopologyResponseBodyNodeMetricsTags> getTags() {
            return this.tags;
        }

    }

    public static class DescribeDSTTopologyResponseBodyEdges extends TeaModel {
        @NameInMap("Source")
        public String source;

        @NameInMap("Target")
        public String target;

        @NameInMap("Id")
        public String id;

        public static DescribeDSTTopologyResponseBodyEdges build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTopologyResponseBodyEdges self = new DescribeDSTTopologyResponseBodyEdges();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTopologyResponseBodyEdges setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeDSTTopologyResponseBodyEdges setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeDSTTopologyResponseBodyEdges setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeDSTTopologyResponseBodyNodesDimensions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDSTTopologyResponseBodyNodesDimensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTopologyResponseBodyNodesDimensions self = new DescribeDSTTopologyResponseBodyNodesDimensions();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTopologyResponseBodyNodesDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDSTTopologyResponseBodyNodesDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDSTTopologyResponseBodyNodes extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("App")
        public String app;

        @NameInMap("Dimensions")
        public java.util.List<DescribeDSTTopologyResponseBodyNodesDimensions> dimensions;

        @NameInMap("Id")
        public String id;

        public static DescribeDSTTopologyResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTopologyResponseBodyNodes self = new DescribeDSTTopologyResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTopologyResponseBodyNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDSTTopologyResponseBodyNodes setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public DescribeDSTTopologyResponseBodyNodes setDimensions(java.util.List<DescribeDSTTopologyResponseBodyNodesDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<DescribeDSTTopologyResponseBodyNodesDimensions> getDimensions() {
            return this.dimensions;
        }

        public DescribeDSTTopologyResponseBodyNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
