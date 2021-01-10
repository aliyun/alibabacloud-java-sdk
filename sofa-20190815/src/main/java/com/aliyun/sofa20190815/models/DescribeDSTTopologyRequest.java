// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTTopologyRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("IncludeMetrics")
    public Boolean includeMetrics;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("Dimensions")
    public java.util.List<DescribeDSTTopologyRequestDimensions> dimensions;

    public static DescribeDSTTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTTopologyRequest self = new DescribeDSTTopologyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDSTTopologyRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DescribeDSTTopologyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDSTTopologyRequest setIncludeMetrics(Boolean includeMetrics) {
        this.includeMetrics = includeMetrics;
        return this;
    }
    public Boolean getIncludeMetrics() {
        return this.includeMetrics;
    }

    public DescribeDSTTopologyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDSTTopologyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDSTTopologyRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DescribeDSTTopologyRequest setDimensions(java.util.List<DescribeDSTTopologyRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<DescribeDSTTopologyRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public static class DescribeDSTTopologyRequestDimensions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDSTTopologyRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTopologyRequestDimensions self = new DescribeDSTTopologyRequestDimensions();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTopologyRequestDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDSTTopologyRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
